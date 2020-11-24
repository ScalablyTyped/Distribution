package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Set of crop hints that are used to generate new crops when serving images.
  */
@js.native
trait SchemaCropHintsAnnotation extends js.Object {
  
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
  implicit class SchemaCropHintsAnnotationOps[Self <: SchemaCropHintsAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCropHintsVarargs(value: SchemaCropHint*): Self = this.set("cropHints", js.Array(value :_*))
    
    @scala.inline
    def setCropHints(value: js.Array[SchemaCropHint]): Self = this.set("cropHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCropHints: Self = this.set("cropHints", js.undefined)
  }
}
