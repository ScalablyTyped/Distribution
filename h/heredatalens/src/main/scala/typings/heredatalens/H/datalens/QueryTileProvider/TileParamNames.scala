package typings.heredatalens.H.datalens.QueryTileProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the names of the URI parameters that control the x/y/z of tiled query.
  * When defining the Data Lens query, dynamic parameters that control tiling can be arbitrarily named.
  * Names of these parameters must be specified to fetch tiles.
  */
@js.native
trait TileParamNames extends js.Object {
  /** Name of the dynamic parameter that defines tile column */
  var x: String = js.native
  /** Name of the dynamic parameter that defines tile row */
  var y: String = js.native
  /** Name of the dynamic parameter that defines zoom level */
  var z: String = js.native
}

object TileParamNames {
  @scala.inline
  def apply(x: String, y: String, z: String): TileParamNames = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileParamNames]
  }
  @scala.inline
  implicit class TileParamNamesOps[Self <: TileParamNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setX(value: String): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: String): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setZ(value: String): Self = this.set("z", value.asInstanceOf[js.Any])
  }
  
}

