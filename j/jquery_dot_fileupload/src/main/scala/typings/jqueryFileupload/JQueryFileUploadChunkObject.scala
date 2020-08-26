package typings.jqueryFileupload

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryFileUploadChunkObject
  extends JQueryFileInputOptions
     with JQueryFileUploadXhr {
  var blob: js.Any = js.native
  var chunkSize: Double = js.native
  var contentRange: String = js.native
}

object JQueryFileUploadChunkObject {
  @scala.inline
  def apply(
    blob: js.Any,
    chunkSize: Double,
    contentRange: String,
    errorThrown: js.Any,
    headers: StringDictionary[js.Any],
    jqXHR: JQueryXHR,
    result: js.Any,
    textStatus: String
  ): JQueryFileUploadChunkObject = {
    val __obj = js.Dynamic.literal(blob = blob.asInstanceOf[js.Any], chunkSize = chunkSize.asInstanceOf[js.Any], contentRange = contentRange.asInstanceOf[js.Any], errorThrown = errorThrown.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], jqXHR = jqXHR.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], textStatus = textStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryFileUploadChunkObject]
  }
  @scala.inline
  implicit class JQueryFileUploadChunkObjectOps[Self <: JQueryFileUploadChunkObject] (val x: Self) extends AnyVal {
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
    def setBlob(value: js.Any): Self = this.set("blob", value.asInstanceOf[js.Any])
    @scala.inline
    def setChunkSize(value: Double): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentRange(value: String): Self = this.set("contentRange", value.asInstanceOf[js.Any])
  }
  
}

