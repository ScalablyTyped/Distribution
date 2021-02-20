package typings.got.mod

import typings.got.gotBooleans.`true`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GotFormOptions[E /* <: String | Null */] extends GotOptions[E] {
  
  var body: js.UndefOr[Record[String, _]] = js.native
  
  var form: `true` = js.native
  
  var hooks: js.UndefOr[Hooks[GotFormOptions[E], Record[String, _]]] = js.native
  
  var json: js.UndefOr[Boolean] = js.native
}
object GotFormOptions {
  
  @scala.inline
  def apply[E /* <: String | Null */](form: `true`): GotFormOptions[E] = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any])
    __obj.asInstanceOf[GotFormOptions[E]]
  }
  
  @scala.inline
  implicit class GotFormOptionsMutableBuilder[Self <: GotFormOptions[_], E /* <: String | Null */] (val x: Self with GotFormOptions[E]) extends AnyVal {
    
    @scala.inline
    def setBody(value: Record[String, _]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setForm(value: `true`): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooks(value: Hooks[GotFormOptions[E], Record[String, _]]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    @scala.inline
    def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
  }
}
