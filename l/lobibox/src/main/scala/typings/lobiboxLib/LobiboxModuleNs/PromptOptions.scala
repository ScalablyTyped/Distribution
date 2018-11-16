package typings
package lobiboxLib.LobiboxModuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PromptOptions
  extends MessageBoxesOptions
     with PromptMethods {
  var attrs: js.UndefOr[js.Any] = js.undefined
         // Prompt type. Available types (text|number|color)
  var label: js.UndefOr[java.lang.String] = js.undefined
     // Set this true for multiline prompt
  var lines: js.UndefOr[scala.Double] = js.undefined
            // Value which is given to textfield when messagebox is created
  var multiline: js.UndefOr[scala.Boolean] = js.undefined
             // This works only for multiline prompt. Number of lines
  var `type`: js.UndefOr[java.lang.String] = js.undefined
           // Object of any valid attribute of input field
  var value: js.UndefOr[java.lang.String] = js.undefined
}

