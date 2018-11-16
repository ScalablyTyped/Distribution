package typings
package highlightDotJsLib.highlightDotJsMod.hljsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICompiledMode extends IModeBase {
  var compiled: scala.Boolean
  var contains: js.UndefOr[js.Array[ICompiledMode]] = js.undefined
  var keywords: js.UndefOr[js.Object] = js.undefined
  var terminator_end: js.UndefOr[java.lang.String] = js.undefined
  var terminators: stdLib.RegExp
}

