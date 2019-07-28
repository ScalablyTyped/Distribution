package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StarterManifest extends js.Object {
  var baseref: String
  var name: String
  var welcome: js.UndefOr[String] = js.undefined
}

object StarterManifest {
  @scala.inline
  def apply(baseref: String, name: String, welcome: String = null): StarterManifest = {
    val __obj = js.Dynamic.literal(baseref = baseref, name = name)
    if (welcome != null) __obj.updateDynamic("welcome")(welcome)
    __obj.asInstanceOf[StarterManifest]
  }
}

