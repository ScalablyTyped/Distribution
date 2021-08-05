package typings.ionicCore.stencilPublicRuntimeMod

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
  
  inline def apply(): ChildNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildNode]
  }
  
  extension [Self <: ChildNode](x: Self) {
    
    inline def setVattrs(value: js.Any): Self = StObject.set(x, "vattrs", value.asInstanceOf[js.Any])
    
    inline def setVattrsUndefined: Self = StObject.set(x, "vattrs", js.undefined)
    
    inline def setVchildren(value: js.Array[VNode]): Self = StObject.set(x, "vchildren", value.asInstanceOf[js.Any])
    
    inline def setVchildrenUndefined: Self = StObject.set(x, "vchildren", js.undefined)
    
    inline def setVchildrenVarargs(value: VNode*): Self = StObject.set(x, "vchildren", js.Array(value :_*))
    
    inline def setVkey(value: String | Double): Self = StObject.set(x, "vkey", value.asInstanceOf[js.Any])
    
    inline def setVkeyUndefined: Self = StObject.set(x, "vkey", js.undefined)
    
    inline def setVname(value: String): Self = StObject.set(x, "vname", value.asInstanceOf[js.Any])
    
    inline def setVnameUndefined: Self = StObject.set(x, "vname", js.undefined)
    
    inline def setVtag(value: String | Double | js.Function): Self = StObject.set(x, "vtag", value.asInstanceOf[js.Any])
    
    inline def setVtagUndefined: Self = StObject.set(x, "vtag", js.undefined)
    
    inline def setVtext(value: String): Self = StObject.set(x, "vtext", value.asInstanceOf[js.Any])
    
    inline def setVtextUndefined: Self = StObject.set(x, "vtext", js.undefined)
  }
}
