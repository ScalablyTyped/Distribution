package typings.jupyterlabTranslation

import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.jupyterlabTranslation.libTokensMod.TranslationBundle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBaseMod {
  
  @JSImport("@jupyterlab/translation/lib/base", "nullTranslator")
  @js.native
  val nullTranslator: NullTranslator_ = js.native
  
  /**
    * A translator that loads a dummy language bundle that returns the same input
    * strings.
    */
  trait NullTranslator_
    extends StObject
       with ITranslator {
    
    /* private */ var _languageBundle: Any
    
    def locale(): String
  }
  object NullTranslator_ {
    
    inline def apply(_languageBundle: Any, load: String => TranslationBundle, locale: () => String): NullTranslator_ = {
      val __obj = js.Dynamic.literal(_languageBundle = _languageBundle.asInstanceOf[js.Any], load = js.Any.fromFunction1(load), locale = js.Any.fromFunction0(locale))
      __obj.asInstanceOf[NullTranslator_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NullTranslator_] (val x: Self) extends AnyVal {
      
      inline def setLocale(value: () => String): Self = StObject.set(x, "locale", js.Any.fromFunction0(value))
      
      inline def set_languageBundle(value: Any): Self = StObject.set(x, "_languageBundle", value.asInstanceOf[js.Any])
    }
  }
}
