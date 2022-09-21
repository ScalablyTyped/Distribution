package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaItem extends StObject {
  
  /**
    * A list of zero or more rich result issues found for this instance.
    */
  var issues: js.UndefOr[js.Array[SchemaRichResultsIssue]] = js.undefined
  
  /**
    * The user-provided name of this item.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaItem {
  
  inline def apply(): SchemaItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaItem]
  }
  
  extension [Self <: SchemaItem](x: Self) {
    
    inline def setIssues(value: js.Array[SchemaRichResultsIssue]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    inline def setIssuesUndefined: Self = StObject.set(x, "issues", js.undefined)
    
    inline def setIssuesVarargs(value: SchemaRichResultsIssue*): Self = StObject.set(x, "issues", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
