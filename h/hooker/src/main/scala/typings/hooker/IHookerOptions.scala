package typings.hooker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHookerOptions extends StObject {
  
  var once: js.UndefOr[Boolean] = js.undefined
  
  var passName: js.UndefOr[Boolean] = js.undefined
  
  var post: js.UndefOr[HookerPostHookFunction] = js.undefined
  
  var pre: js.UndefOr[HookerPreHookFunction] = js.undefined
}
object IHookerOptions {
  
  @scala.inline
  def apply(): IHookerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHookerOptions]
  }
  
  @scala.inline
  implicit class IHookerOptionsMutableBuilder[Self <: IHookerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
    
    @scala.inline
    def setPassName(value: Boolean): Self = StObject.set(x, "passName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassNameUndefined: Self = StObject.set(x, "passName", js.undefined)
    
    @scala.inline
    def setPost(value: HookerPostHookFunction): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    
    @scala.inline
    def setPre(value: HookerPreHookFunction): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
  }
}
