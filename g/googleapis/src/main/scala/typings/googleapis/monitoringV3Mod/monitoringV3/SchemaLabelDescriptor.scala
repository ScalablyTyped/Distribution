package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A description of a label.
  */
trait SchemaLabelDescriptor extends StObject {
  
  /**
    * A human-readable description for the label.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The label key.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * The type of data that can be assigned to the label.
    */
  var valueType: js.UndefOr[String] = js.undefined
}
object SchemaLabelDescriptor {
  
  inline def apply(): SchemaLabelDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLabelDescriptor]
  }
  
  extension [Self <: SchemaLabelDescriptor](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValueType(value: String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
  }
}
