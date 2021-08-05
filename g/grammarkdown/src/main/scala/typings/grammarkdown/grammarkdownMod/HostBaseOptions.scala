package typings.grammarkdown.grammarkdownMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostBaseOptions extends StObject {
  
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  
  var knownGrammars: js.UndefOr[Record[String, String]] = js.undefined
  
  var useBuiltinGrammars: js.UndefOr[Boolean] = js.undefined
}
object HostBaseOptions {
  
  inline def apply(): HostBaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostBaseOptions]
  }
  
  extension [Self <: HostBaseOptions](x: Self) {
    
    inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    
    inline def setKnownGrammars(value: Record[String, String]): Self = StObject.set(x, "knownGrammars", value.asInstanceOf[js.Any])
    
    inline def setKnownGrammarsUndefined: Self = StObject.set(x, "knownGrammars", js.undefined)
    
    inline def setUseBuiltinGrammars(value: Boolean): Self = StObject.set(x, "useBuiltinGrammars", value.asInstanceOf[js.Any])
    
    inline def setUseBuiltinGrammarsUndefined: Self = StObject.set(x, "useBuiltinGrammars", js.undefined)
  }
}
