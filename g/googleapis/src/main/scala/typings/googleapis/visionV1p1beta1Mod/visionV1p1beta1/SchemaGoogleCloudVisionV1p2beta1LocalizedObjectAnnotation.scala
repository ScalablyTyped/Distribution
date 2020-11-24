package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Set of detected objects with bounding boxes.
  */
@js.native
trait SchemaGoogleCloudVisionV1p2beta1LocalizedObjectAnnotation extends js.Object {
  
  /**
    * Image region to which this object belongs. This must be populated.
    */
  var boundingPoly: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1BoundingPoly] = js.native
  
  /**
    * The BCP-47 language code, such as &quot;en-US&quot; or
    * &quot;sr-Latn&quot;. For more information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /**
    * Object ID that should align with EntityAnnotation mid.
    */
  var mid: js.UndefOr[String] = js.native
  
  /**
    * Object name, expressed in its `language_code` language.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Score of the result. Range [0, 1].
    */
  var score: js.UndefOr[Double] = js.native
}
object SchemaGoogleCloudVisionV1p2beta1LocalizedObjectAnnotation {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p2beta1LocalizedObjectAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1LocalizedObjectAnnotation]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p2beta1LocalizedObjectAnnotationOps[Self <: SchemaGoogleCloudVisionV1p2beta1LocalizedObjectAnnotation] (val x: Self) extends AnyVal {
    
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
    def setBoundingPoly(value: SchemaGoogleCloudVisionV1p2beta1BoundingPoly): Self = this.set("boundingPoly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundingPoly: Self = this.set("boundingPoly", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    
    @scala.inline
    def setMid(value: String): Self = this.set("mid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMid: Self = this.set("mid", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
  }
}
