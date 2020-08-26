package typings.imgDiffJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("img-diff-js", "imgDiff")
@js.native
object imgDiff extends js.Object {
  def apply(opt: ImgDiffOptions): js.Promise[ImgDiffResult] = js.native
}

