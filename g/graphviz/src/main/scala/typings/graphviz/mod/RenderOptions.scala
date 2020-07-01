package typings.graphviz.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderOptions extends js.Object {
  /**
    * edge options
    */
  var E: js.UndefOr[Options] = js.undefined
  /**
    * graph options
    */
  var G: js.UndefOr[Options] = js.undefined
  /**
    * node options
    */
  var N: js.UndefOr[Options] = js.undefined
  /**
    * Graphviz path
    * @default $PATH
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * graphviz output file type
    */
  var `type`: RenderType
  /**
    * Graphviz command to use
    * @default dot
    */
  var use: js.UndefOr[RenderEngine] = js.undefined
}

object RenderOptions {
  @scala.inline
  def apply(
    `type`: RenderType,
    E: Options = null,
    G: Options = null,
    N: Options = null,
    path: String = null,
    use: RenderEngine = null
  ): RenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (E != null) __obj.updateDynamic("E")(E.asInstanceOf[js.Any])
    if (G != null) __obj.updateDynamic("G")(G.asInstanceOf[js.Any])
    if (N != null) __obj.updateDynamic("N")(N.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (use != null) __obj.updateDynamic("use")(use.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderOptions]
  }
}

