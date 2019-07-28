package typings.grommet.componentsTextInputMod

import typings.grommet.grommetStrings.onSelect
import typings.grommet.grommetStrings.size
import typings.grommet.utilsMod.Omit
import typings.react.HTMLInputElement
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.InputHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/TextInput", "TextInput")
@js.native
class TextInput protected ()
  extends Component[
      TextInputProps with (Omit[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        onSelect | size
      ]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: TextInputProps with (Omit[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        onSelect | size
      ])) = this()
  def this(
    props: TextInputProps with (Omit[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        onSelect | size
      ]),
    context: js.Any
  ) = this()
}

