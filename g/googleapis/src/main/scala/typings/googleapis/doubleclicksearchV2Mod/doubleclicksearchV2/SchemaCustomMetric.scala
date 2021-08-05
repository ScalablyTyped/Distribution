package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A message containing the custome metric.
  */
trait SchemaCustomMetric extends StObject {
  
  /**
    * Custom metric name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Custom metric numeric value.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object SchemaCustomMetric {
  
  inline def apply(): SchemaCustomMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomMetric]
  }
  
  extension [Self <: SchemaCustomMetric](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
