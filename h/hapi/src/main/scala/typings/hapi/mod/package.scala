package typings.hapi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.catbox.mod.ClientOptions
import typings.catbox.mod.EnginePrototype
import typings.catbox.mod.PolicyOptionVariants
import typings.hapi.anon.Cache
import typings.hapi.anon.Constructor
import typings.hapi.hapiBooleans.`false`
import typings.hapi.hapiBooleans.`true`
import typings.hapi.mod.Lifecycle.Method
import typings.hapi.mod.Util.Dictionary
import typings.joi.mod.Schema
import typings.joi.mod.SchemaMap
import typings.joi.mod.ValidationOptions
import typings.node.bufferMod.global.Buffer
import typings.podium.mod.Podium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CachePolicyOptions[T] = PolicyOptionVariants[T] & Cache

type CacheProvider[T /* <: ClientOptions */] = EnginePrototype[Any] | Constructor[T]

type DecorateName = String | js.Symbol

type Dependencies = String | js.Array[String] | StringDictionary[String]

type LogEventHandler = js.Function2[/* event */ LogEvent, /* tags */ StringDictionary[`true`], Unit]

type PayloadCompressionDecoderSettings = js.Object

type PeekListener = js.Function2[/* chunk */ String, /* encoding */ String, Unit]

type Plugin[T] = (PluginNameVersion & PluginBase[T]) | (PluginPackage & PluginBase[T])

type RequestEventHandler = js.Function3[
/* request */ Request, 
/* event */ RequestEvent, 
/* tags */ StringDictionary[`true`], 
Unit]

type RequestQuery = StringDictionary[String | js.Array[String]]

type ResponseEventHandler = js.Function1[/* request */ Request, Unit]

type ResponseValue = String | js.Object

type RouteCompressionEncoderSettings = js.Object

type RouteEventHandler = js.Function1[/* route */ RequestRoute, Unit]

/* Rewritten from type alias, can be one of: 
  - typings.hapi.mod.RouteOptionsAccessScopeObject
  - typings.hapi.mod.RouteOptionsAccessEntityObject
  - typings.hapi.mod.RouteOptionsAccessScopeObject & typings.hapi.mod.RouteOptionsAccessEntityObject
*/
type RouteOptionsAccessObject = _RouteOptionsAccessObject | (RouteOptionsAccessScopeObject & RouteOptionsAccessEntityObject)

type RouteOptionsAccessScope = `false` | String | js.Array[String]

type RouteOptionsPreAllOptions = RouteOptionsPreObject | js.Array[RouteOptionsPreObject] | Method

type RouteOptionsPreArray = js.Array[RouteOptionsPreAllOptions]

type RouteOptionsResponseSchema = Boolean | ValidationObject | Schema[Any] | (js.Function2[
/* value */ js.Object | Buffer | String, 
/* options */ ValidationOptions, 
js.Promise[Any]])

type RouteOptionsSecure = Boolean | RouteOptionsSecureObject

type ServerAuthConfig = RouteOptionsAccess

type ServerAuthScheme = js.Function2[
/* server */ Server, 
/* options */ js.UndefOr[ServerAuthSchemeOptions], 
ServerAuthSchemeObject]

type ServerAuthSchemeOptions = js.Object

type ServerEventsApplication = String | ServerEventsApplicationObject | Podium

type ServerExtPointFunction = js.Function1[/* server */ Server, Unit]

type ServerMethods = Dictionary[ServerMethod]

type StartEventHandler = js.Function0[Unit]

type StopEventHandler = js.Function0[Unit]

type ValidationObject = SchemaMap[Any, `false`]
