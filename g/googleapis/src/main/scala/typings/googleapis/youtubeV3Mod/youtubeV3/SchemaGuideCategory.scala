package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A guideCategory resource identifies a category that YouTube algorithmically
  * assigns based on a channel&#39;s content or other indicators, such as the
  * channel&#39;s popularity. The list is similar to video categories, with the
  * difference being that a video&#39;s uploader can assign a video category
  * but only YouTube can assign a channel category.
  */
@js.native
trait SchemaGuideCategory extends js.Object {
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the guide category.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#guideCategory&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The snippet object contains basic details about the category, such as its
    * title.
    */
  var snippet: js.UndefOr[SchemaGuideCategorySnippet] = js.native
}

object SchemaGuideCategory {
  @scala.inline
  def apply(): SchemaGuideCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGuideCategory]
  }
  @scala.inline
  implicit class SchemaGuideCategoryOps[Self <: SchemaGuideCategory] (val x: Self) extends AnyVal {
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setSnippet(value: SchemaGuideCategorySnippet): Self = this.set("snippet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnippet: Self = this.set("snippet", js.undefined)
  }
  
}

