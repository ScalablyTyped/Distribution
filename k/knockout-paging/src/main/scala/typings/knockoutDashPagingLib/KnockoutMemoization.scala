package typings
package knockoutDashPagingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait KnockoutMemoization extends js.Object {
  def memoize(callback: js.Function0[java.lang.String]): java.lang.String
  def parseMemoText(memoText: java.lang.String): java.lang.String
  def unmemoize(memoId: java.lang.String, callbackParams: js.Array[_]): scala.Boolean
  def unmemoizeDomNodeAndDescendants(domNode: js.Any, extraCallbackParamsArray: js.Array[_]): scala.Boolean
}

