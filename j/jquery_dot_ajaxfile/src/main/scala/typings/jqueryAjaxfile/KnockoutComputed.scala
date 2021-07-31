package typings.jqueryAjaxfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutComputed[T]
  extends StObject
     with KnockoutObservable[T]
     with KnockoutComputedFunctions[T] {
  
  def dispose(): Unit = js.native
  
  var fn: KnockoutComputedFunctions[js.Any] = js.native
  
  def getDependenciesCount(): Double = js.native
  
  def isActive(): Boolean = js.native
}
