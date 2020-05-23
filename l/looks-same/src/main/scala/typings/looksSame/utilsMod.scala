package typings.looksSame

import typings.looksSame.anon.First
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("looks-same/build/src/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def formatImages(img1: js.Any, img2: js.Any): js.Array[_] = js.native
  def getDiffPixelsCoords(png1: js.Any, png2: js.Any, predicate: js.Any, opts: js.Any): Unit = js.native
  def getDiffPixelsCoords(png1: js.Any, png2: js.Any, predicate: js.Any, opts: js.Any, callback: js.Any): Unit = js.native
  def readPair(first: js.Any, second: js.Any): js.Promise[First] = js.native
}

