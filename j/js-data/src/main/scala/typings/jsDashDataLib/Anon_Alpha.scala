package typings
package jsDashDataLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alpha extends js.Object {
  var alpha: java.lang.String | scala.Boolean
  var beta: java.lang.String | scala.Boolean
  var full: java.lang.String
  var major: scala.Double
  var minor: scala.Double
  var patch: scala.Double
}

object Anon_Alpha {
  @scala.inline
  def apply(
    alpha: java.lang.String | scala.Boolean,
    beta: java.lang.String | scala.Boolean,
    full: java.lang.String,
    major: scala.Double,
    minor: scala.Double,
    patch: scala.Double
  ): Anon_Alpha = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    __obj.updateDynamic("beta")(beta.asInstanceOf[js.Any])
    __obj.updateDynamic("full")(full)
    __obj.updateDynamic("major")(major)
    __obj.updateDynamic("minor")(minor)
    __obj.updateDynamic("patch")(patch)
    __obj.asInstanceOf[Anon_Alpha]
  }
}

