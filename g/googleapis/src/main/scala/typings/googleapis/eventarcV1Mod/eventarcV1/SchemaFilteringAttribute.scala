package typings.googleapis.eventarcV1Mod.eventarcV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFilteringAttribute extends StObject {
  
  /**
    * Output only. Attribute used for filtering the event type.
    */
  var attribute: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Description of the purpose of the attribute.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. If true, the attribute accepts matching expressions in the Eventarc PathPattern format.
    */
  var pathPatternSupported: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. If true, the triggers for this provider should always specify a filter on these attributes. Trigger creation will fail otherwise.
    */
  var required: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaFilteringAttribute {
  
  inline def apply(): SchemaFilteringAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilteringAttribute]
  }
  
  extension [Self <: SchemaFilteringAttribute](x: Self) {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeNull: Self = StObject.set(x, "attribute", null)
    
    inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setPathPatternSupported(value: Boolean): Self = StObject.set(x, "pathPatternSupported", value.asInstanceOf[js.Any])
    
    inline def setPathPatternSupportedNull: Self = StObject.set(x, "pathPatternSupported", null)
    
    inline def setPathPatternSupportedUndefined: Self = StObject.set(x, "pathPatternSupported", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredNull: Self = StObject.set(x, "required", null)
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
