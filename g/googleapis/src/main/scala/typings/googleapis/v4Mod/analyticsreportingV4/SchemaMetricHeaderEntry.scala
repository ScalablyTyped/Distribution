package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetricHeaderEntry extends StObject {
  
  /**
    * The name of the header.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the metric, for example `INTEGER`.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaMetricHeaderEntry {
  
  inline def apply(): SchemaMetricHeaderEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricHeaderEntry]
  }
  
  extension [Self <: SchemaMetricHeaderEntry](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
