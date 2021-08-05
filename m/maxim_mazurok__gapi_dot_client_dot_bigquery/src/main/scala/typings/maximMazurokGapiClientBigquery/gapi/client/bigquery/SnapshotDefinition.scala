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
  
  inline def apply(): SnapshotDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotDefinition]
  }
  
  extension [Self <: SnapshotDefinition](x: Self) {
    
    inline def setBaseTableReference(value: TableReference): Self = StObject.set(x, "baseTableReference", value.asInstanceOf[js.Any])
    
    inline def setBaseTableReferenceUndefined: Self = StObject.set(x, "baseTableReference", js.undefined)
    
    inline def setSnapshotTime(value: String): Self = StObject.set(x, "snapshotTime", value.asInstanceOf[js.Any])
    
    inline def setSnapshotTimeUndefined: Self = StObject.set(x, "snapshotTime", js.undefined)
  }
}
