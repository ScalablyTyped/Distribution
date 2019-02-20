package typings
package jsoneditorLib.jsoneditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteOptions extends js.Object {
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default [39, 35, 9]
    */
  var confirmKeys: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var getOptions: js.UndefOr[AutoCompleteOptionsGetter] = js.undefined
}

