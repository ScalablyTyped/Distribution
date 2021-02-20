package typings.i18nextKo

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Translation extends StObject {
    
    var translation: StringDictionary[String] = js.native
  }
  object Translation {
    
    @scala.inline
    def apply(translation: StringDictionary[String]): Translation = {
      val __obj = js.Dynamic.literal(translation = translation.asInstanceOf[js.Any])
      __obj.asInstanceOf[Translation]
    }
    
    @scala.inline
    implicit class TranslationMutableBuilder[Self <: Translation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTranslation(value: StringDictionary[String]): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
    }
  }
}
