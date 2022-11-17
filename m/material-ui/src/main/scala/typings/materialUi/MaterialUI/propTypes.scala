package typings.materialUi.MaterialUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propTypes {
  
  object corners {
    
    inline def `bottom-left`: "bottom-left" = "bottom-left".asInstanceOf["bottom-left"]
    
    inline def `bottom-right`: "bottom-right" = "bottom-right".asInstanceOf["bottom-right"]
    
    inline def `top-left`: "top-left" = "top-left".asInstanceOf["top-left"]
    
    inline def `top-right`: "top-right" = "top-right".asInstanceOf["top-right"]
  }
  type corners = "bottom-left" | "bottom-right" | "top-left" | "top-right"
  
  object cornersAndCenter {
    
    inline def `bottom-center`: "bottom-center" = "bottom-center".asInstanceOf["bottom-center"]
    
    inline def `bottom-left`: "bottom-left" = "bottom-left".asInstanceOf["bottom-left"]
    
    inline def `bottom-right`: "bottom-right" = "bottom-right".asInstanceOf["bottom-right"]
    
    inline def `top-center`: "top-center" = "top-center".asInstanceOf["top-center"]
    
    inline def `top-left`: "top-left" = "top-left".asInstanceOf["top-left"]
    
    inline def `top-right`: "top-right" = "top-right".asInstanceOf["top-right"]
  }
  type cornersAndCenter = "bottom-center" | "bottom-left" | "bottom-right" | "top-center" | "top-left" | "top-right"
  
  object direction {
    
    inline def down: "down" = "down".asInstanceOf["down"]
    
    inline def left: "left" = "left".asInstanceOf["left"]
    
    inline def right: "right" = "right".asInstanceOf["right"]
    
    inline def up: "up" = "up".asInstanceOf["up"]
  }
  type direction = "left" | "right" | "up" | "down"
  
  object horizontal {
    
    inline def left: "left" = "left".asInstanceOf["left"]
    
    inline def middle: "middle" = "middle".asInstanceOf["middle"]
    
    inline def right: "right" = "right".asInstanceOf["right"]
  }
  type horizontal = "left" | "middle" | "right"
  
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
  
  object tooltipHorizontal {
    
    inline def center: "center" = "center".asInstanceOf["center"]
    
    inline def left: "left" = "left".asInstanceOf["left"]
    
    inline def right: "right" = "right".asInstanceOf["right"]
  }
  type tooltipHorizontal = "left" | "center" | "right"
  
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
  
  object vertical {
    
    inline def bottom: "bottom" = "bottom".asInstanceOf["bottom"]
    
    inline def center: "center" = "center".asInstanceOf["center"]
    
    inline def top: "top" = "top".asInstanceOf["top"]
  }
  type vertical = "top" | "center" | "bottom"
}
