package typings.ionicCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cx extends js.Object {
  var cx: Double
  var cy: Double
  var fill: String
  var r: Double
  var transform: String
  var viewBox: String
}

object Cx {
  @scala.inline
  def apply(cx: Double, cy: Double, fill: String, r: Double, transform: String, viewBox: String): Cx = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cx]
  }
}

