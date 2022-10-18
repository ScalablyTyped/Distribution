package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.ClassKeyTableSortLabelClassKeyDefaultComponentD
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import typings.materialUiCore.materialUiCoreStrings.span
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
  val default: ExtendButtonBase[TableSortLabelTypeMap[js.Object, span]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.active
    - typings.materialUiCore.materialUiCoreStrings.icon
    - typings.materialUiCore.materialUiCoreStrings.iconDirectionDesc
    - typings.materialUiCore.materialUiCoreStrings.iconDirectionAsc
  */
  trait TableSortLabelClassKey extends StObject
  object TableSortLabelClassKey {
    
    inline def active: typings.materialUiCore.materialUiCoreStrings.active = "active".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.active]
    
    inline def icon: typings.materialUiCore.materialUiCoreStrings.icon = "icon".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.icon]
    
    inline def iconDirectionAsc: typings.materialUiCore.materialUiCoreStrings.iconDirectionAsc = "iconDirectionAsc".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.iconDirectionAsc]
    
    inline def iconDirectionDesc: typings.materialUiCore.materialUiCoreStrings.iconDirectionDesc = "iconDirectionDesc".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.iconDirectionDesc]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
  }
  
  type TableSortLabelProps[D /* <: ElementType[Any] */, P] = OverrideProps[TableSortLabelTypeMap[P, D], D]
  
  type TableSortLabelTypeMap[P, D /* <: ElementType[Any] */] = ExtendButtonBaseTypeMap[ClassKeyTableSortLabelClassKeyDefaultComponentD[P, D]]
  
  type _To = ExtendButtonBase[TableSortLabelTypeMap[js.Object, span]]
  
  /* This means you don't have to write `default`, but can instead just say `tableSortLabelTableSortLabelMod.foo` */
  override def _to: ExtendButtonBase[TableSortLabelTypeMap[js.Object, span]] = default
}
