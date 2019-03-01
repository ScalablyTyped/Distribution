package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BreadthFirst extends js.Object {
  var breadthFirst: js.UndefOr[scala.Boolean] = js.undefined
  var deep: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_BreadthFirst {
  @scala.inline
  def apply(
    breadthFirst: js.UndefOr[scala.Boolean] = js.undefined,
    deep: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_BreadthFirst = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(breadthFirst)) __obj.updateDynamic("breadthFirst")(breadthFirst)
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep)
    __obj.asInstanceOf[Anon_BreadthFirst]
  }
}

