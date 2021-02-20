package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Directs Robo to interact with a specific UI element if it is encountered
  * during the crawl. Currently, Robo can perform text entry or element click.
  */
@js.native
trait SchemaRoboDirective extends StObject {
  
  /**
    * Required. The type of action that Robo should perform on the specified
    * element.
    */
  var actionType: js.UndefOr[String] = js.native
  
  /**
    * The text that Robo is directed to set. If left empty, the directive will
    * be treated as a CLICK on the element matching the resource_name.
    */
  var inputText: js.UndefOr[String] = js.native
  
  /**
    * Required. The android resource name of the target UI element. For
    * example,    in Java: R.string.foo    in xml: @string/foo Only the
    * &quot;foo&quot; part is needed. Reference doc:
    * https://developer.android.com/guide/topics/resources/accessing-resources.html
    */
  var resourceName: js.UndefOr[String] = js.native
}
object SchemaRoboDirective {
  
  @scala.inline
  def apply(): SchemaRoboDirective = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoboDirective]
  }
  
  @scala.inline
  implicit class SchemaRoboDirectiveMutableBuilder[Self <: SchemaRoboDirective] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionType(value: String): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
    
    @scala.inline
    def setInputText(value: String): Self = StObject.set(x, "inputText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputTextUndefined: Self = StObject.set(x, "inputText", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
