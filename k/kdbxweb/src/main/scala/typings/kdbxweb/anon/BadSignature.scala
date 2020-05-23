package typings.kdbxweb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadSignature extends js.Object {
  var BadSignature: String
  var FileCorrupt: String
  var InvalidArg: String
  var InvalidKey: String
  var InvalidVersion: String
  var MergeError: String
  var NotImplemented: String
  var Unsupported: String
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
}

