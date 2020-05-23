package typings.kineticjs.global.Kinetic

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.kineticjs.Kinetic.IContainer
import typings.kineticjs.Kinetic.IGroup
import typings.kineticjs.Kinetic.ObjectOptionsConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Kinetic.Group")
@js.native
class Group () extends IContainer {
  def this(config: ObjectOptionsConfig) = this()
}

@JSGlobal("Kinetic.Group")
@js.native
object Group
  extends Instantiable0[IGroup]
     with Instantiable1[/* config */ ObjectOptionsConfig, IGroup]

