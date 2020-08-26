package typings.grommet.textInputMod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.grommetStrings.onSelect
import typings.grommet.grommetStrings.placeholder
import typings.grommet.grommetStrings.size
import typings.grommet.utilsMod.Omit
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.InputHTMLAttributes
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/es6/components/TextInput", "TextInput")
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

@JSImport("grommet/es6/components/TextInput", "TextInput")
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

