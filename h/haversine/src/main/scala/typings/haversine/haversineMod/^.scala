package typings.haversine.haversineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("haversine", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Determines the great-circle distance between two points on a sphere given their longitudes and latitudes
    */
  def apply(start: ParamType[js.UndefOr[Options]], end: ParamType[js.UndefOr[Options]]): Return[Options] = js.native
  def apply(start: ParamType[Options], end: ParamType[Options], options: Options): Return[Options] = js.native
}

