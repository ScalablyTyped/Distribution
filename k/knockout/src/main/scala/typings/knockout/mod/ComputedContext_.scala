package typings.knockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputedContext_ extends StObject {
  
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
  implicit class ComputedContext_MutableBuilder[Self <: ComputedContext_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDependencies(value: () => js.Array[Subscribable_[_]]): Self = StObject.set(x, "getDependencies", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDependenciesCount(value: () => Double): Self = StObject.set(x, "getDependenciesCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsInitial(value: () => Boolean): Self = StObject.set(x, "isInitial", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegisterDependency(value: Subscribable_[_] => Unit): Self = StObject.set(x, "registerDependency", js.Any.fromFunction1(value))
  }
}
