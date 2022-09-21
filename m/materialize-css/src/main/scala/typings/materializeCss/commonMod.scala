package typings.materializeCss

import typings.std.Element
import typings.std.NodeListOf
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  object M {
    
    @JSImport("materialize-css/common", "M.Component")
    @js.native
    abstract class Component[TOptions] protected () extends ComponentBase[TOptions] {
      /**
        * Construct component instance and set everything up
        */
      def this(elem: Element) = this()
      def this(elem: Element, options: Partial[TOptions]) = this()
      
      /**
        * Destroy plugin instance and teardown
        */
      def destroy(): Unit = js.native
    }
    
    @JSImport("materialize-css/common", "M.ComponentBase")
    @js.native
    abstract class ComponentBase[TOptions] () extends StObject {
      def this(options: Partial[TOptions]) = this()
      
      /**
        * The DOM element the plugin was initialized with
        */
      var el: Element = js.native
      
      /**
        * The options the instance was initialized with
        */
      var options: TOptions = js.native
    }
    
    trait InternationalizationOptions extends StObject {
      
      var cancel: String
      
      var clear: String
      
      var done: String
      
      var months: js.Array[String]
      
      var monthsShort: js.Array[String]
      
      var nextMonth: String
      
      var previousMonth: String
      
      var weekdays: js.Array[String]
      
      var weekdaysAbbrev: js.Array[String]
      
      var weekdaysShort: js.Array[String]
    }
    object InternationalizationOptions {
      
      inline def apply(
        cancel: String,
        clear: String,
        done: String,
        months: js.Array[String],
        monthsShort: js.Array[String],
        nextMonth: String,
        previousMonth: String,
        weekdays: js.Array[String],
        weekdaysAbbrev: js.Array[String],
        weekdaysShort: js.Array[String]
      ): InternationalizationOptions = {
        val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], monthsShort = monthsShort.asInstanceOf[js.Any], nextMonth = nextMonth.asInstanceOf[js.Any], previousMonth = previousMonth.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any], weekdaysAbbrev = weekdaysAbbrev.asInstanceOf[js.Any], weekdaysShort = weekdaysShort.asInstanceOf[js.Any])
        __obj.asInstanceOf[InternationalizationOptions]
      }
      
      extension [Self <: InternationalizationOptions](x: Self) {
        
        inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
        
        inline def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
        
        inline def setDone(value: String): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
        
        inline def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
        
        inline def setMonthsShort(value: js.Array[String]): Self = StObject.set(x, "monthsShort", value.asInstanceOf[js.Any])
        
        inline def setMonthsShortVarargs(value: String*): Self = StObject.set(x, "monthsShort", js.Array(value*))
        
        inline def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value*))
        
        inline def setNextMonth(value: String): Self = StObject.set(x, "nextMonth", value.asInstanceOf[js.Any])
        
        inline def setPreviousMonth(value: String): Self = StObject.set(x, "previousMonth", value.asInstanceOf[js.Any])
        
        inline def setWeekdays(value: js.Array[String]): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
        
        inline def setWeekdaysAbbrev(value: js.Array[String]): Self = StObject.set(x, "weekdaysAbbrev", value.asInstanceOf[js.Any])
        
        inline def setWeekdaysAbbrevVarargs(value: String*): Self = StObject.set(x, "weekdaysAbbrev", js.Array(value*))
        
        inline def setWeekdaysShort(value: js.Array[String]): Self = StObject.set(x, "weekdaysShort", value.asInstanceOf[js.Any])
        
        inline def setWeekdaysShortVarargs(value: String*): Self = StObject.set(x, "weekdaysShort", js.Array(value*))
        
        inline def setWeekdaysVarargs(value: String*): Self = StObject.set(x, "weekdays", js.Array(value*))
      }
    }
    
    trait Openable extends StObject {
      
      def close(): Unit
      
      var isOpen: Boolean
      
      def open(): Unit
    }
    object Openable {
      
      inline def apply(close: () => Unit, isOpen: Boolean, open: () => Unit): Openable = {
        val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open))
        __obj.asInstanceOf[Openable]
      }
      
      extension [Self <: Openable](x: Self) {
        
        inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
        
        inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
        
        inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
      }
    }
  }
  
  type Cash = typings.cashDom.mod.Cash
  
  type MElements = NodeListOf[Element] | JQuery | Cash
}
