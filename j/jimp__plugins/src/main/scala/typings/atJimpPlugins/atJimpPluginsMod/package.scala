package typings.atJimpPlugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atJimpPluginsMod {
  import typings.atJimpPlugins.BlitRet
  import typings.atJimpPlugins.BlurRet
  import typings.atJimpPlugins.ColorRet
  import typings.atJimpPlugins.ContainRet
  import typings.atJimpPlugins.CoverRet
  import typings.atJimpPlugins.CropRet
  import typings.atJimpPlugins.DisplaceRet
  import typings.atJimpPlugins.DitherRet
  import typings.atJimpPlugins.FlipRet
  import typings.atJimpPlugins.GaussianRet
  import typings.atJimpPlugins.InvertRet
  import typings.atJimpPlugins.MaskRet
  import typings.atJimpPlugins.NormalizeRet
  import typings.atJimpPlugins.PrintRet
  import typings.atJimpPlugins.ResizeRet
  import typings.atJimpPlugins.RotateRet
  import typings.atJimpPlugins.ScaleRet

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
