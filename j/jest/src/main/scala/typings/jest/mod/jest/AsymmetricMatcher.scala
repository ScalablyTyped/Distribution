package typings.jest.mod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsymmetricMatcher extends js.Object {
  def asymmetricMatch(other: js.Any): Boolean
}

object AsymmetricMatcher {
  @scala.inline
  def apply(asymmetricMatch: js.Any => Boolean): AsymmetricMatcher = {
    val __obj = js.Dynamic.literal(asymmetricMatch = js.Any.fromFunction1(asymmetricMatch))
  
    __obj.asInstanceOf[AsymmetricMatcher]
  }
}

