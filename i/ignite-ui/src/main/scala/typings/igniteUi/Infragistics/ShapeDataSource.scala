package typings.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeDataSource extends StObject {
  
  /**
    * Returns the current converter instance
    */
  def converter(): js.Object
  
  /**
    * Loads to the current data source
    */
  def dataBind(): Unit
  
  def dataView(): Unit
  
  /**
    * Returns true if data is loaded
    */
  def isBound(): Boolean
}
object ShapeDataSource {
  
  @scala.inline
  def apply(converter: () => js.Object, dataBind: () => Unit, dataView: () => Unit, isBound: () => Boolean): ShapeDataSource = {
    val __obj = js.Dynamic.literal(converter = js.Any.fromFunction0(converter), dataBind = js.Any.fromFunction0(dataBind), dataView = js.Any.fromFunction0(dataView), isBound = js.Any.fromFunction0(isBound))
    __obj.asInstanceOf[ShapeDataSource]
  }
  
  @scala.inline
  implicit class ShapeDataSourceMutableBuilder[Self <: ShapeDataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConverter(value: () => js.Object): Self = StObject.set(x, "converter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDataBind(value: () => Unit): Self = StObject.set(x, "dataBind", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDataView(value: () => Unit): Self = StObject.set(x, "dataView", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsBound(value: () => Boolean): Self = StObject.set(x, "isBound", js.Any.fromFunction0(value))
  }
}
