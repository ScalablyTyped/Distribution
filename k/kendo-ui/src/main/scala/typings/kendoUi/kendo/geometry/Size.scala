package typings.kendoUi.kendo.geometry

import typings.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Size extends Observable {
  
  def equals(other: Size): Boolean = js.native
  
  def getHeight(): Double = js.native
  
  def getWidth(): Double = js.native
  
  var height: Double = js.native
  
  var options: SizeOptions = js.native
  
  def setHeight(value: Double): Size = js.native
  
  def setWidth(value: Double): Size = js.native
  
  var width: Double = js.native
}
