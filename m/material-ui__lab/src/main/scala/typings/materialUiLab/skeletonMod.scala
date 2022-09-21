package typings.materialUiLab

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiLab.materialUiLabStrings.span
import typings.materialUiLab.skeletonSkeletonMod.SkeletonTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Skeleton](https://mui.com/components/skeleton/)
    *
    * API:
    *
    * - [Skeleton API](https://mui.com/api/skeleton/)
    */
  @JSImport("@material-ui/lab/Skeleton", JSImport.Default)
  @js.native
  val default: OverridableComponent[SkeletonTypeMap[js.Object, span]] = js.native
  
  type _To = OverridableComponent[SkeletonTypeMap[js.Object, span]]
  
  /* This means you don't have to write `default`, but can instead just say `skeletonMod.foo` */
  override def _to: OverridableComponent[SkeletonTypeMap[js.Object, span]] = default
}
