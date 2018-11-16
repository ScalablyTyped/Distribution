package typings
package imagesLib.imagesMod.imagesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagesStatic extends js.Object {
  def draw(image: ImagesStatic, x: scala.Double, y: scala.Double): ImagesStatic = js.native
  def encode(`type`: java.lang.String): scala.Unit = js.native
  def encode(`type`: java.lang.String, config: ImagesConfig): scala.Unit = js.native
  def fill(red: scala.Double, green: scala.Double, blue: scala.Double): ImagesStatic = js.native
  def fill(red: scala.Double, green: scala.Double, blue: scala.Double, alpha: scala.Double): ImagesStatic = js.native
  def gc(): scala.Unit = js.native
  def getUsedMemory(): scala.Unit = js.native
  def height(): scala.Double = js.native
  def height(height: scala.Double): ImagesStatic = js.native
  def loadFromBuffer(buffer: nodeLib.Buffer): ImagesStatic = js.native
  def resize(width: scala.Double): ImagesStatic = js.native
  def resize(width: scala.Double, height: scala.Double): ImagesStatic = js.native
  def resize(width: scala.Double, height: scala.Double, filter: java.lang.String): ImagesStatic = js.native
  def save(file: java.lang.String): scala.Unit = js.native
  def save(file: java.lang.String, config: ImagesConfig): scala.Unit = js.native
  def save(file: java.lang.String, `type`: SupportType): scala.Unit = js.native
  def save(file: java.lang.String, `type`: SupportType, config: ImagesConfig): scala.Unit = js.native
  def setGCThreshold(value: scala.Double): scala.Unit = js.native
  def setLimit(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def size(): imagesLib.Anon_Height = js.native
  def size(width: scala.Double): ImagesStatic = js.native
  def size(width: scala.Double, height: scala.Double): ImagesStatic = js.native
  def width(): scala.Double = js.native
  def width(width: scala.Double): ImagesStatic = js.native
}

