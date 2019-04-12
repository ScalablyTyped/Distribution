package typings
package atHapiHapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atHapiHapiMod {
  type CachePolicyOptions[T] = atHapiCatboxLib.atHapiCatboxMod.PolicyOptionVariants[T] with atHapiHapiLib.Anon_Cache
  type CacheProvider[T /* <: atHapiCatboxLib.atHapiCatboxMod.ClientOptions */] = atHapiCatboxLib.atHapiCatboxMod.EnginePrototype[js.Any] | atHapiHapiLib.Anon_Constructor[T]
  type DecorateName = java.lang.String | js.Symbol
  type DecorationMethod[T] = js.ThisFunction1[/* this */ T, /* repeated */ js.Any, js.Any]
  type Dependencies = java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type LogEventHandler = js.Function2[
    /* event */ LogEvent, 
    /* tags */ org.scalablytyped.runtime.StringDictionary[atHapiHapiLib.atHapiHapiLibNumbers.`true`], 
    scala.Unit
  ]
  type PayloadCompressionDecoderSettings = js.Object
  type PeekListener = js.Function2[/* chunk */ java.lang.String, /* encoding */ java.lang.String, scala.Unit]
  type Plugin[T] = PluginBase[T] with (PluginNameVersion | PluginPackage)
  type RequestEventHandler = js.Function3[
    /* request */ Request, 
    /* event */ RequestEvent, 
    /* tags */ org.scalablytyped.runtime.StringDictionary[atHapiHapiLib.atHapiHapiLibNumbers.`true`], 
    scala.Unit
  ]
  type ResponseEventHandler = js.Function1[/* request */ Request, scala.Unit]
  type ResponseValue = java.lang.String | js.Object
  type RouteCompressionEncoderSettings = js.Object
  type RouteEventHandler = js.Function1[/* route */ RequestRoute, scala.Unit]
  /* Rewritten from type alias, can be one of: 
    - RouteOptionsAccessScopeObject
    - RouteOptionsAccessEntityObject
    - RouteOptionsAccessScopeObject with RouteOptionsAccessEntityObject
  */
  type RouteOptionsAccessObject = _RouteOptionsAccessObject | (RouteOptionsAccessScopeObject with RouteOptionsAccessEntityObject)
  type RouteOptionsAccessScope = atHapiHapiLib.atHapiHapiLibNumbers.`false` | java.lang.String | js.Array[java.lang.String]
  type RouteOptionsCache = atHapiHapiLib.Anon_Default with (atHapiHapiLib.Anon_ExpiresAt | atHapiHapiLib.Anon_ExpiresAtExpiresIn | atHapiHapiLib.Anon_ExpiresAtExpiresInUndefined)
  type RouteOptionsPreAllOptions = RouteOptionsPreObject | js.Array[RouteOptionsPreObject] | atHapiHapiLib.atHapiHapiMod.LifecycleNs.Method
  type RouteOptionsPreArray = js.Array[RouteOptionsPreAllOptions]
  type RouteOptionsResponseSchema = scala.Boolean | ValidationObject | atHapiJoiLib.atHapiJoiMod.Schema | (js.Function2[
    /* value */ js.Object | nodeLib.Buffer | java.lang.String, 
    /* options */ atHapiJoiLib.atHapiJoiMod.ValidationOptions, 
    js.Promise[js.Any]
  ])
  type RouteOptionsSecure = scala.Boolean | RouteOptionsSecureObject
  type ServerAuthConfig = RouteOptionsAccess
  type ServerAuthScheme = js.Function2[
    /* server */ Server, 
    /* options */ js.UndefOr[ServerAuthSchemeOptions], 
    ServerAuthSchemeObject
  ]
  type ServerAuthSchemeOptions = js.Object
  type ServerEventsApplication = java.lang.String | ServerEventsApplicationObject | atHapiPodiumLib.atHapiPodiumMod.Podium
  type ServerExtPointFunction = js.Function1[/* server */ Server, scala.Unit]
  type ServerMethod = js.Function1[/* repeated */ js.Any, js.Any]
  type StartEventHandler = js.Function0[scala.Unit]
  type StopEventHandler = js.Function0[scala.Unit]
  type ValidationObject = atHapiJoiLib.atHapiJoiMod.SchemaMap
}
