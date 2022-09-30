package typings.hippyReact.mod

import typings.hippyReact.mod.^
import typings.reactReconciler.mod.Fiber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIManagerModule extends StObject {
  
  def callUIFunction(ref: Element, funcName: String, options: Any*): Unit = js.native
  def callUIFunction(ref: Fiber, funcName: String, options: Any*): Unit = js.native
  
  def getElementFromFiberRef(ref: Element): Element | (/* import warning: importer.ImportType#apply Failed type conversion: react-reconciler.react-reconciler.Fiber['stateNode'] */ js.Any) = js.native
  def getElementFromFiberRef(ref: Fiber): Element | (/* import warning: importer.ImportType#apply Failed type conversion: react-reconciler.react-reconciler.Fiber['stateNode'] */ js.Any) = js.native
  
  def getNodeIdByRef(ref: String): Double = js.native
  def getNodeIdByRef(ref: Element): Double = js.native
  def getNodeIdByRef(ref: Fiber): Double = js.native
  
  def measureInAppWindow(ref: Fiber): js.Promise[LayoutContent | String] = js.native
  def measureInAppWindow(ref: Fiber, callback: js.Function1[/* layout */ LayoutContent, Unit]): js.Promise[LayoutContent | String] = js.native
  
  def measureInWindow(ref: Fiber): js.Promise[LayoutContent | String] = js.native
  def measureInWindow(ref: Fiber, callback: js.Function1[/* layout */ LayoutContent, Unit]): js.Promise[LayoutContent | String] = js.native
  
  def measureInWindowByMethod(method: String, ref: Fiber): js.Promise[LayoutContent | String] = js.native
  def measureInWindowByMethod(method: String, ref: Fiber, callback: js.Function1[/* layout */ LayoutContent, Unit]): js.Promise[LayoutContent | String] = js.native
}
object UIManagerModule {
  
  inline def apply: UIManagerModule = ^.asInstanceOf[js.Dynamic].selectDynamic("UIManagerModule").asInstanceOf[UIManagerModule]
}
