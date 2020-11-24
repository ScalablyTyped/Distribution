package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object maskedInputMod {
  
  type MaskedInputType = typings.grommet.maskedInputMod.MaskedInputProps with (typings.std.Omit[
    typings.react.mod.DetailedHTMLProps[
      typings.react.mod.InputHTMLAttributes[typings.std.HTMLInputElement], 
      typings.std.HTMLInputElement
    ], 
    typings.grommet.grommetStrings.icon | typings.grommet.grommetStrings.id | typings.grommet.grommetStrings.mask | typings.grommet.grommetStrings.name | typings.grommet.grommetStrings.onBlur | typings.grommet.grommetStrings.plain | typings.grommet.grommetStrings.reverse | typings.grommet.grommetStrings.size | typings.grommet.grommetStrings.value
  ])
}
