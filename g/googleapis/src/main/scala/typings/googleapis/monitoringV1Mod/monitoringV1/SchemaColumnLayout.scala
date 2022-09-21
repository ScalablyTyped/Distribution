package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaColumnLayout extends StObject {
  
  /**
    * The columns of content to display.
    */
  var columns: js.UndefOr[js.Array[SchemaColumn]] = js.undefined
}
object SchemaColumnLayout {
  
  inline def apply(): SchemaColumnLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColumnLayout]
  }
  
  extension [Self <: SchemaColumnLayout](x: Self) {
    
    inline def setColumns(value: js.Array[SchemaColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: SchemaColumn*): Self = StObject.set(x, "columns", js.Array(value*))
  }
}
