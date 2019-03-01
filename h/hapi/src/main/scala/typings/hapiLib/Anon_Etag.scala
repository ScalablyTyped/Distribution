package typings
package hapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Etag extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var modified: js.UndefOr[java.lang.String] = js.undefined
  var vary: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Etag {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    modified: java.lang.String = null,
    vary: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Etag = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (modified != null) __obj.updateDynamic("modified")(modified)
    if (!js.isUndefined(vary)) __obj.updateDynamic("vary")(vary)
    __obj.asInstanceOf[Anon_Etag]
  }
}

