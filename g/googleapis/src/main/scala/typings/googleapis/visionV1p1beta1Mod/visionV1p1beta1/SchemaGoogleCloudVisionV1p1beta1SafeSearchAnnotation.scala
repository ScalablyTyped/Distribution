package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Set of features pertaining to the image, computed by computer vision
  * methods over safe-search verticals (for example, adult, spoof, medical,
  * violence).
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1SafeSearchAnnotation extends js.Object {
  
  /**
    * Represents the adult content likelihood for the image. Adult content may
    * contain elements such as nudity, pornographic images or cartoons, or
    * sexual activities.
    */
  var adult: js.UndefOr[String] = js.native
  
  /**
    * Likelihood that this is a medical image.
    */
  var medical: js.UndefOr[String] = js.native
  
  /**
    * Likelihood that the request image contains racy content. Racy content may
    * include (but is not limited to) skimpy or sheer clothing, strategically
    * covered nudity, lewd or provocative poses, or close-ups of sensitive body
    * areas.
    */
  var racy: js.UndefOr[String] = js.native
  
  /**
    * Spoof likelihood. The likelihood that an modification was made to the
    * image&#39;s canonical version to make it appear funny or offensive.
    */
  var spoof: js.UndefOr[String] = js.native
  
  /**
    * Likelihood that this image contains violent content.
    */
  var violence: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudVisionV1p1beta1SafeSearchAnnotation {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p1beta1SafeSearchAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1SafeSearchAnnotation]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p1beta1SafeSearchAnnotationOps[Self <: SchemaGoogleCloudVisionV1p1beta1SafeSearchAnnotation] (val x: Self) extends AnyVal {
    
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
    def setAdult(value: String): Self = this.set("adult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdult: Self = this.set("adult", js.undefined)
    
    @scala.inline
    def setMedical(value: String): Self = this.set("medical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedical: Self = this.set("medical", js.undefined)
    
    @scala.inline
    def setRacy(value: String): Self = this.set("racy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRacy: Self = this.set("racy", js.undefined)
    
    @scala.inline
    def setSpoof(value: String): Self = this.set("spoof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpoof: Self = this.set("spoof", js.undefined)
    
    @scala.inline
    def setViolence(value: String): Self = this.set("violence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViolence: Self = this.set("violence", js.undefined)
  }
}
