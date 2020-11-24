package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object buttonMod {
  
  type ButtonType = typings.grommet.buttonMod.ButtonProps with (typings.grommet.utilsMod.Omit[
    typings.react.mod.DetailedHTMLProps[
      typings.react.mod.ButtonHTMLAttributes[typings.std.HTMLButtonElement], 
      typings.std.HTMLButtonElement
    ], 
    typings.grommet.grommetStrings.color
  ])
}
