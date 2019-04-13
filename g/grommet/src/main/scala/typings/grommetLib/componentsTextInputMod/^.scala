package typings
package grommetLib.componentsTextInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/TextInput", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val TextInput: reactLib.reactMod.ComponentClass[
    TextInputProps with (grommetLib.utilsMod.Omit[
      reactLib.reactMod.DetailedHTMLProps[
        reactLib.reactMod.InputHTMLAttributes[reactLib.HTMLInputElement], 
        reactLib.HTMLInputElement
      ], 
      grommetLib.grommetLibStrings.onSelect | grommetLib.grommetLibStrings.size
    ]), 
    reactLib.reactMod.ComponentState
  ] = js.native
}

