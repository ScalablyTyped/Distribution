package typings.hapiDashPino.hapiDashPinoMod

import org.scalablytyped.runtime.StringDictionary
import typings.hapiDashPino.hapiDashPinoNumbers.`false`
import typings.node.NodeJSNs.WriteStream
import typings.pino.pinoMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allTags: js.UndefOr[LogLevels] = js.undefined
  var ignorePaths: js.UndefOr[js.Array[String]] = js.undefined
  var instance: js.UndefOr[Logger] = js.undefined
  var level: js.UndefOr[LogLevels] = js.undefined
  var levelTags: js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in hapi-pino.hapi-pino.LogLevels ]: string}
    */ typings.hapiDashPino.hapiDashPinoStrings.Options with js.Any
  ] = js.undefined
  var logEvents: js.UndefOr[js.Array[String] | `false` | Null] = js.undefined
  var logPayload: js.UndefOr[Boolean] = js.undefined
  var logRouteTags: js.UndefOr[Boolean] = js.undefined
  var mergeHapiLogData: js.UndefOr[Boolean] = js.undefined
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  var redact: js.UndefOr[js.Array[String]] = js.undefined
  var serializers: js.UndefOr[StringDictionary[js.Function1[/* param */ js.Any, Unit]]] = js.undefined
  var stream: js.UndefOr[WriteStream] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allTags: LogLevels = null,
    ignorePaths: js.Array[String] = null,
    instance: Logger = null,
    level: LogLevels = null,
    levelTags: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in hapi-pino.hapi-pino.LogLevels ]: string}
    */ typings.hapiDashPino.hapiDashPinoStrings.Options with js.Any = null,
    logEvents: js.Array[String] | `false` = null,
    logPayload: js.UndefOr[Boolean] = js.undefined,
    logRouteTags: js.UndefOr[Boolean] = js.undefined,
    mergeHapiLogData: js.UndefOr[Boolean] = js.undefined,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    redact: js.Array[String] = null,
    serializers: StringDictionary[js.Function1[/* param */ js.Any, Unit]] = null,
    stream: WriteStream = null
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

