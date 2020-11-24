package typings.kendoUi.kendo.data

import typings.std.Element
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.data.binders")
@js.native
object binders extends js.Object {
  
  @js.native
  object input extends js.Object {
    
    @js.native
    trait checked extends TypedBinder {
      
      def change(): Unit = js.native
      
      def value(): js.Any = js.native
    }
  }
  
  @js.native
  object select extends js.Object {
    
    @js.native
    trait value extends TypedBinder {
      
      def change(): Unit = js.native
    }
    
    type source = typings.kendoUi.kendo.data.binders.source
  }
  
  @js.native
  trait source extends Binder {
    
    def add(index: Number, items: js.Array[_]): Unit = js.native
    
    def container(): Element = js.native
    
    def remove(index: Number, items: js.Array[_]): Unit = js.native
    
    def render(): Unit = js.native
    
    def template(): String = js.native
  }
  
  @js.native
  trait value extends TypedBinder {
    
    def change(): Unit = js.native
  }
  
  @js.native
  object widget extends js.Object {
    
    @js.native
    trait checked extends Binder {
      
      def change(): Unit = js.native
      
      def value(): js.Any = js.native
    }
    
    @js.native
    object dropdowntree extends js.Object {
      
      @js.native
      trait value extends Binder {
        
        def change(): Unit = js.native
      }
    }
    
    @js.native
    trait end extends Binder {
      
      def change(): Unit = js.native
    }
    
    @js.native
    object multiselect extends js.Object {
      
      @js.native
      trait value extends Binder {
        
        def change(): Unit = js.native
      }
    }
    
    @js.native
    trait start extends Binder {
      
      def change(): Unit = js.native
    }
    
    @js.native
    trait value extends Binder {
      
      def change(): Unit = js.native
    }
    
    type disabled = Binder
    
    type enabled = Binder
    
    type events = Binder
    
    type invisible = Binder
    
    type visible = Binder
  }
  
  type attr = Binder
  
  type css = Binder
  
  type disabled = Binder
  
  type enabled = Binder
  
  type events = Binder
  
  type html = Binder
  
  type invisible = Binder
  
  type readonly = Binder
  
  type style = Binder
  
  type text = Binder
  
  type visible = Binder
}
