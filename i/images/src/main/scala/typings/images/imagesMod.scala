package typings.images

import org.scalablytyped.runtime.StringDictionary
import typings.images.imagesMod.ImagesConfig
import typings.images.imagesMod.ImagesStatic
import typings.images.imagesMod.SupportType
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("images", JSImport.Namespace)
@js.native
object imagesMod extends js.Object {
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.images.imagesStrings.png
    - typings.images.imagesStrings.jpg
    - typings.images.imagesStrings.gif
    - typings.images.imagesStrings.bmp
    - typings.images.imagesStrings.raw
    - typings.images.imagesStrings.webp
  */
  trait SupportType extends js.Object
  
  def apply(buffer: Buffer): ImagesStatic = js.native
  def apply(buffer: Buffer, start: Double): ImagesStatic = js.native
  def apply(buffer: Buffer, start: Double, end: Double): ImagesStatic = js.native
  def apply(file: String): ImagesStatic = js.native
  def apply(image: ImagesStatic): ImagesStatic = js.native
  def apply(image: ImagesStatic, x: Double, y: Double, width: Double, height: Double): ImagesStatic = js.native
  def apply(width: Double, height: Double): ImagesStatic = js.native
  type ImagesConfig = StringDictionary[js.Any]
}

