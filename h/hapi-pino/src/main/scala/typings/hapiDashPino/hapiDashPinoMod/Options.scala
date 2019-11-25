package typings.hapiDashPino.hapiDashPinoMod

import typings.atHapiHapi.atHapiHapiMod.Request
import typings.hapiDashPino.Anon_Key
import typings.hapiDashPino.hapiDashPinoNumbers.`false`
import typings.node.processMod._Global_.NodeJS.WriteStream
import typings.pino.pinoMod.Level
import typings.pino.pinoMod.Logger
import typings.pino.pinoMod.PrettyOptions
import typings.pino.pinoMod.redactOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allTags: js.UndefOr[Level] = js.undefined
  var getChildBindings: js.UndefOr[js.Function1[/* req */ Request, Anon_Key]] = js.undefined
  var ignorePaths: js.UndefOr[js.Array[String]] = js.undefined
  var instance: js.UndefOr[Logger] = js.undefined
  var level: js.UndefOr[Level] = js.undefined
  var logEvents: js.UndefOr[js.Array[String] | `false` | Null] = js.undefined
  var logPayload: js.UndefOr[Boolean] = js.undefined
  var logRequestStart: js.UndefOr[Boolean] = js.undefined
  var logRouteTags: js.UndefOr[Boolean] = js.undefined
  var mergeHapiLogData: js.UndefOr[Boolean] = js.undefined
  var prettyPrint: js.UndefOr[Boolean | PrettyOptions] = js.undefined
  var redact: js.UndefOr[js.Array[String] | redactOptions] = js.undefined
  var serializers: js.UndefOr[Serializers] = js.undefined
  var stream: js.UndefOr[WriteStream] = js.undefined
  var tags: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in pino.pino.Level ]:? string}
    */ typings.hapiDashPino.hapiDashPinoStrings.Options with js.Any
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allTags: Level = null,
    getChildBindings: /* req */ Request => Anon_Key = null,
    ignorePaths: js.Array[String] = null,
    instance: Logger = null,
    level: Level = null,
    logEvents: js.Array[String] | `false` = null,
    logPayload: js.UndefOr[Boolean] = js.undefined,
    logRequestStart: js.UndefOr[Boolean] = js.undefined,
    logRouteTags: js.UndefOr[Boolean] = js.undefined,
    mergeHapiLogData: js.UndefOr[Boolean] = js.undefined,
    prettyPrint: Boolean | PrettyOptions = null,
    redact: js.Array[String] | redactOptions = null,
    serializers: Serializers = null,
    stream: WriteStream = null,
    tags: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in pino.pino.Level ]:? string}
    */ typings.hapiDashPino.hapiDashPinoStrings.Options with js.Any = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (allTags != null) __obj.updateDynamic("allTags")(allTags.asInstanceOf[js.Any])
    if (getChildBindings != null) __obj.updateDynamic("getChildBindings")(js.Any.fromFunction1(getChildBindings))
    if (ignorePaths != null) __obj.updateDynamic("ignorePaths")(ignorePaths.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (logEvents != null) __obj.updateDynamic("logEvents")(logEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(logPayload)) __obj.updateDynamic("logPayload")(logPayload.asInstanceOf[js.Any])
    if (!js.isUndefined(logRequestStart)) __obj.updateDynamic("logRequestStart")(logRequestStart.asInstanceOf[js.Any])
    if (!js.isUndefined(logRouteTags)) __obj.updateDynamic("logRouteTags")(logRouteTags.asInstanceOf[js.Any])
    if (!js.isUndefined(mergeHapiLogData)) __obj.updateDynamic("mergeHapiLogData")(mergeHapiLogData.asInstanceOf[js.Any])
    if (prettyPrint != null) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (redact != null) __obj.updateDynamic("redact")(redact.asInstanceOf[js.Any])
    if (serializers != null) __obj.updateDynamic("serializers")(serializers.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

