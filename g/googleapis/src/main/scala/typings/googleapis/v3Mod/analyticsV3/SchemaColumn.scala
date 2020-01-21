package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a metadata column.
  */
@js.native
trait SchemaColumn extends js.Object {
  /**
    * Map of attribute name and value for this column.
    */
  var attributes: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Column id.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Resource type for Analytics column.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaColumn {
  @scala.inline
  def apply(attributes: StringDictionary[String] = null, id: String = null, kind: String = null): SchemaColumn = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaColumn]
  }
}

