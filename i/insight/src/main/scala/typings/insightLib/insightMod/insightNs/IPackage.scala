package typings
package insightLib.insightMod.insightNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPackage extends js.Object {
  var name: java.lang.String
  var version: java.lang.String
}

object IPackage {
  @scala.inline
  def apply(name: java.lang.String, version: java.lang.String): IPackage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[IPackage]
  }
}

