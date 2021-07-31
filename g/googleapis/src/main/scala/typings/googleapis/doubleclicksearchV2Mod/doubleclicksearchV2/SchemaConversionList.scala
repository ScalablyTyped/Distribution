package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of conversions.
  */
trait SchemaConversionList extends StObject {
  
  /**
    * The conversions being requested.
    */
  var conversion: js.UndefOr[js.Array[SchemaConversion]] = js.undefined
  
  /**
    * Identifies this as a ConversionList resource. Value: the fixed string
    * doubleclicksearch#conversionList.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaConversionList {
  
  @scala.inline
  def apply(): SchemaConversionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConversionList]
  }
  
  @scala.inline
  implicit class SchemaConversionListMutableBuilder[Self <: SchemaConversionList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConversion(value: js.Array[SchemaConversion]): Self = StObject.set(x, "conversion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionUndefined: Self = StObject.set(x, "conversion", js.undefined)
    
    @scala.inline
    def setConversionVarargs(value: SchemaConversion*): Self = StObject.set(x, "conversion", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
