package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.ClassKeyTableSortLabelClassKeyDefaultComponentD
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableSortLabelTableSortLabelMod extends Shortcut {
  
  /**
    * A button based label for placing inside `TableCell` for column sorting.
    * Demos:
    *
    * - [Tables](https://mui.com/components/tables/)
    *
    * API:
    *
    * - [TableSortLabel API](https://mui.com/api/table-sort-label/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/core/TableSortLabel/TableSortLabel", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[TableSortLabelTypeMap[js.Object, "span"]] = js.native
  
  object TableSortLabelClassKey {
    
    inline def active: "active" = "active".asInstanceOf["active"]
    
    inline def icon: "icon" = "icon".asInstanceOf["icon"]
    
    inline def iconDirectionAsc: "iconDirectionAsc" = "iconDirectionAsc".asInstanceOf["iconDirectionAsc"]
    
    inline def iconDirectionDesc: "iconDirectionDesc" = "iconDirectionDesc".asInstanceOf["iconDirectionDesc"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
  }
  type TableSortLabelClassKey = "root" | "active" | "icon" | "iconDirectionDesc" | "iconDirectionAsc"
  
  type TableSortLabelProps[D /* <: ElementType[Any] */, P] = OverrideProps[TableSortLabelTypeMap[P, D], D]
  
  type TableSortLabelTypeMap[P, D /* <: ElementType[Any] */] = ExtendButtonBaseTypeMap[ClassKeyTableSortLabelClassKeyDefaultComponentD[P, D]]
  
  type _To = ExtendButtonBase[TableSortLabelTypeMap[js.Object, "span"]]
  
  /* This means you don't have to write `default`, but can instead just say `tableSortLabelTableSortLabelMod.foo` */
  override def _to: ExtendButtonBase[TableSortLabelTypeMap[js.Object, "span"]] = default
}
