package typings.handsontable.mod.Handsontable._editors

import typings.pikaday.mod.PikadayOptions
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Date extends Text {
  
  def destroyElements(): Unit = js.native
  
  def getDatePickerConfig(): PikadayOptions = js.native
  
  def hideDatepicker(): Unit = js.native
  
  def showDatepicker(): Unit = js.native
  def showDatepicker(event: Event): Unit = js.native
}
