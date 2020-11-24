package typings.knockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputedContext_ extends js.Object {
  
  def getDependencies(): js.Array[Subscribable_[_]] = js.native
  
  def getDependenciesCount(): Double = js.native
  
  def isInitial(): Boolean = js.native
  
  def registerDependency(subscribable: Subscribable_[_]): Unit = js.native
}
object ComputedContext_ {
  
  @scala.inline
  def apply(
    getDependencies: () => js.Array[Subscribable_[_]],
    getDependenciesCount: () => Double,
    isInitial: () => Boolean,
    registerDependency: Subscribable_[_] => Unit
  ): ComputedContext_ = {
    val __obj = js.Dynamic.literal(getDependencies = js.Any.fromFunction0(getDependencies), getDependenciesCount = js.Any.fromFunction0(getDependenciesCount), isInitial = js.Any.fromFunction0(isInitial), registerDependency = js.Any.fromFunction1(registerDependency))
    __obj.asInstanceOf[ComputedContext_]
  }
  
  @scala.inline
  implicit class ComputedContext_Ops[Self <: ComputedContext_] (val x: Self) extends AnyVal {
    
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
    def setGetDependencies(value: () => js.Array[Subscribable_[_]]): Self = this.set("getDependencies", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDependenciesCount(value: () => Double): Self = this.set("getDependenciesCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsInitial(value: () => Boolean): Self = this.set("isInitial", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegisterDependency(value: Subscribable_[_] => Unit): Self = this.set("registerDependency", js.Any.fromFunction1(value))
  }
}
