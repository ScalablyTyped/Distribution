package typings.jqueryAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutComputed[T]
  extends KnockoutObservable[T]
     with KnockoutComputedFunctions[T] {
  
  def dispose(): Unit = js.native
  
  var fn: KnockoutComputedFunctions[_] = js.native
  
  def getDependenciesCount(): Double = js.native
  
  def isActive(): Boolean = js.native
}
