package typings
package jqueryDotAjaxfileLib

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
    memoize: js.Function1[js.Function0[java.lang.String], java.lang.String],
    parseMemoText: js.Function1[java.lang.String, java.lang.String],
    unmemoize: js.Function2[java.lang.String, js.Array[_], scala.Boolean],
    unmemoizeDomNodeAndDescendants: js.Function2[js.Any, js.Array[_], scala.Boolean]
  ): KnockoutMemoization = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("memoize")(memoize)
    __obj.updateDynamic("parseMemoText")(parseMemoText)
    __obj.updateDynamic("unmemoize")(unmemoize)
    __obj.updateDynamic("unmemoizeDomNodeAndDescendants")(unmemoizeDomNodeAndDescendants)
    __obj.asInstanceOf[KnockoutMemoization]
  }
}

