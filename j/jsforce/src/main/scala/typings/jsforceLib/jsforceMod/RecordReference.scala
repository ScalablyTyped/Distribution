package typings
package jsforceLib.jsforceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce", "RecordReference")
@js.native
class RecordReference[T] protected ()
  extends jsforceLib.recordMod.RecordReference[T] {
  def this(conn: jsforceLib.connectionMod.Connection, `type`: java.lang.String, id: jsforceLib.salesforceDashIdMod.SalesforceId) = this()
}

