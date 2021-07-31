package typings.maximMazurokGapiClientAdmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  /**
    * Name of the event. This is the specific name of the activity reported by the API. And each eventName is related to a specific G Suite service or feature which the API organizes
    * into types of events. For eventName request parameters in general: - If no eventName is given, the report returns all possible instances of an eventName. - When you request an
    * eventName, the API's response returns all activities which contain that eventName. It is possible that the returned activities will have other eventName properties in addition
    * to the one requested. For more information about eventName properties, see the list of event names for various applications above in applicationName.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Parameter value pairs for various applications. For more information about eventName parameters, see the list of event names for various applications above in applicationName. */
  var parameters: js.UndefOr[js.Array[BoolValue]] = js.undefined
  
  /**
    * Type of event. The G Suite service or feature that an administrator changes is identified in the type property which identifies an event using the eventName property. For a full
    * list of the API's type categories, see the list of event names for various applications above in applicationName.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object Name {
  
  @scala.inline
  def apply(): Name = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParameters(value: js.Array[BoolValue]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: BoolValue*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
