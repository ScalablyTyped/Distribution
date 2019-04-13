package typings
package grommetLib.componentsButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Button", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Button: reactLib.reactMod.ComponentClass[
    ButtonProps with (grommetLib.utilsMod.Omit[
      reactLib.reactMod.DetailedHTMLProps[
        reactLib.reactMod.ButtonHTMLAttributes[reactLib.HTMLButtonElement], 
        reactLib.HTMLButtonElement
      ], 
      grommetLib.grommetLibStrings.color
    ]), 
    reactLib.reactMod.ComponentState
  ] = js.native
}

