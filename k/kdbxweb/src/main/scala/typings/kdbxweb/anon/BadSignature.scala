package typings.kdbxweb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BadSignature extends js.Object {
  var BadSignature: String = js.native
  var FileCorrupt: String = js.native
  var InvalidArg: String = js.native
  var InvalidKey: String = js.native
  var InvalidVersion: String = js.native
  var MergeError: String = js.native
  var NotImplemented: String = js.native
  var Unsupported: String = js.native
}

object BadSignature {
  @scala.inline
  def apply(
    BadSignature: String,
    FileCorrupt: String,
    InvalidArg: String,
    InvalidKey: String,
    InvalidVersion: String,
    MergeError: String,
    NotImplemented: String,
    Unsupported: String
  ): BadSignature = {
    val __obj = js.Dynamic.literal(BadSignature = BadSignature.asInstanceOf[js.Any], FileCorrupt = FileCorrupt.asInstanceOf[js.Any], InvalidArg = InvalidArg.asInstanceOf[js.Any], InvalidKey = InvalidKey.asInstanceOf[js.Any], InvalidVersion = InvalidVersion.asInstanceOf[js.Any], MergeError = MergeError.asInstanceOf[js.Any], NotImplemented = NotImplemented.asInstanceOf[js.Any], Unsupported = Unsupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadSignature]
  }
  @scala.inline
  implicit class BadSignatureOps[Self <: BadSignature] (val x: Self) extends AnyVal {
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
    def setBadSignature(value: String): Self = this.set("BadSignature", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileCorrupt(value: String): Self = this.set("FileCorrupt", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvalidArg(value: String): Self = this.set("InvalidArg", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvalidKey(value: String): Self = this.set("InvalidKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvalidVersion(value: String): Self = this.set("InvalidVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setMergeError(value: String): Self = this.set("MergeError", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotImplemented(value: String): Self = this.set("NotImplemented", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnsupported(value: String): Self = this.set("Unsupported", value.asInstanceOf[js.Any])
  }
  
}

