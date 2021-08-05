package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a deobfuscation file.
  */
trait SchemaDeobfuscationFile extends StObject {
  
  /**
    * The type of the deobfuscation file.
    */
  var symbolType: js.UndefOr[String] = js.undefined
}
object SchemaDeobfuscationFile {
  
  inline def apply(): SchemaDeobfuscationFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeobfuscationFile]
  }
  
  extension [Self <: SchemaDeobfuscationFile](x: Self) {
    
    inline def setSymbolType(value: String): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
    
    inline def setSymbolTypeUndefined: Self = StObject.set(x, "symbolType", js.undefined)
  }
}
