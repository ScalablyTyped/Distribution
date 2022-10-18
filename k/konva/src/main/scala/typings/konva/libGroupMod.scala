package typings.konva

import typings.konva.libContainerMod.Container
import typings.konva.libContainerMod.ContainerConfig
import typings.konva.libShapeMod.Shape
import typings.konva.libShapeMod.ShapeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGroupMod {
  
  @JSImport("konva/lib/Group", "Group")
  @js.native
  open class Group () extends Container[Group | Shape[ShapeConfig]] {
    def this(config: ContainerConfig) = this()
  }
  
  type GroupConfig = ContainerConfig
}
