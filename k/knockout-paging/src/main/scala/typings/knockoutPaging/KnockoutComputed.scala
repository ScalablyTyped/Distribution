package typings.knockoutPaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- org.scalablytyped.runtime.StObject because Already inherited
- typings.knockoutPaging.KnockoutComputedFunctions because Already inherited */ @js.native
trait KnockoutComputed[T]
  extends StObject
     with KnockoutObservable[T] {
  
  def dispose(): Unit = js.native
  
  var fn: KnockoutComputedFunctions[Any] = js.native
  
  def getDependenciesCount(): Double = js.native
  
  def isActive(): Boolean = js.native
}
