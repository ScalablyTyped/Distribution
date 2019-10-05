package typings.heredatalens.H.datalens.QueryTileProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the names of the URI parameters that control the x/y/z of tiled query.
  * When defining the Data Lens query, dynamic parameters that control tiling can be arbitrarily named.
  * Names of these parameters must be specified to fetch tiles.
  */
trait TileParamNames extends js.Object {
  /** Name of the dynamic parameter that defines tile column */
  var x: String
  /** Name of the dynamic parameter that defines tile row */
  var y: String
  /** Name of the dynamic parameter that defines zoom level */
  var z: String
}

object TileParamNames {
  @scala.inline
  def apply(x: String, y: String, z: String): TileParamNames = {
    val __obj = js.Dynamic.literal(x = x, y = y, z = z)
  
    __obj.asInstanceOf[TileParamNames]
  }
}

