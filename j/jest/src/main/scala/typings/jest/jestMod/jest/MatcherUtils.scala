package typings.jest.jestMod.jest

import typings.jest.Anon_Actual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatcherUtils extends js.Object {
  val expand: Boolean
  val isNot: Boolean
  var utils: Anon_Actual
  /**
    *  This is a deep-equality function that will return true if two objects have the same values (recursively).
    */
  def equals(a: js.Any, b: js.Any): Boolean
}

object MatcherUtils {
  @scala.inline
  def apply(equals: (js.Any, js.Any) => Boolean, expand: Boolean, isNot: Boolean, utils: Anon_Actual): MatcherUtils = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction2(equals), expand = expand, isNot = isNot, utils = utils)
  
    __obj.asInstanceOf[MatcherUtils]
  }
}

