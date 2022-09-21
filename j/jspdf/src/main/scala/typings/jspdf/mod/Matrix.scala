package typings.jspdf.mod

import typings.jspdf.anon.Rotate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Matrix extends StObject {
  
  var a: Double = js.native
  
  def applyToPoint(point: Point): Point = js.native
  
  def applyToRectangle(rect: Rectangle): Rectangle = js.native
  
  var b: Double = js.native
  
  var c: Double = js.native
  
  var d: Double = js.native
  
  def decompose(): Rotate = js.native
  
  var e: Double = js.native
  
  var f: Double = js.native
  
  def inversed(): Matrix = js.native
  
  def join(): String = js.native
  def join(separator: String): String = js.native
  
  def multiply(matrix: Matrix): Matrix = js.native
  
  var shx: Double = js.native
  
  var shy: Double = js.native
  
  var sx: Double = js.native
  
  var sy: Double = js.native
  
  var tx: Double = js.native
  
  var ty: Double = js.native
}
