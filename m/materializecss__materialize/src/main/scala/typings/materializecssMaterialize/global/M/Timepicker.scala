package typings.materializecssMaterialize.global.M

import typings.materializecssMaterialize.M.Views
import typings.materializecssMaterialize.anon.PartialTimepickerOptions
import typings.materializecssMaterialize.materializecssMaterializeStrings.AM
import typings.materializecssMaterialize.materializecssMaterializeStrings.PM
import typings.materializecssMaterialize.materializecssMaterializeStrings.webkitVibrate
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.Timepicker")
@js.native
open class Timepicker ()
  extends StObject
     with typings.materializecssMaterialize.M.Timepicker {
  
  /**
    * If the time is AM or PM on twelve-hour clock
    * @default 'PM'
    */
  /* CompleteClass */
  var amOrPm: AM | PM = js.native
  
  /**
    * Close timepicker
    */
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /**
    * Current view on the timepicker
    * @default 'hours'
    */
  /* CompleteClass */
  var currentView: Views = js.native
  
  /**
    * If the picker is open.
    */
  /* CompleteClass */
  var isOpen: Boolean = js.native
  
  /**
    * Open timepicker
    */
  /* CompleteClass */
  override def open(): Unit = js.native
  
  /**
    * Show hours or minutes view on timepicker
    * @param view The name of the view you want to switch to, 'hours' or 'minutes'.
    */
  /* CompleteClass */
  override def showView(view: Views): Unit = js.native
  
  /**
    * The selected time.
    */
  /* CompleteClass */
  var time: String = js.native
  
  /**
    * Vibrate device when dragging clock hand.
    */
  /* CompleteClass */
  var vibrate: typings.materializecssMaterialize.materializecssMaterializeStrings.vibrate | webkitVibrate | Null = js.native
}
object Timepicker {
  
  @JSGlobal("M.Timepicker")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializecssMaterialize.M.Timepicker = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.Timepicker]
  
  /**
    * Init Timepickers
    */
  /* static member */
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ Any
  ): js.Array[typings.materializecssMaterialize.M.Timepicker] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializecssMaterialize.M.Timepicker]]
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ Any,
    options: PartialTimepickerOptions
  ): js.Array[typings.materializecssMaterialize.M.Timepicker] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializecssMaterialize.M.Timepicker]]
  /**
    * Init Timepicker
    */
  /* static member */
  inline def init(els: Element): typings.materializecssMaterialize.M.Timepicker = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.Timepicker]
  inline def init(els: Element, options: PartialTimepickerOptions): typings.materializecssMaterialize.M.Timepicker = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializecssMaterialize.M.Timepicker]
}
