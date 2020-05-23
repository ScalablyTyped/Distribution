package typings.heremaps.global.H.map

import typings.heremaps.H.map.Spatial.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents a spatial map object which provides its projected geometry.
  */
@JSGlobal("H.map.Spatial")
@js.native
class Spatial protected ()
  extends typings.heremaps.H.map.Spatial {
  /**
    * Constructor
    * @param isClosed {boolean} - Indicates whether this spatial object represents a closed shape
    * @param opt_options {H.map.Spatial.Options=} - The options to apply
    */
  def this(isClosed: Boolean) = this()
  def this(isClosed: Boolean, opt_options: Options) = this()
}

