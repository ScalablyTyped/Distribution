package typings
package matterDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameVersion
  extends matterDashJsLib.matterDashJsMod.MatterNs._Dependency {
  var name: java.lang.String
  var version: java.lang.String
}

object Anon_NameVersion {
  @scala.inline
  def apply(name: java.lang.String, version: java.lang.String): Anon_NameVersion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_NameVersion]
  }
}

