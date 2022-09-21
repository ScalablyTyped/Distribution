package typings.kendoUi.kendo.data

import typings.std.Element
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binders {
  
  type attr = Binder
  
  type css = Binder
  
  type disabled = Binder
  
  type enabled = Binder
  
  type events = Binder
  
  type html = Binder
  
  object input {
    
    @js.native
    trait checked
      extends StObject
         with TypedBinder {
      
      def change(): Unit = js.native
      
      def value(): Any = js.native
    }
  }
  
  type invisible = Binder
  
  type readonly = Binder
  
  object select {
    
    type source = typings.kendoUi.kendo.data.binders.source
    
    @js.native
    trait value
      extends StObject
         with TypedBinder {
      
      def change(): Unit = js.native
    }
  }
  
  @js.native
  trait source
    extends StObject
       with Binder {
    
    def add(index: Number, items: js.Array[Any]): Unit = js.native
    
    def container(): Element = js.native
    
    def remove(index: Number, items: js.Array[Any]): Unit = js.native
    
    def render(): Unit = js.native
    
    def template(): String = js.native
  }
  
  type style = Binder
  
  type text = Binder
  
  @js.native
  trait value
    extends StObject
       with TypedBinder {
    
    def change(): Unit = js.native
  }
  
  type visible = Binder
  
  object widget {
    
    @js.native
    trait checked
      extends StObject
         with Binder {
      
      def change(): Unit = js.native
      
      def value(): Any = js.native
    }
    
    type disabled = Binder
    
    object dropdowntree {
      
      @js.native
      trait value
        extends StObject
           with Binder {
        
        def change(): Unit = js.native
      }
    }
    
    type enabled = Binder
    
    @js.native
    trait end
      extends StObject
         with Binder {
      
      def change(): Unit = js.native
    }
    
    type events = Binder
    
    type invisible = Binder
    
    object multiselect {
      
      @js.native
      trait value
        extends StObject
           with Binder {
        
        def change(): Unit = js.native
      }
    }
    
    @js.native
    trait start
      extends StObject
         with Binder {
      
      def change(): Unit = js.native
    }
    
    @js.native
    trait value
      extends StObject
         with Binder {
      
      def change(): Unit = js.native
    }
    
    type visible = Binder
  }
}
