package typings.guacamoleClient.layerMod.Layer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("guacamole-client/lib/Layer", "Layer.Pixel")
@js.native
class Pixel protected () extends js.Object {
  /**
    * @param r The red component of this pixel.
    * @param g The green component of this pixel.
    * @param b The blue component of this pixel.
    * @param a The alpha component of this pixel.
    */
  def this(r: Double, g: Double, b: Double, a: Double) = this()
  /**
    * The alpha component of this pixel, where 0 is the minimum value,
    * and 255 is the maximum.
    */
  var alpha: Double = js.native
  /**
    * The blue component of this pixel, where 0 is the minimum value,
    * and 255 is the maximum.
    */
  var blue: Double = js.native
  /**
    * The green component of this pixel, where 0 is the minimum value,
    * and 255 is the maximum.
    */
  var green: Double = js.native
  /**
    * The red component of this pixel, where 0 is the minimum value,
    * and 255 is the maximum.
    */
  var red: Double = js.native
}

