package typings
package jsonapiDashSerializerLib.jsonapiDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeserializerOptions extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var keyForAttribute: js.UndefOr[
    jsonapiDashSerializerLib.jsonapiDashSerializerLibStrings.`dash-case` | jsonapiDashSerializerLib.jsonapiDashSerializerLibStrings.`lisp-case` | jsonapiDashSerializerLib.jsonapiDashSerializerLibStrings.`spinal-case` | jsonapiDashSerializerLib.jsonapiDashSerializerLibStrings.`kebab-case` | jsonapiDashSerializerLib.jsonapiDashSerializerLibStrings.underscore_case | jsonapiDashSerializerLib.jsonapiDashSerializerLibStrings.snake_case | jsonapiDashSerializerLib.jsonapiDashSerializerLibStrings.camelCase | jsonapiDashSerializerLib.jsonapiDashSerializerLibStrings.CamelCase | KeyForAttribute
  ] = js.undefined
  var pluralizeType: js.UndefOr[scala.Boolean] = js.undefined
  var transform: js.UndefOr[Transform] = js.undefined
  var typeAsAttribute: js.UndefOr[scala.Boolean] = js.undefined
}

object DeserializerOptions {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    keyForAttribute: jsonapiDashSerializerLib.jsonapiDashSerializerLibStrings.`dash-case` | jsonapiDashSerializerLib.jsonapiDashSerializerLibStrings.`lisp-case` | jsonapiDashSerializerLib.jsonapiDashSerializerLibStrings.`spinal-case` | jsonapiDashSerializerLib.jsonapiDashSerializerLibStrings.`kebab-case` | jsonapiDashSerializerLib.jsonapiDashSerializerLibStrings.underscore_case | jsonapiDashSerializerLib.jsonapiDashSerializerLibStrings.snake_case | jsonapiDashSerializerLib.jsonapiDashSerializerLibStrings.camelCase | jsonapiDashSerializerLib.jsonapiDashSerializerLibStrings.CamelCase | KeyForAttribute = null,
    pluralizeType: js.UndefOr[scala.Boolean] = js.undefined,
    transform: Transform = null,
    typeAsAttribute: js.UndefOr[scala.Boolean] = js.undefined
  ): DeserializerOptions = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (keyForAttribute != null) __obj.updateDynamic("keyForAttribute")(keyForAttribute.asInstanceOf[js.Any])
    if (!js.isUndefined(pluralizeType)) __obj.updateDynamic("pluralizeType")(pluralizeType)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (!js.isUndefined(typeAsAttribute)) __obj.updateDynamic("typeAsAttribute")(typeAsAttribute)
    __obj.asInstanceOf[DeserializerOptions]
  }
}

