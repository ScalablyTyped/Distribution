package typings
package heredatalensLib.HNs.datalensNs.QueryTileProviderNs

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
  var x: java.lang.String
  /** Name of the dynamic parameter that defines tile row */
  var y: java.lang.String
  /** Name of the dynamic parameter that defines zoom level */
  var z: java.lang.String
}

