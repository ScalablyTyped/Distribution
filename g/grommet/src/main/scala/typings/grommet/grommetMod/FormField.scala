package typings.grommet.grommetMod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.componentsFormFieldMod.FormFieldProps
import typings.grommet.grommetStrings.placeholder
import typings.grommet.utilsMod.Omit
import typings.react.HTMLInputElement
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.InputHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "FormField")
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

@JSImport("grommet", "FormField")
@js.native
object FormField extends TopLevel[
      ComponentClass[
        FormFieldProps with (Omit[
          DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
          placeholder
        ]), 
        ComponentState
      ]
    ]

