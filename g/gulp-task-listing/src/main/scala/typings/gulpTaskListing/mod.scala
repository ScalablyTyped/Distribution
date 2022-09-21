package typings.gulpTaskListing

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-task-listing", JSImport.Namespace)
  @js.native
  val ^ : GulpTaskListing = js.native
  
  type FilterFunction = js.Function1[/* task */ String, Boolean]
  
  @js.native
  trait GulpTaskListing extends StObject {
    
    def apply(cb: js.Function): Unit = js.native
    
    /**
      * Allows for custom filtering of Gulp tasks in the listing
      * 
      * @param subTaskFilter a RegExp or Function returning whether the given task is a subtask
      * @param excludeFilter a RegExp or Function returning whether the given task should be excluded from the listing
      */
    def withFilters(subTaskFilter: js.RegExp): js.Function1[/* cb */ js.Function, Unit] = js.native
    def withFilters(subTaskFilter: js.RegExp, excludeFilter: js.RegExp): js.Function1[/* cb */ js.Function, Unit] = js.native
    def withFilters(subTaskFilter: js.RegExp, excludeFilter: FilterFunction): js.Function1[/* cb */ js.Function, Unit] = js.native
    def withFilters(subTaskFilter: FilterFunction): js.Function1[/* cb */ js.Function, Unit] = js.native
    def withFilters(subTaskFilter: FilterFunction, excludeFilter: js.RegExp): js.Function1[/* cb */ js.Function, Unit] = js.native
    def withFilters(subTaskFilter: FilterFunction, excludeFilter: FilterFunction): js.Function1[/* cb */ js.Function, Unit] = js.native
  }
  
  type _To = GulpTaskListing
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: GulpTaskListing = ^
}
