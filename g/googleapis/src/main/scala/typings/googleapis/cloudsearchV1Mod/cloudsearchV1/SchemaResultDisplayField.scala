package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Display Fields for Search Results
  */
@js.native
trait SchemaResultDisplayField extends js.Object {
  /**
    * The display label for the property.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * The operator name of the property.
    */
  var operatorName: js.UndefOr[String] = js.native
  /**
    * The name value pair for the property.
    */
  var property: js.UndefOr[SchemaNamedProperty] = js.native
}

object SchemaResultDisplayField {
  @scala.inline
  def apply(label: String = null, operatorName: String = null, property: SchemaNamedProperty = null): SchemaResultDisplayField = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (operatorName != null) __obj.updateDynamic("operatorName")(operatorName.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResultDisplayField]
  }
}

