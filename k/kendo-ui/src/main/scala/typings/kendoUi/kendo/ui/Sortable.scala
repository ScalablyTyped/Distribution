package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sortable
  extends StObject
     with Widget {
  
  def indexOf(element: JQuery): Double = js.native
  
  def items(): JQuery = js.native
  
  @JSName("options")
  var options_Sortable: SortableOptions = js.native
  
  var wrapper: JQuery = js.native
}
