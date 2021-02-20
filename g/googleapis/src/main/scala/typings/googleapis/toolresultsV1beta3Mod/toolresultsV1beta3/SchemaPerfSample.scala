package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource representing a single performance measure or data point
  */
@js.native
trait SchemaPerfSample extends StObject {
  
  /**
    * Timestamp of collection
    */
  var sampleTime: js.UndefOr[SchemaTimestamp] = js.native
  
  /**
    * Value observed
    */
  var value: js.UndefOr[Double] = js.native
}
object SchemaPerfSample {
  
  @scala.inline
  def apply(): SchemaPerfSample = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerfSample]
  }
  
  @scala.inline
  implicit class SchemaPerfSampleMutableBuilder[Self <: SchemaPerfSample] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSampleTime(value: SchemaTimestamp): Self = StObject.set(x, "sampleTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleTimeUndefined: Self = StObject.set(x, "sampleTime", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
