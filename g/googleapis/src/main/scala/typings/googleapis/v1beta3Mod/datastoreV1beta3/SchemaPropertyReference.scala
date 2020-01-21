package typings.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a property relative to the kind expressions.
  */
@js.native
trait SchemaPropertyReference extends js.Object {
  /**
    * The name of the property. If name includes &quot;.&quot;s, it may be
    * interpreted as a property name path.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaPropertyReference {
  @scala.inline
  def apply(name: String = null): SchemaPropertyReference = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPropertyReference]
  }
}

