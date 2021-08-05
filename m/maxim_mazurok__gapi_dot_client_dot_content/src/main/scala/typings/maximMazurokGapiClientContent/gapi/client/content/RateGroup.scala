package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RateGroup extends StObject {
  
  /**
    * A list of shipping labels defining the products to which this rate group applies to. This is a disjunction: only one of the labels has to match for the rate group to apply. May only
    * be empty for the last rate group of a service. Required.
    */
  var applicableShippingLabels: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A list of carrier rates that can be referred to by `mainTable` or `singleValue`. */
  var carrierRates: js.UndefOr[js.Array[CarrierRate]] = js.undefined
  
  /** A table defining the rate group, when `singleValue` is not expressive enough. Can only be set if `singleValue` is not set. */
  var mainTable: js.UndefOr[Table] = js.undefined
  
  /** Name of the rate group. Optional. If set has to be unique within shipping service. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The value of the rate group (e.g. flat rate $10). Can only be set if `mainTable` and `subtables` are not set. */
  var singleValue: js.UndefOr[Value] = js.undefined
  
  /** A list of subtables referred to by `mainTable`. Can only be set if `mainTable` is set. */
  var subtables: js.UndefOr[js.Array[Table]] = js.undefined
}
object RateGroup {
  
  inline def apply(): RateGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RateGroup]
  }
  
  extension [Self <: RateGroup](x: Self) {
    
    inline def setApplicableShippingLabels(value: js.Array[String]): Self = StObject.set(x, "applicableShippingLabels", value.asInstanceOf[js.Any])
    
    inline def setApplicableShippingLabelsUndefined: Self = StObject.set(x, "applicableShippingLabels", js.undefined)
    
    inline def setApplicableShippingLabelsVarargs(value: String*): Self = StObject.set(x, "applicableShippingLabels", js.Array(value :_*))
    
    inline def setCarrierRates(value: js.Array[CarrierRate]): Self = StObject.set(x, "carrierRates", value.asInstanceOf[js.Any])
    
    inline def setCarrierRatesUndefined: Self = StObject.set(x, "carrierRates", js.undefined)
    
    inline def setCarrierRatesVarargs(value: CarrierRate*): Self = StObject.set(x, "carrierRates", js.Array(value :_*))
    
    inline def setMainTable(value: Table): Self = StObject.set(x, "mainTable", value.asInstanceOf[js.Any])
    
    inline def setMainTableUndefined: Self = StObject.set(x, "mainTable", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSingleValue(value: Value): Self = StObject.set(x, "singleValue", value.asInstanceOf[js.Any])
    
    inline def setSingleValueUndefined: Self = StObject.set(x, "singleValue", js.undefined)
    
    inline def setSubtables(value: js.Array[Table]): Self = StObject.set(x, "subtables", value.asInstanceOf[js.Any])
    
    inline def setSubtablesUndefined: Self = StObject.set(x, "subtables", js.undefined)
    
    inline def setSubtablesVarargs(value: Table*): Self = StObject.set(x, "subtables", js.Array(value :_*))
  }
}
