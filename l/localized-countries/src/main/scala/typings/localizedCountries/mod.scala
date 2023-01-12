package typings.localizedCountries

import org.scalablytyped.runtime.StringDictionary
import typings.localizedCountries.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(locale: String): LocalizedCountries = ^.asInstanceOf[js.Dynamic].apply(locale.asInstanceOf[js.Any]).asInstanceOf[LocalizedCountries]
  inline def apply(locale: js.Object): LocalizedCountries = ^.asInstanceOf[js.Dynamic].apply(locale.asInstanceOf[js.Any]).asInstanceOf[LocalizedCountries]
  
  @JSImport("localized-countries", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("localized-countries", "languages")
  @js.native
  val languages: js.Array[String] = js.native
  
  trait LocalizedCountries extends StObject {
    
    def array(): js.Array[Code]
    
    def get(code: String): String
    
    def `object`(): StringDictionary[String]
  }
  object LocalizedCountries {
    
    inline def apply(array: () => js.Array[Code], get: String => String, `object`: () => StringDictionary[String]): LocalizedCountries = {
      val __obj = js.Dynamic.literal(array = js.Any.fromFunction0(array), get = js.Any.fromFunction1(get))
      __obj.updateDynamic("object")(js.Any.fromFunction0(`object`))
      __obj.asInstanceOf[LocalizedCountries]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocalizedCountries] (val x: Self) extends AnyVal {
      
      inline def setArray(value: () => js.Array[Code]): Self = StObject.set(x, "array", js.Any.fromFunction0(value))
      
      inline def setGet(value: String => String): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setObject(value: () => StringDictionary[String]): Self = StObject.set(x, "object", js.Any.fromFunction0(value))
    }
  }
}
