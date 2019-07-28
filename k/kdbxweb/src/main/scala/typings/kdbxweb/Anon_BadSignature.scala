package typings.kdbxweb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BadSignature extends js.Object {
  var BadSignature: String
  var FileCorrupt: String
  var InvalidArg: String
  var InvalidKey: String
  var InvalidVersion: String
  var MergeError: String
  var NotImplemented: String
  var Unsupported: String
}

object Anon_BadSignature {
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
  ): Anon_BadSignature = {
    val __obj = js.Dynamic.literal(BadSignature = BadSignature, FileCorrupt = FileCorrupt, InvalidArg = InvalidArg, InvalidKey = InvalidKey, InvalidVersion = InvalidVersion, MergeError = MergeError, NotImplemented = NotImplemented, Unsupported = Unsupported)
  
    __obj.asInstanceOf[Anon_BadSignature]
  }
}

