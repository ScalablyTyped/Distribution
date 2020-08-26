package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnErrorEventUIParam extends js.Object {
  /**
    * Gets the current errorCode.
    */
  var errorCode: js.UndefOr[Double] = js.native
  /**
    * Gets the detailed error description.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * Gets the error type - it could be clientside or serverside.
    */
  var errorType: js.UndefOr[String] = js.native
  /**
    * Gets the identifier of the file for which the event is fired(after that it can be used API function getFileInfo). NOTE: It is possible to be null in some cases: try to drop multiple files when mode is single , check maximum allowed uploading files fails or check for count of maximum allowed simultaneous files upload fails.
    */
  var fileId: js.UndefOr[Double] = js.native
  /**
    * Gets the igUpload widget object.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Gets the specific server message returned by server - if errorType is serverside.
    */
  var serverMessage: js.UndefOr[String] = js.native
}

object OnErrorEventUIParam {
  @scala.inline
  def apply(): OnErrorEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnErrorEventUIParam]
  }
  @scala.inline
  implicit class OnErrorEventUIParamOps[Self <: OnErrorEventUIParam] (val x: Self) extends AnyVal {
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
    def setErrorCode(value: Double): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    @scala.inline
    def setErrorType(value: String): Self = this.set("errorType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorType: Self = this.set("errorType", js.undefined)
    @scala.inline
    def setFileId(value: Double): Self = this.set("fileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileId: Self = this.set("fileId", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setServerMessage(value: String): Self = this.set("serverMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerMessage: Self = this.set("serverMessage", js.undefined)
  }
  
}

