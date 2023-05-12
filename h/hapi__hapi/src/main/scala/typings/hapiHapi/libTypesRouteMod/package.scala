package typings.hapiHapi.libTypesRouteMod

import typings.hapiHapi.hapiHapiBooleans.`false`
import typings.hapiHapi.libTypesRequestMod.ReqRef
import typings.hapiHapi.libTypesUtilsMod.Lifecycle.Method
import typings.hapiHapi.libTypesUtilsMod.Lifecycle.ReturnValue
import typings.joi.mod.Schema
import typings.joi.mod.SchemaMap
import typings.joi.mod.ValidationOptions
import typings.node.bufferMod.global.Buffer
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type PayloadCompressionDecoderSettings = js.Object

type RouteCompressionEncoderSettings = js.Object

/* Rewritten from type alias, can be one of: 
  - typings.hapiHapi.libTypesRouteMod.RouteOptionsAccessScopeObject
  - typings.hapiHapi.libTypesRouteMod.RouteOptionsAccessEntityObject
  - typings.hapiHapi.libTypesRouteMod.RouteOptionsAccessScopeObject & typings.hapiHapi.libTypesRouteMod.RouteOptionsAccessEntityObject
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
/* rules */ (/* import warning: importer.ImportType#apply Failed type conversion: @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['Rules'] */ js.Any) | Null, 
/* info */ RulesInfo, 
Partial[RouteOptions[Refs]] | Null]

type ValidationObject = SchemaMap[Any, `false`]
