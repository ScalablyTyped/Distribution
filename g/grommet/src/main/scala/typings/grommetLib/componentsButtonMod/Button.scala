package typings
package grommetLib.componentsButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Button", "Button")
@js.native
class Button protected ()
  extends reactLib.reactMod.ReactNs.Component[
      ButtonProps with (grommetLib.utilsMod.Omit[
        reactLib.reactMod.ReactNs.DetailedHTMLProps[
          reactLib.reactMod.ReactNs.ButtonHTMLAttributes[reactLib.HTMLButtonElement], 
          reactLib.HTMLButtonElement
        ], 
        grommetLib.grommetLibStrings.color
      ]), 
      reactLib.reactMod.ReactNs.ComponentState, 
      js.Any
    ] {
  def this(props: ButtonProps with (grommetLib.utilsMod.Omit[
      reactLib.reactMod.ReactNs.DetailedHTMLProps[
        reactLib.reactMod.ReactNs.ButtonHTMLAttributes[reactLib.HTMLButtonElement], 
        reactLib.HTMLButtonElement
      ], 
      grommetLib.grommetLibStrings.color
    ])) = this()
  def this(props: ButtonProps with (grommetLib.utilsMod.Omit[
      reactLib.reactMod.ReactNs.DetailedHTMLProps[
        reactLib.reactMod.ReactNs.ButtonHTMLAttributes[reactLib.HTMLButtonElement], 
        reactLib.HTMLButtonElement
      ], 
      grommetLib.grommetLibStrings.color
    ]), context: js.Any) = this()
}

