package typings.koaDashRequestid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Expose extends js.Object {
  var expose: js.UndefOr[String] = js.undefined
  var header: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[String] = js.undefined
}

object Anon_Expose {
  @scala.inline
  def apply(expose: String = null, header: String = null, query: String = null): Anon_Expose = {
    val __obj = js.Dynamic.literal()
    if (expose != null) __obj.updateDynamic("expose")(expose)
    if (header != null) __obj.updateDynamic("header")(header)
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[Anon_Expose]
  }
}

