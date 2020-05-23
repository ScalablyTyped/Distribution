package typings.kolite

import typings.kolite.anon.Opacity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KoLiteActivity extends js.Object {
  var defaults: KoLiteActivityOptions = js.native
  def apply(options: KoLiteActivityOptions): JQuery = js.native
  def getOpacity(options: Opacity, i: Double): Double = js.native
}

