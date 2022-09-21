package typings.googleapis.manufacturersV1Mod.manufacturersV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFeatureDescription extends StObject {
  
  /**
    * A short description of the feature.
    */
  var headline: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional image describing the feature.
    */
  var image: js.UndefOr[SchemaImage] = js.undefined
  
  /**
    * A detailed description of the feature.
    */
  var text: js.UndefOr[String | Null] = js.undefined
}
object SchemaFeatureDescription {
  
  inline def apply(): SchemaFeatureDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeatureDescription]
  }
  
  extension [Self <: SchemaFeatureDescription](x: Self) {
    
    inline def setHeadline(value: String): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
    
    inline def setHeadlineNull: Self = StObject.set(x, "headline", null)
    
    inline def setHeadlineUndefined: Self = StObject.set(x, "headline", js.undefined)
    
    inline def setImage(value: SchemaImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
