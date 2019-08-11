package typings.grommet.componentsTextInputMod

import typings.grommet.grommetStrings.onSelect
import typings.grommet.grommetStrings.placeholder
import typings.grommet.grommetStrings.size
import typings.grommet.utilsMod.Omit
import typings.react.HTMLInputElement
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.InputHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/TextInput", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val TextInput: ComponentClass[
    TextInputProps with (Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      onSelect | size | placeholder
    ]), 
    ComponentState
  ] = js.native
}

