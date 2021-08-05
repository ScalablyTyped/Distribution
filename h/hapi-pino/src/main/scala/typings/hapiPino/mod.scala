package typings.hapiPino

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.hapiHapi.mod.Plugin
import typings.hapiHapi.mod.Request
import typings.hapiPino.anon.Dictkey
import typings.hapiPino.anon.keyinLevelstring
import typings.hapiPino.hapiPinoBooleans.`false`
import typings.node.processMod.global.NodeJS.WriteStream
import typings.pino.mod.Level
import typings.pino.mod.Logger
import typings.pino.mod.PrettyOptions
import typings.pino.mod.SerializerFn
import typings.pino.mod.redactOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("hapi-pino", JSImport.Namespace)
  @js.native
  val ^ : Plugin[Options] = js.native
  
  trait Options extends StObject {
    
    var allTags: js.UndefOr[Level] = js.undefined
    
    var getChildBindings: js.UndefOr[js.Function1[/* req */ Request, Dictkey]] = js.undefined
    
    var ignorePaths: js.UndefOr[js.Array[String]] = js.undefined
    
    var instance: js.UndefOr[Logger] = js.undefined
    
    var level: js.UndefOr[Level] = js.undefined
    
    var logEvents: js.UndefOr[js.Array[String] | `false` | Null] = js.undefined
    
    var logPayload: js.UndefOr[Boolean] = js.undefined
    
    var logRequestComplete: js.UndefOr[Boolean | (js.Function1[/* req */ Request, Boolean])] = js.undefined
    
    var logRequestStart: js.UndefOr[Boolean | (js.Function1[/* req */ Request, Boolean])] = js.undefined
    
    var logRouteTags: js.UndefOr[Boolean] = js.undefined
    
    var mergeHapiLogData: js.UndefOr[Boolean] = js.undefined
    
    var prettyPrint: js.UndefOr[Boolean | PrettyOptions] = js.undefined
    
    var redact: js.UndefOr[js.Array[String] | redactOptions] = js.undefined
    
    var serializers: js.UndefOr[Serializers] = js.undefined
    
    var stream: js.UndefOr[WriteStream] = js.undefined
    
    var tags: js.UndefOr[keyinLevelstring] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllTags(value: Level): Self = StObject.set(x, "allTags", value.asInstanceOf[js.Any])
      
      inline def setAllTagsUndefined: Self = StObject.set(x, "allTags", js.undefined)
      
      inline def setGetChildBindings(value: /* req */ Request => Dictkey): Self = StObject.set(x, "getChildBindings", js.Any.fromFunction1(value))
      
      inline def setGetChildBindingsUndefined: Self = StObject.set(x, "getChildBindings", js.undefined)
      
      inline def setIgnorePaths(value: js.Array[String]): Self = StObject.set(x, "ignorePaths", value.asInstanceOf[js.Any])
      
      inline def setIgnorePathsUndefined: Self = StObject.set(x, "ignorePaths", js.undefined)
      
      inline def setIgnorePathsVarargs(value: String*): Self = StObject.set(x, "ignorePaths", js.Array(value :_*))
      
      inline def setInstance(value: Logger): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
      
      inline def setLevel(value: Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setLogEvents(value: js.Array[String] | `false`): Self = StObject.set(x, "logEvents", value.asInstanceOf[js.Any])
      
      inline def setLogEventsNull: Self = StObject.set(x, "logEvents", null)
      
      inline def setLogEventsUndefined: Self = StObject.set(x, "logEvents", js.undefined)
      
      inline def setLogEventsVarargs(value: String*): Self = StObject.set(x, "logEvents", js.Array(value :_*))
      
      inline def setLogPayload(value: Boolean): Self = StObject.set(x, "logPayload", value.asInstanceOf[js.Any])
      
      inline def setLogPayloadUndefined: Self = StObject.set(x, "logPayload", js.undefined)
      
      inline def setLogRequestComplete(value: Boolean | (js.Function1[/* req */ Request, Boolean])): Self = StObject.set(x, "logRequestComplete", value.asInstanceOf[js.Any])
      
      inline def setLogRequestCompleteFunction1(value: /* req */ Request => Boolean): Self = StObject.set(x, "logRequestComplete", js.Any.fromFunction1(value))
      
      inline def setLogRequestCompleteUndefined: Self = StObject.set(x, "logRequestComplete", js.undefined)
      
      inline def setLogRequestStart(value: Boolean | (js.Function1[/* req */ Request, Boolean])): Self = StObject.set(x, "logRequestStart", value.asInstanceOf[js.Any])
      
      inline def setLogRequestStartFunction1(value: /* req */ Request => Boolean): Self = StObject.set(x, "logRequestStart", js.Any.fromFunction1(value))
      
      inline def setLogRequestStartUndefined: Self = StObject.set(x, "logRequestStart", js.undefined)
      
      inline def setLogRouteTags(value: Boolean): Self = StObject.set(x, "logRouteTags", value.asInstanceOf[js.Any])
      
      inline def setLogRouteTagsUndefined: Self = StObject.set(x, "logRouteTags", js.undefined)
      
      inline def setMergeHapiLogData(value: Boolean): Self = StObject.set(x, "mergeHapiLogData", value.asInstanceOf[js.Any])
      
      inline def setMergeHapiLogDataUndefined: Self = StObject.set(x, "mergeHapiLogData", js.undefined)
      
      inline def setPrettyPrint(value: Boolean | PrettyOptions): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      inline def setRedact(value: js.Array[String] | redactOptions): Self = StObject.set(x, "redact", value.asInstanceOf[js.Any])
      
      inline def setRedactUndefined: Self = StObject.set(x, "redact", js.undefined)
      
      inline def setRedactVarargs(value: String*): Self = StObject.set(x, "redact", js.Array(value :_*))
      
      inline def setSerializers(value: Serializers): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
      
      inline def setSerializersUndefined: Self = StObject.set(x, "serializers", js.undefined)
      
      inline def setStream(value: WriteStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      inline def setTags(value: keyinLevelstring): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  type Serializers = StringDictionary[SerializerFn]
  
  type _To = Plugin[Options]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Plugin[Options] = ^
  
  /* augmented module */
  object hapiHapiAugmentingMod {
    
    trait Request extends StObject {
      
      var logger: Logger
    }
    object Request {
      
      inline def apply(logger: Logger): typings.hapiPino.mod.hapiHapiAugmentingMod.Request = {
        val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.hapiPino.mod.hapiHapiAugmentingMod.Request]
      }
      
      extension [Self <: typings.hapiPino.mod.hapiHapiAugmentingMod.Request](x: Self) {
        
        inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      }
    }
    
    trait Server extends StObject {
      
      var logger: Logger
    }
    object Server {
      
      inline def apply(logger: Logger): Server = {
        val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
        __obj.asInstanceOf[Server]
      }
      
      extension [Self <: Server](x: Self) {
        
        inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      }
    }
  }
}
