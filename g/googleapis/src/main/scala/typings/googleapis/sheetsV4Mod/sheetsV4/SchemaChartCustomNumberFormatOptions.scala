package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChartCustomNumberFormatOptions extends StObject {
  
  /**
    * Custom prefix to be prepended to the chart attribute. This field is optional.
    */
  var prefix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Custom suffix to be appended to the chart attribute. This field is optional.
    */
  var suffix: js.UndefOr[String | Null] = js.undefined
}
object SchemaChartCustomNumberFormatOptions {
  
  inline def apply(): SchemaChartCustomNumberFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChartCustomNumberFormatOptions]
  }
  
  extension [Self <: SchemaChartCustomNumberFormatOptions](x: Self) {
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixNull: Self = StObject.set(x, "prefix", null)
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixNull: Self = StObject.set(x, "suffix", null)
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
  }
}
