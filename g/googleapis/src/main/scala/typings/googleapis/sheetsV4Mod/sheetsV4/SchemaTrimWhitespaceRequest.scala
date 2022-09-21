package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTrimWhitespaceRequest extends StObject {
  
  /**
    * The range whose cells to trim.
    */
  var range: js.UndefOr[SchemaGridRange] = js.undefined
}
object SchemaTrimWhitespaceRequest {
  
  inline def apply(): SchemaTrimWhitespaceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrimWhitespaceRequest]
  }
  
  extension [Self <: SchemaTrimWhitespaceRequest](x: Self) {
    
    inline def setRange(value: SchemaGridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
