package typings.materialUi.MaterialUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    inline def `bottom-left`: typings.materialUi.materialUiStrings.`bottom-left` = "bottom-left".asInstanceOf[typings.materialUi.materialUiStrings.`bottom-left`]
    
    inline def `bottom-right`: typings.materialUi.materialUiStrings.`bottom-right` = "bottom-right".asInstanceOf[typings.materialUi.materialUiStrings.`bottom-right`]
    
    inline def `top-left`: typings.materialUi.materialUiStrings.`top-left` = "top-left".asInstanceOf[typings.materialUi.materialUiStrings.`top-left`]
    
    inline def `top-right`: typings.materialUi.materialUiStrings.`top-right` = "top-right".asInstanceOf[typings.materialUi.materialUiStrings.`top-right`]
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
    
    inline def `bottom-center`: typings.materialUi.materialUiStrings.`bottom-center` = "bottom-center".asInstanceOf[typings.materialUi.materialUiStrings.`bottom-center`]
    
    inline def `bottom-left`: typings.materialUi.materialUiStrings.`bottom-left` = "bottom-left".asInstanceOf[typings.materialUi.materialUiStrings.`bottom-left`]
    
    inline def `bottom-right`: typings.materialUi.materialUiStrings.`bottom-right` = "bottom-right".asInstanceOf[typings.materialUi.materialUiStrings.`bottom-right`]
    
    inline def `top-center`: typings.materialUi.materialUiStrings.`top-center` = "top-center".asInstanceOf[typings.materialUi.materialUiStrings.`top-center`]
    
    inline def `top-left`: typings.materialUi.materialUiStrings.`top-left` = "top-left".asInstanceOf[typings.materialUi.materialUiStrings.`top-left`]
    
    inline def `top-right`: typings.materialUi.materialUiStrings.`top-right` = "top-right".asInstanceOf[typings.materialUi.materialUiStrings.`top-right`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUi.materialUiStrings.left
    - typings.materialUi.materialUiStrings.right
    - typings.materialUi.materialUiStrings.up
    - typings.materialUi.materialUiStrings.down
  */
  trait direction extends StObject
  object direction {
    
    inline def down: typings.materialUi.materialUiStrings.down = "down".asInstanceOf[typings.materialUi.materialUiStrings.down]
    
    inline def left: typings.materialUi.materialUiStrings.left = "left".asInstanceOf[typings.materialUi.materialUiStrings.left]
    
    inline def right: typings.materialUi.materialUiStrings.right = "right".asInstanceOf[typings.materialUi.materialUiStrings.right]
    
    inline def up: typings.materialUi.materialUiStrings.up = "up".asInstanceOf[typings.materialUi.materialUiStrings.up]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUi.materialUiStrings.left
    - typings.materialUi.materialUiStrings.middle
    - typings.materialUi.materialUiStrings.right
  */
  trait horizontal extends StObject
  object horizontal {
    
    inline def left: typings.materialUi.materialUiStrings.left = "left".asInstanceOf[typings.materialUi.materialUiStrings.left]
    
    inline def middle: typings.materialUi.materialUiStrings.middle = "middle".asInstanceOf[typings.materialUi.materialUiStrings.middle]
    
    inline def right: typings.materialUi.materialUiStrings.right = "right".asInstanceOf[typings.materialUi.materialUiStrings.right]
  }
  
  trait origin extends StObject {
    
    var horizontal: typings.materialUi.MaterialUI.propTypes.horizontal
    
    var vertical: typings.materialUi.MaterialUI.propTypes.vertical
  }
  object origin {
    
    inline def apply(horizontal: horizontal, vertical: vertical): origin = {
      val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[origin]
    }
    
    extension [Self <: origin](x: Self) {
      
      inline def setHorizontal(value: horizontal): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setVertical(value: vertical): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUi.materialUiStrings.left
    - typings.materialUi.materialUiStrings.center
    - typings.materialUi.materialUiStrings.right
  */
  trait tooltipHorizontal extends StObject
  object tooltipHorizontal {
    
    inline def center: typings.materialUi.materialUiStrings.center = "center".asInstanceOf[typings.materialUi.materialUiStrings.center]
    
    inline def left: typings.materialUi.materialUiStrings.left = "left".asInstanceOf[typings.materialUi.materialUiStrings.left]
    
    inline def right: typings.materialUi.materialUiStrings.right = "right".asInstanceOf[typings.materialUi.materialUiStrings.right]
  }
  
  trait utils extends StObject {
    
    def addDays(date: js.Date, days: Double): js.Date
    
    def addMonths(date: js.Date, months: Double): js.Date
    
    def addYears(date: js.Date, years: Double): js.Date
    
    def getFirstDayOfMonth(date: js.Date): js.Date
    
    def getWeekArray(date: js.Date, firstDayOfWeek: Double): js.Array[js.Array[js.Date | Null]]
    
    def getYear(date: js.Date): Double
    
    def monthDiff(date1: js.Date, date2: js.Date): Double
    
    def setYear(date: js.Date, year: Double): js.Date
  }
  object utils {
    
    inline def apply(
      addDays: (js.Date, Double) => js.Date,
      addMonths: (js.Date, Double) => js.Date,
      addYears: (js.Date, Double) => js.Date,
      getFirstDayOfMonth: js.Date => js.Date,
      getWeekArray: (js.Date, Double) => js.Array[js.Array[js.Date | Null]],
      getYear: js.Date => Double,
      monthDiff: (js.Date, js.Date) => Double,
      setYear: (js.Date, Double) => js.Date
    ): utils = {
      val __obj = js.Dynamic.literal(addDays = js.Any.fromFunction2(addDays), addMonths = js.Any.fromFunction2(addMonths), addYears = js.Any.fromFunction2(addYears), getFirstDayOfMonth = js.Any.fromFunction1(getFirstDayOfMonth), getWeekArray = js.Any.fromFunction2(getWeekArray), getYear = js.Any.fromFunction1(getYear), monthDiff = js.Any.fromFunction2(monthDiff), setYear = js.Any.fromFunction2(setYear))
      __obj.asInstanceOf[utils]
    }
    
    extension [Self <: utils](x: Self) {
      
      inline def setAddDays(value: (js.Date, Double) => js.Date): Self = StObject.set(x, "addDays", js.Any.fromFunction2(value))
      
      inline def setAddMonths(value: (js.Date, Double) => js.Date): Self = StObject.set(x, "addMonths", js.Any.fromFunction2(value))
      
      inline def setAddYears(value: (js.Date, Double) => js.Date): Self = StObject.set(x, "addYears", js.Any.fromFunction2(value))
      
      inline def setGetFirstDayOfMonth(value: js.Date => js.Date): Self = StObject.set(x, "getFirstDayOfMonth", js.Any.fromFunction1(value))
      
      inline def setGetWeekArray(value: (js.Date, Double) => js.Array[js.Array[js.Date | Null]]): Self = StObject.set(x, "getWeekArray", js.Any.fromFunction2(value))
      
      inline def setGetYear(value: js.Date => Double): Self = StObject.set(x, "getYear", js.Any.fromFunction1(value))
      
      inline def setMonthDiff(value: (js.Date, js.Date) => Double): Self = StObject.set(x, "monthDiff", js.Any.fromFunction2(value))
      
      inline def setSetYear(value: (js.Date, Double) => js.Date): Self = StObject.set(x, "setYear", js.Any.fromFunction2(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUi.materialUiStrings.top
    - typings.materialUi.materialUiStrings.center
    - typings.materialUi.materialUiStrings.bottom
  */
  trait vertical extends StObject
  object vertical {
    
    inline def bottom: typings.materialUi.materialUiStrings.bottom = "bottom".asInstanceOf[typings.materialUi.materialUiStrings.bottom]
    
    inline def center: typings.materialUi.materialUiStrings.center = "center".asInstanceOf[typings.materialUi.materialUiStrings.center]
    
    inline def top: typings.materialUi.materialUiStrings.top = "top".asInstanceOf[typings.materialUi.materialUiStrings.top]
  }
}
