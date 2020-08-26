package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a video.  NOTE: Creating a video from Google Drive requires that
  * the requesting app have at least one of the drive, drive.readonly, or
  * drive.file OAuth scopes.
  */
@js.native
trait SchemaCreateVideoRequest extends js.Object {
  /**
    * The element properties for the video.  The PageElementProperties.size
    * property is optional. If you don&#39;t specify a size, a default size is
    * chosen by the server.  The PageElementProperties.transform property is
    * optional. The transform must not have shear components. If you don&#39;t
    * specify a transform, the video will be placed at the top left corner of
    * the page.
    */
  var elementProperties: js.UndefOr[SchemaPageElementProperties] = js.native
  /**
    * The video source&#39;s unique identifier for this video.  e.g. For
    * YouTube video https://www.youtube.com/watch?v=7U3axjORYZ0, the ID is
    * 7U3axjORYZ0. For a Google Drive video
    * https://drive.google.com/file/d/1xCgQLFTJi5_Xl8DgW_lcUYq5e-q6Hi5Q the ID
    * is 1xCgQLFTJi5_Xl8DgW_lcUYq5e-q6Hi5Q.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A user-supplied object ID.  If you specify an ID, it must be unique among
    * all pages and page elements in the presentation. The ID must start with
    * an alphanumeric character or an underscore (matches regex
    * `[a-zA-Z0-9_]`); remaining characters may include those as well as a
    * hyphen or colon (matches regex `[a-zA-Z0-9_-:]`). The length of the ID
    * must not be less than 5 or greater than 50.  If you don&#39;t specify an
    * ID, a unique one is generated.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The video source.
    */
  var source: js.UndefOr[String] = js.native
}

object SchemaCreateVideoRequest {
  @scala.inline
  def apply(): SchemaCreateVideoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateVideoRequest]
  }
  @scala.inline
  implicit class SchemaCreateVideoRequestOps[Self <: SchemaCreateVideoRequest] (val x: Self) extends AnyVal {
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
    def setElementProperties(value: SchemaPageElementProperties): Self = this.set("elementProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementProperties: Self = this.set("elementProperties", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

