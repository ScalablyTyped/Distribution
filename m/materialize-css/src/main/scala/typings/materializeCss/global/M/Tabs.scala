package typings.materializeCss.global.M

import typings.materializeCss.anon.PartialTabsOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.Tabs")
@js.native
class Tabs ()
  extends StObject
     with typings.materializeCss.M.Tabs {
  
  /**
    * The index of tab that is currently shown
    */
  /* CompleteClass */
  var index: Double = js.native
  
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
  inline def getInstance(elem: Element): typings.materializeCss.M.Tabs = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Tabs]
  
  /**
    * Init Tabses
    */
  /* static member */
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.Tabs] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializeCss.M.Tabs]]
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialTabsOptions
  ): js.Array[typings.materializeCss.M.Tabs] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializeCss.M.Tabs]]
  /**
    * Init Tabs
    */
  /* static member */
  inline def init(els: Element): typings.materializeCss.M.Tabs = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Tabs]
  inline def init(els: Element, options: PartialTabsOptions): typings.materializeCss.M.Tabs = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializeCss.M.Tabs]
}
