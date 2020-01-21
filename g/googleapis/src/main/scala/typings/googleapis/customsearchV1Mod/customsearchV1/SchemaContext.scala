package typings.googleapis.customsearchV1Mod.customsearchV1

import typings.googleapis.AnonAnchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaContext extends js.Object {
  var facets: js.UndefOr[js.Array[js.Array[AnonAnchor]]] = js.native
  var title: js.UndefOr[String] = js.native
}

object SchemaContext {
  @scala.inline
  def apply(facets: js.Array[js.Array[AnonAnchor]] = null, title: String = null): SchemaContext = {
    val __obj = js.Dynamic.literal()
    if (facets != null) __obj.updateDynamic("facets")(facets.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaContext]
  }
}

