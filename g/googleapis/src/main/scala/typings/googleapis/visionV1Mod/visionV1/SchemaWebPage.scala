package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for web pages.
  */
@js.native
trait SchemaWebPage extends js.Object {
  
  /**
    * Fully matching images on the page. Can include resized copies of the
    * query image.
    */
  var fullMatchingImages: js.UndefOr[js.Array[SchemaWebImage]] = js.native
  
  /**
    * Title for the web page, may contain HTML markups.
    */
  var pageTitle: js.UndefOr[String] = js.native
  
  /**
    * Partial matching images on the page. Those images are similar enough to
    * share some key-point features. For example an original image will likely
    * have partial matching for its crops.
    */
  var partialMatchingImages: js.UndefOr[js.Array[SchemaWebImage]] = js.native
  
  /**
    * (Deprecated) Overall relevancy score for the web page.
    */
  var score: js.UndefOr[Double] = js.native
  
  /**
    * The result web page URL.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaWebPage {
  
  @scala.inline
  def apply(): SchemaWebPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebPage]
  }
  
  @scala.inline
  implicit class SchemaWebPageOps[Self <: SchemaWebPage] (val x: Self) extends AnyVal {
    
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
    def setFullMatchingImagesVarargs(value: SchemaWebImage*): Self = this.set("fullMatchingImages", js.Array(value :_*))
    
    @scala.inline
    def setFullMatchingImages(value: js.Array[SchemaWebImage]): Self = this.set("fullMatchingImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullMatchingImages: Self = this.set("fullMatchingImages", js.undefined)
    
    @scala.inline
    def setPageTitle(value: String): Self = this.set("pageTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageTitle: Self = this.set("pageTitle", js.undefined)
    
    @scala.inline
    def setPartialMatchingImagesVarargs(value: SchemaWebImage*): Self = this.set("partialMatchingImages", js.Array(value :_*))
    
    @scala.inline
    def setPartialMatchingImages(value: js.Array[SchemaWebImage]): Self = this.set("partialMatchingImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartialMatchingImages: Self = this.set("partialMatchingImages", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
