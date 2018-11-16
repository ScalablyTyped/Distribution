package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_ContentScriptWindow extends js.Object {
  var contentScript: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var contentScriptFile: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var onError: js.Function1[/* data */ js.UndefOr[js.Any], _]
  var onMessage: js.Function1[/* data */ js.UndefOr[js.Any], _]
  var window: stdLib.Window
}

