package typings.i18nextExpressMiddleware.mod

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageDetectorInterface extends js.Object {
  var cacheUserLanguage: js.UndefOr[
    js.Function4[
      /* req */ Request_[ParamsDictionary], 
      /* res */ Response_[_], 
      /* lng */ String, 
      /* options */ js.UndefOr[js.Object], 
      Unit
    ]
  ] = js.native
  var name: String = js.native
  def lookup(req: Request_[ParamsDictionary], res: Response_[_]): String | js.Array[String] = js.native
  def lookup(req: Request_[ParamsDictionary], res: Response_[_], options: LanguageDetectorInterfaceOptions): String | js.Array[String] = js.native
}

