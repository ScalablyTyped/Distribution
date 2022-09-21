package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRoboDirective extends StObject {
  
  /**
    * Required. The type of action that Robo should perform on the specified element.
    */
  var actionType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The text that Robo is directed to set. If left empty, the directive will be treated as a CLICK on the element matching the resource_name.
    */
  var inputText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The android resource name of the target UI element. For example, in Java: R.string.foo in xml: @string/foo Only the "foo" part is needed. Reference doc: https://developer.android.com/guide/topics/resources/accessing-resources.html
    */
  var resourceName: js.UndefOr[String | Null] = js.undefined
}
object SchemaRoboDirective {
  
  inline def apply(): SchemaRoboDirective = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoboDirective]
  }
  
  extension [Self <: SchemaRoboDirective](x: Self) {
    
    inline def setActionType(value: String): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    inline def setActionTypeNull: Self = StObject.set(x, "actionType", null)
    
    inline def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
    
    inline def setInputText(value: String): Self = StObject.set(x, "inputText", value.asInstanceOf[js.Any])
    
    inline def setInputTextNull: Self = StObject.set(x, "inputText", null)
    
    inline def setInputTextUndefined: Self = StObject.set(x, "inputText", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameNull: Self = StObject.set(x, "resourceName", null)
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
