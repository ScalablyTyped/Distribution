package typings.jsonapiDashSerializer.jsonapiDashSerializerMod

import typings.jsonapiDashSerializer.jsonapiDashSerializerStrings.CamelCase
import typings.jsonapiDashSerializer.jsonapiDashSerializerStrings.`dash-case`
import typings.jsonapiDashSerializer.jsonapiDashSerializerStrings.`kebab-case`
import typings.jsonapiDashSerializer.jsonapiDashSerializerStrings.`lisp-case`
import typings.jsonapiDashSerializer.jsonapiDashSerializerStrings.`spinal-case`
import typings.jsonapiDashSerializer.jsonapiDashSerializerStrings.camelCase
import typings.jsonapiDashSerializer.jsonapiDashSerializerStrings.snake_case
import typings.jsonapiDashSerializer.jsonapiDashSerializerStrings.underscore_case
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeserializerOptions extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var keyForAttribute: js.UndefOr[
    `dash-case` | `lisp-case` | `spinal-case` | `kebab-case` | underscore_case | snake_case | camelCase | CamelCase | KeyForAttribute
  ] = js.undefined
  var pluralizeType: js.UndefOr[Boolean] = js.undefined
  var transform: js.UndefOr[Transform] = js.undefined
  var typeAsAttribute: js.UndefOr[Boolean] = js.undefined
}

object DeserializerOptions {
  @scala.inline
  def apply(
    id: String = null,
    keyForAttribute: `dash-case` | `lisp-case` | `spinal-case` | `kebab-case` | underscore_case | snake_case | camelCase | CamelCase | KeyForAttribute = null,
    pluralizeType: js.UndefOr[Boolean] = js.undefined,
    transform: Transform = null,
    typeAsAttribute: js.UndefOr[Boolean] = js.undefined
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

