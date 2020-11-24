package typings.knockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObservableFunctions[T] extends SubscribableFunctions[T] {
  
  def equalityComparer(a: T, b: T): Boolean = js.native
  
  def peek(): T = js.native
  
  def valueHasMutated(): Unit = js.native
  
  def valueWillMutate(): Unit = js.native
}
