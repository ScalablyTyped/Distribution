package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A metric value representing temporal values of a variable.
  */
@js.native
trait SchemaIntegerGauge extends StObject {
  
  /**
    * The time at which this value was measured. Measured as msecs from epoch.
    */
  var timestamp: js.UndefOr[String] = js.native
  
  /**
    * The value of the variable represented by this gauge.
    */
  var value: js.UndefOr[SchemaSplitInt64] = js.native
}
object SchemaIntegerGauge {
  
  @scala.inline
  def apply(): SchemaIntegerGauge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntegerGauge]
  }
  
  @scala.inline
  implicit class SchemaIntegerGaugeMutableBuilder[Self <: SchemaIntegerGauge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setValue(value: SchemaSplitInt64): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
