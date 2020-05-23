package typings.materializeCss.global.M

import typings.materializeCss.M.TabsOptions
import typings.materializeCss.MElements
import typings.materializeCss.anon.PartialTabsOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Tabs")
@js.native
class Tabs ()
  extends typings.materializeCss.M.Tabs {
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /**
    * The index of tab that is currently shown
    */
  /* CompleteClass */
  override var index: Double = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: TabsOptions = js.native
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
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

/* static members */
@JSGlobal("M.Tabs")
@js.native
object Tabs extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Tabs = js.native
  /**
    * Init Tabses
    */
  def init(els: MElements): js.Array[typings.materializeCss.M.Tabs] = js.native
  def init(els: MElements, options: PartialTabsOptions): js.Array[typings.materializeCss.M.Tabs] = js.native
  /**
    * Init Tabs
    */
  def init(els: Element): typings.materializeCss.M.Tabs = js.native
  def init(els: Element, options: PartialTabsOptions): typings.materializeCss.M.Tabs = js.native
}

