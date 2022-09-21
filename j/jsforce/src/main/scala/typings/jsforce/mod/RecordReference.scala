package typings.jsforce.mod

import typings.jsforce.salesforceIdMod.SalesforceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsforce", "RecordReference")
@js.native
open class RecordReference[T] protected ()
  extends typings.jsforce.recordMod.RecordReference[T] {
  def this(conn: typings.jsforce.connectionMod.Connection, `type`: String, id: SalesforceId) = this()
}
