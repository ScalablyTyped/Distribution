package typings.koaRequestid.anon

import typings.koaRequestid.koaRequestidBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expose extends js.Object {
  var expose: js.UndefOr[String | `false`] = js.undefined
  var header: js.UndefOr[String | `false`] = js.undefined
  var query: js.UndefOr[String | `false`] = js.undefined
}

object Expose {
  @scala.inline
  def apply(expose: String | `false` = null, header: String | `false` = null, query: String | `false` = null): Expose = {
    val __obj = js.Dynamic.literal()
    if (expose != null) __obj.updateDynamic("expose")(expose.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expose]
  }
}

