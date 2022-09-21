package typings.kineticjs.Kinetic

import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStage
  extends StObject
     with IContainer {
  
  def add(layer: ILayer): Any = js.native
  
  def clear(): Any = js.native
  
  def getContainer(): HTMLElement = js.native
  
  def getContent(): HTMLElement = js.native
  
  def getDOM(): HTMLElement = js.native
  
  def getIntersection(pos: Any): Any = js.native
  
  def getMousePosition(): Any = js.native
  def getMousePosition(evt: Event): Any = js.native
  
  def getPointerPosition(): Vector2d = js.native
  
  def getTouchPosition(): Any = js.native
  def getTouchPosition(evt: Event): Any = js.native
  
  def getUserPosition(): Any = js.native
  def getUserPosition(evt: Event): Any = js.native
  
  def load(JSON: Any): Any = js.native
  
  def reset(): Any = js.native
  
  def toImage(config: Any, callback: js.Function0[Any]): Any = js.native
  
  def toJSON(): Any = js.native
}
