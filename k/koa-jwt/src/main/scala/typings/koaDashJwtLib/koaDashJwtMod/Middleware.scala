package typings
package koaDashJwtLib.koaDashJwtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Middleware
  extends koaDashComposeLib.koaDashComposeMod.Middleware[koaLib.koaMod.ParameterizedContext[js.Any, js.Object]] {
  def unless(): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def unless(params: koaDashJwtLib.Anon_Path): koaLib.koaMod.Middleware[_, js.Object] = js.native
}

