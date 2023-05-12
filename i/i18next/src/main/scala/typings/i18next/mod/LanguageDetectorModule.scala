package typings.i18next.mod

import typings.i18next.i18nextStrings.languageDetector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageDetectorModule
  extends StObject
     with Module {
  
  var cacheUserLanguage: js.UndefOr[js.Function1[/* lng */ String, Unit]] = js.undefined
  
  /** Must return detected language */
  def detect(): js.UndefOr[String | js.Array[String]]
  
  var init: js.UndefOr[
    js.Function3[
      /* services */ Services, 
      /* detectorOptions */ js.Object, 
      /* i18nextOptions */ InitOptions[js.Object], 
      Unit
    ]
  ] = js.undefined
  
  @JSName("type")
  var type_LanguageDetectorModule: languageDetector
}
object LanguageDetectorModule {
  
  inline def apply(detect: () => js.UndefOr[String | js.Array[String]]): LanguageDetectorModule = {
    val __obj = js.Dynamic.literal(detect = js.Any.fromFunction0(detect))
    __obj.updateDynamic("type")("languageDetector")
    __obj.asInstanceOf[LanguageDetectorModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LanguageDetectorModule] (val x: Self) extends AnyVal {
    
    inline def setCacheUserLanguage(value: /* lng */ String => Unit): Self = StObject.set(x, "cacheUserLanguage", js.Any.fromFunction1(value))
    
    inline def setCacheUserLanguageUndefined: Self = StObject.set(x, "cacheUserLanguage", js.undefined)
    
    inline def setDetect(value: () => js.UndefOr[String | js.Array[String]]): Self = StObject.set(x, "detect", js.Any.fromFunction0(value))
    
    inline def setInit(
      value: (/* services */ Services, /* detectorOptions */ js.Object, /* i18nextOptions */ InitOptions[js.Object]) => Unit
    ): Self = StObject.set(x, "init", js.Any.fromFunction3(value))
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setType(value: languageDetector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
