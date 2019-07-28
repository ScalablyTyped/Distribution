package typings.i18nextDashExpressDashMiddleware.i18nextDashExpressDashMiddlewareMod

import typings.express.expressMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait i18nextExpressMiddleware extends js.Object {
  def LanguageDetector(): Handler
  def missingKeyHandler(): Handler
}

object i18nextExpressMiddleware {
  @scala.inline
  def apply(LanguageDetector: () => Handler, missingKeyHandler: () => Handler): i18nextExpressMiddleware = {
    val __obj = js.Dynamic.literal(LanguageDetector = js.Any.fromFunction0(LanguageDetector), missingKeyHandler = js.Any.fromFunction0(missingKeyHandler))
  
    __obj.asInstanceOf[i18nextExpressMiddleware]
  }
}

