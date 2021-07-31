package typings.googleapis.visionV1Mod.visionV1

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
  
  @scala.inline
  def apply(): SchemaDominantColorsAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDominantColorsAnnotation]
  }
  
  @scala.inline
  implicit class SchemaDominantColorsAnnotationMutableBuilder[Self <: SchemaDominantColorsAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: js.Array[SchemaColorInfo]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: SchemaColorInfo*): Self = StObject.set(x, "colors", js.Array(value :_*))
  }
}
