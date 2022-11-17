package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.Clickable
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipChipMod extends Shortcut {
  
  /**
    * Chips represent complex entities in small blocks, such as a contact.
    * Demos:
    *
    * - [Chips](https://mui.com/components/chips/)
    *
    * API:
    *
    * - [Chip API](https://mui.com/api/chip/)
    */
  @JSImport("@material-ui/core/Chip/Chip", JSImport.Default)
  @js.native
  val default: OverridableComponent[ChipTypeMap[js.Object, "div"]] = js.native
  
  object ChipClassKey {
    
    inline def avatar: "avatar" = "avatar".asInstanceOf["avatar"]
    
    inline def avatarColorPrimary: "avatarColorPrimary" = "avatarColorPrimary".asInstanceOf["avatarColorPrimary"]
    
    inline def avatarColorSecondary: "avatarColorSecondary" = "avatarColorSecondary".asInstanceOf["avatarColorSecondary"]
    
    inline def avatarSmall: "avatarSmall" = "avatarSmall".asInstanceOf["avatarSmall"]
    
    inline def clickable: "clickable" = "clickable".asInstanceOf["clickable"]
    
    inline def clickableColorPrimary: "clickableColorPrimary" = "clickableColorPrimary".asInstanceOf["clickableColorPrimary"]
    
    inline def clickableColorSecondary: "clickableColorSecondary" = "clickableColorSecondary".asInstanceOf["clickableColorSecondary"]
    
    inline def colorPrimary: "colorPrimary" = "colorPrimary".asInstanceOf["colorPrimary"]
    
    inline def colorSecondary: "colorSecondary" = "colorSecondary".asInstanceOf["colorSecondary"]
    
    inline def deletable: "deletable" = "deletable".asInstanceOf["deletable"]
    
    inline def deletableColorPrimary: "deletableColorPrimary" = "deletableColorPrimary".asInstanceOf["deletableColorPrimary"]
    
    inline def deletableColorSecondary: "deletableColorSecondary" = "deletableColorSecondary".asInstanceOf["deletableColorSecondary"]
    
    inline def deleteIcon: "deleteIcon" = "deleteIcon".asInstanceOf["deleteIcon"]
    
    inline def deleteIconColorPrimary: "deleteIconColorPrimary" = "deleteIconColorPrimary".asInstanceOf["deleteIconColorPrimary"]
    
    inline def deleteIconColorSecondary: "deleteIconColorSecondary" = "deleteIconColorSecondary".asInstanceOf["deleteIconColorSecondary"]
    
    inline def deleteIconOutlinedColorPrimary: "deleteIconOutlinedColorPrimary" = "deleteIconOutlinedColorPrimary".asInstanceOf["deleteIconOutlinedColorPrimary"]
    
    inline def deleteIconOutlinedColorSecondary: "deleteIconOutlinedColorSecondary" = "deleteIconOutlinedColorSecondary".asInstanceOf["deleteIconOutlinedColorSecondary"]
    
    inline def deleteIconSmall: "deleteIconSmall" = "deleteIconSmall".asInstanceOf["deleteIconSmall"]
    
    inline def disabled: "disabled" = "disabled".asInstanceOf["disabled"]
    
    inline def icon: "icon" = "icon".asInstanceOf["icon"]
    
    inline def iconColorPrimary: "iconColorPrimary" = "iconColorPrimary".asInstanceOf["iconColorPrimary"]
    
    inline def iconColorSecondary: "iconColorSecondary" = "iconColorSecondary".asInstanceOf["iconColorSecondary"]
    
    inline def iconSmall: "iconSmall" = "iconSmall".asInstanceOf["iconSmall"]
    
    inline def label: "label" = "label".asInstanceOf["label"]
    
    inline def labelSmall: "labelSmall" = "labelSmall".asInstanceOf["labelSmall"]
    
    inline def outlined: "outlined" = "outlined".asInstanceOf["outlined"]
    
    inline def outlinedPrimary: "outlinedPrimary" = "outlinedPrimary".asInstanceOf["outlinedPrimary"]
    
    inline def outlinedSecondary: "outlinedSecondary" = "outlinedSecondary".asInstanceOf["outlinedSecondary"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def sizeSmall: "sizeSmall" = "sizeSmall".asInstanceOf["sizeSmall"]
  }
  type ChipClassKey = "root" | "sizeSmall" | "colorPrimary" | "colorSecondary" | "disabled" | "clickable" | "clickableColorPrimary" | "clickableColorSecondary" | "deletable" | "deletableColorPrimary" | "deletableColorSecondary" | "outlined" | "outlinedPrimary" | "outlinedSecondary" | "avatar" | "avatarSmall" | "avatarColorPrimary" | "avatarColorSecondary" | "icon" | "iconSmall" | "iconColorPrimary" | "iconColorSecondary" | "label" | "labelSmall" | "deleteIcon" | "deleteIconSmall" | "deleteIconColorPrimary" | "deleteIconColorSecondary" | "deleteIconOutlinedColorPrimary" | "deleteIconOutlinedColorSecondary"
  
  type ChipProps[D /* <: ElementType[Any] */, P] = OverrideProps[ChipTypeMap[P, D], D]
  
  trait ChipTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: ChipClassKey
    
    var defaultComponent: D
    
    var props: P & Clickable
  }
  object ChipTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: ChipClassKey, defaultComponent: D, props: P & Clickable): ChipTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChipTypeMap[P, D]]
    }
    
    extension [Self <: ChipTypeMap[?, ?], P, D /* <: ElementType[Any] */](x: Self & (ChipTypeMap[P, D])) {
      
      inline def setClassKey(value: ChipClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Clickable): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[ChipTypeMap[js.Object, "div"]]
  
  /* This means you don't have to write `default`, but can instead just say `chipChipMod.foo` */
  override def _to: OverridableComponent[ChipTypeMap[js.Object, "div"]] = default
}
