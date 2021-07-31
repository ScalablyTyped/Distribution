package typings.ionicons.stencilPublicRuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildNode extends StObject {
  
  var vattrs: js.UndefOr[js.Any] = js.undefined
  
  var vchildren: js.UndefOr[js.Array[VNode]] = js.undefined
  
  var vkey: js.UndefOr[String | Double] = js.undefined
  
  var vname: js.UndefOr[String] = js.undefined
  
  var vtag: js.UndefOr[String | Double | js.Function] = js.undefined
  
  var vtext: js.UndefOr[String] = js.undefined
}
object ChildNode {
  
  @scala.inline
  def apply(): ChildNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildNode]
  }
  
  @scala.inline
  implicit class ChildNodeMutableBuilder[Self <: ChildNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVattrs(value: js.Any): Self = StObject.set(x, "vattrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVattrsUndefined: Self = StObject.set(x, "vattrs", js.undefined)
    
    @scala.inline
    def setVchildren(value: js.Array[VNode]): Self = StObject.set(x, "vchildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVchildrenUndefined: Self = StObject.set(x, "vchildren", js.undefined)
    
    @scala.inline
    def setVchildrenVarargs(value: VNode*): Self = StObject.set(x, "vchildren", js.Array(value :_*))
    
    @scala.inline
    def setVkey(value: String | Double): Self = StObject.set(x, "vkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVkeyUndefined: Self = StObject.set(x, "vkey", js.undefined)
    
    @scala.inline
    def setVname(value: String): Self = StObject.set(x, "vname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVnameUndefined: Self = StObject.set(x, "vname", js.undefined)
    
    @scala.inline
    def setVtag(value: String | Double | js.Function): Self = StObject.set(x, "vtag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVtagUndefined: Self = StObject.set(x, "vtag", js.undefined)
    
    @scala.inline
    def setVtext(value: String): Self = StObject.set(x, "vtext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVtextUndefined: Self = StObject.set(x, "vtext", js.undefined)
  }
}
