package typings.grommet.componentsMaskedInputMod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.grommetStrings.id
import typings.grommet.grommetStrings.mask
import typings.grommet.grommetStrings.name
import typings.grommet.grommetStrings.plain
import typings.grommet.grommetStrings.size
import typings.grommet.grommetStrings.value
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.InputHTMLAttributes
import typings.std.HTMLInputElement
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/MaskedInput", "MaskedInput")
@js.native
class MaskedInput protected ()
  extends Component[
      MaskedInputProps with (Omit[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        id | mask | name | plain | size | value
      ]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: MaskedInputProps with (Omit[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        id | mask | name | plain | size | value
      ])) = this()
  def this(
    props: MaskedInputProps with (Omit[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        id | mask | name | plain | size | value
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/MaskedInput", "MaskedInput")
@js.native
object MaskedInput extends TopLevel[
      ComponentClass[
        MaskedInputProps with (Omit[
          DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
          id | mask | name | plain | size | value
        ]), 
        ComponentState
      ]
    ]

