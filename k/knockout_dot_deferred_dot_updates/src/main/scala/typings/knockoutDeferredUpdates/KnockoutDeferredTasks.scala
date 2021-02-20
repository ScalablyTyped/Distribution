package typings.knockoutDeferredUpdates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutDeferredTasks extends StObject {
  
  def makeProcessedCallback(evaluator: js.Function): Unit = js.native
  
  def processDelayed(evaluator: js.Function): Boolean = js.native
  def processDelayed(evaluator: js.Function, distinct: js.UndefOr[scala.Nothing], options: js.Array[_]): Boolean = js.native
  def processDelayed(evaluator: js.Function, distinct: Boolean): Boolean = js.native
  def processDelayed(evaluator: js.Function, distinct: Boolean, options: js.Array[_]): Boolean = js.native
  
  def processImmediate(evaluator: js.Function): js.Any = js.native
  def processImmediate(evaluator: js.Function, `object`: js.UndefOr[scala.Nothing], args: js.Array[_]): js.Any = js.native
  def processImmediate(evaluator: js.Function, `object`: js.Any): js.Any = js.native
  def processImmediate(evaluator: js.Function, `object`: js.Any, args: js.Array[_]): js.Any = js.native
}
