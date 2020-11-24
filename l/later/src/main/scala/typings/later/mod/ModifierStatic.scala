package typings.later.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifierStatic extends js.Object {
  
  /**
    * Creates a new modified constraint.
    *
    * @param constraint: The constraint to be modified
    * @param value: The starting value of the after constraint
    */
  /**
    * After Modifier
    */
  def after(constraint: TimePeriod, value: Double): TimePeriod = js.native
  /**
    * After Modifier
    */
  @JSName("after")
  var after_Original: Modifier = js.native
  
  /**
    * Creates a new modified constraint.
    *
    * @param constraint: The constraint to be modified
    * @param value: The starting value of the after constraint
    */
  /**
    * Before Modifier
    */
  def before(constraint: TimePeriod, value: Double): TimePeriod = js.native
  /**
    * Before Modifier
    */
  @JSName("before")
  var before_Original: Modifier = js.native
}
