package typings.haversine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("haversine", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Determines the great-circle distance between two points on a sphere given their longitudes and latitudes
    */
  def apply[OptionsT /* <: js.UndefOr[Options] */](start: ParamType[OptionsT], end: ParamType[OptionsT]): Return[OptionsT] = js.native
  def apply[OptionsT /* <: js.UndefOr[Options] */](start: ParamType[OptionsT], end: ParamType[OptionsT], options: OptionsT): Return[OptionsT] = js.native
}

