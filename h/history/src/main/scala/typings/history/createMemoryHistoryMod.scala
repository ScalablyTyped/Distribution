package typings.history

import typings.history.mod.History
import typings.history.mod.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createMemoryHistoryMod {
  
  @JSImport("history/createMemoryHistory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[S](): MemoryHistory[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[MemoryHistory[S]]
  inline def default[S](options: MemoryHistoryBuildOptions): MemoryHistory[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[MemoryHistory[S]]
  
  @js.native
  trait MemoryHistory[HistoryLocationState]
    extends StObject
       with History[HistoryLocationState] {
    
    def canGo(n: Double): Boolean = js.native
    
    var entries: js.Array[Location[HistoryLocationState]] = js.native
    
    var index: Double = js.native
  }
  
  trait MemoryHistoryBuildOptions extends StObject {
    
    var getUserConfirmation: js.UndefOr[
        js.Function2[/* message */ String, /* callback */ js.Function1[/* result */ Boolean, Unit], Unit]
      ] = js.undefined
    
    var initialEntries: js.UndefOr[js.Array[String]] = js.undefined
    
    var initialIndex: js.UndefOr[Double] = js.undefined
    
    var keyLength: js.UndefOr[Double] = js.undefined
  }
  object MemoryHistoryBuildOptions {
    
    inline def apply(): MemoryHistoryBuildOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemoryHistoryBuildOptions]
    }
    
    extension [Self <: MemoryHistoryBuildOptions](x: Self) {
      
      inline def setGetUserConfirmation(value: (/* message */ String, /* callback */ js.Function1[/* result */ Boolean, Unit]) => Unit): Self = StObject.set(x, "getUserConfirmation", js.Any.fromFunction2(value))
      
      inline def setGetUserConfirmationUndefined: Self = StObject.set(x, "getUserConfirmation", js.undefined)
      
      inline def setInitialEntries(value: js.Array[String]): Self = StObject.set(x, "initialEntries", value.asInstanceOf[js.Any])
      
      inline def setInitialEntriesUndefined: Self = StObject.set(x, "initialEntries", js.undefined)
      
      inline def setInitialEntriesVarargs(value: String*): Self = StObject.set(x, "initialEntries", js.Array(value :_*))
      
      inline def setInitialIndex(value: Double): Self = StObject.set(x, "initialIndex", value.asInstanceOf[js.Any])
      
      inline def setInitialIndexUndefined: Self = StObject.set(x, "initialIndex", js.undefined)
      
      inline def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
      
      inline def setKeyLengthUndefined: Self = StObject.set(x, "keyLength", js.undefined)
    }
  }
}
