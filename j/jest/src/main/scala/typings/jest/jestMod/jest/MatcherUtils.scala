package typings.jest.jestMod.jest

import org.scalablytyped.runtime.StringDictionary
import typings.jest.Anon_Actual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatcherUtils
  extends /* other */ StringDictionary[js.Any] {
  val isNot: Boolean
  val promise: String
  var utils: Anon_Actual
  def dontThrow(): Unit
  /**
    *  This is a deep-equality function that will return true if two objects have the same values (recursively).
    */
  def equals(a: js.Any, b: js.Any): Boolean
}

object MatcherUtils {
  @scala.inline
  def apply(
    dontThrow: () => Unit,
    equals: (js.Any, js.Any) => Boolean,
    isNot: Boolean,
    promise: String,
    utils: Anon_Actual,
    StringDictionary: /* other */ StringDictionary[js.Any] = null
  ): MatcherUtils = {
    val __obj = js.Dynamic.literal(dontThrow = js.Any.fromFunction0(dontThrow), equals = js.Any.fromFunction2(equals), isNot = isNot, promise = promise, utils = utils)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[MatcherUtils]
  }
}

