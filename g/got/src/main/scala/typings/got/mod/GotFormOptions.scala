package typings.got.mod

import typings.got.gotBooleans.`true`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GotFormOptions[E /* <: String | Null */]
  extends StObject
     with GotOptions[E] {
  
  var body: js.UndefOr[Record[String, js.Any]] = js.undefined
  
  var form: `true`
  
  var hooks: js.UndefOr[Hooks[GotFormOptions[E], Record[String, js.Any]]] = js.undefined
  
  var json: js.UndefOr[Boolean] = js.undefined
}
object GotFormOptions {
  
  inline def apply[E /* <: String | Null */](): GotFormOptions[E] = {
    val __obj = js.Dynamic.literal(form = true)
    __obj.asInstanceOf[GotFormOptions[E]]
  }
  
  extension [Self <: GotFormOptions[?], E /* <: String | Null */](x: Self & GotFormOptions[E]) {
    
    inline def setBody(value: Record[String, js.Any]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setForm(value: `true`): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setHooks(value: Hooks[GotFormOptions[E], Record[String, js.Any]]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
  }
}
