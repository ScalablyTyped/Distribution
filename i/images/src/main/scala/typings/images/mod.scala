package typings.images

import org.scalablytyped.runtime.StringDictionary
import typings.images.anon.Height
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(buffer: Buffer): ImagesStatic = ^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any]).asInstanceOf[ImagesStatic]
  @scala.inline
  def apply(buffer: Buffer, start: Double): ImagesStatic = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[ImagesStatic]
  @scala.inline
  def apply(buffer: Buffer, start: Double, end: Double): ImagesStatic = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[ImagesStatic]
  @scala.inline
  def apply(buffer: Buffer, start: Unit, end: Double): ImagesStatic = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[ImagesStatic]
  @scala.inline
  def apply(file: String): ImagesStatic = ^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any]).asInstanceOf[ImagesStatic]
  @scala.inline
  def apply(image: ImagesStatic): ImagesStatic = ^.asInstanceOf[js.Dynamic].apply(image.asInstanceOf[js.Any]).asInstanceOf[ImagesStatic]
  // tslint:disable-line unified-signatures
  @scala.inline
  def apply(image: ImagesStatic, x: Double, y: Double, width: Double, height: Double): ImagesStatic = (^.asInstanceOf[js.Dynamic].apply(image.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[ImagesStatic]
  @scala.inline
  def apply(width: Double, height: Double): ImagesStatic = (^.asInstanceOf[js.Dynamic].apply(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[ImagesStatic]
  
  @JSImport("images", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("images", "ImagesStatic")
  @js.native
  class ImagesStatic () extends StObject {
    
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
    def resize(width: Double, height: Unit, filter: String): ImagesStatic = js.native
    
    def save(file: String): Unit = js.native
    def save(file: String, config: ImagesConfig): Unit = js.native
    def save(file: String, `type`: Unit, config: ImagesConfig): Unit = js.native
    def save(file: String, `type`: SupportType): Unit = js.native
    def save(file: String, `type`: SupportType, config: ImagesConfig): Unit = js.native
    
    def setGCThreshold(value: Double): Unit = js.native
    
    def setLimit(width: Double, height: Double): Unit = js.native
    
    def size(): Height = js.native
    def size(width: Double): ImagesStatic = js.native
    def size(width: Double, height: Double): ImagesStatic = js.native
    
    def width(): Double = js.native
    def width(width: Double): ImagesStatic = js.native
  }
  
  type ImagesConfig = StringDictionary[js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.images.imagesStrings.png
    - typings.images.imagesStrings.jpg
    - typings.images.imagesStrings.gif
    - typings.images.imagesStrings.bmp
    - typings.images.imagesStrings.raw
    - typings.images.imagesStrings.webp
  */
  trait SupportType extends StObject
  object SupportType {
    
    @scala.inline
    def bmp: typings.images.imagesStrings.bmp = "bmp".asInstanceOf[typings.images.imagesStrings.bmp]
    
    @scala.inline
    def gif: typings.images.imagesStrings.gif = "gif".asInstanceOf[typings.images.imagesStrings.gif]
    
    @scala.inline
    def jpg: typings.images.imagesStrings.jpg = "jpg".asInstanceOf[typings.images.imagesStrings.jpg]
    
    @scala.inline
    def png: typings.images.imagesStrings.png = "png".asInstanceOf[typings.images.imagesStrings.png]
    
    @scala.inline
    def raw: typings.images.imagesStrings.raw = "raw".asInstanceOf[typings.images.imagesStrings.raw]
    
    @scala.inline
    def webp: typings.images.imagesStrings.webp = "webp".asInstanceOf[typings.images.imagesStrings.webp]
  }
}
