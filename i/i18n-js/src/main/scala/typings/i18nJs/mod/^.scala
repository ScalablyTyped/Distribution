package typings.i18nJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.i18nJs.i18nJsStrings.guess
import typings.i18nJs.i18nJsStrings.message
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("i18n-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var defaultLocale: String = js.native
  
  var defaultSeparator: String = js.native
  
  var fallbacks: Boolean | String | (StringDictionary[String | js.Array[String]]) = js.native
  
  // tslint:disable-next-line prefer-declare-function
  var getFullScope: js.Function2[
    /* scope */ String | js.Array[String], 
    /* options */ js.UndefOr[TranslateOptions], 
    String
  ] = js.native
  
  var locale: String = js.native
  
  var missingBehaviour: message | guess = js.native
  
  // tslint:disable-next-line prefer-declare-function
  var missingPlaceholder: js.Function3[
    /* placeholder */ String, 
    /* message */ String, 
    /* options */ js.UndefOr[InterpolateOptions], 
    js.UndefOr[String | Null]
  ] = js.native
  
  // tslint:disable-next-line prefer-declare-function
  var missingTranslation: js.Function2[
    /* scope */ String, 
    /* options */ js.UndefOr[TranslateOptions], 
    js.UndefOr[String | Null]
  ] = js.native
  
  var missingTranslationPrefix: String = js.native
  
  // tslint:disable-next-line prefer-declare-function
  var nullPlaceholder: js.Function3[
    /* placeholder */ String, 
    /* message */ String, 
    /* options */ js.UndefOr[InterpolateOptions], 
    js.UndefOr[String | Null]
  ] = js.native
  
  var placeholder: RegExp = js.native
}
