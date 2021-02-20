package typings.kineticjs.Kinetic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContainer extends INode {
  
  def add(child: INode): js.Any = js.native
  
  def destroyChildren(): IContainer = js.native
  
  def find(selector: String): js.Any = js.native
  
  def get(selector: js.Any): js.Any = js.native
  
  def getChildren(): js.Array[INode] = js.native
  
  def getIntersections(point: js.Any): js.Any = js.native
  
  def isAncestorOf(node: js.Any): js.Any = js.native
  
  def removeChildren(): js.Any = js.native
}
