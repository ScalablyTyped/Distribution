package typings.googleapis.urlshortenerV1Mod.urlshortenerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaStringCount extends js.Object {
  /**
    * Number of clicks for this top entry, e.g. for this particular country or
    * browser.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * Label assigned to this top entry, e.g. &quot;US&quot; or
    * &quot;Chrome&quot;.
    */
  var id: js.UndefOr[String] = js.native
}

object SchemaStringCount {
  @scala.inline
  def apply(count: String = null, id: String = null): SchemaStringCount = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStringCount]
  }
}

