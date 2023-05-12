package typings.inferno

import typings.inferno.distCoreTypesMod.InfernoNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    var children: js.UndefOr[InfernoNode] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: InfernoNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait Html extends StObject {
    
    var __html: String
  }
  object Html {
    
    inline def apply(__html: String): Html = {
      val __obj = js.Dynamic.literal(__html = __html.asInstanceOf[js.Any])
      __obj.asInstanceOf[Html]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Html] (val x: Self) extends AnyVal {
      
      inline def set__html(value: String): Self = StObject.set(x, "__html", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<{  children :inferno.inferno/dist/core/types.InfernoNode | undefined}> */
  trait ReadonlychildrenInfernoNo extends StObject {
    
    val children: js.UndefOr[InfernoNode] = js.undefined
  }
  object ReadonlychildrenInfernoNo {
    
    inline def apply(): ReadonlychildrenInfernoNo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlychildrenInfernoNo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlychildrenInfernoNo] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: InfernoNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
