package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single strongly-typed value.
  */
trait SchemaTypedValue extends StObject {
  
  /**
    * A Boolean value: true or false.
    */
  var boolValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A distribution value.
    */
  var distributionValue: js.UndefOr[SchemaDistribution] = js.undefined
  
  /**
    * A 64-bit double-precision floating-point number. Its magnitude is
    * approximately &amp;plusmn;10&lt;sup&gt;&amp;plusmn;300&lt;/sup&gt; and it
    * has 16 significant digits of precision.
    */
  var doubleValue: js.UndefOr[Double] = js.undefined
  
  /**
    * A 64-bit integer. Its range is approximately
    * &amp;plusmn;9.2x10&lt;sup&gt;18&lt;/sup&gt;.
    */
  var int64Value: js.UndefOr[String] = js.undefined
  
  /**
    * A variable-length string value.
    */
  var stringValue: js.UndefOr[String] = js.undefined
}
object SchemaTypedValue {
  
  inline def apply(): SchemaTypedValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTypedValue]
  }
  
  extension [Self <: SchemaTypedValue](x: Self) {
    
    inline def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    inline def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    inline def setDistributionValue(value: SchemaDistribution): Self = StObject.set(x, "distributionValue", value.asInstanceOf[js.Any])
    
    inline def setDistributionValueUndefined: Self = StObject.set(x, "distributionValue", js.undefined)
    
    inline def setDoubleValue(value: Double): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    inline def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    inline def setInt64Value(value: String): Self = StObject.set(x, "int64Value", value.asInstanceOf[js.Any])
    
    inline def setInt64ValueUndefined: Self = StObject.set(x, "int64Value", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
