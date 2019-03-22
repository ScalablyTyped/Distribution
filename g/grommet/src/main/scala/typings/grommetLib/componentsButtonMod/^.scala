package typings
package grommetLib.componentsButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Button", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Button: reactLib.reactMod.ReactNs.ComponentClass[
    ButtonProps with (grommetLib.utilsMod.Omit[
      reactLib.reactMod.ReactNs.DetailedHTMLProps[
        reactLib.reactMod.ReactNs.ButtonHTMLAttributes[reactLib.HTMLButtonElement], 
        reactLib.HTMLButtonElement
      ], 
      grommetLib.grommetLibStrings.color
    ]), 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
}

