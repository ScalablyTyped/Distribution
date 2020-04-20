package typings.hapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginPackage extends js.Object {
  /**
    * Alternatively, the name and version can be included via the pkg property containing the 'package.json' file for the module which already has the name and version included
    */
  var pkg: js.Any
}

object PluginPackage {
  @scala.inline
  def apply(pkg: js.Any): PluginPackage = {
    val __obj = js.Dynamic.literal(pkg = pkg.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginPackage]
  }
}

