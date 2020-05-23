package typings.kineticjs.global.Kinetic

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.kineticjs.Kinetic.ILayer
import typings.kineticjs.Kinetic.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Kinetic.Layer")
@js.native
class Layer () extends ILayer {
  def this(config: LayerConfig) = this()
}

@JSGlobal("Kinetic.Layer")
@js.native
object Layer
  extends Instantiable0[ILayer]
     with Instantiable1[/* config */ LayerConfig, ILayer]

