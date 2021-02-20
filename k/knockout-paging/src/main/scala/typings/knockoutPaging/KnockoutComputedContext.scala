package typings.knockoutPaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutComputedContext extends StObject {
  
  def getDependenciesCount(): Double = js.native
  
  def isInitial(): Boolean = js.native
  
  var isSleeping: Boolean = js.native
}
object KnockoutComputedContext {
  
  @scala.inline
  def apply(getDependenciesCount: () => Double, isInitial: () => Boolean, isSleeping: Boolean): KnockoutComputedContext = {
    val __obj = js.Dynamic.literal(getDependenciesCount = js.Any.fromFunction0(getDependenciesCount), isInitial = js.Any.fromFunction0(isInitial), isSleeping = isSleeping.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutComputedContext]
  }
  
  @scala.inline
  implicit class KnockoutComputedContextMutableBuilder[Self <: KnockoutComputedContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDependenciesCount(value: () => Double): Self = StObject.set(x, "getDependenciesCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsInitial(value: () => Boolean): Self = StObject.set(x, "isInitial", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSleeping(value: Boolean): Self = StObject.set(x, "isSleeping", value.asInstanceOf[js.Any])
  }
}
