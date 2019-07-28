package typings.images.imagesMod

import typings.images.Anon_Height
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("images", "ImagesStatic")
@js.native
class ImagesStatic () extends js.Object {
  def draw(image: ImagesStatic, x: Double, y: Double): ImagesStatic = js.native
  def encode(`type`: String): Unit = js.native
  def encode(`type`: String, config: ImagesConfig): Unit = js.native
  def fill(red: Double, green: Double, blue: Double): ImagesStatic = js.native
  def fill(red: Double, green: Double, blue: Double, alpha: Double): ImagesStatic = js.native
  def gc(): Unit = js.native
  def getUsedMemory(): Unit = js.native
  def height(): Double = js.native
  def height(height: Double): ImagesStatic = js.native
  def loadFromBuffer(buffer: Buffer): ImagesStatic = js.native
  def resize(width: Double): ImagesStatic = js.native
  def resize(width: Double, height: Double): ImagesStatic = js.native
  def resize(width: Double, height: Double, filter: String): ImagesStatic = js.native
  def save(file: String): Unit = js.native
  def save(file: String, config: ImagesConfig): Unit = js.native
  def save(file: String, `type`: SupportType): Unit = js.native
  def save(file: String, `type`: SupportType, config: ImagesConfig): Unit = js.native
  def setGCThreshold(value: Double): Unit = js.native
  def setLimit(width: Double, height: Double): Unit = js.native
  def size(): Anon_Height = js.native
  def size(width: Double): ImagesStatic = js.native
  def size(width: Double, height: Double): ImagesStatic = js.native
  def width(): Double = js.native
  def width(width: Double): ImagesStatic = js.native
}

