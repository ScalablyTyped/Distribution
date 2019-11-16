package typings.atJestEnvironment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Virtual extends js.Object {
  var virtual: js.UndefOr[Boolean] = js.undefined
}

object Anon_Virtual {
  @scala.inline
  def apply(virtual: js.UndefOr[Boolean] = js.undefined): Anon_Virtual = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(virtual)) __obj.updateDynamic("virtual")(virtual)
    __obj.asInstanceOf[Anon_Virtual]
  }
}

