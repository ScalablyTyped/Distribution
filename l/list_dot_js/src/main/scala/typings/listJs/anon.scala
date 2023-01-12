package typings.listJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attr extends StObject {
    
    var attr: String
    
    var name: String
  }
  object Attr {
    
    inline def apply(attr: String, name: String): Attr = {
      val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attr]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Attr] (val x: Self) extends AnyVal {
      
      inline def setAttr(value: String): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: js.Array[String]
  }
  object Data {
    
    inline def apply(data: js.Array[String]): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.Array[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: String*): Self = StObject.set(x, "data", js.Array(value*))
    }
  }
  
  trait InnerWindow extends StObject {
    
    var innerWindow: js.UndefOr[Double] = js.undefined
    
    var item: js.UndefOr[String] = js.undefined
    
    var left: js.UndefOr[Double] = js.undefined
    
    var outerWindow: js.UndefOr[Double] = js.undefined
    
    var paginationClass: js.UndefOr[String] = js.undefined
    
    var right: js.UndefOr[Double] = js.undefined
  }
  object InnerWindow {
    
    inline def apply(): InnerWindow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InnerWindow]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InnerWindow] (val x: Self) extends AnyVal {
      
      inline def setInnerWindow(value: Double): Self = StObject.set(x, "innerWindow", value.asInstanceOf[js.Any])
      
      inline def setInnerWindowUndefined: Self = StObject.set(x, "innerWindow", js.undefined)
      
      inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setOuterWindow(value: Double): Self = StObject.set(x, "outerWindow", value.asInstanceOf[js.Any])
      
      inline def setOuterWindowUndefined: Self = StObject.set(x, "outerWindow", js.undefined)
      
      inline def setPaginationClass(value: String): Self = StObject.set(x, "paginationClass", value.asInstanceOf[js.Any])
      
      inline def setPaginationClassUndefined: Self = StObject.set(x, "paginationClass", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    }
  }
}
