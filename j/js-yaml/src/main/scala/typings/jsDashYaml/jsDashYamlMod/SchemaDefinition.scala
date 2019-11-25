package typings.jsDashYaml.jsDashYamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaDefinition extends js.Object {
  var explicit: js.UndefOr[js.Array[Type]] = js.undefined
  var `implicit`: js.UndefOr[js.Array[_]] = js.undefined
  var include: js.UndefOr[js.Array[Schema]] = js.undefined
}

object SchemaDefinition {
  @scala.inline
  def apply(explicit: js.Array[Type] = null, `implicit`: js.Array[_] = null, include: js.Array[Schema] = null): SchemaDefinition = {
    val __obj = js.Dynamic.literal()
    if (explicit != null) __obj.updateDynamic("explicit")(explicit.asInstanceOf[js.Any])
    if (`implicit` != null) __obj.updateDynamic("implicit")(`implicit`.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDefinition]
  }
}

