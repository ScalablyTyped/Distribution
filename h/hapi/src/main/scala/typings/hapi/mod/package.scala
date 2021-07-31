package typings.hapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CachePolicyOptions[T] = typings.catbox.mod.PolicyOptionVariants[T] & typings.hapi.anon.Cache

type CacheProvider[T /* <: typings.catbox.mod.ClientOptions */] = typings.catbox.mod.EnginePrototype[js.Any] | typings.hapi.anon.Constructor[T]

type DecorateName = java.lang.String | js.Symbol

type Dependencies = java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[java.lang.String]

type LogEventHandler = js.Function2[
/* event */ typings.hapi.mod.LogEvent, 
/* tags */ org.scalablytyped.runtime.StringDictionary[typings.hapi.hapiBooleans.`true`], 
scala.Unit]

type PayloadCompressionDecoderSettings = js.Object

type PeekListener = js.Function2[/* chunk */ java.lang.String, /* encoding */ java.lang.String, scala.Unit]

type Plugin[T] = typings.hapi.mod.PluginBase[T] & (typings.hapi.mod.PluginNameVersion | typings.hapi.mod.PluginPackage)

type RequestEventHandler = js.Function3[
/* request */ typings.hapi.mod.Request, 
/* event */ typings.hapi.mod.RequestEvent, 
/* tags */ org.scalablytyped.runtime.StringDictionary[typings.hapi.hapiBooleans.`true`], 
scala.Unit]

type RequestQuery = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]

type ResponseEventHandler = js.Function1[/* request */ typings.hapi.mod.Request, scala.Unit]

type ResponseValue = java.lang.String | js.Object

type RouteCompressionEncoderSettings = js.Object

type RouteEventHandler = js.Function1[/* route */ typings.hapi.mod.RequestRoute, scala.Unit]

/* Rewritten from type alias, can be one of: 
  - typings.hapi.mod.RouteOptionsAccessScopeObject
  - typings.hapi.mod.RouteOptionsAccessEntityObject
  - typings.hapi.mod.RouteOptionsAccessScopeObject & typings.hapi.mod.RouteOptionsAccessEntityObject
*/
type RouteOptionsAccessObject = typings.hapi.mod._RouteOptionsAccessObject | (typings.hapi.mod.RouteOptionsAccessScopeObject & typings.hapi.mod.RouteOptionsAccessEntityObject)

type RouteOptionsAccessScope = typings.hapi.hapiBooleans.`false` | java.lang.String | js.Array[java.lang.String]

type RouteOptionsCache = typings.hapi.anon.Otherwise & (typings.hapi.anon.ExpiresAt | typings.hapi.anon.ExpiresIn | typings.hapi.anon.ExpiresAtExpiresIn)

type RouteOptionsPreAllOptions = typings.hapi.mod.RouteOptionsPreObject | js.Array[typings.hapi.mod.RouteOptionsPreObject] | typings.hapi.mod.Lifecycle.Method

type RouteOptionsPreArray = js.Array[typings.hapi.mod.RouteOptionsPreAllOptions]

type RouteOptionsResponseSchema = scala.Boolean | typings.hapi.mod.ValidationObject | typings.joi.mod.Schema | (js.Function2[
/* value */ js.Object | typings.node.Buffer | java.lang.String, 
/* options */ typings.joi.mod.ValidationOptions, 
js.Promise[js.Any]])

type RouteOptionsSecure = scala.Boolean | typings.hapi.mod.RouteOptionsSecureObject

type ServerAuthConfig = typings.hapi.mod.RouteOptionsAccess

type ServerAuthScheme = js.Function2[
/* server */ typings.hapi.mod.Server, 
/* options */ js.UndefOr[typings.hapi.mod.ServerAuthSchemeOptions], 
typings.hapi.mod.ServerAuthSchemeObject]

type ServerAuthSchemeOptions = js.Object

type ServerEventsApplication = java.lang.String | typings.hapi.mod.ServerEventsApplicationObject | typings.podium.mod.Podium

type ServerExtPointFunction = js.Function1[/* server */ typings.hapi.mod.Server, scala.Unit]

type ServerMethods = typings.hapi.mod.Util.Dictionary[typings.hapi.mod.ServerMethod]

type StartEventHandler = js.Function0[scala.Unit]

type StopEventHandler = js.Function0[scala.Unit]

type ValidationObject = typings.joi.mod.SchemaMap[js.Any]
