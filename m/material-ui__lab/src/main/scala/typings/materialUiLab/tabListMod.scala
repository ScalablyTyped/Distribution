package typings.materialUiLab

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.buttonBaseButtonBaseMod.ButtonBaseTypeMap
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiLab.materialUiLabStrings.button
import typings.materialUiLab.tabListTabListMod.TabListTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabListMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Tabs](https://mui.com/components/tabs/)
    *
    * API:
    *
    * - [TabList API](https://mui.com/api/tab-list/)
    * - inherits [Tabs API](https://mui.com/api/tabs/)
    */
  @JSImport("@material-ui/lab/TabList", JSImport.Default)
  @js.native
  val default: OverridableComponent[
    TabListTypeMap[js.Object, ExtendButtonBase[ButtonBaseTypeMap[js.Object, button]]]
  ] = js.native
  
  type _To = OverridableComponent[
    TabListTypeMap[js.Object, ExtendButtonBase[ButtonBaseTypeMap[js.Object, button]]]
  ]
  
  /* This means you don't have to write `default`, but can instead just say `tabListMod.foo` */
  override def _to: OverridableComponent[
    TabListTypeMap[js.Object, ExtendButtonBase[ButtonBaseTypeMap[js.Object, button]]]
  ] = default
}
