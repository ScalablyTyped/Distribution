package typings.lernaDashGetDashPackages.lernaDashGetDashPackagesMod

import typings.lernaDashGetDashPackages.Anon_Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LernaPackage extends js.Object {
  var location: String
  var `package`: Anon_Config
}

object LernaPackage {
  @scala.inline
  def apply(location: String, `package`: Anon_Config): LernaPackage = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(`package`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LernaPackage]
  }
}

