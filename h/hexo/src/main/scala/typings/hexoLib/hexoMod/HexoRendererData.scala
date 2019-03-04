package typings
package hexoLib.hexoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HexoRendererData extends js.Object {
  /**
    * File path.
    */
  val path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * File content.
    */
  val text: java.lang.String
}

object HexoRendererData {
  @scala.inline
  def apply(text: java.lang.String, path: java.lang.String = null): HexoRendererData = {
    val __obj = js.Dynamic.literal(text = text)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[HexoRendererData]
  }
}

