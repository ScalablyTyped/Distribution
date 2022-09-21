package typings.kendoUi.kendo.dataviz.map

import typings.kendoUi.kendo.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Marker
  extends StObject
     with Observable {
  
  def location(): Location = js.native
  def location(location: Any): Unit = js.native
  def location(location: Location): Unit = js.native
  
  var options: MarkerOptions = js.native
}
