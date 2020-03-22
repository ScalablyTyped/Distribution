package typings.hapiHapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CachePolicyOptions[T] = typings.hapiCatbox.mod.PolicyOptionVariants[T] with typings.hapiHapi.AnonCache
  type CacheProvider[T /* <: typings.hapiCatbox.mod.ClientOptions */] = typings.hapiCatbox.mod.EnginePrototype[js.Any] | typings.hapiHapi.AnonConstructor[T]
  type DecorateName = java.lang.String | js.Symbol
  type DecorationMethod[T] = js.ThisFunction1[/* this */ T, /* repeated */ js.Any, js.Any]
  type Dependencies = java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type LogEventHandler = js.Function2[
    /* event */ typings.hapiHapi.mod.LogEvent, 
    /* tags */ org.scalablytyped.runtime.StringDictionary[typings.hapiHapi.hapiHapiBooleans.`true`], 
    scala.Unit
  ]
  type PayloadCompressionDecoderSettings = js.Object
  type PeekListener = js.Function2[/* chunk */ java.lang.String, /* encoding */ java.lang.String, scala.Unit]
  type Plugin[T] = typings.hapiHapi.mod.PluginBase[T] with (typings.hapiHapi.mod.PluginNameVersion | typings.hapiHapi.mod.PluginPackage)
  type RequestEventHandler = js.Function3[
    /* request */ typings.hapiHapi.mod.Request, 
    /* event */ typings.hapiHapi.mod.RequestEvent, 
    /* tags */ org.scalablytyped.runtime.StringDictionary[typings.hapiHapi.hapiHapiBooleans.`true`], 
    scala.Unit
  ]
  type RequestQuery = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type ResponseEventHandler = js.Function1[/* request */ typings.hapiHapi.mod.Request, scala.Unit]
  type ResponseValue = java.lang.String | js.Object
  type RouteCompressionEncoderSettings = js.Object
  type RouteEventHandler = js.Function1[/* route */ typings.hapiHapi.mod.RequestRoute, scala.Unit]
  /* Rewritten from type alias, can be one of: 
    - typings.hapiHapi.mod.RouteOptionsAccessScopeObject
    - typings.hapiHapi.mod.RouteOptionsAccessEntityObject
    - typings.hapiHapi.mod.RouteOptionsAccessScopeObject with typings.hapiHapi.mod.RouteOptionsAccessEntityObject
  */
  type RouteOptionsAccessObject = typings.hapiHapi.mod._RouteOptionsAccessObject | (typings.hapiHapi.mod.RouteOptionsAccessScopeObject with typings.hapiHapi.mod.RouteOptionsAccessEntityObject)
  type RouteOptionsAccessScope = typings.hapiHapi.hapiHapiBooleans.`false` | java.lang.String | js.Array[java.lang.String]
  type RouteOptionsCache = typings.hapiHapi.AnonOtherwise with (typings.hapiHapi.AnonExpiresAt | typings.hapiHapi.AnonExpiresIn | typings.hapiHapi.AnonExpiresAtExpiresIn)
  type RouteOptionsPreAllOptions = typings.hapiHapi.mod.RouteOptionsPreObject | js.Array[typings.hapiHapi.mod.RouteOptionsPreObject] | typings.hapiHapi.mod.Lifecycle.Method
  type RouteOptionsPreArray = js.Array[typings.hapiHapi.mod.RouteOptionsPreAllOptions]
  type RouteOptionsResponseSchema = scala.Boolean | typings.hapiHapi.mod.ValidationObject | typings.hapiJoi.mod.Schema | (js.Function2[
    /* value */ js.Object | typings.node.Buffer | java.lang.String, 
    /* options */ typings.hapiJoi.mod.ValidationOptions, 
    js.Promise[js.Any]
  ])
  type RouteOptionsSecure = scala.Boolean | typings.hapiHapi.mod.RouteOptionsSecureObject
  type ServerAuthConfig = typings.hapiHapi.mod.RouteOptionsAccess
  type ServerAuthScheme = js.Function2[
    /* server */ typings.hapiHapi.mod.Server, 
    /* options */ js.UndefOr[typings.hapiHapi.mod.ServerAuthSchemeOptions], 
    typings.hapiHapi.mod.ServerAuthSchemeObject
  ]
  type ServerAuthSchemeOptions = js.Object
  type ServerEventsApplication = java.lang.String | typings.hapiHapi.mod.ServerEventsApplicationObject | typings.hapiPodium.mod.Podium
  type ServerExtPointFunction = js.Function1[/* server */ typings.hapiHapi.mod.Server, scala.Unit]
  type ServerMethod = js.Function1[/* repeated */ js.Any, js.Any]
  type ServerMethods = typings.hapiHapi.mod.Util.Dictionary[typings.hapiHapi.mod.ServerMethod]
  type StartEventHandler = js.Function0[scala.Unit]
  type StopEventHandler = js.Function0[scala.Unit]
  type ValidationObject = typings.hapiJoi.mod.SchemaMap[js.Any]
}
