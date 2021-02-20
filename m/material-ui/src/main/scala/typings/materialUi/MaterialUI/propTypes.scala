package typings.materialUi.MaterialUI

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propTypes {
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUi.materialUiStrings.`bottom-left`
    - typings.materialUi.materialUiStrings.`bottom-right`
    - typings.materialUi.materialUiStrings.`top-left`
    - typings.materialUi.materialUiStrings.`top-right`
  */
  trait corners extends StObject
  object corners {
    
    @scala.inline
    def `bottom-left`: typings.materialUi.materialUiStrings.`bottom-left` = "bottom-left".asInstanceOf[typings.materialUi.materialUiStrings.`bottom-left`]
    
    @scala.inline
    def `bottom-right`: typings.materialUi.materialUiStrings.`bottom-right` = "bottom-right".asInstanceOf[typings.materialUi.materialUiStrings.`bottom-right`]
    
    @scala.inline
    def `top-left`: typings.materialUi.materialUiStrings.`top-left` = "top-left".asInstanceOf[typings.materialUi.materialUiStrings.`top-left`]
    
    @scala.inline
    def `top-right`: typings.materialUi.materialUiStrings.`top-right` = "top-right".asInstanceOf[typings.materialUi.materialUiStrings.`top-right`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUi.materialUiStrings.`bottom-center`
    - typings.materialUi.materialUiStrings.`bottom-left`
    - typings.materialUi.materialUiStrings.`bottom-right`
    - typings.materialUi.materialUiStrings.`top-center`
    - typings.materialUi.materialUiStrings.`top-left`
    - typings.materialUi.materialUiStrings.`top-right`
  */
  trait cornersAndCenter extends StObject
  object cornersAndCenter {
    
    @scala.inline
    def `bottom-center`: typings.materialUi.materialUiStrings.`bottom-center` = "bottom-center".asInstanceOf[typings.materialUi.materialUiStrings.`bottom-center`]
    
    @scala.inline
    def `bottom-left`: typings.materialUi.materialUiStrings.`bottom-left` = "bottom-left".asInstanceOf[typings.materialUi.materialUiStrings.`bottom-left`]
    
    @scala.inline
    def `bottom-right`: typings.materialUi.materialUiStrings.`bottom-right` = "bottom-right".asInstanceOf[typings.materialUi.materialUiStrings.`bottom-right`]
    
    @scala.inline
    def `top-center`: typings.materialUi.materialUiStrings.`top-center` = "top-center".asInstanceOf[typings.materialUi.materialUiStrings.`top-center`]
    
    @scala.inline
    def `top-left`: typings.materialUi.materialUiStrings.`top-left` = "top-left".asInstanceOf[typings.materialUi.materialUiStrings.`top-left`]
    
    @scala.inline
    def `top-right`: typings.materialUi.materialUiStrings.`top-right` = "top-right".asInstanceOf[typings.materialUi.materialUiStrings.`top-right`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUi.materialUiStrings.left
    - typings.materialUi.materialUiStrings.right
    - typings.materialUi.materialUiStrings.up
    - typings.materialUi.materialUiStrings.down
  */
  trait direction extends StObject
  object direction {
    
    @scala.inline
    def down: typings.materialUi.materialUiStrings.down = "down".asInstanceOf[typings.materialUi.materialUiStrings.down]
    
    @scala.inline
    def left: typings.materialUi.materialUiStrings.left = "left".asInstanceOf[typings.materialUi.materialUiStrings.left]
    
    @scala.inline
    def right: typings.materialUi.materialUiStrings.right = "right".asInstanceOf[typings.materialUi.materialUiStrings.right]
    
    @scala.inline
    def up: typings.materialUi.materialUiStrings.up = "up".asInstanceOf[typings.materialUi.materialUiStrings.up]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUi.materialUiStrings.left
    - typings.materialUi.materialUiStrings.middle
    - typings.materialUi.materialUiStrings.right
  */
  trait horizontal extends StObject
  object horizontal {
    
    @scala.inline
    def left: typings.materialUi.materialUiStrings.left = "left".asInstanceOf[typings.materialUi.materialUiStrings.left]
    
    @scala.inline
    def middle: typings.materialUi.materialUiStrings.middle = "middle".asInstanceOf[typings.materialUi.materialUiStrings.middle]
    
    @scala.inline
    def right: typings.materialUi.materialUiStrings.right = "right".asInstanceOf[typings.materialUi.materialUiStrings.right]
  }
  
  @js.native
  trait origin extends StObject {
    
    var horizontal: typings.materialUi.MaterialUI.propTypes.horizontal = js.native
    
    var vertical: typings.materialUi.MaterialUI.propTypes.vertical = js.native
  }
  object origin {
    
    @scala.inline
    def apply(horizontal: horizontal, vertical: vertical): origin = {
      val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[origin]
    }
    
    @scala.inline
    implicit class originMutableBuilder[Self <: origin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHorizontal(value: horizontal): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertical(value: vertical): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUi.materialUiStrings.left
    - typings.materialUi.materialUiStrings.center
    - typings.materialUi.materialUiStrings.right
  */
  trait tooltipHorizontal extends StObject
  object tooltipHorizontal {
    
    @scala.inline
    def center: typings.materialUi.materialUiStrings.center = "center".asInstanceOf[typings.materialUi.materialUiStrings.center]
    
    @scala.inline
    def left: typings.materialUi.materialUiStrings.left = "left".asInstanceOf[typings.materialUi.materialUiStrings.left]
    
    @scala.inline
    def right: typings.materialUi.materialUiStrings.right = "right".asInstanceOf[typings.materialUi.materialUiStrings.right]
  }
  
  @js.native
  trait utils extends StObject {
    
    def addDays(date: Date, days: Double): Date = js.native
    
    def addMonths(date: Date, months: Double): Date = js.native
    
    def addYears(date: Date, years: Double): Date = js.native
    
    def getFirstDayOfMonth(date: Date): Date = js.native
    
    def getWeekArray(date: Date, firstDayOfWeek: Double): js.Array[js.Array[Date | Null]] = js.native
    
    def getYear(date: Date): Double = js.native
    
    def monthDiff(date1: Date, date2: Date): Double = js.native
    
    def setYear(date: Date, year: Double): Date = js.native
  }
  object utils {
    
    @scala.inline
    def apply(
      addDays: (Date, Double) => Date,
      addMonths: (Date, Double) => Date,
      addYears: (Date, Double) => Date,
      getFirstDayOfMonth: Date => Date,
      getWeekArray: (Date, Double) => js.Array[js.Array[Date | Null]],
      getYear: Date => Double,
      monthDiff: (Date, Date) => Double,
      setYear: (Date, Double) => Date
    ): utils = {
      val __obj = js.Dynamic.literal(addDays = js.Any.fromFunction2(addDays), addMonths = js.Any.fromFunction2(addMonths), addYears = js.Any.fromFunction2(addYears), getFirstDayOfMonth = js.Any.fromFunction1(getFirstDayOfMonth), getWeekArray = js.Any.fromFunction2(getWeekArray), getYear = js.Any.fromFunction1(getYear), monthDiff = js.Any.fromFunction2(monthDiff), setYear = js.Any.fromFunction2(setYear))
      __obj.asInstanceOf[utils]
    }
    
    @scala.inline
    implicit class utilsMutableBuilder[Self <: utils] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddDays(value: (Date, Double) => Date): Self = StObject.set(x, "addDays", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddMonths(value: (Date, Double) => Date): Self = StObject.set(x, "addMonths", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddYears(value: (Date, Double) => Date): Self = StObject.set(x, "addYears", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetFirstDayOfMonth(value: Date => Date): Self = StObject.set(x, "getFirstDayOfMonth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetWeekArray(value: (Date, Double) => js.Array[js.Array[Date | Null]]): Self = StObject.set(x, "getWeekArray", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetYear(value: Date => Double): Self = StObject.set(x, "getYear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMonthDiff(value: (Date, Date) => Double): Self = StObject.set(x, "monthDiff", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetYear(value: (Date, Double) => Date): Self = StObject.set(x, "setYear", js.Any.fromFunction2(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUi.materialUiStrings.top
    - typings.materialUi.materialUiStrings.center
    - typings.materialUi.materialUiStrings.bottom
  */
  trait vertical extends StObject
  object vertical {
    
    @scala.inline
    def bottom: typings.materialUi.materialUiStrings.bottom = "bottom".asInstanceOf[typings.materialUi.materialUiStrings.bottom]
    
    @scala.inline
    def center: typings.materialUi.materialUiStrings.center = "center".asInstanceOf[typings.materialUi.materialUiStrings.center]
    
    @scala.inline
    def top: typings.materialUi.materialUiStrings.top = "top".asInstanceOf[typings.materialUi.materialUiStrings.top]
  }
}
