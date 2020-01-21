package typings.jsforce.mod

import typings.jsforce.salesforceIdMod.SalesforceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce", "RecordReference")
@js.native
class RecordReference[T] protected ()
  extends typings.jsforce.recordMod.RecordReference[T] {
  def this(conn: typings.jsforce.connectionMod.Connection, `type`: String, id: SalesforceId) = this()
}

