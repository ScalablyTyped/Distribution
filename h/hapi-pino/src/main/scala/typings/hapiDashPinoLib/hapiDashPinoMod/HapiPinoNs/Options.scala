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
  var levelTags: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in hapi-pino.hapi-pino.HapiPino.LogLevels ]: string}
    */ js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in hapi-pino.hapi-pino.HapiPino.LogLevels ]: string}
    */ hapiDashPinoLib.hapiDashPinoLibStrings.Options with js.Any
  ] = js.undefined
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

object Options {
  @scala.inline
  def apply(
    allTags: LogLevels = null,
    ignorePaths: js.Array[java.lang.String] = null,
    instance: pinoLib.pinoMod.PNs.Logger = null,
    level: LogLevels = null,
    levelTags: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in hapi-pino.hapi-pino.HapiPino.LogLevels ]: string}
    */ hapiDashPinoLib.hapiDashPinoLibStrings.Options with js.Any = null,
    logEvents: js.Array[java.lang.String] | hapiDashPinoLib.hapiDashPinoLibNumbers.`false` = null,
    logPayload: js.UndefOr[scala.Boolean] = js.undefined,
    logRouteTags: js.UndefOr[scala.Boolean] = js.undefined,
    mergeHapiLogData: js.UndefOr[scala.Boolean] = js.undefined,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    redact: js.Array[java.lang.String] = null,
    serializers: org.scalablytyped.runtime.StringDictionary[js.Function1[/* param */ js.Any, scala.Unit]] = null,
    stream: nodeLib.NodeJSNs.WriteStream = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (allTags != null) __obj.updateDynamic("allTags")(allTags)
    if (ignorePaths != null) __obj.updateDynamic("ignorePaths")(ignorePaths)
    if (instance != null) __obj.updateDynamic("instance")(instance)
    if (level != null) __obj.updateDynamic("level")(level)
    if (levelTags != null) __obj.updateDynamic("levelTags")(levelTags)
    if (logEvents != null) __obj.updateDynamic("logEvents")(logEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(logPayload)) __obj.updateDynamic("logPayload")(logPayload)
    if (!js.isUndefined(logRouteTags)) __obj.updateDynamic("logRouteTags")(logRouteTags)
    if (!js.isUndefined(mergeHapiLogData)) __obj.updateDynamic("mergeHapiLogData")(mergeHapiLogData)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (redact != null) __obj.updateDynamic("redact")(redact)
    if (serializers != null) __obj.updateDynamic("serializers")(serializers)
    if (stream != null) __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[Options]
  }
}

