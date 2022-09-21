package typings.handsontable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conditionUpdateObserverMod {
  
  @JSImport("handsontable/plugins/filters/conditionUpdateObserver", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ConditionUpdateObserver {
    def this(
      hot: typings.handsontable.coreMod.default,
      conditionCollection: typings.handsontable.conditionCollectionMod.default
    ) = this()
    def this(
      hot: typings.handsontable.coreMod.default,
      conditionCollection: typings.handsontable.conditionCollectionMod.default,
      columnDataFactory: js.Function0[js.Array[Any]]
    ) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def flush(): Unit = js.native
    
    /* CompleteClass */
    override def groupChanges(): Unit = js.native
    
    /* CompleteClass */
    override def updateStatesAtColumn(column: Double, conditionArgsChange: Any): Unit = js.native
  }
  
  trait ConditionUpdateObserver extends StObject {
    
    def destroy(): Unit
    
    def flush(): Unit
    
    def groupChanges(): Unit
    
    def updateStatesAtColumn(column: Double, conditionArgsChange: Any): Unit
  }
  object ConditionUpdateObserver {
    
    inline def apply(
      destroy: () => Unit,
      flush: () => Unit,
      groupChanges: () => Unit,
      updateStatesAtColumn: (Double, Any) => Unit
    ): ConditionUpdateObserver = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), flush = js.Any.fromFunction0(flush), groupChanges = js.Any.fromFunction0(groupChanges), updateStatesAtColumn = js.Any.fromFunction2(updateStatesAtColumn))
      __obj.asInstanceOf[ConditionUpdateObserver]
    }
    
    extension [Self <: ConditionUpdateObserver](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
      
      inline def setGroupChanges(value: () => Unit): Self = StObject.set(x, "groupChanges", js.Any.fromFunction0(value))
      
      inline def setUpdateStatesAtColumn(value: (Double, Any) => Unit): Self = StObject.set(x, "updateStatesAtColumn", js.Any.fromFunction2(value))
    }
  }
}
