package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTableDisplayOptions extends StObject {
  
  /**
    * Optional. Columns to display in the table. Leave empty to display all available columns. Note: This field is for future features and is not currently used.
    */
  var shownColumns: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaTableDisplayOptions {
  
  inline def apply(): SchemaTableDisplayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableDisplayOptions]
  }
  
  extension [Self <: SchemaTableDisplayOptions](x: Self) {
    
    inline def setShownColumns(value: js.Array[String]): Self = StObject.set(x, "shownColumns", value.asInstanceOf[js.Any])
    
    inline def setShownColumnsNull: Self = StObject.set(x, "shownColumns", null)
    
    inline def setShownColumnsUndefined: Self = StObject.set(x, "shownColumns", js.undefined)
    
    inline def setShownColumnsVarargs(value: String*): Self = StObject.set(x, "shownColumns", js.Array(value*))
  }
}
