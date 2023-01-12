package typings.i18nextKo

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Translation extends StObject {
    
    var translation: StringDictionary[String]
  }
  object Translation {
    
    inline def apply(translation: StringDictionary[String]): Translation = {
      val __obj = js.Dynamic.literal(translation = translation.asInstanceOf[js.Any])
      __obj.asInstanceOf[Translation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Translation] (val x: Self) extends AnyVal {
      
      inline def setTranslation(value: StringDictionary[String]): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
    }
  }
}
