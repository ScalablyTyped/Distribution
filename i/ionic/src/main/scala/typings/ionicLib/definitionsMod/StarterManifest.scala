package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StarterManifest extends js.Object {
  var baseref: java.lang.String
  var name: java.lang.String
  var welcome: js.UndefOr[java.lang.String] = js.undefined
}

object StarterManifest {
  @scala.inline
  def apply(baseref: java.lang.String, name: java.lang.String, welcome: java.lang.String = null): StarterManifest = {
    val __obj = js.Dynamic.literal(baseref = baseref, name = name)
    if (welcome != null) __obj.updateDynamic("welcome")(welcome)
    __obj.asInstanceOf[StarterManifest]
  }
}

