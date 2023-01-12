package typings.inversify.libInterfacesInterfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context extends StObject {
  
  def addPlan(plan: Plan): Unit
  
  var container: Container
  
  var currentRequest: Request
  
  var id: Double
  
  var plan: Plan
  
  def setCurrentRequest(request: Request): Unit
}
object Context {
  
  inline def apply(
    addPlan: Plan => Unit,
    container: Container,
    currentRequest: Request,
    id: Double,
    plan: Plan,
    setCurrentRequest: Request => Unit
  ): Context = {
    val __obj = js.Dynamic.literal(addPlan = js.Any.fromFunction1(addPlan), container = container.asInstanceOf[js.Any], currentRequest = currentRequest.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], setCurrentRequest = js.Any.fromFunction1(setCurrentRequest))
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
    
    inline def setAddPlan(value: Plan => Unit): Self = StObject.set(x, "addPlan", js.Any.fromFunction1(value))
    
    inline def setContainer(value: Container): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setCurrentRequest(value: Request): Self = StObject.set(x, "currentRequest", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPlan(value: Plan): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setSetCurrentRequest(value: Request => Unit): Self = StObject.set(x, "setCurrentRequest", js.Any.fromFunction1(value))
  }
}
