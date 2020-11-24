package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoombarProviderDataChart extends js.Object {
  
  def clean(): Unit = js.native
  
  def cleanOptsForZoom(options: js.Object): Unit = js.native
  
  def createClone(container: js.Object, options: js.Object): Unit = js.native
  
  def getBaseOpts(options: js.Object): Unit = js.native
  
  def setSize(width: js.Object, height: js.Object): Unit = js.native
  
  def syncMinWidth(minWidth: js.Object): Unit = js.native
  
  def targetObject(obj: js.Object): Unit = js.native
  
  def targetWidth(): Unit = js.native
  
  def update(a: js.Object, b: js.Object): Unit = js.native
  
  def widgetName(): Unit = js.native
}
object ZoombarProviderDataChart {
  
  @scala.inline
  def apply(
    clean: () => Unit,
    cleanOptsForZoom: js.Object => Unit,
    createClone: (js.Object, js.Object) => Unit,
    getBaseOpts: js.Object => Unit,
    setSize: (js.Object, js.Object) => Unit,
    syncMinWidth: js.Object => Unit,
    targetObject: js.Object => Unit,
    targetWidth: () => Unit,
    update: (js.Object, js.Object) => Unit,
    widgetName: () => Unit
  ): ZoombarProviderDataChart = {
    val __obj = js.Dynamic.literal(clean = js.Any.fromFunction0(clean), cleanOptsForZoom = js.Any.fromFunction1(cleanOptsForZoom), createClone = js.Any.fromFunction2(createClone), getBaseOpts = js.Any.fromFunction1(getBaseOpts), setSize = js.Any.fromFunction2(setSize), syncMinWidth = js.Any.fromFunction1(syncMinWidth), targetObject = js.Any.fromFunction1(targetObject), targetWidth = js.Any.fromFunction0(targetWidth), update = js.Any.fromFunction2(update), widgetName = js.Any.fromFunction0(widgetName))
    __obj.asInstanceOf[ZoombarProviderDataChart]
  }
  
  @scala.inline
  implicit class ZoombarProviderDataChartOps[Self <: ZoombarProviderDataChart] (val x: Self) extends AnyVal {
    
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
    def setClean(value: () => Unit): Self = this.set("clean", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCleanOptsForZoom(value: js.Object => Unit): Self = this.set("cleanOptsForZoom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateClone(value: (js.Object, js.Object) => Unit): Self = this.set("createClone", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetBaseOpts(value: js.Object => Unit): Self = this.set("getBaseOpts", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSize(value: (js.Object, js.Object) => Unit): Self = this.set("setSize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSyncMinWidth(value: js.Object => Unit): Self = this.set("syncMinWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTargetObject(value: js.Object => Unit): Self = this.set("targetObject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTargetWidth(value: () => Unit): Self = this.set("targetWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: (js.Object, js.Object) => Unit): Self = this.set("update", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWidgetName(value: () => Unit): Self = this.set("widgetName", js.Any.fromFunction0(value))
  }
}
