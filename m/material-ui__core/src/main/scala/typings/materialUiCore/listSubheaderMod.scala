package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.listSubheaderListSubheaderMod.ListSubheaderTypeMap
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listSubheaderMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Lists](https://mui.com/components/lists/)
    *
    * API:
    *
    * - [ListSubheader API](https://mui.com/api/list-subheader/)
    */
  @JSImport("@material-ui/core/ListSubheader", JSImport.Default)
  @js.native
  val default: OverridableComponent[ListSubheaderTypeMap[js.Object, "li"]] = js.native
  
  type _To = OverridableComponent[ListSubheaderTypeMap[js.Object, "li"]]
  
  /* This means you don't have to write `default`, but can instead just say `listSubheaderMod.foo` */
  override def _to: OverridableComponent[ListSubheaderTypeMap[js.Object, "li"]] = default
}
