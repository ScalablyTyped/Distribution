package typings.inkSelectInput

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ink-select-input", JSImport.Default)
  @js.native
  class default ()
    extends Component[SelectInputProps[ItemOfSelectInput], js.Object, js.Any]
  
  trait ItemOfSelectInput extends StObject {
    
    var key: js.UndefOr[String | Double] = js.undefined
    
    var label: String
    
    var value: js.Any
  }
  object ItemOfSelectInput {
    
    @scala.inline
    def apply(label: String, value: js.Any): ItemOfSelectInput = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemOfSelectInput]
    }
    
    @scala.inline
    implicit class ItemOfSelectInputMutableBuilder[Self <: ItemOfSelectInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type SelectInput = Component[SelectInputProps[ItemOfSelectInput], js.Object, js.Any]
  
  trait SelectInputProps[T /* <: ItemOfSelectInput */] extends StObject {
    
    var focus: js.UndefOr[Boolean] = js.undefined
    
    var indicatorComponent: js.UndefOr[Component[js.Object, js.Object, js.Any]] = js.undefined
    
    var initialIndex: js.UndefOr[Double] = js.undefined
    
    var itemComponent: js.UndefOr[Component[js.Object, js.Object, js.Any]] = js.undefined
    
    var items: js.UndefOr[js.Array[T]] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* item */ T, Unit]] = js.undefined
  }
  object SelectInputProps {
    
    @scala.inline
    def apply[T /* <: ItemOfSelectInput */](): SelectInputProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectInputProps[T]]
    }
    
    @scala.inline
    implicit class SelectInputPropsMutableBuilder[Self <: SelectInputProps[?], T /* <: ItemOfSelectInput */] (val x: Self & SelectInputProps[T]) extends AnyVal {
      
      @scala.inline
      def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      @scala.inline
      def setIndicatorComponent(value: Component[js.Object, js.Object, js.Any]): Self = StObject.set(x, "indicatorComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorComponentUndefined: Self = StObject.set(x, "indicatorComponent", js.undefined)
      
      @scala.inline
      def setInitialIndex(value: Double): Self = StObject.set(x, "initialIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialIndexUndefined: Self = StObject.set(x, "initialIndex", js.undefined)
      
      @scala.inline
      def setItemComponent(value: Component[js.Object, js.Object, js.Any]): Self = StObject.set(x, "itemComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemComponentUndefined: Self = StObject.set(x, "itemComponent", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* item */ T => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    }
  }
}
