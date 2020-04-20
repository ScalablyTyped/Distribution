package typings.markdownIt.rulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleOptions extends js.Object {
  /**
    * array with names of "alternate" chains.
    */
  var alt: js.Array[String]
}

object RuleOptions {
  @scala.inline
  def apply(alt: js.Array[String]): RuleOptions = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleOptions]
  }
}

