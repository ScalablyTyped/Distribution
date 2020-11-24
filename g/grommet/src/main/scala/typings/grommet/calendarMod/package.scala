package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object calendarMod {
  
  type CalendarType = typings.grommet.calendarMod.CalendarProps with (typings.std.Omit[
    typings.react.mod.DetailedHTMLProps[
      typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement], 
      typings.std.HTMLDivElement
    ], 
    typings.grommet.grommetStrings.onSelect
  ])
}
