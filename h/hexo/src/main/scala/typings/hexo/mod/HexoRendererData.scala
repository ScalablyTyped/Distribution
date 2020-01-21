package typings.hexo.mod

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
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[HexoRendererData]
  }
}

