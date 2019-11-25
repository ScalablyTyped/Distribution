package typings.k6.wsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  /** Request headers. */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  /** Response time metric tags. */
  var tags: js.UndefOr[StringDictionary[String]] = js.undefined
}

object Params {
  @scala.inline
  def apply(headers: StringDictionary[String] = null, tags: StringDictionary[String] = null): Params = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}

