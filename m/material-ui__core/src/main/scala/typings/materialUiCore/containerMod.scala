package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.containerContainerMod.ContainerTypeMap
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Container](https://mui.com/components/container/)
    *
    * API:
    *
    * - [Container API](https://mui.com/api/container/)
    */
  @JSImport("@material-ui/core/Container", JSImport.Default)
  @js.native
  val default: OverridableComponent[ContainerTypeMap[js.Object, "div"]] = js.native
  
  type _To = OverridableComponent[ContainerTypeMap[js.Object, "div"]]
  
  /* This means you don't have to write `default`, but can instead just say `containerMod.foo` */
  override def _to: OverridableComponent[ContainerTypeMap[js.Object, "div"]] = default
}
