package typings.hapiPino.mod

import typings.hapiHapi.mod.Request
import typings.hapiPino.anon.Dictkey
import typings.hapiPino.anon.keyinLevelstring
import typings.hapiPino.hapiPinoBooleans.`false`
import typings.node.processMod.global.NodeJS.WriteStream
import typings.pino.mod.Level
import typings.pino.mod.Logger
import typings.pino.mod.PrettyOptions
import typings.pino.mod.redactOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var allTags: js.UndefOr[Level] = js.native
  
  var getChildBindings: js.UndefOr[js.Function1[/* req */ Request, Dictkey]] = js.native
  
  var ignorePaths: js.UndefOr[js.Array[String]] = js.native
  
  var instance: js.UndefOr[Logger] = js.native
  
  var level: js.UndefOr[Level] = js.native
  
  var logEvents: js.UndefOr[js.Array[String] | `false` | Null] = js.native
  
  var logPayload: js.UndefOr[Boolean] = js.native
  
  var logRequestComplete: js.UndefOr[Boolean | (js.Function1[/* req */ Request, Boolean])] = js.native
  
  var logRequestStart: js.UndefOr[Boolean | (js.Function1[/* req */ Request, Boolean])] = js.native
  
  var logRouteTags: js.UndefOr[Boolean] = js.native
  
  var mergeHapiLogData: js.UndefOr[Boolean] = js.native
  
  var prettyPrint: js.UndefOr[Boolean | PrettyOptions] = js.native
  
  var redact: js.UndefOr[js.Array[String] | redactOptions] = js.native
  
  var serializers: js.UndefOr[Serializers] = js.native
  
  var stream: js.UndefOr[WriteStream] = js.native
  
  var tags: js.UndefOr[keyinLevelstring] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllTags(value: Level): Self = this.set("allTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllTags: Self = this.set("allTags", js.undefined)
    
    @scala.inline
    def setGetChildBindings(value: /* req */ Request => Dictkey): Self = this.set("getChildBindings", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetChildBindings: Self = this.set("getChildBindings", js.undefined)
    
    @scala.inline
    def setIgnorePathsVarargs(value: String*): Self = this.set("ignorePaths", js.Array(value :_*))
    
    @scala.inline
    def setIgnorePaths(value: js.Array[String]): Self = this.set("ignorePaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnorePaths: Self = this.set("ignorePaths", js.undefined)
    
    @scala.inline
    def setInstance(value: Logger): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    
    @scala.inline
    def setLevel(value: Level): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setLogEventsVarargs(value: String*): Self = this.set("logEvents", js.Array(value :_*))
    
    @scala.inline
    def setLogEvents(value: js.Array[String] | `false`): Self = this.set("logEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogEvents: Self = this.set("logEvents", js.undefined)
    
    @scala.inline
    def setLogEventsNull: Self = this.set("logEvents", null)
    
    @scala.inline
    def setLogPayload(value: Boolean): Self = this.set("logPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogPayload: Self = this.set("logPayload", js.undefined)
    
    @scala.inline
    def setLogRequestCompleteFunction1(value: /* req */ Request => Boolean): Self = this.set("logRequestComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLogRequestComplete(value: Boolean | (js.Function1[/* req */ Request, Boolean])): Self = this.set("logRequestComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogRequestComplete: Self = this.set("logRequestComplete", js.undefined)
    
    @scala.inline
    def setLogRequestStartFunction1(value: /* req */ Request => Boolean): Self = this.set("logRequestStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLogRequestStart(value: Boolean | (js.Function1[/* req */ Request, Boolean])): Self = this.set("logRequestStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogRequestStart: Self = this.set("logRequestStart", js.undefined)
    
    @scala.inline
    def setLogRouteTags(value: Boolean): Self = this.set("logRouteTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogRouteTags: Self = this.set("logRouteTags", js.undefined)
    
    @scala.inline
    def setMergeHapiLogData(value: Boolean): Self = this.set("mergeHapiLogData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeHapiLogData: Self = this.set("mergeHapiLogData", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean | PrettyOptions): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    
    @scala.inline
    def setRedactVarargs(value: String*): Self = this.set("redact", js.Array(value :_*))
    
    @scala.inline
    def setRedact(value: js.Array[String] | redactOptions): Self = this.set("redact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedact: Self = this.set("redact", js.undefined)
    
    @scala.inline
    def setSerializers(value: Serializers): Self = this.set("serializers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerializers: Self = this.set("serializers", js.undefined)
    
    @scala.inline
    def setStream(value: WriteStream): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    
    @scala.inline
    def setTags(value: keyinLevelstring): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
