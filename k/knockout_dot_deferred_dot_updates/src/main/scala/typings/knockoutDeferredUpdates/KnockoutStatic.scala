package typings.knockoutDeferredUpdates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Knockout global
@js.native
trait KnockoutStatic extends StObject {
  
  def evaluateAsynchronously(evaluator: js.Function): Double = js.native
  def evaluateAsynchronously(evaluator: js.Function, timeout: Any): Double = js.native
  
  def ignoreDependencies(callback: js.Function, callbackTarget: Any): Any = js.native
  def ignoreDependencies(callback: js.Function, callbackTarget: Any, callbackArgs: js.Array[Any]): Any = js.native
  
  def processAllDeferredBindingUpdates(): Unit = js.native
  
  def processAllDeferredUpdates(): Unit = js.native
}
