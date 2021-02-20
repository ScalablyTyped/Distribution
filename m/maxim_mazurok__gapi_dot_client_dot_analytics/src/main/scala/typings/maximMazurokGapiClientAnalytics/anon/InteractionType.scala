package typings.maximMazurokGapiClientAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InteractionType extends StObject {
  
  /** Type of an interaction on conversion path. Such as CLICK, IMPRESSION etc. */
  var interactionType: js.UndefOr[String] = js.native
  
  /** Node value of an interaction on conversion path. Such as source, medium etc. */
  var nodeValue: js.UndefOr[String] = js.native
}
object InteractionType {
  
  @scala.inline
  def apply(): InteractionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InteractionType]
  }
  
  @scala.inline
  implicit class InteractionTypeMutableBuilder[Self <: InteractionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInteractionType(value: String): Self = StObject.set(x, "interactionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractionTypeUndefined: Self = StObject.set(x, "interactionType", js.undefined)
    
    @scala.inline
    def setNodeValue(value: String): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeValueUndefined: Self = StObject.set(x, "nodeValue", js.undefined)
  }
}
