package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInAppProductListing extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object SchemaInAppProductListing {
  
  inline def apply(): SchemaInAppProductListing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInAppProductListing]
  }
  
  extension [Self <: SchemaInAppProductListing](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
