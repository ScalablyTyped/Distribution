package typings.materializeCss.M

import typings.materializeCss.materializeCssStrings.AM
import typings.materializeCss.materializeCssStrings.PM
import typings.materializeCss.materializeCssStrings.vibrate
import typings.materializeCss.materializeCssStrings.webkitVibrate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<TimepickerOptions> * / any */ trait Timepicker extends StObject {
  
  /**
    * If the time is AM or PM on twelve-hour clock
    * @default 'PM'
    */
  var amOrPm: AM | PM
  
  /**
    * Close timepicker
    */
  def close(): Unit
  
  /**
    * Current view on the timepicker
    * @default 'hours'
    */
  var currentView: Views
  
  /**
    * If the picker is open.
    */
  var isOpen: Boolean
  
  /**
    * Open timepicker
    */
  def open(): Unit
  
  /**
    * Show hours or minutes view on timepicker
    * @param view The name of the view you want to switch to, 'hours' or 'minutes'.
    */
  def showView(view: Views): Unit
  
  /**
    * The selected time.
    */
  var time: String
  
  /**
    * Vibrate device when dragging clock hand.
    */
  var vibrate: typings.materializeCss.materializeCssStrings.vibrate | webkitVibrate | Null
}
object Timepicker {
  
  inline def apply(
    amOrPm: AM | PM,
    close: () => Unit,
    currentView: Views,
    isOpen: Boolean,
    open: () => Unit,
    showView: Views => Unit,
    time: String
  ): Timepicker = {
    val __obj = js.Dynamic.literal(amOrPm = amOrPm.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), currentView = currentView.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), showView = js.Any.fromFunction1(showView), time = time.asInstanceOf[js.Any], vibrate = null)
    __obj.asInstanceOf[Timepicker]
  }
  
  extension [Self <: Timepicker](x: Self) {
    
    inline def setAmOrPm(value: AM | PM): Self = StObject.set(x, "amOrPm", value.asInstanceOf[js.Any])
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setCurrentView(value: Views): Self = StObject.set(x, "currentView", value.asInstanceOf[js.Any])
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    inline def setShowView(value: Views => Unit): Self = StObject.set(x, "showView", js.Any.fromFunction1(value))
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setVibrate(value: vibrate | webkitVibrate): Self = StObject.set(x, "vibrate", value.asInstanceOf[js.Any])
    
    inline def setVibrateNull: Self = StObject.set(x, "vibrate", null)
  }
}
