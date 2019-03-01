package typings
package kdbxwebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BadSignature extends js.Object {
  var BadSignature: java.lang.String
  var FileCorrupt: java.lang.String
  var InvalidArg: java.lang.String
  var InvalidKey: java.lang.String
  var InvalidVersion: java.lang.String
  var MergeError: java.lang.String
  var NotImplemented: java.lang.String
  var Unsupported: java.lang.String
}

object Anon_BadSignature {
  @scala.inline
  def apply(
    BadSignature: java.lang.String,
    FileCorrupt: java.lang.String,
    InvalidArg: java.lang.String,
    InvalidKey: java.lang.String,
    InvalidVersion: java.lang.String,
    MergeError: java.lang.String,
    NotImplemented: java.lang.String,
    Unsupported: java.lang.String
  ): Anon_BadSignature = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BadSignature")(BadSignature)
    __obj.updateDynamic("FileCorrupt")(FileCorrupt)
    __obj.updateDynamic("InvalidArg")(InvalidArg)
    __obj.updateDynamic("InvalidKey")(InvalidKey)
    __obj.updateDynamic("InvalidVersion")(InvalidVersion)
    __obj.updateDynamic("MergeError")(MergeError)
    __obj.updateDynamic("NotImplemented")(NotImplemented)
    __obj.updateDynamic("Unsupported")(Unsupported)
    __obj.asInstanceOf[Anon_BadSignature]
  }
}

