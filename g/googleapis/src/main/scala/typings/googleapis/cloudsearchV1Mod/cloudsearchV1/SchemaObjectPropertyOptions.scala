package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for object properties.
  */
@js.native
trait SchemaObjectPropertyOptions extends js.Object {
  /**
    * The properties of the sub-object. These properties represent a nested
    * object. For example, if this property represents a postal address, the
    * subobjectProperties might be named *street*, *city*, and *state*. The
    * maximum number of elements is 1000.
    */
  var subobjectProperties: js.UndefOr[js.Array[SchemaPropertyDefinition]] = js.native
}

object SchemaObjectPropertyOptions {
  @scala.inline
  def apply(subobjectProperties: js.Array[SchemaPropertyDefinition] = null): SchemaObjectPropertyOptions = {
    val __obj = js.Dynamic.literal()
    if (subobjectProperties != null) __obj.updateDynamic("subobjectProperties")(subobjectProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaObjectPropertyOptions]
  }
}

