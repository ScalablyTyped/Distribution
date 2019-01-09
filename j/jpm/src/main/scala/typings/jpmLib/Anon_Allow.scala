package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Allow extends js.Object {
  var allow: js.UndefOr[Anon_Script] = js.undefined
  var contentScript: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var contentScriptFile: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var contentScriptOptions: js.UndefOr[js.Any] = js.undefined
  var contentScriptWhen: js.UndefOr[
    jpmLib.jpmLibStrings.start | jpmLib.jpmLibStrings.ready | jpmLib.jpmLibStrings.end
  ] = js.undefined
  var contentURL: js.UndefOr[java.lang.String] = js.undefined
  var include: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | stdLib.RegExp | js.Array[stdLib.RegExp]
  ] = js.undefined
  var onMessage: js.UndefOr[js.Function1[/* message */ java.lang.String, _]] = js.undefined
}

