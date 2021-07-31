package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeTaint extends StObject {
  
  /** Effect for taint. */
  var effect: js.UndefOr[String] = js.undefined
  
  /** Key for taint. */
  var key: js.UndefOr[String] = js.undefined
  
  /** Value for taint. */
  var value: js.UndefOr[String] = js.undefined
}
object NodeTaint {
  
  @scala.inline
  def apply(): NodeTaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeTaint]
  }
  
  @scala.inline
  implicit class NodeTaintMutableBuilder[Self <: NodeTaint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffect(value: String): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
