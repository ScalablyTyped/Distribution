package typings.lernaDashGetDashPackages.lernaDashGetDashPackagesMod

import typings.lernaDashGetDashPackages.Anon_Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LernaPackage extends js.Object {
  @JSName("package")
  var _package: Anon_Config
  var location: String
}

object LernaPackage {
  @scala.inline
  def apply(_package: Anon_Config, location: String): LernaPackage = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[LernaPackage]
  }
}

