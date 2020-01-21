package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A metaline is a list of properties that are displayed along with the search
  * result to provide context.
  */
@js.native
trait SchemaMetaline extends js.Object {
  /**
    * The list of displayed properties for the metaline.
    */
  var properties: js.UndefOr[js.Array[SchemaDisplayedProperty]] = js.native
}

object SchemaMetaline {
  @scala.inline
  def apply(properties: js.Array[SchemaDisplayedProperty] = null): SchemaMetaline = {
    val __obj = js.Dynamic.literal()
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMetaline]
  }
}

