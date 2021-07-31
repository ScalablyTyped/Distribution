package typings.jqueryDynatree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynaTree extends StObject {
  
  def activateKey(key: String): DynaTreeNode = js.native
  
  def count(): Double = js.native
  
  def disable(): Unit = js.native
  
  def enable(): Unit = js.native
  
  def enableUpdate(enable: Boolean): Unit = js.native
  
  def getActiveNode(): DynaTreeNode = js.native
  
  def getNodeByKey(key: String): DynaTreeNode = js.native
  
  def getPersistData(): js.Any = js.native
  
  def getRoot(): DynaTreeNode = js.native
  
  def getSelectedNodes(stopOnParents: Boolean): js.Array[DynaTreeNode] = js.native
  
  def initialize(): Unit = js.native
  
  def isInitializing(): Boolean = js.native
  
  def isReloading(): Boolean = js.native
  
  def isUserEvent(): Boolean = js.native
  
  def loadKeyPath(keyPath: String, callback: js.Function2[/* node */ DynaTreeNode, /* status */ String, Unit]): Unit = js.native
  
  def reactivate(setFocus: Boolean): Unit = js.native
  
  def redraw(): Unit = js.native
  
  def reload(): Unit = js.native
  
  def renderInvisibleNodes(): Unit = js.native
  
  def selectKey(key: String, flag: String): DynaTreeNode = js.native
  
  def serializeArray(stopOnParents: Boolean): js.Array[js.Any] = js.native
  
  def toDict(): js.Any = js.native
  def toDict(includeRoot: Boolean): js.Any = js.native
  
  def visit(fn: js.Function1[/* node */ DynaTreeNode, Boolean]): Unit = js.native
  def visit(fn: js.Function1[/* node */ DynaTreeNode, Boolean], includeRoot: Boolean): Unit = js.native
}
