package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinesOptions extends StObject {
  
  /**
    * Language of the results
    * @default en
    */
  var language: js.UndefOr[String] = js.undefined
}
object LinesOptions {
  
  inline def apply(): LinesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinesOptions]
  }
  
  extension [Self <: LinesOptions](x: Self) {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
  }
}
