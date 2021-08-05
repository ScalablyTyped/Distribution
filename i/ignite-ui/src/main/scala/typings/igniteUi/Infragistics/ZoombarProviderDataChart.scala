package typings.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoombarProviderDataChart extends StObject {
  
  def clean(): Unit
  
  def cleanOptsForZoom(options: js.Object): Unit
  
  def createClone(container: js.Object, options: js.Object): Unit
  
  def getBaseOpts(options: js.Object): Unit
  
  def setSize(width: js.Object, height: js.Object): Unit
  
  def syncMinWidth(minWidth: js.Object): Unit
  
  def targetObject(obj: js.Object): Unit
  
  def targetWidth(): Unit
  
  def update(a: js.Object, b: js.Object): Unit
  
  def widgetName(): Unit
}
object ZoombarProviderDataChart {
  
  inline def apply(
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
  
  extension [Self <: ZoombarProviderDataChart](x: Self) {
    
    inline def setClean(value: () => Unit): Self = StObject.set(x, "clean", js.Any.fromFunction0(value))
    
    inline def setCleanOptsForZoom(value: js.Object => Unit): Self = StObject.set(x, "cleanOptsForZoom", js.Any.fromFunction1(value))
    
    inline def setCreateClone(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "createClone", js.Any.fromFunction2(value))
    
    inline def setGetBaseOpts(value: js.Object => Unit): Self = StObject.set(x, "getBaseOpts", js.Any.fromFunction1(value))
    
    inline def setSetSize(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "setSize", js.Any.fromFunction2(value))
    
    inline def setSyncMinWidth(value: js.Object => Unit): Self = StObject.set(x, "syncMinWidth", js.Any.fromFunction1(value))
    
    inline def setTargetObject(value: js.Object => Unit): Self = StObject.set(x, "targetObject", js.Any.fromFunction1(value))
    
    inline def setTargetWidth(value: () => Unit): Self = StObject.set(x, "targetWidth", js.Any.fromFunction0(value))
    
    inline def setUpdate(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    
    inline def setWidgetName(value: () => Unit): Self = StObject.set(x, "widgetName", js.Any.fromFunction0(value))
  }
}
