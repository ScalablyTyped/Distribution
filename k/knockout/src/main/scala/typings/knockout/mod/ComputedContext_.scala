package typings.knockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputedContext_ extends StObject {
  
  def getDependencies(): js.Array[Subscribable_[Any]]
  
  def getDependenciesCount(): Double
  
  def isInitial(): Boolean
  
  def registerDependency(subscribable: Subscribable_[Any]): Unit
}
object ComputedContext_ {
  
  inline def apply(
    getDependencies: () => js.Array[Subscribable_[Any]],
    getDependenciesCount: () => Double,
    isInitial: () => Boolean,
    registerDependency: Subscribable_[Any] => Unit
  ): ComputedContext_ = {
    val __obj = js.Dynamic.literal(getDependencies = js.Any.fromFunction0(getDependencies), getDependenciesCount = js.Any.fromFunction0(getDependenciesCount), isInitial = js.Any.fromFunction0(isInitial), registerDependency = js.Any.fromFunction1(registerDependency))
    __obj.asInstanceOf[ComputedContext_]
  }
  
  extension [Self <: ComputedContext_](x: Self) {
    
    inline def setGetDependencies(value: () => js.Array[Subscribable_[Any]]): Self = StObject.set(x, "getDependencies", js.Any.fromFunction0(value))
    
    inline def setGetDependenciesCount(value: () => Double): Self = StObject.set(x, "getDependenciesCount", js.Any.fromFunction0(value))
    
    inline def setIsInitial(value: () => Boolean): Self = StObject.set(x, "isInitial", js.Any.fromFunction0(value))
    
    inline def setRegisterDependency(value: Subscribable_[Any] => Unit): Self = StObject.set(x, "registerDependency", js.Any.fromFunction1(value))
  }
}
