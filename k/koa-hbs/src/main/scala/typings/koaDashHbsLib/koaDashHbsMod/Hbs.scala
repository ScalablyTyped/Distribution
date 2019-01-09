package typings
package koaDashHbsLib.koaDashHbsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hbs extends js.Object {
  var SafeString: org.scalablytyped.runtime.Instantiable1[/* str */ java.lang.String, handlebarsLib.handlebarsMod.SafeString] = js.native
  var Utils: koaDashHbsLib.Anon_BlockParams = js.native
  @JSName("registerHelper")
  var registerHelper_Original: koaDashHbsLib.Anon_Fn = js.native
  def middleware(opts: koaDashHbsLib.koaDashHbsMod.HbsNs.Middleware): js.Any = js.native
  def registerHelper(name: handlebarsLib.HandlebarsNs.HelperDeclareSpec): scala.Unit = js.native
  def registerHelper(name: java.lang.String, fn: handlebarsLib.HandlebarsNs.HelperDelegate): scala.Unit = js.native
}

