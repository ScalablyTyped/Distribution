package typings.jupyterlabJsonExtension.componentMod

import typings.luminoCoreutils.jsonMod.JSONObject
import typings.luminoCoreutils.jsonMod.JSONValue
import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProps extends js.Object {
  var data: NonNullable[JSONValue]
  var metadata: js.UndefOr[JSONObject] = js.undefined
}

object IProps {
  @scala.inline
  def apply(data: NonNullable[JSONValue] = null, metadata: JSONObject = null): IProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProps]
  }
}

