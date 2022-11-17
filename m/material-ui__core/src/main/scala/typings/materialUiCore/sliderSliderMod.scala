package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.Arialabel
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderSliderMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Slider](https://mui.com/components/slider/)
    *
    * API:
    *
    * - [Slider API](https://mui.com/api/slider/)
    */
  @JSImport("@material-ui/core/Slider/Slider", JSImport.Default)
  @js.native
  val default: OverridableComponent[SliderTypeMap[js.Object, "span"]] = js.native
  
  trait Mark extends StObject {
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var value: Double
  }
  object Mark {
    
    inline def apply(value: Double): Mark = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mark]
    }
    
    extension [Self <: Mark](x: Self) {
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  object SliderClassKey {
    
    inline def active: "active" = "active".asInstanceOf["active"]
    
    inline def colorPrimary: "colorPrimary" = "colorPrimary".asInstanceOf["colorPrimary"]
    
    inline def colorSecondary: "colorSecondary" = "colorSecondary".asInstanceOf["colorSecondary"]
    
    inline def disabled: "disabled" = "disabled".asInstanceOf["disabled"]
    
    inline def focusVisible: "focusVisible" = "focusVisible".asInstanceOf["focusVisible"]
    
    inline def mark: "mark" = "mark".asInstanceOf["mark"]
    
    inline def markActive: "markActive" = "markActive".asInstanceOf["markActive"]
    
    inline def markLabel: "markLabel" = "markLabel".asInstanceOf["markLabel"]
    
    inline def markLabelActive: "markLabelActive" = "markLabelActive".asInstanceOf["markLabelActive"]
    
    inline def marked: "marked" = "marked".asInstanceOf["marked"]
    
    inline def rail: "rail" = "rail".asInstanceOf["rail"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def thumb: "thumb" = "thumb".asInstanceOf["thumb"]
    
    inline def thumbColorPrimary: "thumbColorPrimary" = "thumbColorPrimary".asInstanceOf["thumbColorPrimary"]
    
    inline def thumbColorSecondary: "thumbColorSecondary" = "thumbColorSecondary".asInstanceOf["thumbColorSecondary"]
    
    inline def track: "track" = "track".asInstanceOf["track"]
    
    inline def trackFalse: "trackFalse" = "trackFalse".asInstanceOf["trackFalse"]
    
    inline def trackInverted: "trackInverted" = "trackInverted".asInstanceOf["trackInverted"]
    
    inline def valueLabel: "valueLabel" = "valueLabel".asInstanceOf["valueLabel"]
    
    inline def vertical: "vertical" = "vertical".asInstanceOf["vertical"]
  }
  type SliderClassKey = "root" | "colorPrimary" | "colorSecondary" | "marked" | "vertical" | "disabled" | "rail" | "track" | "trackFalse" | "trackInverted" | "thumb" | "thumbColorPrimary" | "thumbColorSecondary" | "active" | "focusVisible" | "valueLabel" | "mark" | "markActive" | "markLabel" | "markLabelActive"
  
  type SliderProps[D /* <: ElementType[Any] */, P] = OverrideProps[SliderTypeMap[P, D], D]
  
  trait SliderTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: SliderClassKey
    
    var defaultComponent: D
    
    var props: P & Arialabel
  }
  object SliderTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: SliderClassKey, defaultComponent: D, props: P & Arialabel): SliderTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderTypeMap[P, D]]
    }
    
    extension [Self <: SliderTypeMap[?, ?], P, D /* <: ElementType[Any] */](x: Self & (SliderTypeMap[P, D])) {
      
      inline def setClassKey(value: SliderClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Arialabel): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValueLabelProps
    extends StObject
       with HTMLAttributes[HTMLSpanElement] {
    
    @JSName("children")
    var children_ValueLabelProps: ReactElement
    
    var open: Boolean
    
    var value: Double
  }
  object ValueLabelProps {
    
    inline def apply(children: ReactElement, open: Boolean, value: Double): ValueLabelProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueLabelProps]
    }
    
    extension [Self <: ValueLabelProps](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[SliderTypeMap[js.Object, "span"]]
  
  /* This means you don't have to write `default`, but can instead just say `sliderSliderMod.foo` */
  override def _to: OverridableComponent[SliderTypeMap[js.Object, "span"]] = default
}
