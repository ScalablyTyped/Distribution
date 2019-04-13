package typings
package grommetLib.grommetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "Button")
@js.native
class Button protected ()
  extends reactLib.reactMod.Component[
      grommetLib.componentsButtonMod.ButtonProps with (grommetLib.utilsMod.Omit[
        reactLib.reactMod.DetailedHTMLProps[
          reactLib.reactMod.ButtonHTMLAttributes[reactLib.HTMLButtonElement], 
          reactLib.HTMLButtonElement
        ], 
        grommetLib.grommetLibStrings.color
      ]), 
      reactLib.reactMod.ComponentState, 
      js.Any
    ] {
  def this(props: grommetLib.componentsButtonMod.ButtonProps with (grommetLib.utilsMod.Omit[
      reactLib.reactMod.DetailedHTMLProps[
        reactLib.reactMod.ButtonHTMLAttributes[reactLib.HTMLButtonElement], 
        reactLib.HTMLButtonElement
      ], 
      grommetLib.grommetLibStrings.color
    ])) = this()
  def this(props: grommetLib.componentsButtonMod.ButtonProps with (grommetLib.utilsMod.Omit[
      reactLib.reactMod.DetailedHTMLProps[
        reactLib.reactMod.ButtonHTMLAttributes[reactLib.HTMLButtonElement], 
        reactLib.HTMLButtonElement
      ], 
      grommetLib.grommetLibStrings.color
    ]), context: js.Any) = this()
}

