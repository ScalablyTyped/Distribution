package typings
package lernaDashGetDashPackagesLib.lernaDashGetDashPackagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LernaPackage extends js.Object {
  var location: java.lang.String
  var `package`: lernaDashGetDashPackagesLib.Anon_Config
}

object LernaPackage {
  @scala.inline
  def apply(location: java.lang.String, `package`: lernaDashGetDashPackagesLib.Anon_Config): LernaPackage = {
    val __obj = js.Dynamic.literal(location = location)
    __obj.updateDynamic("package")(`package`)
    __obj.asInstanceOf[LernaPackage]
  }
}

