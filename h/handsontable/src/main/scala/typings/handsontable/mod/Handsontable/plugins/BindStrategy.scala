package typings.handsontable.mod.Handsontable.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindStrategy extends StObject {
  
  def clearMap(): Unit = js.native
  
  def createMap(length: Double): Unit = js.native
  
  def createRow(params: js.Any): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def klass(): Unit = js.native
  
  def removeRow(params: js.Any): Unit = js.native
  
  def setStrategy(name: String): Unit = js.native
  
  var strategy: String | Unit = js.native
  
  def translate(params: js.Any): Unit = js.native
}
object BindStrategy {
  
  @scala.inline
  def apply(
    clearMap: () => Unit,
    createMap: Double => Unit,
    createRow: js.Any => Unit,
    destroy: () => Unit,
    klass: () => Unit,
    removeRow: js.Any => Unit,
    setStrategy: String => Unit,
    strategy: String | Unit,
    translate: js.Any => Unit
  ): BindStrategy = {
    val __obj = js.Dynamic.literal(clearMap = js.Any.fromFunction0(clearMap), createMap = js.Any.fromFunction1(createMap), createRow = js.Any.fromFunction1(createRow), destroy = js.Any.fromFunction0(destroy), klass = js.Any.fromFunction0(klass), removeRow = js.Any.fromFunction1(removeRow), setStrategy = js.Any.fromFunction1(setStrategy), strategy = strategy.asInstanceOf[js.Any], translate = js.Any.fromFunction1(translate))
    __obj.asInstanceOf[BindStrategy]
  }
  
  @scala.inline
  implicit class BindStrategyMutableBuilder[Self <: BindStrategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearMap(value: () => Unit): Self = StObject.set(x, "clearMap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateMap(value: Double => Unit): Self = StObject.set(x, "createMap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateRow(value: js.Any => Unit): Self = StObject.set(x, "createRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKlass(value: () => Unit): Self = StObject.set(x, "klass", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveRow(value: js.Any => Unit): Self = StObject.set(x, "removeRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStrategy(value: String => Unit): Self = StObject.set(x, "setStrategy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStrategy(value: String | Unit): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslate(value: js.Any => Unit): Self = StObject.set(x, "translate", js.Any.fromFunction1(value))
  }
}
