package typings.kbar

import typings.kbar.typesMod.History
import typings.kbar.typesMod.HistoryItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object historyImplMod {
  
  @JSImport("kbar/lib/action/HistoryImpl", "HistoryItemImpl")
  @js.native
  open class HistoryItemImpl protected ()
    extends StObject
       with HistoryItem {
    def this(item: HistoryItem) = this()
    
    /* CompleteClass */
    override def negate(): Any = js.native
    @JSName("negate")
    var negate_FHistoryItemImpl: js.Function0[Any] = js.native
    
    /* CompleteClass */
    override def perform(): Any = js.native
    @JSName("perform")
    var perform_FHistoryItemImpl: js.Function0[Any] = js.native
  }
  /* static members */
  object HistoryItemImpl {
    
    @JSImport("kbar/lib/action/HistoryImpl", "HistoryItemImpl")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(item: HistoryItem): HistoryItemImpl = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(item.asInstanceOf[js.Any]).asInstanceOf[HistoryItemImpl]
  }
  
  @JSImport("kbar/lib/action/HistoryImpl", "history")
  @js.native
  val history: HistoryImpl = js.native
  
  @js.native
  trait HistoryImpl
    extends StObject
       with History {
    
    def init(): Unit = js.native
    
    @JSName("redoStack")
    var redoStack_HistoryImpl: js.Array[HistoryItemImpl] = js.native
    
    @JSName("undoStack")
    var undoStack_HistoryImpl: js.Array[HistoryItemImpl] = js.native
  }
}
