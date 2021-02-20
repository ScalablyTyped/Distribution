package typings.griddleReact.mod

import typings.reactRedux.mod.Connect_
import typings.reactRedux.mod.DefaultRootState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  val connect: Connect_[DefaultRootState] = js.native
  
  @JSImport("griddle-react", "utils.dataUtils")
  @js.native
  val dataUtils: PropertyBag[js.Function] = js.native
  
  @JSImport("griddle-react", "utils.rowUtils")
  @js.native
  val rowUtils: PropertyBag[js.Function] = js.native
  
  object sortUtils {
    
    @JSImport("griddle-react", "utils.sortUtils.defaultSort")
    @js.native
    def defaultSort(data: js.Array[_], column: String): Double = js.native
    @JSImport("griddle-react", "utils.sortUtils.defaultSort")
    @js.native
    def defaultSort(data: js.Array[_], column: String, sortAscending: Boolean): Double = js.native
    
    @JSImport("griddle-react", "utils.sortUtils.setSortProperties")
    @js.native
    def setSortProperties(sortProperties: SortProperties): js.Function0[Unit] = js.native
  }
  
  @js.native
  trait SortProperties extends StObject {
    
    var columnId: String = js.native
    
    def setSortColumn(sortProperties: js.Function1[/* key */ GriddleSortKey, Unit]): Unit = js.native
    
    var sortProperty: GriddleSortKey = js.native
  }
  object SortProperties {
    
    @scala.inline
    def apply(
      columnId: String,
      setSortColumn: js.Function1[/* key */ GriddleSortKey, Unit] => Unit,
      sortProperty: GriddleSortKey
    ): SortProperties = {
      val __obj = js.Dynamic.literal(columnId = columnId.asInstanceOf[js.Any], setSortColumn = js.Any.fromFunction1(setSortColumn), sortProperty = sortProperty.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortProperties]
    }
    
    @scala.inline
    implicit class SortPropertiesMutableBuilder[Self <: SortProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnId(value: String): Self = StObject.set(x, "columnId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetSortColumn(value: js.Function1[/* key */ GriddleSortKey, Unit] => Unit): Self = StObject.set(x, "setSortColumn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSortProperty(value: GriddleSortKey): Self = StObject.set(x, "sortProperty", value.asInstanceOf[js.Any])
    }
  }
}
