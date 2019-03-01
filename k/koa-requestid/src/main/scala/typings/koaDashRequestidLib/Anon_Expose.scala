package typings
package koaDashRequestidLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Expose extends js.Object {
  var expose: js.UndefOr[java.lang.String] = js.undefined
  var header: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Expose {
  @scala.inline
  def apply(expose: java.lang.String = null, header: java.lang.String = null, query: java.lang.String = null): Anon_Expose = {
    val __obj = js.Dynamic.literal()
    if (expose != null) __obj.updateDynamic("expose")(expose)
    if (header != null) __obj.updateDynamic("header")(header)
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[Anon_Expose]
  }
}

