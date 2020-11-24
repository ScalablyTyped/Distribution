package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stores image properties, such as dominant colors.
  */
@js.native
trait SchemaGoogleCloudVisionV1p2beta1ImageProperties extends js.Object {
  
  /**
    * If present, dominant colors completed successfully.
    */
  var dominantColors: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1DominantColorsAnnotation] = js.native
}
object SchemaGoogleCloudVisionV1p2beta1ImageProperties {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p2beta1ImageProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1ImageProperties]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p2beta1ImagePropertiesOps[Self <: SchemaGoogleCloudVisionV1p2beta1ImageProperties] (val x: Self) extends AnyVal {
    
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
    def setDominantColors(value: SchemaGoogleCloudVisionV1p2beta1DominantColorsAnnotation): Self = this.set("dominantColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDominantColors: Self = this.set("dominantColors", js.undefined)
  }
}
