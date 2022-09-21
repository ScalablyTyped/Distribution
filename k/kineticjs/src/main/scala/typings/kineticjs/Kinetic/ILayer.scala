package typings.kineticjs.Kinetic

import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILayer
  extends StObject
     with IContainer {
  
  def afterDraw(handler: js.Function0[Any]): Any = js.native
  
  def beforeDraw(handler: js.Function0[Any]): Any = js.native
  
  def clear(): Any = js.native
  
  def getCanvas(): ICanvas = js.native
  
  def getClearBeforeDraw(): Any = js.native
  
  def getContext(): CanvasRenderingContext2D = js.native
  
  def setClearBeforeDraw(clearBeforeDraw: Boolean): Any = js.native
}
