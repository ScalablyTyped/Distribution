package typings.grommet.componentsFormFieldMod

import typings.grommet.grommetStrings.placeholder
import typings.react.HTMLInputElement
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.InputHTMLAttributes
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/FormField", "FormField")
@js.native
class FormField protected ()
  extends Component[
      FormFieldProps with (Omit[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        placeholder
      ]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: FormFieldProps with (Omit[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        placeholder
      ])) = this()
  def this(
    props: FormFieldProps with (Omit[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        placeholder
      ]),
    context: js.Any
  ) = this()
}

