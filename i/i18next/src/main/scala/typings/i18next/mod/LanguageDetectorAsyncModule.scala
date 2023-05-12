package typings.i18next.mod

import typings.i18next.i18nextBooleans.`true`
import typings.i18next.i18nextStrings.languageDetector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageDetectorAsyncModule
  extends StObject
     with Module {
  
  /** Set to true to enable async detection */
  var async: `true`
  
  var cacheUserLanguage: js.UndefOr[js.Function1[/* lng */ String, Unit | js.Promise[Unit]]] = js.undefined
  
  /** Must call callback passing detected language or return a Promise*/
  def detect(callback: js.Function1[/* lng */ js.UndefOr[String | js.Array[String]], js.UndefOr[Unit]]): Unit | (js.Promise[js.UndefOr[String | js.Array[String]]])
  
  var init: js.UndefOr[
    js.Function3[
      /* services */ Services, 
      /* detectorOptions */ js.Object, 
      /* i18nextOptions */ InitOptions[js.Object], 
      Unit
    ]
  ] = js.undefined
  
  @JSName("type")
  var type_LanguageDetectorAsyncModule: languageDetector
}
object LanguageDetectorAsyncModule {
  
  inline def apply(
    detect: js.Function1[/* lng */ js.UndefOr[String | js.Array[String]], js.UndefOr[Unit]] => Unit | (js.Promise[js.UndefOr[String | js.Array[String]]])
  ): LanguageDetectorAsyncModule = {
    val __obj = js.Dynamic.literal(async = true, detect = js.Any.fromFunction1(detect))
    __obj.updateDynamic("type")("languageDetector")
    __obj.asInstanceOf[LanguageDetectorAsyncModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LanguageDetectorAsyncModule] (val x: Self) extends AnyVal {
    
    inline def setAsync(value: `true`): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setCacheUserLanguage(value: /* lng */ String => Unit | js.Promise[Unit]): Self = StObject.set(x, "cacheUserLanguage", js.Any.fromFunction1(value))
    
    inline def setCacheUserLanguageUndefined: Self = StObject.set(x, "cacheUserLanguage", js.undefined)
    
    inline def setDetect(
      value: js.Function1[/* lng */ js.UndefOr[String | js.Array[String]], js.UndefOr[Unit]] => Unit | (js.Promise[js.UndefOr[String | js.Array[String]]])
    ): Self = StObject.set(x, "detect", js.Any.fromFunction1(value))
    
    inline def setInit(
      value: (/* services */ Services, /* detectorOptions */ js.Object, /* i18nextOptions */ InitOptions[js.Object]) => Unit
    ): Self = StObject.set(x, "init", js.Any.fromFunction3(value))
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setType(value: languageDetector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
