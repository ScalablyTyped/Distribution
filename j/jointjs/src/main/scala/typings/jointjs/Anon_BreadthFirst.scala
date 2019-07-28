package typings.jointjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BreadthFirst extends js.Object {
  var breadthFirst: js.UndefOr[Boolean] = js.undefined
  var deep: js.UndefOr[Boolean] = js.undefined
}

object Anon_BreadthFirst {
  @scala.inline
  def apply(breadthFirst: js.UndefOr[Boolean] = js.undefined, deep: js.UndefOr[Boolean] = js.undefined): Anon_BreadthFirst = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(breadthFirst)) __obj.updateDynamic("breadthFirst")(breadthFirst)
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep)
    __obj.asInstanceOf[Anon_BreadthFirst]
  }
}

