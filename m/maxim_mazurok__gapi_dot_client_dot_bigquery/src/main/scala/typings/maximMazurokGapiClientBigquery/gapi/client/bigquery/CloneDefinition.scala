package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloneDefinition extends StObject {
  
  /** [Required] Reference describing the ID of the table that was cloned. */
  var baseTableReference: js.UndefOr[TableReference] = js.undefined
  
  /** [Required] The time at which the base table was cloned. This value is reported in the JSON response using RFC3339 format. */
  var cloneTime: js.UndefOr[String] = js.undefined
}
object CloneDefinition {
  
  inline def apply(): CloneDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloneDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloneDefinition] (val x: Self) extends AnyVal {
    
    inline def setBaseTableReference(value: TableReference): Self = StObject.set(x, "baseTableReference", value.asInstanceOf[js.Any])
    
    inline def setBaseTableReferenceUndefined: Self = StObject.set(x, "baseTableReference", js.undefined)
    
    inline def setCloneTime(value: String): Self = StObject.set(x, "cloneTime", value.asInstanceOf[js.Any])
    
    inline def setCloneTimeUndefined: Self = StObject.set(x, "cloneTime", js.undefined)
  }
}
