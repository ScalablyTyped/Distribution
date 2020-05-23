package typings.lernaGetPackages.mod

import typings.lernaGetPackages.anon.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LernaPackage extends js.Object {
  @JSName("package")
  var _package: Config
  var location: String
}

object LernaPackage {
  @scala.inline
  def apply(_package: Config, location: String): LernaPackage = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[LernaPackage]
  }
}

