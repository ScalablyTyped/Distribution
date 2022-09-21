package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdWordsLocationExtensions extends StObject {
  
  /**
    * Required. An alternate phone number to display on AdWords location extensions instead of the location's primary phone number.
    */
  var adPhone: js.UndefOr[String | Null] = js.undefined
}
object SchemaAdWordsLocationExtensions {
  
  inline def apply(): SchemaAdWordsLocationExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdWordsLocationExtensions]
  }
  
  extension [Self <: SchemaAdWordsLocationExtensions](x: Self) {
    
    inline def setAdPhone(value: String): Self = StObject.set(x, "adPhone", value.asInstanceOf[js.Any])
    
    inline def setAdPhoneNull: Self = StObject.set(x, "adPhone", null)
    
    inline def setAdPhoneUndefined: Self = StObject.set(x, "adPhone", js.undefined)
  }
}
