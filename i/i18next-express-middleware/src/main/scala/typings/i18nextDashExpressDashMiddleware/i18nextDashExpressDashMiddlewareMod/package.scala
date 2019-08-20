package typings.i18nextDashExpressDashMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object i18nextDashExpressDashMiddlewareMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.express.expressMod.Application
  import typings.express.expressMod.Request
  import typings.express.expressMod.Response
  import typings.express.expressMod.Router
  import typings.i18next.i18nextMod.i18n

  type App = Application | Router
  type I18next = i18n
  type IgnoreRoutesFunction = js.Function4[
    /* req */ Request, 
    /* res */ Response, 
    /* options */ HandleOptions, 
    /* i18next */ I18next, 
    Boolean
  ]
  type LanguageDetectorCaches = Boolean | js.Array[String]
  type LanguageDetectorInterfaceOptions = StringDictionary[js.Any]
  type LanguageDetectorOrder = js.Array[String]
  // LanguageDetector
  type LanguageDetectorServices = js.Any
}
