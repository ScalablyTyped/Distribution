package typings.kineticjs.global.Kinetic

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.kineticjs.Kinetic.IImage
import typings.kineticjs.Kinetic.ImageConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Kinetic.Image")
@js.native
class Image () extends IImage {
  def this(config: ImageConfig) = this()
}

@JSGlobal("Kinetic.Image")
@js.native
object Image
  extends Instantiable0[IImage]
     with Instantiable1[/* config */ ImageConfig, IImage]

