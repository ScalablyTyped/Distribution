package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaField extends StObject {
  
  /**
    * The maximum number of times this field can be repeated. 0 or -1 means unbounded.
    */
  var maxOccurs: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The minimum number of times this field must be present/repeated.
    */
  var minOccurs: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The name of the field. For example, "PID-1" or just "1".
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The HL7v2 table this field refers to. For example, PID-15 (Patient's Primary Language) usually refers to table "0296".
    */
  var table: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of this field. A Type with this name must be defined in an Hl7TypesConfig.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaField {
  
  inline def apply(): SchemaField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaField]
  }
  
  extension [Self <: SchemaField](x: Self) {
    
    inline def setMaxOccurs(value: Double): Self = StObject.set(x, "maxOccurs", value.asInstanceOf[js.Any])
    
    inline def setMaxOccursNull: Self = StObject.set(x, "maxOccurs", null)
    
    inline def setMaxOccursUndefined: Self = StObject.set(x, "maxOccurs", js.undefined)
    
    inline def setMinOccurs(value: Double): Self = StObject.set(x, "minOccurs", value.asInstanceOf[js.Any])
    
    inline def setMinOccursNull: Self = StObject.set(x, "minOccurs", null)
    
    inline def setMinOccursUndefined: Self = StObject.set(x, "minOccurs", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableNull: Self = StObject.set(x, "table", null)
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
