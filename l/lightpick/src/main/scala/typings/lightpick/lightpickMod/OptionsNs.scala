package typings.lightpick.lightpickMod

import typings.lightpick.Anon_Value
import typings.lightpick.lightpickMod.OptionsNs.DayOfWeek
import typings.lightpick.lightpickMod.OptionsNs.DropdownsNs.Years
import typings.lightpick.lightpickMod.OptionsNs.LocaleNs.Buttons
import typings.lightpick.lightpickMod.OptionsNs.LocaleNs.PluralizeFn
import typings.lightpick.lightpickMod.OptionsNs.LocaleNs.PluralizeFnLocale
import typings.lightpick.lightpickMod.OptionsNs.Orientation
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lightpick", "Options")
@js.native
object OptionsNs extends js.Object {
  @js.native
  sealed trait DayOfWeek extends js.Object
  
  trait Dropdowns extends js.Object {
    /**
      * true/false for enable/disable dropdown of months.
      */
    var months: js.UndefOr[Boolean] = js.undefined
    /**
      * Can be false for disable dropdown of years.
      */
    var years: js.UndefOr[Boolean | Years] = js.undefined
  }
  
  trait Locale extends js.Object {
    /**
      * Text for buttons.
      */
    var buttons: js.UndefOr[Buttons] = js.undefined
    var pluralize: js.UndefOr[PluralizeFn] = js.undefined
    /**
      * Text for tooltip.
      */
    var tooltip: js.UndefOr[Partial[PluralizeFnLocale]] = js.undefined
    /**
      * Show tooltip text on disabled dates. (Eg. «Already booked»)
      */
    var tooltipOnDisabled: js.UndefOr[String] = js.undefined
  }
  
  @js.native
  sealed trait Orientation extends js.Object
  
  @js.native
  object DayOfWeek extends js.Object {
    @js.native
    sealed trait Friday extends DayOfWeek
    
    @js.native
    sealed trait Monday extends DayOfWeek
    
    @js.native
    sealed trait Saturday extends DayOfWeek
    
    @js.native
    sealed trait Sunday extends DayOfWeek
    
    @js.native
    sealed trait Thursday extends DayOfWeek
    
    @js.native
    sealed trait Tuesday extends DayOfWeek
    
    @js.native
    sealed trait Wednesday extends DayOfWeek
    
    /* 3 */ val Friday: typings.lightpick.lightpickMod.OptionsNs.DayOfWeek.Friday with Double = js.native
    /* 1 */ val Monday: typings.lightpick.lightpickMod.OptionsNs.DayOfWeek.Monday with Double = js.native
    /* 4 */ val Saturday: typings.lightpick.lightpickMod.OptionsNs.DayOfWeek.Saturday with Double = js.native
    /* 5 */ val Sunday: typings.lightpick.lightpickMod.OptionsNs.DayOfWeek.Sunday with Double = js.native
    /* 2 */ val Thursday: typings.lightpick.lightpickMod.OptionsNs.DayOfWeek.Thursday with Double = js.native
    /* 0 */ val Tuesday: typings.lightpick.lightpickMod.OptionsNs.DayOfWeek.Tuesday with Double = js.native
    /* 1 */ val Wednesday: typings.lightpick.lightpickMod.OptionsNs.DayOfWeek.Wednesday with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DayOfWeek with Double] = js.native
  }
  
  @JSName("Dropdowns")
  @js.native
  object DropdownsNs extends js.Object {
    trait Years extends js.Object {
      var max: js.UndefOr[Double] = js.undefined
      var min: js.UndefOr[Double] = js.undefined
    }
    
  }
  
  @JSName("Locale")
  @js.native
  object LocaleNs extends js.Object {
    trait Buttons extends js.Object {
      @JSName("apply")
      var apply: js.UndefOr[String] = js.undefined
      var close: js.UndefOr[String] = js.undefined
      var next: js.UndefOr[String] = js.undefined
      var prev: js.UndefOr[String] = js.undefined
      var reset: js.UndefOr[String] = js.undefined
    }
    
    trait PluralizeFnLocale extends js.Object {
      var one: String
      var other: String
    }
    
    /**
      * Function for calc plural text. More examples for another locales on betsol/numerous.
      *
      * @see https://github.com/betsol/numerous/tree/master/locales
      */
    type PluralizeFn = js.Function2[/* i */ String | Double, /* locale */ PluralizeFnLocale, String]
  }
  
  @js.native
  object Orientation extends js.Object {
    @js.native
    sealed trait Auto extends Orientation
    
    @js.native
    sealed trait Bottom extends Orientation
    
    @js.native
    sealed trait BottomLeft extends Orientation
    
    @js.native
    sealed trait BottomRight extends Orientation
    
    @js.native
    sealed trait Left extends Orientation
    
    @js.native
    sealed trait Right extends Orientation
    
    @js.native
    sealed trait Top extends Orientation
    
    @js.native
    sealed trait TopLeft extends Orientation
    
    @js.native
    sealed trait TopRight extends Orientation
    
    /* "auto" */ val Auto: typings.lightpick.lightpickMod.OptionsNs.Orientation.Auto with String = js.native
    /* "bottom" */ val Bottom: typings.lightpick.lightpickMod.OptionsNs.Orientation.Bottom with String = js.native
    /* "bottom left" */ val BottomLeft: typings.lightpick.lightpickMod.OptionsNs.Orientation.BottomLeft with String = js.native
    /* "bottom right" */ val BottomRight: typings.lightpick.lightpickMod.OptionsNs.Orientation.BottomRight with String = js.native
    /* "left" */ val Left: typings.lightpick.lightpickMod.OptionsNs.Orientation.Left with String = js.native
    /* "right" */ val Right: typings.lightpick.lightpickMod.OptionsNs.Orientation.Right with String = js.native
    /* "top" */ val Top: typings.lightpick.lightpickMod.OptionsNs.Orientation.Top with String = js.native
    /* "top left" */ val TopLeft: typings.lightpick.lightpickMod.OptionsNs.Orientation.TopLeft with String = js.native
    /* "top right" */ val TopRight: typings.lightpick.lightpickMod.OptionsNs.Orientation.TopRight with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Orientation with String] = js.native
  }
  
  type Field = Element with Anon_Value
  /**
    * Callback function for when the picker is hidden.
    */
  type OnCloseFn = js.ThisFunction0[/* this */ Lightpick, Unit]
  type OnErrorFn = js.ThisFunction1[/* this */ Lightpick, /* message */ String, Unit]
  /**
    * Callback function for when the picker becomes visible.
    */
  type OnOpenFn = js.ThisFunction0[/* this */ Lightpick, Unit]
  /**
    * Callback function for when a date is selected.
    */
  type OnSelectFn = js.ThisFunction2[/* this */ Lightpick, /* startDate */ OutputDate, /* endDate */ OutputDate, Unit]
}

