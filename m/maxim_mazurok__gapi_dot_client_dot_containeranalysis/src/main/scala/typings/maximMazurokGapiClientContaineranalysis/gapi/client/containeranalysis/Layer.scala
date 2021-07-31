package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layer extends StObject {
  
  /** The recovered arguments to the Dockerfile directive. */
  var arguments: js.UndefOr[String] = js.undefined
  
  /** Required. The recovered Dockerfile directive used to construct this layer. */
  var directive: js.UndefOr[String] = js.undefined
}
object Layer {
  
  @scala.inline
  def apply(): Layer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layer]
  }
  
  @scala.inline
  implicit class LayerMutableBuilder[Self <: Layer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: String): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    @scala.inline
    def setDirective(value: String): Self = StObject.set(x, "directive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectiveUndefined: Self = StObject.set(x, "directive", js.undefined)
  }
}
