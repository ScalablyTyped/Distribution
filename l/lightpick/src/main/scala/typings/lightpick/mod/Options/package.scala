package typings.lightpick.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Options {
  type Dropdowns = typings.lightpick.mod.Options.Dropdowns_
  type Field = typings.std.Element with typings.lightpick.AnonValue
  type Locale = typings.lightpick.mod.Options.Locale_
  /**
    * Callback function for when the picker is hidden.
    */
  type OnCloseFn = js.ThisFunction0[/* this */ typings.lightpick.mod.Lightpick, scala.Unit]
  type OnErrorFn = js.ThisFunction1[
    /* this */ typings.lightpick.mod.Lightpick, 
    /* message */ java.lang.String, 
    scala.Unit
  ]
  /**
    * Callback function for when the months select is changed.
    */
  type OnMonthsChangeFn = js.ThisFunction1[/* this */ typings.lightpick.mod.Lightpick, /* month */ scala.Double, scala.Unit]
  /**
    * Callback function for when the picker becomes visible.
    */
  type OnOpenFn = js.ThisFunction0[/* this */ typings.lightpick.mod.Lightpick, scala.Unit]
  /**
    * Callback function for when a date is selected.
    */
  type OnSelectFn = js.ThisFunction2[
    /* this */ typings.lightpick.mod.Lightpick, 
    /* startDate */ typings.lightpick.mod.OutputDate, 
    /* endDate */ typings.lightpick.mod.OutputDate, 
    scala.Unit
  ]
  /**
    * Callback function for when either a start or an end date is selected.
    */
  type OnSelectStartEndFn = js.ThisFunction1[
    /* this */ typings.lightpick.mod.Lightpick, 
    /* date */ typings.lightpick.mod.OutputDate, 
    scala.Unit
  ]
  /**
    * Callback function for when the years select is changed.
    */
  type OnYearsChangeFn = js.ThisFunction1[/* this */ typings.lightpick.mod.Lightpick, /* year */ scala.Double, scala.Unit]
}
