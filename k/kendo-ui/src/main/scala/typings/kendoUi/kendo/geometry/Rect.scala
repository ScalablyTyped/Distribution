package typings.kendoUi.kendo.geometry

import typings.kendoUi.kendo.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rect
  extends StObject
     with Observable {
  
  def bbox(matrix: Matrix): Rect = js.native
  
  def bottomLeft(): Point = js.native
  
  def bottomRight(): Point = js.native
  
  def center(): Point = js.native
  
  def equals(other: Rect): Boolean = js.native
  
  def getOrigin(): Point = js.native
  
  def getSize(): Size = js.native
  
  def height(): Double = js.native
  
  var options: RectOptions = js.native
  
  var origin: Point = js.native
  
  def setOrigin(value: js.Any): Rect = js.native
  def setOrigin(value: Point): Rect = js.native
  
  def setSize(value: js.Any): Rect = js.native
  def setSize(value: Size): Rect = js.native
  
  var size: Size = js.native
  
  def topLeft(): Point = js.native
  
  def topRight(): Point = js.native
  
  def width(): Double = js.native
}
