package typings.heremaps.H.service

import typings.heremaps.AnonNormal
import typings.heremaps.AnonNormalSatellite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This property specifies collection of pre-configured HERE layers
  */
trait DefaultLayers extends js.Object {
  var raster: AnonNormalSatellite
  var vector: AnonNormal
}

object DefaultLayers {
  @scala.inline
  def apply(raster: AnonNormalSatellite, vector: AnonNormal): DefaultLayers = {
    val __obj = js.Dynamic.literal(raster = raster.asInstanceOf[js.Any], vector = vector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefaultLayers]
  }
}

