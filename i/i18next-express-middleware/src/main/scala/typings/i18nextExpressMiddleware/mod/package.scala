package typings.i18nextExpressMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type App = typings.express.mod.Application_ | typings.express.mod.Router
  type I18next = typings.i18next.mod.i18n
  type IgnoreRoutesFunction = js.Function4[
    /* req */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* res */ typings.express.mod.Response_[js.Any], 
    /* options */ typings.i18nextExpressMiddleware.mod.HandleOptions, 
    /* i18next */ typings.i18nextExpressMiddleware.mod.I18next, 
    scala.Boolean
  ]
  type LanguageDetectorCaches = scala.Boolean | js.Array[java.lang.String]
  type LanguageDetectorInterfaceOptions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type LanguageDetectorOrder = js.Array[java.lang.String]
  // LanguageDetector
  type LanguageDetectorServices = js.Any
}
