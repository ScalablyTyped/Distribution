package typings.kendoUi.kendo.dataviz.geometry

import typings.kendoUi.kendo.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Size
  extends StObject
     with Observable {
  
  def equals(other: typings.kendoUi.kendo.geometry.Size): Boolean = js.native
  
  def getHeight(): Double = js.native
  
  def getWidth(): Double = js.native
  
  var height: Double = js.native
  
  var options: SizeOptions = js.native
  
  def setHeight(value: Double): typings.kendoUi.kendo.geometry.Size = js.native
  
  def setWidth(value: Double): typings.kendoUi.kendo.geometry.Size = js.native
  
  var width: Double = js.native
}
