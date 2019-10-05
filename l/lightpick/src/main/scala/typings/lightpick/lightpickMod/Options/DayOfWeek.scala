package typings.lightpick.lightpickMod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DayOfWeek extends js.Object

@JSImport("lightpick", "Options.DayOfWeek")
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
  
  /* 3 */ val Friday: typings.lightpick.lightpickMod.Options.DayOfWeek.Friday with Double = js.native
  /* 1 */ val Monday: typings.lightpick.lightpickMod.Options.DayOfWeek.Monday with Double = js.native
  /* 4 */ val Saturday: typings.lightpick.lightpickMod.Options.DayOfWeek.Saturday with Double = js.native
  /* 5 */ val Sunday: typings.lightpick.lightpickMod.Options.DayOfWeek.Sunday with Double = js.native
  /* 2 */ val Thursday: typings.lightpick.lightpickMod.Options.DayOfWeek.Thursday with Double = js.native
  /* 0 */ val Tuesday: typings.lightpick.lightpickMod.Options.DayOfWeek.Tuesday with Double = js.native
  /* 1 */ val Wednesday: typings.lightpick.lightpickMod.Options.DayOfWeek.Wednesday with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DayOfWeek with Double] = js.native
}

