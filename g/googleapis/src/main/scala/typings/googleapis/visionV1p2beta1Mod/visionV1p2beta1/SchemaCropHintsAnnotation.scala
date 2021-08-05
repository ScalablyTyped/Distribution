package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Set of crop hints that are used to generate new crops when serving images.
  */
trait SchemaCropHintsAnnotation extends StObject {
  
  /**
    * Crop hint results.
    */
  var cropHints: js.UndefOr[js.Array[SchemaCropHint]] = js.undefined
}
object SchemaCropHintsAnnotation {
  
  inline def apply(): SchemaCropHintsAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCropHintsAnnotation]
  }
  
  extension [Self <: SchemaCropHintsAnnotation](x: Self) {
    
    inline def setCropHints(value: js.Array[SchemaCropHint]): Self = StObject.set(x, "cropHints", value.asInstanceOf[js.Any])
    
    inline def setCropHintsUndefined: Self = StObject.set(x, "cropHints", js.undefined)
    
    inline def setCropHintsVarargs(value: SchemaCropHint*): Self = StObject.set(x, "cropHints", js.Array(value :_*))
  }
}
