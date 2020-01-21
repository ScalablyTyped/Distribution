package typings.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of a kind.
  */
@js.native
trait SchemaKindExpression extends js.Object {
  /**
    * The name of the kind.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaKindExpression {
  @scala.inline
  def apply(name: String = null): SchemaKindExpression = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaKindExpression]
  }
}

