package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodePopulatedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the bindings object for the level at which the populated node is located.
    */
  var binding: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets the node data.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the jQuery element of the node whose children are populated.
    */
  var element: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the data-path atrribute of the populated node.
    */
  var path: js.UndefOr[String] = js.undefined
}
object NodePopulatedEventUIParam {
  
  @scala.inline
  def apply(): NodePopulatedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodePopulatedEventUIParam]
  }
  
  @scala.inline
  implicit class NodePopulatedEventUIParamMutableBuilder[Self <: NodePopulatedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinding(value: js.Any): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingUndefined: Self = StObject.set(x, "binding", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
