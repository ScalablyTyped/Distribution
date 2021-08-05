package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * InputMapping creates a &#39;virtual&#39; property that will be injected
  * into the properties before sending the request to the underlying API.
  */
trait SchemaInputMapping extends StObject {
  
  /**
    * The name of the field that is going to be injected.
    */
  var fieldName: js.UndefOr[String] = js.undefined
  
  /**
    * The location where this mapping applies.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * Regex to evaluate on method to decide if input applies.
    */
  var methodMatch: js.UndefOr[String] = js.undefined
  
  /**
    * A jsonPath expression to select an element.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaInputMapping {
  
  inline def apply(): SchemaInputMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInputMapping]
  }
  
  extension [Self <: SchemaInputMapping](x: Self) {
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMethodMatch(value: String): Self = StObject.set(x, "methodMatch", value.asInstanceOf[js.Any])
    
    inline def setMethodMatchUndefined: Self = StObject.set(x, "methodMatch", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
