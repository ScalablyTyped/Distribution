package typings.linguiReact

import typings.linguiCore.mod.I18n_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait I18n extends StObject {
    
    var i18n: I18n_
    
    var i18nHash: js.UndefOr[String] = js.undefined
  }
  object I18n {
    
    inline def apply(i18n: I18n_): I18n = {
      val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any])
      __obj.asInstanceOf[I18n]
    }
    
    extension [Self <: I18n](x: Self) {
      
      inline def setI18n(value: I18n_): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setI18nHash(value: String): Self = StObject.set(x, "i18nHash", value.asInstanceOf[js.Any])
      
      inline def setI18nHashUndefined: Self = StObject.set(x, "i18nHash", js.undefined)
    }
  }
}
