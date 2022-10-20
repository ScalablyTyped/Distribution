package typings.hapiHapi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.hapiCatbox.mod.ClientOptions
import typings.hapiCatbox.mod.EnginePrototype
import typings.hapiCatbox.mod.PolicyOptionVariants
import typings.hapiHapi.anon.Cache
import typings.hapiHapi.anon.Constructor
import typings.hapiHapi.hapiHapiBooleans.`false`
import typings.hapiHapi.hapiHapiBooleans.`true`
import typings.hapiHapi.mod.Lifecycle.Method
import typings.hapiHapi.mod.Lifecycle.ReturnValue
import typings.hapiHapi.mod.Util.Dictionary
import typings.hapiHapi.mod.^
import typings.joi.mod.Schema
import typings.joi.mod.SchemaMap
import typings.joi.mod.ValidationOptions
import typings.node.bufferMod.global.Buffer
import typings.std.Omit
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def server(): Server_ = ^.asInstanceOf[js.Dynamic].applyDynamic("server")().asInstanceOf[Server_]
inline def server(opts: ServerOptions): Server_ = ^.asInstanceOf[js.Dynamic].applyDynamic("server")(opts.asInstanceOf[js.Any]).asInstanceOf[Server_]

type AuthArtifacts = StringDictionary[Any]

type CachePolicyOptions[T] = PolicyOptionVariants[T] & Cache

type CacheProvider[T /* <: ClientOptions */] = EnginePrototype[Any] | Constructor[T]

type DecorateName = String | js.Symbol

type Dependencies = String | js.Array[String] | StringDictionary[String]

type LogEventHandler = js.Function2[/* event */ LogEvent, /* tags */ StringDictionary[`true`], Unit]

type MergeRefs[T /* <: ReqRef */] = MergeType[ReqRefDefaults, T]

type MergeType[T /* <: js.Object */, U /* <: js.Object */] = (Omit[T, /* keyof U */ String]) & U

type PayloadCompressionDecoderSettings = js.Object

type PeekListener = js.Function2[/* chunk */ String, /* encoding */ String, Unit]

type Plugin[T] = (PluginNameVersion & PluginBase[T]) | (PluginPackage & PluginBase[T])

type ReqRefDefaults = InternalRequestDefaults

type RequestEventHandler = js.Function3[
/* request */ Request[ReqRefDefaults], 
/* event */ RequestEvent, 
/* tags */ StringDictionary[`true`], 
Unit]

type RequestQuery = StringDictionary[Any]

type ResponseEventHandler = js.Function1[/* request */ Request[ReqRefDefaults], Unit]

type ResponseValue = String | js.Object

type RouteCompressionEncoderSettings = js.Object

type RouteEventHandler = js.Function1[/* route */ RequestRoute, Unit]

/* Rewritten from type alias, can be one of: 
  - typings.hapiHapi.mod.RouteOptionsAccessScopeObject
  - typings.hapiHapi.mod.RouteOptionsAccessEntityObject
  - typings.hapiHapi.mod.RouteOptionsAccessScopeObject & typings.hapiHapi.mod.RouteOptionsAccessEntityObject
*/
type RouteOptionsAccessObject = _RouteOptionsAccessObject | (RouteOptionsAccessScopeObject & RouteOptionsAccessEntityObject)

type RouteOptionsAccessScope = `false` | String | js.Array[String]

type RouteOptionsPreAllOptions[Refs /* <: ReqRef */] = RouteOptionsPreObject[Refs] | js.Array[RouteOptionsPreObject[Refs]] | (Method[Refs, ReturnValue[Refs]])

type RouteOptionsPreArray[Refs /* <: ReqRef */] = js.Array[RouteOptionsPreAllOptions[Refs]]

type RouteOptionsResponseSchema = Boolean | ValidationObject | Schema[Any] | (js.Function2[
/* value */ js.Object | Buffer | String, 
/* options */ ValidationOptions, 
js.Promise[Any]])

type RouteOptionsSecure = Boolean | RouteOptionsSecureObject

type RulesProcessor[Refs /* <: ReqRef */] = js.Function2[
/* rules */ (/* import warning: importer.ImportType#apply Failed type conversion: @hapi/hapi.@hapi/hapi.MergeRefs<Refs>['Rules'] */ js.Any) | Null, 
/* info */ RulesInfo, 
Partial[RouteOptions[Refs]] | Null]

type ServerAuthConfig = RouteOptionsAccess

type ServerAuthScheme[// tslint:disable-next-line no-unnecessary-generics
Options /* <: ServerAuthSchemeOptions */, // tslint:disable-next-line no-unnecessary-generics
Refs /* <: ReqRef */] = js.Function2[
/* server */ Server_, 
/* options */ js.UndefOr[Options], 
ServerAuthSchemeObject[Refs]]

type ServerAuthSchemeOptions = js.Object

type ServerEventsApplication = String | ServerEventsApplicationObject | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Podium */ Any)

type ServerExtPointFunction = js.Function1[/* server */ Server_, Unit]

type ServerMethods = Dictionary[ServerMethod]

type ServerRegisterPluginObjectArray[T, U, V, W, X, Y, Z] = js.Array[ServerRegisterPluginObject[T | U | V | W | X | Y | Z]]

type StartEventHandler = js.Function0[Unit]

type StopEventHandler = js.Function0[Unit]

type ValidationObject = SchemaMap[Any, `false`]
