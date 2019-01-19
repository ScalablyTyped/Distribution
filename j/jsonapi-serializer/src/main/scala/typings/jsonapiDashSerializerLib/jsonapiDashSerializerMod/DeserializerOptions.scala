package typings
package jsonapiDashSerializerLib.jsonapiDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeserializerOptions extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var keyForAttribute: js.UndefOr[
    jsonapiDashSerializerLib.jsonapiDashSerializerLibStrings.`dash-case` | jsonapiDashSerializerLib.jsonapiDashSerializerLibStrings.`lisp-case` | jsonapiDashSerializerLib.jsonapiDashSerializerLibStrings.`spinal-case` | jsonapiDashSerializerLib.jsonapiDashSerializerLibStrings.`kebab-case` | jsonapiDashSerializerLib.jsonapiDashSerializerLibStrings.underscore_case | jsonapiDashSerializerLib.jsonapiDashSerializerLibStrings.snake_case | jsonapiDashSerializerLib.jsonapiDashSerializerLibStrings.camelCase | jsonapiDashSerializerLib.jsonapiDashSerializerLibStrings.CamelCase
  ] = js.undefined
  var pluralizeType: js.UndefOr[scala.Boolean] = js.undefined
  var transform: js.UndefOr[Transform] = js.undefined
  var typeAsAttribute: js.UndefOr[scala.Boolean] = js.undefined
}

