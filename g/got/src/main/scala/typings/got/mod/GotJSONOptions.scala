package typings.got.mod

import typings.got.gotBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GotJSONOptions
  extends StObject
     with GotOptions[String | Null] {
  
  // Body must be an object or array. See https://github.com/sindresorhus/got/issues/511
  var body: js.UndefOr[js.Object] = js.undefined
  
  var form: js.UndefOr[Boolean] = js.undefined
  
  var hooks: js.UndefOr[Hooks[GotJSONOptions, js.Object]] = js.undefined
  
  var json: `true`
}
object GotJSONOptions {
  
  @scala.inline
  def apply(): GotJSONOptions = {
    val __obj = js.Dynamic.literal(json = true)
    __obj.asInstanceOf[GotJSONOptions]
  }
  
  @scala.inline
  implicit class GotJSONOptionsMutableBuilder[Self <: GotJSONOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setForm(value: Boolean): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    @scala.inline
    def setHooks(value: Hooks[GotJSONOptions, js.Object]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    @scala.inline
    def setJson(value: `true`): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
  }
}
