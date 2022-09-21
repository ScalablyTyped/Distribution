package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSuffix extends StObject {
  
  /**
    * Only applies to Option.CUSTOM.
    */
  var customSuffix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Suffix option.
    */
  var option: js.UndefOr[String | Null] = js.undefined
}
object SchemaSuffix {
  
  inline def apply(): SchemaSuffix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuffix]
  }
  
  extension [Self <: SchemaSuffix](x: Self) {
    
    inline def setCustomSuffix(value: String): Self = StObject.set(x, "customSuffix", value.asInstanceOf[js.Any])
    
    inline def setCustomSuffixNull: Self = StObject.set(x, "customSuffix", null)
    
    inline def setCustomSuffixUndefined: Self = StObject.set(x, "customSuffix", js.undefined)
    
    inline def setOption(value: String): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setOptionNull: Self = StObject.set(x, "option", null)
    
    inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
  }
}
