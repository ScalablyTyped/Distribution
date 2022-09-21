package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTrimWhitespaceResponse extends StObject {
  
  /**
    * The number of cells that were trimmed of whitespace.
    */
  var cellsChangedCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaTrimWhitespaceResponse {
  
  inline def apply(): SchemaTrimWhitespaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrimWhitespaceResponse]
  }
  
  extension [Self <: SchemaTrimWhitespaceResponse](x: Self) {
    
    inline def setCellsChangedCount(value: Double): Self = StObject.set(x, "cellsChangedCount", value.asInstanceOf[js.Any])
    
    inline def setCellsChangedCountNull: Self = StObject.set(x, "cellsChangedCount", null)
    
    inline def setCellsChangedCountUndefined: Self = StObject.set(x, "cellsChangedCount", js.undefined)
  }
}
