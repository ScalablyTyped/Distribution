package typings
package jpmLib.FFAddonSDKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see [nsIException]{@link https://developer.mozilla.org/en-US/docs/Mozilla/Tech/XPCOM/Reference/Interface/nsIException}
  */
trait NSIException extends js.Object {
  var columnNumber: scala.Double
  var data: js.Any
  var filename: java.lang.String
  var inner: js.UndefOr[NSIException] = js.undefined
  var lineNumber: scala.Double
  var location: js.UndefOr[js.Any] = js.undefined
  var message: java.lang.String
  var name: java.lang.String
  var result: js.Any
}

