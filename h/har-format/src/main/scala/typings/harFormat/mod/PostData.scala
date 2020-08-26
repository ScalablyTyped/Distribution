package typings.harFormat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostData extends js.Object {
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.native
  /** Mime type of posted data. */
  var mimeType: String = js.native
  /**
    * List of posted parameters (in case of URL encoded parameters).
    *
    * _`text` and `params` fields are mutually exclusive._
    */
  var params: js.Array[Param] = js.native
  /**
    * Plain text posted data
    *
    * _`params` and `text` fields are mutually exclusive._
    */
  var text: String = js.native
}

object PostData {
  @scala.inline
  def apply(mimeType: String, params: js.Array[Param], text: String): PostData = {
    val __obj = js.Dynamic.literal(mimeType = mimeType.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostData]
  }
  @scala.inline
  implicit class PostDataOps[Self <: PostData] (val x: Self) extends AnyVal {
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
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setParamsVarargs(value: Param*): Self = this.set("params", js.Array(value :_*))
    @scala.inline
    def setParams(value: js.Array[Param]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
  }
  
}

