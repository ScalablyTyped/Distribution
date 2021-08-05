package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stores image properties, such as dominant colors.
  */
trait SchemaImageProperties extends StObject {
  
  /**
    * If present, dominant colors completed successfully.
    */
  var dominantColors: js.UndefOr[SchemaDominantColorsAnnotation] = js.undefined
}
object SchemaImageProperties {
  
  inline def apply(): SchemaImageProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageProperties]
  }
  
  extension [Self <: SchemaImageProperties](x: Self) {
    
    inline def setDominantColors(value: SchemaDominantColorsAnnotation): Self = StObject.set(x, "dominantColors", value.asInstanceOf[js.Any])
    
    inline def setDominantColorsUndefined: Self = StObject.set(x, "dominantColors", js.undefined)
  }
}
