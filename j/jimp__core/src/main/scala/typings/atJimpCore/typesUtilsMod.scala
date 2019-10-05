package typings.atJimpCore

import typings.atJimpCore.typesEtcMod.Image
import typings.atJimpCore.typesPluginsMod.JimpPlugin
import typings.atJimpCore.typesPluginsMod.JimpType
import typings.atJimpCore.typesUtilsMod.FunctionRet
import typings.atJimpCore.typesUtilsMod.GetPluginFuncArrValues
import typings.atJimpCore.typesUtilsMod.GetPluginVal
import typings.atJimpCore.typesUtilsMod.UnionToIntersection
import typings.atJimpCore.typesUtilsMod.WellFormedValues
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/core/types/utils", JSImport.Namespace)
@js.native
object typesUtilsMod extends js.Object {
  type FunctionRet[T] = js.Array[js.Function1[/* props */ js.Array[js.Any] | scala.Nothing, T]]
  type GetIntersectionFromPlugins[PluginFuncArr /* <: FunctionRet[JimpPlugin[Image] | JimpType[Image]] */] = UnionToIntersection[GetPluginFuncArrValues[PluginFuncArr]]
  type GetPluginFuncArrValues[PluginFuncArr] = js.UndefOr[// Get the plugin value, may be ill-formed or well-formed
  GetPluginVal[js.Any]]
  type GetPluginVal[Q] = Q | WellFormedValues[Q]
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type UnionToIntersection[U] = js.Any
  type WellFormedValues[T /* <: js.Any */] = /* import warning: ImportType.apply Failed type conversion: T['class'] */ js.Any
}

