package typings
package knockoutDashPreDashRenderedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutMemoization extends js.Object {
  def memoize(callback: js.Function0[java.lang.String]): java.lang.String
  def parseMemoText(memoText: java.lang.String): java.lang.String
  def unmemoize(memoId: java.lang.String, callbackParams: js.Array[_]): scala.Boolean
  def unmemoizeDomNodeAndDescendants(domNode: js.Any, extraCallbackParamsArray: js.Array[_]): scala.Boolean
}

object KnockoutMemoization {
  @scala.inline
  def apply(
    memoize: js.Function0[java.lang.String] => java.lang.String,
    parseMemoText: java.lang.String => java.lang.String,
    unmemoize: (java.lang.String, js.Array[_]) => scala.Boolean,
    unmemoizeDomNodeAndDescendants: (js.Any, js.Array[_]) => scala.Boolean
  ): KnockoutMemoization = {
    val __obj = js.Dynamic.literal(memoize = js.Any.fromFunction1(memoize), parseMemoText = js.Any.fromFunction1(parseMemoText), unmemoize = js.Any.fromFunction2(unmemoize), unmemoizeDomNodeAndDescendants = js.Any.fromFunction2(unmemoizeDomNodeAndDescendants))
  
    __obj.asInstanceOf[KnockoutMemoization]
  }
}

