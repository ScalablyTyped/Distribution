package typings.knockoutPreRendered

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutComputedContext extends js.Object {
  
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
  implicit class KnockoutComputedContextOps[Self <: KnockoutComputedContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetDependenciesCount(value: () => Double): Self = this.set("getDependenciesCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsInitial(value: () => Boolean): Self = this.set("isInitial", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSleeping(value: Boolean): Self = this.set("isSleeping", value.asInstanceOf[js.Any])
  }
}
