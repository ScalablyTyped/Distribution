package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Set of dominant colors and their corresponding scores.
  */
trait SchemaDominantColorsAnnotation extends StObject {
  
  /**
    * RGB color values with their score and pixel fraction.
    */
  var colors: js.UndefOr[js.Array[SchemaColorInfo]] = js.undefined
}
object SchemaDominantColorsAnnotation {
  
  inline def apply(): SchemaDominantColorsAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDominantColorsAnnotation]
  }
  
  extension [Self <: SchemaDominantColorsAnnotation](x: Self) {
    
    inline def setColors(value: js.Array[SchemaColorInfo]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: SchemaColorInfo*): Self = StObject.set(x, "colors", js.Array(value :_*))
  }
}
