package typings
package hapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_IsHttpOnly extends js.Object {
  var encoding: js.UndefOr[
    hapiLib.hapiLibStrings.none | hapiLib.hapiLibStrings.base64 | hapiLib.hapiLibStrings.base64json | hapiLib.hapiLibStrings.form | hapiLib.hapiLibStrings.iron
  ] = js.undefined
  var ignoreErrors: js.UndefOr[scala.Boolean] = js.undefined
  var isHttpOnly: js.UndefOr[scala.Boolean] = js.undefined
  var isSameSite: js.UndefOr[
    hapiLib.hapiLibNumbers.`false` | hapiLib.hapiLibStrings.Strict | hapiLib.hapiLibStrings.Lax
  ] = js.undefined
  var isSecure: js.UndefOr[scala.Boolean] = js.undefined
  var strictHeader: js.UndefOr[scala.Boolean] = js.undefined
}

