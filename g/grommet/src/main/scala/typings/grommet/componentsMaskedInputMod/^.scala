package typings.grommet.componentsMaskedInputMod

import typings.grommet.grommetStrings.id
import typings.grommet.grommetStrings.mask
import typings.grommet.grommetStrings.name
import typings.grommet.grommetStrings.plain
import typings.grommet.grommetStrings.size
import typings.grommet.grommetStrings.value
import typings.react.HTMLInputElement
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.InputHTMLAttributes
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/MaskedInput", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val MaskedInput: ComponentClass[
    MaskedInputProps with (Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      id | mask | name | plain | size | value
    ]), 
    ComponentState
  ] = js.native
}

