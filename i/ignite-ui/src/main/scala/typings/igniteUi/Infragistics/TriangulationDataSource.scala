package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriangulationDataSource extends js.Object {
  
  /**
    * Returns the current converter instance
    */
  def converter(): js.Object = js.native
  
  /**
    * Loads to the current data source
    */
  def dataBind(): Unit = js.native
  
  def dataView(): Unit = js.native
  
  /**
    * Returns true if data is loaded
    */
  def isBound(): Boolean = js.native
}
object TriangulationDataSource {
  
  @scala.inline
  def apply(converter: () => js.Object, dataBind: () => Unit, dataView: () => Unit, isBound: () => Boolean): TriangulationDataSource = {
    val __obj = js.Dynamic.literal(converter = js.Any.fromFunction0(converter), dataBind = js.Any.fromFunction0(dataBind), dataView = js.Any.fromFunction0(dataView), isBound = js.Any.fromFunction0(isBound))
    __obj.asInstanceOf[TriangulationDataSource]
  }
  
  @scala.inline
  implicit class TriangulationDataSourceOps[Self <: TriangulationDataSource] (val x: Self) extends AnyVal {
    
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
    def setConverter(value: () => js.Object): Self = this.set("converter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDataBind(value: () => Unit): Self = this.set("dataBind", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDataView(value: () => Unit): Self = this.set("dataView", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsBound(value: () => Boolean): Self = this.set("isBound", js.Any.fromFunction0(value))
  }
}
