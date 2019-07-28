package typings.jsforce.jsforceMod

import typings.jsforce.salesforceDashIdMod.SalesforceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce", "RecordReference")
@js.native
class RecordReference[T] protected ()
  extends typings.jsforce.recordMod.RecordReference[T] {
  def this(conn: typings.jsforce.connectionMod.Connection, `type`: String, id: SalesforceId) = this()
}

