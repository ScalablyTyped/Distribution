package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChainName extends StObject {
  
  /**
    * The display name for this chain.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The BCP 47 code of language of the name.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaChainName {
  
  inline def apply(): SchemaChainName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChainName]
  }
  
  extension [Self <: SchemaChainName](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}
