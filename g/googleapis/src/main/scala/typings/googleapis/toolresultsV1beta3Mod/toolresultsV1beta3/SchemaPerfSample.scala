package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPerfSample extends StObject {
  
  /**
    * Timestamp of collection.
    */
  var sampleTime: js.UndefOr[SchemaTimestamp] = js.undefined
  
  /**
    * Value observed
    */
  var value: js.UndefOr[Double | Null] = js.undefined
}
object SchemaPerfSample {
  
  inline def apply(): SchemaPerfSample = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerfSample]
  }
  
  extension [Self <: SchemaPerfSample](x: Self) {
    
    inline def setSampleTime(value: SchemaTimestamp): Self = StObject.set(x, "sampleTime", value.asInstanceOf[js.Any])
    
    inline def setSampleTimeUndefined: Self = StObject.set(x, "sampleTime", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
