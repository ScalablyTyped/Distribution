package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single strongly-typed value.
  */
@js.native
trait SchemaTypedValue extends StObject {
  
  /**
    * A Boolean value: true or false.
    */
  var boolValue: js.UndefOr[Boolean] = js.native
  
  /**
    * A distribution value.
    */
  var distributionValue: js.UndefOr[SchemaDistribution] = js.native
  
  /**
    * A 64-bit double-precision floating-point number. Its magnitude is
    * approximately &amp;plusmn;10&lt;sup&gt;&amp;plusmn;300&lt;/sup&gt; and it
    * has 16 significant digits of precision.
    */
  var doubleValue: js.UndefOr[Double] = js.native
  
  /**
    * A 64-bit integer. Its range is approximately
    * &amp;plusmn;9.2x10&lt;sup&gt;18&lt;/sup&gt;.
    */
  var int64Value: js.UndefOr[String] = js.native
  
  /**
    * A variable-length string value.
    */
  var stringValue: js.UndefOr[String] = js.native
}
object SchemaTypedValue {
  
  @scala.inline
  def apply(): SchemaTypedValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTypedValue]
  }
  
  @scala.inline
  implicit class SchemaTypedValueMutableBuilder[Self <: SchemaTypedValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    @scala.inline
    def setDistributionValue(value: SchemaDistribution): Self = StObject.set(x, "distributionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionValueUndefined: Self = StObject.set(x, "distributionValue", js.undefined)
    
    @scala.inline
    def setDoubleValue(value: Double): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    @scala.inline
    def setInt64Value(value: String): Self = StObject.set(x, "int64Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInt64ValueUndefined: Self = StObject.set(x, "int64Value", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
