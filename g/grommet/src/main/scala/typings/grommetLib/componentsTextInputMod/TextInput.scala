package typings
package grommetLib.componentsTextInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/TextInput", "TextInput")
@js.native
class TextInput protected ()
  extends reactLib.reactMod.Component[
      TextInputProps with (grommetLib.utilsMod.Omit[
        reactLib.reactMod.DetailedHTMLProps[
          reactLib.reactMod.InputHTMLAttributes[reactLib.HTMLInputElement], 
          reactLib.HTMLInputElement
        ], 
        grommetLib.grommetLibStrings.onSelect | grommetLib.grommetLibStrings.size
      ]), 
      reactLib.reactMod.ComponentState, 
      js.Any
    ] {
  def this(props: TextInputProps with (grommetLib.utilsMod.Omit[
      reactLib.reactMod.DetailedHTMLProps[
        reactLib.reactMod.InputHTMLAttributes[reactLib.HTMLInputElement], 
        reactLib.HTMLInputElement
      ], 
      grommetLib.grommetLibStrings.onSelect | grommetLib.grommetLibStrings.size
    ])) = this()
  def this(props: TextInputProps with (grommetLib.utilsMod.Omit[
      reactLib.reactMod.DetailedHTMLProps[
        reactLib.reactMod.InputHTMLAttributes[reactLib.HTMLInputElement], 
        reactLib.HTMLInputElement
      ], 
      grommetLib.grommetLibStrings.onSelect | grommetLib.grommetLibStrings.size
    ]), context: js.Any) = this()
}

