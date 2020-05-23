package typings.koaHbs.mod

import org.scalablytyped.runtime.Instantiable1
import typings.handlebars.Handlebars.HelperDeclareSpec
import typings.handlebars.Handlebars.HelperDelegate
import typings.koaHbs.anon.FnCall
import typings.koaHbs.anon.TypeofUtils
import typings.koaHbs.mod.Hbs.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hbs_ extends js.Object {
  var SafeString: Instantiable1[/* str */ String, typings.handlebars.mod.SafeString] = js.native
  var Utils: TypeofUtils = js.native
  @JSName("registerHelper")
  var registerHelper_Original: FnCall = js.native
  def middleware(opts: Middleware): js.Any = js.native
  def registerHelper(name: String, fn: HelperDelegate): Unit = js.native
  def registerHelper(name: HelperDeclareSpec): Unit = js.native
}

