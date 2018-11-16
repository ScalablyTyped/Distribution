package typings
package launchpadLib.launchpadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BrowserPlatformDetails extends js.Object {
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var command: js.UndefOr[java.lang.String] = js.undefined
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var defaultLocation: js.UndefOr[java.lang.String] = js.undefined
  var getCommand: js.UndefOr[
    js.Function3[
      /* browser */ BrowserPlatformDetails, 
      /* url */ java.lang.String, 
      /* args */ js.Array[java.lang.String], 
      java.lang.String
    ]
  ] = js.undefined
  var imageName: js.UndefOr[java.lang.String] = js.undefined
  var multi: js.UndefOr[scala.Boolean] = js.undefined
  var opensTab: js.UndefOr[scala.Boolean] = js.undefined
  var pathQuery: js.UndefOr[java.lang.String] = js.undefined
  var plistPath: js.UndefOr[java.lang.String] = js.undefined
  var process: js.UndefOr[java.lang.String] = js.undefined
  var versionKey: js.UndefOr[java.lang.String] = js.undefined
}

