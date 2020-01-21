package typings.gun.gunMod

import org.scalablytyped.runtime.TopLevel
import typings.gun.TypeofimportedGun
import typings.gun.gunStrings.pre_root
import typings.gun.mod.Gun.ChainReference
import typings.gun.mod.Gun.Constructor
import typings.gun.mod.Gun.ConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gun/gun", JSImport.Namespace)
@js.native
class ^[DataType] ()
  extends ChainReference[DataType, js.Any, pre_root] {
  def this(options: String) = this()
  def this(options: js.Array[String]) = this()
  def this(options: ConstructorOptions) = this()
}

@JSImport("gun/gun", JSImport.Namespace)
@js.native
object ^ extends TopLevel[Constructor with TypeofimportedGun]

