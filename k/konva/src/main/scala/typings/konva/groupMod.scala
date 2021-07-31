package typings.konva

import typings.konva.containerMod.Container
import typings.konva.containerMod.ContainerConfig
import typings.konva.shapeMod.Shape
import typings.konva.shapeMod.ShapeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupMod {
  
  @JSImport("konva/types/Group", "Group")
  @js.native
  class Group () extends Container[Group | Shape[ShapeConfig]] {
    def this(config: ContainerConfig) = this()
  }
}
