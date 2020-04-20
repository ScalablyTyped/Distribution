package typings.knockoutPaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutMemoization extends js.Object {
  def memoize(callback: js.Function0[String]): String
  def parseMemoText(memoText: String): String
  def unmemoize(memoId: String, callbackParams: js.Array[_]): Boolean
  def unmemoizeDomNodeAndDescendants(domNode: js.Any, extraCallbackParamsArray: js.Array[_]): Boolean
}

object KnockoutMemoization {
  @scala.inline
  def apply(
    memoize: js.Function0[String] => String,
    parseMemoText: String => String,
    unmemoize: (String, js.Array[_]) => Boolean,
    unmemoizeDomNodeAndDescendants: (js.Any, js.Array[_]) => Boolean
  ): KnockoutMemoization = {
    val __obj = js.Dynamic.literal(memoize = js.Any.fromFunction1(memoize), parseMemoText = js.Any.fromFunction1(parseMemoText), unmemoize = js.Any.fromFunction2(unmemoize), unmemoizeDomNodeAndDescendants = js.Any.fromFunction2(unmemoizeDomNodeAndDescendants))
    __obj.asInstanceOf[KnockoutMemoization]
  }
}

