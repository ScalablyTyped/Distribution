package typings.looksSame.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("looks-same", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Compare two images
    * @param image1 The first image
    * @param image2 The second image
    * @param callback Call when finish compare
    */
  def apply(image1: String, image2: String, callback: LooksSameCallback): Unit = js.native
  def apply(image1: String, image2: String, options: js.Object, callback: LooksSameCallback): Unit = js.native
  /**
    * Compare two images with options
    * @param image1 The first image
    * @param image2 The second image
    * @param options The options passed to looksSame function
    * @param callback Call when finish compare
    */
  def apply(image1: String, image2: String, options: LooksSameOptions, callback: LooksSameCallback): Unit = js.native
  def apply(image1: String, image2: BoundedImage, callback: LooksSameCallback): Unit = js.native
  def apply(image1: String, image2: BoundedImage, options: js.Object, callback: LooksSameCallback): Unit = js.native
  def apply(image1: String, image2: BoundedImage, options: LooksSameOptions, callback: LooksSameCallback): Unit = js.native
  def apply(image1: String, image2: Buffer, callback: LooksSameCallback): Unit = js.native
  def apply(image1: String, image2: Buffer, options: js.Object, callback: LooksSameCallback): Unit = js.native
  def apply(image1: String, image2: Buffer, options: LooksSameOptions, callback: LooksSameCallback): Unit = js.native
  def apply(image1: BoundedImage, image2: String, callback: LooksSameCallback): Unit = js.native
  def apply(image1: BoundedImage, image2: String, options: js.Object, callback: LooksSameCallback): Unit = js.native
  def apply(image1: BoundedImage, image2: String, options: LooksSameOptions, callback: LooksSameCallback): Unit = js.native
  def apply(image1: BoundedImage, image2: BoundedImage, callback: LooksSameCallback): Unit = js.native
  def apply(image1: BoundedImage, image2: BoundedImage, options: js.Object, callback: LooksSameCallback): Unit = js.native
  def apply(image1: BoundedImage, image2: BoundedImage, options: LooksSameOptions, callback: LooksSameCallback): Unit = js.native
  def apply(image1: BoundedImage, image2: Buffer, callback: LooksSameCallback): Unit = js.native
  def apply(image1: BoundedImage, image2: Buffer, options: js.Object, callback: LooksSameCallback): Unit = js.native
  def apply(image1: BoundedImage, image2: Buffer, options: LooksSameOptions, callback: LooksSameCallback): Unit = js.native
  def apply(image1: Buffer, image2: String, callback: LooksSameCallback): Unit = js.native
  def apply(image1: Buffer, image2: String, options: js.Object, callback: LooksSameCallback): Unit = js.native
  def apply(image1: Buffer, image2: String, options: LooksSameOptions, callback: LooksSameCallback): Unit = js.native
  def apply(image1: Buffer, image2: BoundedImage, callback: LooksSameCallback): Unit = js.native
  def apply(image1: Buffer, image2: BoundedImage, options: js.Object, callback: LooksSameCallback): Unit = js.native
  def apply(image1: Buffer, image2: BoundedImage, options: LooksSameOptions, callback: LooksSameCallback): Unit = js.native
  def apply(image1: Buffer, image2: Buffer, callback: LooksSameCallback): Unit = js.native
  def apply(image1: Buffer, image2: Buffer, options: js.Object, callback: LooksSameCallback): Unit = js.native
  def apply(image1: Buffer, image2: Buffer, options: LooksSameOptions, callback: LooksSameCallback): Unit = js.native
}
