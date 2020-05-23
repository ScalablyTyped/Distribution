package typings.heremaps.H.service

import typings.heremaps.anon.Normal
import typings.heremaps.anon.Satellite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This property specifies collection of pre-configured HERE layers
  */
trait DefaultLayers extends js.Object {
  var raster: Satellite
  var vector: Normal
}

object DefaultLayers {
  @scala.inline
  def apply(raster: Satellite, vector: Normal): DefaultLayers = {
    val __obj = js.Dynamic.literal(raster = raster.asInstanceOf[js.Any], vector = vector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultLayers]
  }
}

