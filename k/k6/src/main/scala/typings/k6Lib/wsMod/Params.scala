package typings
package k6Lib.wsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  /** Request headers. */
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /** Response time metric tags. */
  var tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
}

object Params {
  @scala.inline
  def apply(
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    tags: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): Params = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Params]
  }
}

