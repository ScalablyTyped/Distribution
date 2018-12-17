package typings
package hapiDashPinoLib.hapiDashPinoMod.HapiPinoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  var allTags: js.UndefOr[LogLevels] = js.undefined
  var ignorePaths: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var instance: js.UndefOr[pinoLib.pinoMod.PNs.Logger] = js.undefined
  var level: js.UndefOr[LogLevels] = js.undefined
  var levelTags: js.UndefOr[hapiDashPinoLib.hapiDashPinoLibStrings.Options with js.Any] = js.undefined
  var logEvents: js.UndefOr[
    js.Array[java.lang.String] | hapiDashPinoLib.hapiDashPinoLibNumbers.`false` | scala.Null
  ] = js.undefined
  var logPayload: js.UndefOr[scala.Boolean] = js.undefined
  var logRouteTags: js.UndefOr[scala.Boolean] = js.undefined
  var mergeHapiLogData: js.UndefOr[scala.Boolean] = js.undefined
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  var redact: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var serializers: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[js.Function1[/* param */ js.Any, scala.Unit]]
  ] = js.undefined
  var stream: js.UndefOr[nodeLib.NodeJSNs.WriteStream] = js.undefined
}

