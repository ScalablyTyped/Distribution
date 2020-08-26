package typings.heremaps.H.service

import typings.heremaps.anon.Normal
import typings.heremaps.anon.Satellite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This property specifies collection of pre-configured HERE layers
  */
@js.native
trait DefaultLayers extends js.Object {
  var raster: Satellite = js.native
  var vector: Normal = js.native
}

object DefaultLayers {
  @scala.inline
  def apply(raster: Satellite, vector: Normal): DefaultLayers = {
    val __obj = js.Dynamic.literal(raster = raster.asInstanceOf[js.Any], vector = vector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultLayers]
  }
  @scala.inline
  implicit class DefaultLayersOps[Self <: DefaultLayers] (val x: Self) extends AnyVal {
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
    def setRaster(value: Satellite): Self = this.set("raster", value.asInstanceOf[js.Any])
    @scala.inline
    def setVector(value: Normal): Self = this.set("vector", value.asInstanceOf[js.Any])
  }
  
}

