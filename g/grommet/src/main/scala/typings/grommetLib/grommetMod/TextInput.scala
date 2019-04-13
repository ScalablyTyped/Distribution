package typings
package grommetLib.grommetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "TextInput")
@js.native
class TextInput protected ()
  extends reactLib.reactMod.Component[
      grommetLib.componentsTextInputMod.TextInputProps with (grommetLib.utilsMod.Omit[
        reactLib.reactMod.DetailedHTMLProps[
          reactLib.reactMod.InputHTMLAttributes[reactLib.HTMLInputElement], 
          reactLib.HTMLInputElement
        ], 
        grommetLib.grommetLibStrings.onSelect | grommetLib.grommetLibStrings.size
      ]), 
      reactLib.reactMod.ComponentState, 
      js.Any
    ] {
  def this(props: grommetLib.componentsTextInputMod.TextInputProps with (grommetLib.utilsMod.Omit[
      reactLib.reactMod.DetailedHTMLProps[
        reactLib.reactMod.InputHTMLAttributes[reactLib.HTMLInputElement], 
        reactLib.HTMLInputElement
      ], 
      grommetLib.grommetLibStrings.onSelect | grommetLib.grommetLibStrings.size
    ])) = this()
  def this(props: grommetLib.componentsTextInputMod.TextInputProps with (grommetLib.utilsMod.Omit[
      reactLib.reactMod.DetailedHTMLProps[
        reactLib.reactMod.InputHTMLAttributes[reactLib.HTMLInputElement], 
        reactLib.HTMLInputElement
      ], 
      grommetLib.grommetLibStrings.onSelect | grommetLib.grommetLibStrings.size
    ]), context: js.Any) = this()
}

