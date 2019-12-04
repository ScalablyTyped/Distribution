package typings.imageDashSize

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("image-size/dist/detector", JSImport.Namespace)
@js.native
object distDetectorMod extends js.Object {
  def detector(buffer: Buffer): js.UndefOr[String] = js.native
}

