package typings.knockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputedFunctions[T] extends SubscribableFunctions[T] {
  
  def dispose(): Unit = js.native
  
  // It's possible for a to be undefined, since the equalityComparer is run on the initial
  // computation with undefined as the first argument. This is user-relevant for deferred computeds.
  def equalityComparer(a: T, b: T): Boolean = js.native
  def equalityComparer(a: js.UndefOr[scala.Nothing], b: T): Boolean = js.native
  
  def getDependencies(): js.Array[Subscribable_[_]] = js.native
  
  def getDependenciesCount(): Double = js.native
  
  def isActive(): Boolean = js.native
  
  def peek(): T = js.native
}
