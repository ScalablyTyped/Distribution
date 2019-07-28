package typings.looksDashSame.looksDashSameMod

import typings.looksDashSame.Anon_Tolerance
import typings.node.Buffer
import typings.std.Error
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
  /**
    * Compare two colors
    * @param color1 The first color
    * @param color2 The second color
    * @param options The options passed to looksSame.colors function
    */
  def colors(color1: LooksSameColor, color2: LooksSameColor, options: Anon_Tolerance): Unit = js.native
  def createDiff(
    options: CreateDiffAsBufferOptions,
    callback: js.Function2[/* error */ Error | Null, /* buffer */ Buffer, _]
  ): Unit = js.native
  def createDiff(options: CreateDiffOptions, callback: js.Function1[/* error */ Error | Null, _]): Unit = js.native
}

