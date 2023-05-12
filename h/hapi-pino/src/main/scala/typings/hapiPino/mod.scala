package typings.hapiPino

import org.scalablytyped.runtime.Shortcut
import typings.hapiHapi.libTypesPluginMod.Plugin
import typings.hapiPino.anon.Dictkey
import typings.hapiPino.anon.keyinLevelstring
import typings.hapiPino.hapiPinoBooleans.`false`
import typings.hapiPino.mod.hapiHapiAugmentingMod.Request
import typings.node.processMod.global.NodeJS.WriteStream
import typings.pino.mod.pino.Level
import typings.pino.mod.pino.Logger
import typings.pino.mod.pino.LoggerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("hapi-pino", JSImport.Namespace)
  @js.native
  val ^ : Plugin[Options, Unit] = js.native
  
  trait Options
    extends StObject
       with LoggerOptions {
    
    var allTags: js.UndefOr[Level] = js.undefined
    
    var customRequestCompleteMessage: js.UndefOr[js.Function2[/* req */ Request, /* responseTime */ Double, String]] = js.undefined
    
    var customRequestErrorMessage: js.UndefOr[js.Function2[/* req */ Request, /* error */ js.Error, String]] = js.undefined
    
    var customRequestStartMessage: js.UndefOr[js.Function1[/* req */ Request, String]] = js.undefined
    
    var getChildBindings: js.UndefOr[js.Function1[/* req */ Request, Dictkey]] = js.undefined
    
    var ignoreFunc: js.UndefOr[js.Function2[/* options */ this.type, /* request */ Request, Boolean]] = js.undefined
    
    var ignorePaths: js.UndefOr[js.Array[String]] = js.undefined
    
    var ignoreTags: js.UndefOr[js.Array[String]] = js.undefined
    
    var ignoredEventTags: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    var instance: js.UndefOr[Logger[LoggerOptions]] = js.undefined
    
    var log4xxResponseErrors: js.UndefOr[Boolean] = js.undefined
    
    var logEvents: js.UndefOr[js.Array[String] | `false` | Null] = js.undefined
    
    var logPathParams: js.UndefOr[Boolean] = js.undefined
    
    var logPayload: js.UndefOr[Boolean] = js.undefined
    
    var logQueryParams: js.UndefOr[Boolean] = js.undefined
    
    var logRequestComplete: js.UndefOr[Boolean | (js.Function1[/* req */ Request, Boolean])] = js.undefined
    
    var logRequestStart: js.UndefOr[Boolean | (js.Function1[/* req */ Request, Boolean])] = js.undefined
    
    var logRouteTags: js.UndefOr[Boolean] = js.undefined
    
    var mergeHapiLogData: js.UndefOr[Boolean] = js.undefined
    
    var stream: js.UndefOr[WriteStream] = js.undefined
    
    var tags: js.UndefOr[keyinLevelstring] = js.undefined
    
    @JSName("timestamp")
    var timestamp_Options: js.UndefOr[Boolean | js.Function0[String]] = js.undefined
    
    var wrapSerializers: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAllTags(value: Level): Self = StObject.set(x, "allTags", value.asInstanceOf[js.Any])
      
      inline def setAllTagsUndefined: Self = StObject.set(x, "allTags", js.undefined)
      
      inline def setCustomRequestCompleteMessage(value: (/* req */ Request, /* responseTime */ Double) => String): Self = StObject.set(x, "customRequestCompleteMessage", js.Any.fromFunction2(value))
      
      inline def setCustomRequestCompleteMessageUndefined: Self = StObject.set(x, "customRequestCompleteMessage", js.undefined)
      
      inline def setCustomRequestErrorMessage(value: (/* req */ Request, /* error */ js.Error) => String): Self = StObject.set(x, "customRequestErrorMessage", js.Any.fromFunction2(value))
      
      inline def setCustomRequestErrorMessageUndefined: Self = StObject.set(x, "customRequestErrorMessage", js.undefined)
      
      inline def setCustomRequestStartMessage(value: /* req */ Request => String): Self = StObject.set(x, "customRequestStartMessage", js.Any.fromFunction1(value))
      
      inline def setCustomRequestStartMessageUndefined: Self = StObject.set(x, "customRequestStartMessage", js.undefined)
      
      inline def setGetChildBindings(value: /* req */ Request => Dictkey): Self = StObject.set(x, "getChildBindings", js.Any.fromFunction1(value))
      
      inline def setGetChildBindingsUndefined: Self = StObject.set(x, "getChildBindings", js.undefined)
      
      inline def setIgnoreFunc(value: (Options, /* request */ Request) => Boolean): Self = StObject.set(x, "ignoreFunc", js.Any.fromFunction2(value))
      
      inline def setIgnoreFuncUndefined: Self = StObject.set(x, "ignoreFunc", js.undefined)
      
      inline def setIgnorePaths(value: js.Array[String]): Self = StObject.set(x, "ignorePaths", value.asInstanceOf[js.Any])
      
      inline def setIgnorePathsUndefined: Self = StObject.set(x, "ignorePaths", js.undefined)
      
      inline def setIgnorePathsVarargs(value: String*): Self = StObject.set(x, "ignorePaths", js.Array(value*))
      
      inline def setIgnoreTags(value: js.Array[String]): Self = StObject.set(x, "ignoreTags", value.asInstanceOf[js.Any])
      
      inline def setIgnoreTagsUndefined: Self = StObject.set(x, "ignoreTags", js.undefined)
      
      inline def setIgnoreTagsVarargs(value: String*): Self = StObject.set(x, "ignoreTags", js.Array(value*))
      
      inline def setIgnoredEventTags(value: js.Array[js.Object]): Self = StObject.set(x, "ignoredEventTags", value.asInstanceOf[js.Any])
      
      inline def setIgnoredEventTagsUndefined: Self = StObject.set(x, "ignoredEventTags", js.undefined)
      
      inline def setIgnoredEventTagsVarargs(value: js.Object*): Self = StObject.set(x, "ignoredEventTags", js.Array(value*))
      
      inline def setInstance(value: Logger[LoggerOptions]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
      
      inline def setLog4xxResponseErrors(value: Boolean): Self = StObject.set(x, "log4xxResponseErrors", value.asInstanceOf[js.Any])
      
      inline def setLog4xxResponseErrorsUndefined: Self = StObject.set(x, "log4xxResponseErrors", js.undefined)
      
      inline def setLogEvents(value: js.Array[String] | `false`): Self = StObject.set(x, "logEvents", value.asInstanceOf[js.Any])
      
      inline def setLogEventsNull: Self = StObject.set(x, "logEvents", null)
      
      inline def setLogEventsUndefined: Self = StObject.set(x, "logEvents", js.undefined)
      
      inline def setLogEventsVarargs(value: String*): Self = StObject.set(x, "logEvents", js.Array(value*))
      
      inline def setLogPathParams(value: Boolean): Self = StObject.set(x, "logPathParams", value.asInstanceOf[js.Any])
      
      inline def setLogPathParamsUndefined: Self = StObject.set(x, "logPathParams", js.undefined)
      
      inline def setLogPayload(value: Boolean): Self = StObject.set(x, "logPayload", value.asInstanceOf[js.Any])
      
      inline def setLogPayloadUndefined: Self = StObject.set(x, "logPayload", js.undefined)
      
      inline def setLogQueryParams(value: Boolean): Self = StObject.set(x, "logQueryParams", value.asInstanceOf[js.Any])
      
      inline def setLogQueryParamsUndefined: Self = StObject.set(x, "logQueryParams", js.undefined)
      
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
      
      inline def setStream(value: WriteStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      inline def setTags(value: keyinLevelstring): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTimestamp(value: Boolean | js.Function0[String]): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampFunction0(value: () => String): Self = StObject.set(x, "timestamp", js.Any.fromFunction0(value))
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setWrapSerializers(value: Boolean): Self = StObject.set(x, "wrapSerializers", value.asInstanceOf[js.Any])
      
      inline def setWrapSerializersUndefined: Self = StObject.set(x, "wrapSerializers", js.undefined)
    }
  }
  
  type _To = Plugin[Options, Unit]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Plugin[Options, Unit] = ^
  
  /* augmented module */
  object hapiHapiAugmentingMod {
    
    trait Request extends StObject {
      
      var logger: Logger[LoggerOptions]
    }
    object Request {
      
      inline def apply(logger: Logger[LoggerOptions]): Request = {
        val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
        __obj.asInstanceOf[Request]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
        
        inline def setLogger(value: Logger[LoggerOptions]): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      }
    }
    
    trait Server extends StObject {
      
      var logger: Logger[LoggerOptions]
    }
    object Server {
      
      inline def apply(logger: Logger[LoggerOptions]): Server = {
        val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
        __obj.asInstanceOf[Server]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Server] (val x: Self) extends AnyVal {
        
        inline def setLogger(value: Logger[LoggerOptions]): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      }
    }
  }
}
