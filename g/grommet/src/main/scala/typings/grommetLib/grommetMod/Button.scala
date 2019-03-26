package typings
package grommetLib.grommetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "Button")
@js.native
class Button protected ()
  extends reactLib.reactMod.ReactNs.Component[
      grommetLib.componentsButtonMod.ButtonProps with (grommetLib.utilsMod.Omit[
        reactLib.reactMod.ReactNs.DetailedHTMLProps[
          reactLib.reactMod.ReactNs.ButtonHTMLAttributes[reactLib.HTMLButtonElement], 
          reactLib.HTMLButtonElement
        ], 
        grommetLib.grommetLibStrings.color
      ]), 
      reactLib.reactMod.ReactNs.ComponentState, 
      js.Any
    ] {
  def this(props: grommetLib.componentsButtonMod.ButtonProps with (grommetLib.utilsMod.Omit[
      reactLib.reactMod.ReactNs.DetailedHTMLProps[
        reactLib.reactMod.ReactNs.ButtonHTMLAttributes[reactLib.HTMLButtonElement], 
        reactLib.HTMLButtonElement
      ], 
      grommetLib.grommetLibStrings.color
    ])) = this()
  def this(props: grommetLib.componentsButtonMod.ButtonProps with (grommetLib.utilsMod.Omit[
      reactLib.reactMod.ReactNs.DetailedHTMLProps[
        reactLib.reactMod.ReactNs.ButtonHTMLAttributes[reactLib.HTMLButtonElement], 
        reactLib.HTMLButtonElement
      ], 
      grommetLib.grommetLibStrings.color
    ]), context: js.Any) = this()
}

