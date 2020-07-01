package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object checkBoxGroupMod {
  type CheckBoxType = typings.grommet.utilsMod.Omit[
    typings.grommet.checkBoxMod.CheckBoxProps with (typings.react.mod.DetailedHTMLProps[
      typings.react.mod.InputHTMLAttributes[typings.std.HTMLInputElement], 
      typings.std.HTMLInputElement
    ]), 
    typings.grommet.grommetStrings.checked
  ]
}
