package typings
package gulpDashTaskDashListingLib.gulpDashTaskDashListingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GulpTaskListing extends js.Object {
  def apply(cb: js.Function): scala.Unit = js.native
  /**
       * Allows for custom filtering of Gulp tasks in the listing
       * 
       * @param subTaskFilter a RegExp or Function returning whether the given task is a subtask
       * @param excludeFilter a RegExp or Function returning whether the given task should be excluded from the listing
       */
  def withFilters(subTaskFilter: gulpDashTaskDashListingLib.FilterFunction): js.Function1[/* cb */ js.Function, scala.Unit] = js.native
  /**
       * Allows for custom filtering of Gulp tasks in the listing
       * 
       * @param subTaskFilter a RegExp or Function returning whether the given task is a subtask
       * @param excludeFilter a RegExp or Function returning whether the given task should be excluded from the listing
       */
  def withFilters(
    subTaskFilter: gulpDashTaskDashListingLib.FilterFunction,
    excludeFilter: gulpDashTaskDashListingLib.FilterFunction
  ): js.Function1[/* cb */ js.Function, scala.Unit] = js.native
  /**
       * Allows for custom filtering of Gulp tasks in the listing
       * 
       * @param subTaskFilter a RegExp or Function returning whether the given task is a subtask
       * @param excludeFilter a RegExp or Function returning whether the given task should be excluded from the listing
       */
  def withFilters(subTaskFilter: gulpDashTaskDashListingLib.FilterFunction, excludeFilter: stdLib.RegExp): js.Function1[/* cb */ js.Function, scala.Unit] = js.native
  /**
       * Allows for custom filtering of Gulp tasks in the listing
       * 
       * @param subTaskFilter a RegExp or Function returning whether the given task is a subtask
       * @param excludeFilter a RegExp or Function returning whether the given task should be excluded from the listing
       */
  def withFilters(subTaskFilter: stdLib.RegExp): js.Function1[/* cb */ js.Function, scala.Unit] = js.native
  /**
       * Allows for custom filtering of Gulp tasks in the listing
       * 
       * @param subTaskFilter a RegExp or Function returning whether the given task is a subtask
       * @param excludeFilter a RegExp or Function returning whether the given task should be excluded from the listing
       */
  def withFilters(subTaskFilter: stdLib.RegExp, excludeFilter: gulpDashTaskDashListingLib.FilterFunction): js.Function1[/* cb */ js.Function, scala.Unit] = js.native
  /**
       * Allows for custom filtering of Gulp tasks in the listing
       * 
       * @param subTaskFilter a RegExp or Function returning whether the given task is a subtask
       * @param excludeFilter a RegExp or Function returning whether the given task should be excluded from the listing
       */
  def withFilters(subTaskFilter: stdLib.RegExp, excludeFilter: stdLib.RegExp): js.Function1[/* cb */ js.Function, scala.Unit] = js.native
}

