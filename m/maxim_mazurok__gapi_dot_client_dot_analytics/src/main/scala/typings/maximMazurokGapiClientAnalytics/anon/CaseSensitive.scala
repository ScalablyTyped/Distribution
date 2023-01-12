package typings.maximMazurokGapiClientAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaseSensitive extends StObject {
  
  /** Indicates if the filter expressions are case sensitive. */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  /** Expression to extract from field A. */
  var extractA: js.UndefOr[String] = js.undefined
  
  /** Expression to extract from field B. */
  var extractB: js.UndefOr[String] = js.undefined
  
  /** Field A. */
  var fieldA: js.UndefOr[String] = js.undefined
  
  /** The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION. */
  var fieldAIndex: js.UndefOr[Double] = js.undefined
  
  /** Indicates if field A is required to match. */
  var fieldARequired: js.UndefOr[Boolean] = js.undefined
  
  /** Field B. */
  var fieldB: js.UndefOr[String] = js.undefined
  
  /** The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION. */
  var fieldBIndex: js.UndefOr[Double] = js.undefined
  
  /** Indicates if field B is required to match. */
  var fieldBRequired: js.UndefOr[Boolean] = js.undefined
  
  /** Expression used to construct the output value. */
  var outputConstructor: js.UndefOr[String] = js.undefined
  
  /** Output field. */
  var outputToField: js.UndefOr[String] = js.undefined
  
  /** The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION. */
  var outputToFieldIndex: js.UndefOr[Double] = js.undefined
  
  /** Indicates if the existing value of the output field, if any, should be overridden by the output expression. */
  var overrideOutputField: js.UndefOr[Boolean] = js.undefined
}
object CaseSensitive {
  
  inline def apply(): CaseSensitive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaseSensitive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CaseSensitive] (val x: Self) extends AnyVal {
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setExtractA(value: String): Self = StObject.set(x, "extractA", value.asInstanceOf[js.Any])
    
    inline def setExtractAUndefined: Self = StObject.set(x, "extractA", js.undefined)
    
    inline def setExtractB(value: String): Self = StObject.set(x, "extractB", value.asInstanceOf[js.Any])
    
    inline def setExtractBUndefined: Self = StObject.set(x, "extractB", js.undefined)
    
    inline def setFieldA(value: String): Self = StObject.set(x, "fieldA", value.asInstanceOf[js.Any])
    
    inline def setFieldAIndex(value: Double): Self = StObject.set(x, "fieldAIndex", value.asInstanceOf[js.Any])
    
    inline def setFieldAIndexUndefined: Self = StObject.set(x, "fieldAIndex", js.undefined)
    
    inline def setFieldARequired(value: Boolean): Self = StObject.set(x, "fieldARequired", value.asInstanceOf[js.Any])
    
    inline def setFieldARequiredUndefined: Self = StObject.set(x, "fieldARequired", js.undefined)
    
    inline def setFieldAUndefined: Self = StObject.set(x, "fieldA", js.undefined)
    
    inline def setFieldB(value: String): Self = StObject.set(x, "fieldB", value.asInstanceOf[js.Any])
    
    inline def setFieldBIndex(value: Double): Self = StObject.set(x, "fieldBIndex", value.asInstanceOf[js.Any])
    
    inline def setFieldBIndexUndefined: Self = StObject.set(x, "fieldBIndex", js.undefined)
    
    inline def setFieldBRequired(value: Boolean): Self = StObject.set(x, "fieldBRequired", value.asInstanceOf[js.Any])
    
    inline def setFieldBRequiredUndefined: Self = StObject.set(x, "fieldBRequired", js.undefined)
    
    inline def setFieldBUndefined: Self = StObject.set(x, "fieldB", js.undefined)
    
    inline def setOutputConstructor(value: String): Self = StObject.set(x, "outputConstructor", value.asInstanceOf[js.Any])
    
    inline def setOutputConstructorUndefined: Self = StObject.set(x, "outputConstructor", js.undefined)
    
    inline def setOutputToField(value: String): Self = StObject.set(x, "outputToField", value.asInstanceOf[js.Any])
    
    inline def setOutputToFieldIndex(value: Double): Self = StObject.set(x, "outputToFieldIndex", value.asInstanceOf[js.Any])
    
    inline def setOutputToFieldIndexUndefined: Self = StObject.set(x, "outputToFieldIndex", js.undefined)
    
    inline def setOutputToFieldUndefined: Self = StObject.set(x, "outputToField", js.undefined)
    
    inline def setOverrideOutputField(value: Boolean): Self = StObject.set(x, "overrideOutputField", value.asInstanceOf[js.Any])
    
    inline def setOverrideOutputFieldUndefined: Self = StObject.set(x, "overrideOutputField", js.undefined)
  }
}
