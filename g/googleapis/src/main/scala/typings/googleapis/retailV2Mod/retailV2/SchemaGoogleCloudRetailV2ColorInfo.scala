package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2ColorInfo extends StObject {
  
  /**
    * The standard color families. Strongly recommended to use the following standard color groups: "Red", "Pink", "Orange", "Yellow", "Purple", "Green", "Cyan", "Blue", "Brown", "White", "Gray", "Black" and "Mixed". Normally it is expected to have only 1 color family. May consider using single "Mixed" instead of multiple values. A maximum of 5 values are allowed. Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [color](https://support.google.com/merchants/answer/6324487). Schema.org property [Product.color](https://schema.org/color).
    */
  var colorFamilies: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The color display names, which may be different from standard color family names, such as the color aliases used in the website frontend. Normally it is expected to have only 1 color. May consider using single "Mixed" instead of multiple values. A maximum of 25 colors are allowed. Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [color](https://support.google.com/merchants/answer/6324487). Schema.org property [Product.color](https://schema.org/color).
    */
  var colors: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2ColorInfo {
  
  inline def apply(): SchemaGoogleCloudRetailV2ColorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2ColorInfo]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2ColorInfo](x: Self) {
    
    inline def setColorFamilies(value: js.Array[String]): Self = StObject.set(x, "colorFamilies", value.asInstanceOf[js.Any])
    
    inline def setColorFamiliesNull: Self = StObject.set(x, "colorFamilies", null)
    
    inline def setColorFamiliesUndefined: Self = StObject.set(x, "colorFamilies", js.undefined)
    
    inline def setColorFamiliesVarargs(value: String*): Self = StObject.set(x, "colorFamilies", js.Array(value*))
    
    inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsNull: Self = StObject.set(x, "colors", null)
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
  }
}
