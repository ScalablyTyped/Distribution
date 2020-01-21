package typings.ionicCliFramework.mod

import typings.ionicCliFramework.configMod.BaseConfigOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework", "BaseConfig")
@js.native
abstract class BaseConfig[T /* <: js.Object */] protected ()
  extends typings.ionicCliFramework.libMod.BaseConfig[T] {
  def this(p: String) = this()
  def this(p: String, hasPathPrefix: BaseConfigOptions) = this()
}

