package typings.hexo.hexoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HexoRendererData extends js.Object {
  /**
    * File path.
    */
  val path: js.UndefOr[String] = js.undefined
  /**
    * File content.
    */
  val text: String
}

object HexoRendererData {
  @scala.inline
  def apply(text: String, path: String = null): HexoRendererData = {
    val __obj = js.Dynamic.literal(text = text)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[HexoRendererData]
  }
}

