package typings.griddleReact.mod

import typings.reactRedux.esComponentsConnectMod.Connect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utils {
  
  @JSImport("griddle-react", "utils.columnUtils")
  @js.native
  val columnUtils: PropertyBag[js.Function] = js.native
  
  @JSImport("griddle-react", "utils.compositionUtils")
  @js.native
  val compositionUtils: PropertyBag[js.Function] = js.native
  
  /* was `typeof originalConnect` */
  @JSImport("griddle-react", "utils.connect")
  @js.native
  val connect: Connect[Any] = js.native
  
  @JSImport("griddle-react", "utils.dataUtils")
  @js.native
  val dataUtils: PropertyBag[js.Function] = js.native
  
  @JSImport("griddle-react", "utils.rowUtils")
  @js.native
  val rowUtils: PropertyBag[js.Function] = js.native
  
  object sortUtils {
    
    @JSImport("griddle-react", "utils.sortUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultSort(data: js.Array[Any], column: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultSort")(data.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def defaultSort(data: js.Array[Any], column: String, sortAscending: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultSort")(data.asInstanceOf[js.Any], column.asInstanceOf[js.Any], sortAscending.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def setSortProperties(sortProperties: SortProperties): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setSortProperties")(sortProperties.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  }
  
  trait SortProperties extends StObject {
    
    var columnId: String
    
    def setSortColumn(sortProperties: js.Function1[/* key */ GriddleSortKey, Unit]): Unit
    
    var sortProperty: GriddleSortKey
  }
  object SortProperties {
    
    inline def apply(
      columnId: String,
      setSortColumn: js.Function1[/* key */ GriddleSortKey, Unit] => Unit,
      sortProperty: GriddleSortKey
    ): SortProperties = {
      val __obj = js.Dynamic.literal(columnId = columnId.asInstanceOf[js.Any], setSortColumn = js.Any.fromFunction1(setSortColumn), sortProperty = sortProperty.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SortProperties] (val x: Self) extends AnyVal {
      
      inline def setColumnId(value: String): Self = StObject.set(x, "columnId", value.asInstanceOf[js.Any])
      
      inline def setSetSortColumn(value: js.Function1[/* key */ GriddleSortKey, Unit] => Unit): Self = StObject.set(x, "setSortColumn", js.Any.fromFunction1(value))
      
      inline def setSortProperty(value: GriddleSortKey): Self = StObject.set(x, "sortProperty", value.asInstanceOf[js.Any])
    }
  }
}
