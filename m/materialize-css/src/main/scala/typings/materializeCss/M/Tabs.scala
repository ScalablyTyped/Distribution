package typings.materializeCss.M

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<TabsOptions> * / any */ trait Tabs extends StObject {
  
  /**
    * The index of tab that is currently shown
    */
  var index: Double
  
  /**
    * Show tab content that corresponds to the tab with the id
    * @param tabId The id of the tab that you want to switch to
    */
  def select(tabId: String): Unit
  
  /**
    * Recalculate tab indicator position. This is useful when the indicator position is not correct
    */
  def updateTabIndicator(): Unit
}
object Tabs {
  
  @scala.inline
  def apply(index: Double, select: String => Unit, updateTabIndicator: () => Unit): Tabs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], select = js.Any.fromFunction1(select), updateTabIndicator = js.Any.fromFunction0(updateTabIndicator))
    __obj.asInstanceOf[Tabs]
  }
  
  @scala.inline
  implicit class TabsMutableBuilder[Self <: Tabs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: String => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateTabIndicator(value: () => Unit): Self = StObject.set(x, "updateTabIndicator", js.Any.fromFunction0(value))
  }
}
