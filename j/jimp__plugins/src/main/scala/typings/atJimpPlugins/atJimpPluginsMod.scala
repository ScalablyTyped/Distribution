package typings.atJimpPlugins

import typings.atJimpPlugins.atJimpPluginsMod.Plugins
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/plugins", JSImport.Namespace)
@js.native
object atJimpPluginsMod extends js.Object {
  def default(): Plugins = js.native
  /**
    * This is made union and not intersection to avoid issues with
    * `IllformedPlugin` and `WellFormedPlugin` when using typings with Jimp
    * generic
    *
    * In reality, this should be an intersection but our type data isn't
    * clever enough to figure out what's a class and what's not/etc
    */
  type Plugins = DitherRet | ResizeRet | BlitRet | RotateRet | ColorRet | PrintRet | BlurRet | CropRet | NormalizeRet | InvertRet | GaussianRet | FlipRet | MaskRet | ScaleRet | DisplaceRet | ContainRet | CoverRet
}

