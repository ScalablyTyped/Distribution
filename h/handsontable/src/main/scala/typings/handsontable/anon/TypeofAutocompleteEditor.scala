package typings.handsontable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAutocompleteEditor extends StObject {
  
  def sortByRelevance(value: Any, choices: js.Array[String], caseSensitive: Boolean): js.Array[Double]
}
object TypeofAutocompleteEditor {
  
  inline def apply(sortByRelevance: (Any, js.Array[String], Boolean) => js.Array[Double]): TypeofAutocompleteEditor = {
    val __obj = js.Dynamic.literal(sortByRelevance = js.Any.fromFunction3(sortByRelevance))
    __obj.asInstanceOf[TypeofAutocompleteEditor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofAutocompleteEditor] (val x: Self) extends AnyVal {
    
    inline def setSortByRelevance(value: (Any, js.Array[String], Boolean) => js.Array[Double]): Self = StObject.set(x, "sortByRelevance", js.Any.fromFunction3(value))
  }
}
