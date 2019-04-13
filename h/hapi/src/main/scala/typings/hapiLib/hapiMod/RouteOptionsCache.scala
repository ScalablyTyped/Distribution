package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteOptionsCache extends js.Object {
  var expiresAt: js.UndefOr[scala.Nothing | java.lang.String] = js.native
  var expiresIn: js.UndefOr[scala.Double | scala.Nothing] = js.native
  var otherwise: js.UndefOr[java.lang.String] = js.native
  var privacy: js.UndefOr[
    hapiLib.hapiLibStrings.default | hapiLib.hapiLibStrings.public | hapiLib.hapiLibStrings.`private`
  ] = js.native
  var statuses: js.UndefOr[js.Array[scala.Double]] = js.native
}

