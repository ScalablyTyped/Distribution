package typings.googleapis.ondemandscanningV1Mod.ondemandscanningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRelatedUrl extends StObject {
  
  /**
    * Label to describe usage of the URL.
    */
  var label: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specific URL associated with the resource.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaRelatedUrl {
  
  inline def apply(): SchemaRelatedUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelatedUrl]
  }
  
  extension [Self <: SchemaRelatedUrl](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
