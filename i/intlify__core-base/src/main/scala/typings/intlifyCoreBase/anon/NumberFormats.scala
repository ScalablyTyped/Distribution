package typings.intlifyCoreBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberFormats extends StObject {
  
  var numberFormats: /* import warning: importer.ImportType#apply Failed type conversion: infer N */ js.Any
}
object NumberFormats {
  
  inline def apply(
    numberFormats: /* import warning: importer.ImportType#apply Failed type conversion: infer N */ js.Any
  ): NumberFormats = {
    val __obj = js.Dynamic.literal(numberFormats = numberFormats.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormats]
  }
  
  extension [Self <: NumberFormats](x: Self) {
    
    inline def setNumberFormats(value: /* import warning: importer.ImportType#apply Failed type conversion: infer N */ js.Any): Self = StObject.set(x, "numberFormats", value.asInstanceOf[js.Any])
  }
}
