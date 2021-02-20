package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Set of crop hints that are used to generate new crops when serving images.
  */
@js.native
trait SchemaCropHintsAnnotation extends StObject {
  
  /**
    * Crop hint results.
    */
  var cropHints: js.UndefOr[js.Array[SchemaCropHint]] = js.native
}
object SchemaCropHintsAnnotation {
  
  @scala.inline
  def apply(): SchemaCropHintsAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCropHintsAnnotation]
  }
  
  @scala.inline
  implicit class SchemaCropHintsAnnotationMutableBuilder[Self <: SchemaCropHintsAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCropHints(value: js.Array[SchemaCropHint]): Self = StObject.set(x, "cropHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropHintsUndefined: Self = StObject.set(x, "cropHints", js.undefined)
    
    @scala.inline
    def setCropHintsVarargs(value: SchemaCropHint*): Self = StObject.set(x, "cropHints", js.Array(value :_*))
  }
}
