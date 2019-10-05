package typings.grommet.componentsTextInputMod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.grommetStrings.onSelect
import typings.grommet.grommetStrings.placeholder
import typings.grommet.grommetStrings.size
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

@JSImport("grommet/components/TextInput", "TextInput")
@js.native
class TextInput protected ()
  extends Component[
      TextInputProps with (Omit[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        onSelect | size | placeholder
      ]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: TextInputProps with (Omit[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        onSelect | size | placeholder
      ])) = this()
  def this(
    props: TextInputProps with (Omit[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        onSelect | size | placeholder
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/TextInput", "TextInput")
@js.native
object TextInput extends TopLevel[
      ComponentClass[
        TextInputProps with (Omit[
          DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
          onSelect | size | placeholder
        ]), 
        ComponentState
      ]
    ]

