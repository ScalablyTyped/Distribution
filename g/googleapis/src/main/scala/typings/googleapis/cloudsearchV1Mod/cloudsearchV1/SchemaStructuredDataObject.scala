package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A structured data object consisting of named properties.
  */
@js.native
trait SchemaStructuredDataObject extends js.Object {
  /**
    * The properties for the object. The maximum number of elements is 1000.
    */
  var properties: js.UndefOr[js.Array[SchemaNamedProperty]] = js.native
}

object SchemaStructuredDataObject {
  @scala.inline
  def apply(properties: js.Array[SchemaNamedProperty] = null): SchemaStructuredDataObject = {
    val __obj = js.Dynamic.literal()
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStructuredDataObject]
  }
}

