package typings.looksDashSame.looksDashSameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("looks-same", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Compare two images
    * @param image1 The first image path
    * @param image2 The second image path
    * @param callback Call when finish compare
    */
  def apply(image1: String, image2: String, callback: LooksSameCallback): Unit = js.native
  /**
    * Compare two images with options
    * @param image1 The first image path
    * @param image2 The second image path
    * @param options The options passed to looksSame function
    * @param callback Call when finish compare
    */
  def apply(image1: String, image2: String, options: LooksSameOptions, callback: LooksSameCallback): Unit = js.native
}

