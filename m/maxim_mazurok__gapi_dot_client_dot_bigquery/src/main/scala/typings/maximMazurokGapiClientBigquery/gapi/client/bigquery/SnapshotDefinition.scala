package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotDefinition extends StObject {
  
  /** [Required] Reference describing the ID of the table that is snapshotted. */
  var baseTableReference: js.UndefOr[TableReference] = js.undefined
  
  /** [Required] The time at which the base table was snapshot. */
  var snapshotTime: js.UndefOr[String] = js.undefined
}
object SnapshotDefinition {
  
  @scala.inline
  def apply(): SnapshotDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotDefinition]
  }
  
  @scala.inline
  implicit class SnapshotDefinitionMutableBuilder[Self <: SnapshotDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseTableReference(value: TableReference): Self = StObject.set(x, "baseTableReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseTableReferenceUndefined: Self = StObject.set(x, "baseTableReference", js.undefined)
    
    @scala.inline
    def setSnapshotTime(value: String): Self = StObject.set(x, "snapshotTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotTimeUndefined: Self = StObject.set(x, "snapshotTime", js.undefined)
  }
}
