package typings.kineticjs.Kinetic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContainer
  extends StObject
     with INode {
  
  def add(child: INode): Any = js.native
  
  def destroyChildren(): IContainer = js.native
  
  def find(selector: String): Any = js.native
  
  def get(selector: Any): Any = js.native
  
  def getChildren(): js.Array[INode] = js.native
  
  def getIntersections(point: Any): Any = js.native
  
  def isAncestorOf(node: Any): Any = js.native
  
  def removeChildren(): Any = js.native
}
