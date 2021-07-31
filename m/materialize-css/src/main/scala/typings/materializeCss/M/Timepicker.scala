package typings.materializeCss.M

import typings.materializeCss.materializeCssStrings.hours
import typings.materializeCss.materializeCssStrings.minutes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<TimepickerOptions> * / any */ @js.native
trait Timepicker extends StObject {
  
  /**
    * Close timepicker
    */
  def close(): Unit = js.native
  
  /**
    * If the picker is open.
    */
  var isOpen: Boolean = js.native
  
  /**
    * Open timepicker
    */
  def open(): Unit = js.native
  
  /**
    * Show hours or minutes view on timepicker
    * @param view The name of the view you want to switch to, 'hours' or 'minutes'.
    */
  @JSName("showView")
  def showView_hours(view: hours): Unit = js.native
  @JSName("showView")
  def showView_minutes(view: minutes): Unit = js.native
  
  /**
    * The selected time.
    */
  var time: String = js.native
}
