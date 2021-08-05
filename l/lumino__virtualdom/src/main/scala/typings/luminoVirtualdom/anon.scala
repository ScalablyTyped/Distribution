package typings.luminoVirtualdom

import typings.luminoVirtualdom.mod.ElementAttrs
import typings.luminoVirtualdom.mod.VirtualNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attrs extends StObject {
    
    var attrs: js.UndefOr[ElementAttrs] = js.undefined
    
    var children: js.UndefOr[js.Array[VirtualNode]] = js.undefined
  }
  object Attrs {
    
    inline def apply(): Attrs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attrs]
    }
    
    extension [Self <: Attrs](x: Self) {
      
      inline def setAttrs(value: ElementAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setChildren(value: js.Array[VirtualNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: VirtualNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    }
  }
}
