package typings.materializecssMaterialize.global.M

import typings.materializecssMaterialize.M.TabsOptions
import typings.materializecssMaterialize.MElements
import typings.materializecssMaterialize.anon.PartialTabsOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.Tabs")
@js.native
open class Tabs ()
  extends StObject
     with typings.materializecssMaterialize.M.Tabs {
  
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  var el: Element = js.native
  
  /**
    * The index of tab that is currently shown
    */
  /* CompleteClass */
  var index: Double = js.native
  
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  var options: TabsOptions = js.native
  
  /**
    * Show tab content that corresponds to the tab with the id
    * @param tabId The id of the tab that you want to switch to
    */
  /* CompleteClass */
  override def select(tabId: String): Unit = js.native
  
  /**
    * Recalculate tab indicator position. This is useful when the indicator position is not correct
    */
  /* CompleteClass */
  override def updateTabIndicator(): Unit = js.native
}
object Tabs {
  
  @JSGlobal("M.Tabs")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializecssMaterialize.M.Tabs = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.Tabs]
  
  /**
    * Init Tabses
    */
  /* static member */
  inline def init(els: MElements): js.Array[typings.materializecssMaterialize.M.Tabs] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializecssMaterialize.M.Tabs]]
  inline def init(els: MElements, options: PartialTabsOptions): js.Array[typings.materializecssMaterialize.M.Tabs] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializecssMaterialize.M.Tabs]]
  /**
    * Init Tabs
    */
  /* static member */
  inline def init(els: Element): typings.materializecssMaterialize.M.Tabs = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.Tabs]
  inline def init(els: Element, options: PartialTabsOptions): typings.materializecssMaterialize.M.Tabs = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializecssMaterialize.M.Tabs]
}
