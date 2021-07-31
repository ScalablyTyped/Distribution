package typings.humanDate

import typings.humanDate.anon.RelativeTimeOptionsreturn
import typings.humanDate.anon.RelativeTimeOptionsreturnAllUnits
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("human-date", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def monthName(arg: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("monthName")(arg.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def monthName(arg: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("monthName")(arg.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def monthName(arg: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("monthName")(arg.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def prettyPrint(arg: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyPrint")(arg.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def prettyPrint(arg: String, options: PrettyPrintOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyPrint")(arg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def prettyPrint(arg: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyPrint")(arg.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def prettyPrint(arg: Double, options: PrettyPrintOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyPrint")(arg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def prettyPrint(arg: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyPrint")(arg.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def prettyPrint(arg: Date, options: PrettyPrintOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyPrint")(arg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def relativeTime(arg: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("relativeTime")(arg.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def relativeTime(arg: String, options: RelativeTimeOptionsreturn): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relativeTime")(arg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def relativeTime(arg: String, options: RelativeTimeOptionsreturnAllUnits): RelativeTimeReturns = (^.asInstanceOf[js.Dynamic].applyDynamic("relativeTime")(arg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RelativeTimeReturns]
  @scala.inline
  def relativeTime(arg: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("relativeTime")(arg.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def relativeTime(arg: Double, options: RelativeTimeOptionsreturn): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relativeTime")(arg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def relativeTime(arg: Double, options: RelativeTimeOptionsreturnAllUnits): RelativeTimeReturns = (^.asInstanceOf[js.Dynamic].applyDynamic("relativeTime")(arg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RelativeTimeReturns]
  @scala.inline
  def relativeTime(arg: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("relativeTime")(arg.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def relativeTime(arg: Date, options: RelativeTimeOptionsreturn): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relativeTime")(arg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def relativeTime(arg: Date, options: RelativeTimeOptionsreturnAllUnits): RelativeTimeReturns = (^.asInstanceOf[js.Dynamic].applyDynamic("relativeTime")(arg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RelativeTimeReturns]
  
  @scala.inline
  def toUTC(arg: String): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toUTC")(arg.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def toUTC(arg: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toUTC")(arg.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def toUTC(arg: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toUTC")(arg.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  trait PrettyPrintOptions extends StObject {
    
    var showTime: js.UndefOr[Boolean] = js.undefined
  }
  object PrettyPrintOptions {
    
    @scala.inline
    def apply(): PrettyPrintOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrettyPrintOptions]
    }
    
    @scala.inline
    implicit class PrettyPrintOptionsMutableBuilder[Self <: PrettyPrintOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShowTime(value: Boolean): Self = StObject.set(x, "showTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTimeUndefined: Self = StObject.set(x, "showTime", js.undefined)
    }
  }
  
  trait RelativeTimeOptions extends StObject {
    
    var allUnits: js.UndefOr[Boolean] = js.undefined
    
    var futureSuffix: js.UndefOr[String] = js.undefined
    
    var pastSuffix: js.UndefOr[String] = js.undefined
    
    var presentText: js.UndefOr[String] = js.undefined
    
    var returnObject: js.UndefOr[Boolean] = js.undefined
  }
  object RelativeTimeOptions {
    
    @scala.inline
    def apply(): RelativeTimeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RelativeTimeOptions]
    }
    
    @scala.inline
    implicit class RelativeTimeOptionsMutableBuilder[Self <: RelativeTimeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllUnits(value: Boolean): Self = StObject.set(x, "allUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllUnitsUndefined: Self = StObject.set(x, "allUnits", js.undefined)
      
      @scala.inline
      def setFutureSuffix(value: String): Self = StObject.set(x, "futureSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFutureSuffixUndefined: Self = StObject.set(x, "futureSuffix", js.undefined)
      
      @scala.inline
      def setPastSuffix(value: String): Self = StObject.set(x, "pastSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPastSuffixUndefined: Self = StObject.set(x, "pastSuffix", js.undefined)
      
      @scala.inline
      def setPresentText(value: String): Self = StObject.set(x, "presentText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresentTextUndefined: Self = StObject.set(x, "presentText", js.undefined)
      
      @scala.inline
      def setReturnObject(value: Boolean): Self = StObject.set(x, "returnObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnObjectUndefined: Self = StObject.set(x, "returnObject", js.undefined)
    }
  }
  
  trait RelativeTimeReturns extends StObject {
    
    var days: Double
    
    var hours: Double
    
    var past: Boolean
    
    var seconds: Double
    
    var years: Double
  }
  object RelativeTimeReturns {
    
    @scala.inline
    def apply(days: Double, hours: Double, past: Boolean, seconds: Double, years: Double): RelativeTimeReturns = {
      val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], past = past.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelativeTimeReturns]
    }
    
    @scala.inline
    implicit class RelativeTimeReturnsMutableBuilder[Self <: RelativeTimeReturns] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPast(value: Boolean): Self = StObject.set(x, "past", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYears(value: Double): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
    }
  }
}
