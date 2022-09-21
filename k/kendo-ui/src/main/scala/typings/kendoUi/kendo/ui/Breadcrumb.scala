package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Breadcrumb
  extends StObject
     with Widget {
  
  def items(items: js.Array[BreadcrumbItem]): Unit = js.native
  
  @JSName("options")
  var options_Breadcrumb: BreadcrumbOptions = js.native
  
  def value(path: String): Unit = js.native
  
  var wrapper: JQuery = js.native
}
