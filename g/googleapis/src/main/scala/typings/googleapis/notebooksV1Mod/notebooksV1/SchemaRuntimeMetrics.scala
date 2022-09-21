package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRuntimeMetrics extends StObject {
  
  /**
    * Output only. The system metrics.
    */
  var systemMetrics: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaRuntimeMetrics {
  
  inline def apply(): SchemaRuntimeMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRuntimeMetrics]
  }
  
  extension [Self <: SchemaRuntimeMetrics](x: Self) {
    
    inline def setSystemMetrics(value: StringDictionary[String]): Self = StObject.set(x, "systemMetrics", value.asInstanceOf[js.Any])
    
    inline def setSystemMetricsNull: Self = StObject.set(x, "systemMetrics", null)
    
    inline def setSystemMetricsUndefined: Self = StObject.set(x, "systemMetrics", js.undefined)
  }
}
