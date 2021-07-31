package typings.got.mod

import typings.node.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GotBodyOptions[E /* <: String | Null */]
  extends StObject
     with GotOptions[E] {
  
  var body: js.UndefOr[String | Buffer | Readable] = js.undefined
  
  var hooks: js.UndefOr[Hooks[GotBodyOptions[E], String | Buffer | Readable]] = js.undefined
}
object GotBodyOptions {
  
  @scala.inline
  def apply[E /* <: String | Null */](): GotBodyOptions[E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GotBodyOptions[E]]
  }
  
  @scala.inline
  implicit class GotBodyOptionsMutableBuilder[Self <: GotBodyOptions[?], E /* <: String | Null */] (val x: Self & GotBodyOptions[E]) extends AnyVal {
    
    @scala.inline
    def setBody(value: String | Buffer | Readable): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setHooks(value: Hooks[GotBodyOptions[E], String | Buffer | Readable]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
  }
}
