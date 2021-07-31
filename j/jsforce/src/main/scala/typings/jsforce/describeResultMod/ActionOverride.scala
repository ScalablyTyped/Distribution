package typings.jsforce.describeResultMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionOverride extends StObject {
  
  var formFactor: String
  
  var isAvailableInTouch: Boolean
  
  var name: String
  
  var pageId: String
  
  var url: js.UndefOr[maybe[String]] = js.undefined
}
object ActionOverride {
  
  @scala.inline
  def apply(formFactor: String, isAvailableInTouch: Boolean, name: String, pageId: String): ActionOverride = {
    val __obj = js.Dynamic.literal(formFactor = formFactor.asInstanceOf[js.Any], isAvailableInTouch = isAvailableInTouch.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pageId = pageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionOverride]
  }
  
  @scala.inline
  implicit class ActionOverrideMutableBuilder[Self <: ActionOverride] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormFactor(value: String): Self = StObject.set(x, "formFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAvailableInTouch(value: Boolean): Self = StObject.set(x, "isAvailableInTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageId(value: String): Self = StObject.set(x, "pageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: maybe[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlNull: Self = StObject.set(x, "url", null)
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
