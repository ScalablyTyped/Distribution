package typings.knockoutDeferredUpdates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutDeferredTasks extends StObject {
  
  def makeProcessedCallback(evaluator: js.Function): Unit = js.native
  
  def processDelayed(evaluator: js.Function): Boolean = js.native
  def processDelayed(evaluator: js.Function, distinct: Boolean): Boolean = js.native
  def processDelayed(evaluator: js.Function, distinct: Boolean, options: js.Array[Any]): Boolean = js.native
  def processDelayed(evaluator: js.Function, distinct: Unit, options: js.Array[Any]): Boolean = js.native
  
  def processImmediate(evaluator: js.Function): Any = js.native
  def processImmediate(evaluator: js.Function, `object`: Any): Any = js.native
  def processImmediate(evaluator: js.Function, `object`: Any, args: js.Array[Any]): Any = js.native
  def processImmediate(evaluator: js.Function, `object`: Unit, args: js.Array[Any]): Any = js.native
}
