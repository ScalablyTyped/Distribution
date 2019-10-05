package typings.koaDashHbs.koaDashHbsMod

import org.scalablytyped.runtime.Instantiable1
import typings.handlebars.Handlebars.HelperDeclareSpec
import typings.handlebars.Handlebars.HelperDelegate
import typings.koaDashHbs.Fn_Fn
import typings.koaDashHbs.TypeofUtils
import typings.koaDashHbs.koaDashHbsMod.Hbs.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Hbs")
@js.native
trait Hbs_ extends js.Object {
  var SafeString: Instantiable1[/* str */ String, typings.handlebars.handlebarsMod.SafeString] = js.native
  var Utils: TypeofUtils = js.native
  @JSName("registerHelper")
  var registerHelper_Original: Fn_Fn = js.native
  def middleware(opts: Middleware): js.Any = js.native
  def registerHelper(name: String, fn: HelperDelegate): Unit = js.native
  def registerHelper(name: HelperDeclareSpec): Unit = js.native
}

