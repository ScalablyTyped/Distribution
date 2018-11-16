package typings
package koaDashJoiDashRouterLib.koaDashJoiDashRouterMod.createRouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Spec extends js.Object {
  var method: java.lang.String
  var path: java.lang.String | stdLib.RegExp
  var validate: js.UndefOr[koaDashJoiDashRouterLib.Anon_Failure] = js.undefined
  def handler(ctx: Context): scala.Unit
}

