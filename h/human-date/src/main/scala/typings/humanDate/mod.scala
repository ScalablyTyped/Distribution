package typings.humanDate

import typings.humanDate.anon.RelativeTimeOptionsreturn
import typings.humanDate.anon.RelativeTimeOptionsreturnAllUnits
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("human-date", "monthName")
  @js.native
  def monthName(arg: String): String = js.native
  @JSImport("human-date", "monthName")
  @js.native
  def monthName(arg: Double): String = js.native
  @JSImport("human-date", "monthName")
  @js.native
  def monthName(arg: Date): String = js.native
  
  @JSImport("human-date", "prettyPrint")
  @js.native
  def prettyPrint(arg: String): String = js.native
  @JSImport("human-date", "prettyPrint")
  @js.native
  def prettyPrint(arg: String, options: PrettyPrintOptions): String = js.native
  @JSImport("human-date", "prettyPrint")
  @js.native
  def prettyPrint(arg: Double): String = js.native
  @JSImport("human-date", "prettyPrint")
  @js.native
  def prettyPrint(arg: Double, options: PrettyPrintOptions): String = js.native
  @JSImport("human-date", "prettyPrint")
  @js.native
  def prettyPrint(arg: Date): String = js.native
  @JSImport("human-date", "prettyPrint")
  @js.native
  def prettyPrint(arg: Date, options: PrettyPrintOptions): String = js.native
  
  @JSImport("human-date", "relativeTime")
  @js.native
  def relativeTime(arg: String): String = js.native
  @JSImport("human-date", "relativeTime")
  @js.native
  def relativeTime(arg: String, options: RelativeTimeOptionsreturn): String = js.native
  @JSImport("human-date", "relativeTime")
  @js.native
  def relativeTime(arg: String, options: RelativeTimeOptionsreturnAllUnits): RelativeTimeReturns = js.native
  @JSImport("human-date", "relativeTime")
  @js.native
  def relativeTime(arg: Double): String = js.native
  @JSImport("human-date", "relativeTime")
  @js.native
  def relativeTime(arg: Double, options: RelativeTimeOptionsreturn): String = js.native
  @JSImport("human-date", "relativeTime")
  @js.native
  def relativeTime(arg: Double, options: RelativeTimeOptionsreturnAllUnits): RelativeTimeReturns = js.native
  @JSImport("human-date", "relativeTime")
  @js.native
  def relativeTime(arg: Date): String = js.native
  @JSImport("human-date", "relativeTime")
  @js.native
  def relativeTime(arg: Date, options: RelativeTimeOptionsreturn): String = js.native
  @JSImport("human-date", "relativeTime")
  @js.native
  def relativeTime(arg: Date, options: RelativeTimeOptionsreturnAllUnits): RelativeTimeReturns = js.native
  
  @JSImport("human-date", "toUTC")
  @js.native
  def toUTC(arg: String): Date = js.native
  @JSImport("human-date", "toUTC")
  @js.native
  def toUTC(arg: Double): Date = js.native
  @JSImport("human-date", "toUTC")
  @js.native
  def toUTC(arg: Date): Date = js.native
  
  @js.native
  trait PrettyPrintOptions extends StObject {
    
    var showTime: js.UndefOr[Boolean] = js.native
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
  
  @js.native
  trait RelativeTimeOptions extends StObject {
    
    var allUnits: js.UndefOr[Boolean] = js.native
    
    var futureSuffix: js.UndefOr[String] = js.native
    
    var pastSuffix: js.UndefOr[String] = js.native
    
    var presentText: js.UndefOr[String] = js.native
    
    var returnObject: js.UndefOr[Boolean] = js.native
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
  
  @js.native
  trait RelativeTimeReturns extends StObject {
    
    var days: Double = js.native
    
    var hours: Double = js.native
    
    var past: Boolean = js.native
    
    var seconds: Double = js.native
    
    var years: Double = js.native
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
