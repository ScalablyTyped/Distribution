package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The type of Google Cloud Vision API detection to perform, and the maximum
  * number of results to return for that type. Multiple `Feature` objects can
  * be specified in the `features` list.
  */
@js.native
trait SchemaGoogleCloudVisionV1p2beta1Feature extends js.Object {
  
  /**
    * Maximum number of results of this type. Does not apply to
    * `TEXT_DETECTION`, `DOCUMENT_TEXT_DETECTION`, or `CROP_HINTS`.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * Model to use for the feature. Supported values:
    * &quot;builtin/stable&quot; (the default if unset) and
    * &quot;builtin/latest&quot;.
    */
  var model: js.UndefOr[String] = js.native
  
  /**
    * The feature type.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudVisionV1p2beta1Feature {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p2beta1Feature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1Feature]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p2beta1FeatureOps[Self <: SchemaGoogleCloudVisionV1p2beta1Feature] (val x: Self) extends AnyVal {
    
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
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
