package typings.materializeCss.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<TabsOptions> * / any */ @js.native
trait Tabs extends js.Object {
  
  /**
    * The index of tab that is currently shown
    */
  var index: Double = js.native
  
  /**
    * Show tab content that corresponds to the tab with the id
    * @param tabId The id of the tab that you want to switch to
    */
  def select(tabId: String): Unit = js.native
  
  /**
    * Recalculate tab indicator position. This is useful when the indicator position is not correct
    */
  def updateTabIndicator(): Unit = js.native
}
object Tabs {
  
  @scala.inline
  def apply(index: Double, select: String => Unit, updateTabIndicator: () => Unit): Tabs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], select = js.Any.fromFunction1(select), updateTabIndicator = js.Any.fromFunction0(updateTabIndicator))
    __obj.asInstanceOf[Tabs]
  }
  
  @scala.inline
  implicit class TabsOps[Self <: Tabs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: String => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateTabIndicator(value: () => Unit): Self = this.set("updateTabIndicator", js.Any.fromFunction0(value))
  }
}
