package typings.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HierarchicalDataSource extends StObject {
  
  def dataAt(path: js.Object, keyspath: js.Object): Unit
  
  def dataBind(callback: js.Object, callee: js.Object): Unit
  
  def root(): Unit
}
object HierarchicalDataSource {
  
  @scala.inline
  def apply(dataAt: (js.Object, js.Object) => Unit, dataBind: (js.Object, js.Object) => Unit, root: () => Unit): HierarchicalDataSource = {
    val __obj = js.Dynamic.literal(dataAt = js.Any.fromFunction2(dataAt), dataBind = js.Any.fromFunction2(dataBind), root = js.Any.fromFunction0(root))
    __obj.asInstanceOf[HierarchicalDataSource]
  }
  
  @scala.inline
  implicit class HierarchicalDataSourceMutableBuilder[Self <: HierarchicalDataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataAt(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "dataAt", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDataBind(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "dataBind", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRoot(value: () => Unit): Self = StObject.set(x, "root", js.Any.fromFunction0(value))
  }
}
