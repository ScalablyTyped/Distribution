package typings.looksSame.pngPngMod

import typings.looksSame.anon.B
import typings.looksSame.anon.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("looks-same/build/src/lib/png/png", JSImport.Default)
@js.native
abstract class default protected () extends PNGImage {
  def this(_png: js.Any) = this()
  /* CompleteClass */
  override var _png: js.Any = js.native
  /* CompleteClass */
  override def _getIdx(x: js.Any, y: js.Any): Double = js.native
  /* CompleteClass */
  override def createBuffer(callback: js.Any): Unit = js.native
  /* CompleteClass */
  override def getActualCoord(x: Double, y: Double): Y = js.native
  /* CompleteClass */
  override def getPixel(x: js.Any, y: js.Any): B = js.native
  /* CompleteClass */
  override def height: Double = js.native
  /* CompleteClass */
  override def save(path: js.Any, callback: js.Any): Unit = js.native
  /* CompleteClass */
  override def setPixel(x: js.Any, y: js.Any, color: js.Any): Unit = js.native
  /* CompleteClass */
  override def width: Double = js.native
}

/* static members */
@JSImport("looks-same/build/src/lib/png/png", JSImport.Default)
@js.native
object default extends js.Object {
  def create[T /* <: PNGImage */](args: js.Any*): T = js.native
}

