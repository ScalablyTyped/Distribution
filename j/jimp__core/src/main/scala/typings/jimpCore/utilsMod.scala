package typings.jimpCore

import typings.jimpCore.anon.DecodersEncoders
import typings.jimpCore.etcMod.Image
import typings.jimpCore.pluginsMod.JimpPlugin
import typings.jimpCore.pluginsMod.JimpType
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  type FunctionRet[T] = js.Array[js.Function1[/* props */ js.Array[Any] | scala.Nothing, T]]
  
  type GetIntersectionFromPlugins[PluginFuncArr /* <: FunctionRet[JimpPlugin[Image] | JimpType[Image]] */] = UnionToIntersection[Exclude[GetPluginFuncArrValues[PluginFuncArr], Unit]]
  
  type GetIntersectionFromPluginsStatics[PluginFuncArr /* <: FunctionRet[JimpPlugin[Image] | JimpType[Image]] */] = UnionToIntersection[GetPluginFuncArrConsts[PluginFuncArr]] & DecodersEncoders[PluginFuncArr]
  
  type GetPluginConst[Q] = js.Object | WellFormedConstants[Q]
  
  type GetPluginDecoders[Q] = js.Object
  
  type GetPluginEncoders[Q] = js.Object
  
  type GetPluginFuncArrConsts[PluginFuncArr] = js.UndefOr[
    // Get the plugin constants, may be ill-formed or well-formed
  GetPluginConst[Any]
  ]
  
  type GetPluginFuncArrDecoders[PluginFuncArr] = js.UndefOr[
    // Get the plugin decoders, may be ill-formed or well-formed
  GetPluginDecoders[Any]
  ]
  
  type GetPluginFuncArrEncoders[PluginFuncArr] = js.UndefOr[
    // Get the plugin encoders, may be ill-formed or well-formed
  GetPluginEncoders[Any]
  ]
  
  type GetPluginFuncArrValues[PluginFuncArr] = js.UndefOr[// Get the plugin value, may be ill-formed or well-formed
  GetPluginVal[Any]]
  
  type GetPluginVal[Q] = Q | WellFormedValues[Q]
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type UnionToIntersection[U] = Any
  
  type WellFormedConstants[T /* <: Any */] = js.Object
  
  type WellFormedValues[T /* <: Any */] = js.Object
}
