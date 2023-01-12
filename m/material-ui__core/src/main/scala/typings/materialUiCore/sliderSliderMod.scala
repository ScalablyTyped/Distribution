package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.Arialabel
import typings.materialUiCore.materialUiCoreStrings.span
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
  val default: OverridableComponent[SliderTypeMap[js.Object, span]] = js.native
  
  trait Mark extends StObject {
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var value: Double
  }
  object Mark {
    
    inline def apply(value: Double): Mark = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mark]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mark] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.colorPrimary
    - typings.materialUiCore.materialUiCoreStrings.colorSecondary
    - typings.materialUiCore.materialUiCoreStrings.marked
    - typings.materialUiCore.materialUiCoreStrings.vertical
    - typings.materialUiCore.materialUiCoreStrings.disabled
    - typings.materialUiCore.materialUiCoreStrings.rail
    - typings.materialUiCore.materialUiCoreStrings.track
    - typings.materialUiCore.materialUiCoreStrings.trackFalse
    - typings.materialUiCore.materialUiCoreStrings.trackInverted
    - typings.materialUiCore.materialUiCoreStrings.thumb
    - typings.materialUiCore.materialUiCoreStrings.thumbColorPrimary
    - typings.materialUiCore.materialUiCoreStrings.thumbColorSecondary
    - typings.materialUiCore.materialUiCoreStrings.active
    - typings.materialUiCore.materialUiCoreStrings.focusVisible
    - typings.materialUiCore.materialUiCoreStrings.valueLabel
    - typings.materialUiCore.materialUiCoreStrings.mark
    - typings.materialUiCore.materialUiCoreStrings.markActive
    - typings.materialUiCore.materialUiCoreStrings.markLabel
    - typings.materialUiCore.materialUiCoreStrings.markLabelActive
  */
  trait SliderClassKey extends StObject
  object SliderClassKey {
    
    inline def active: typings.materialUiCore.materialUiCoreStrings.active = "active".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.active]
    
    inline def colorPrimary: typings.materialUiCore.materialUiCoreStrings.colorPrimary = "colorPrimary".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.colorPrimary]
    
    inline def colorSecondary: typings.materialUiCore.materialUiCoreStrings.colorSecondary = "colorSecondary".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.colorSecondary]
    
    inline def disabled: typings.materialUiCore.materialUiCoreStrings.disabled = "disabled".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.disabled]
    
    inline def focusVisible: typings.materialUiCore.materialUiCoreStrings.focusVisible = "focusVisible".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.focusVisible]
    
    inline def mark: typings.materialUiCore.materialUiCoreStrings.mark = "mark".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.mark]
    
    inline def markActive: typings.materialUiCore.materialUiCoreStrings.markActive = "markActive".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.markActive]
    
    inline def markLabel: typings.materialUiCore.materialUiCoreStrings.markLabel = "markLabel".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.markLabel]
    
    inline def markLabelActive: typings.materialUiCore.materialUiCoreStrings.markLabelActive = "markLabelActive".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.markLabelActive]
    
    inline def marked: typings.materialUiCore.materialUiCoreStrings.marked = "marked".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.marked]
    
    inline def rail: typings.materialUiCore.materialUiCoreStrings.rail = "rail".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.rail]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
    
    inline def thumb: typings.materialUiCore.materialUiCoreStrings.thumb = "thumb".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.thumb]
    
    inline def thumbColorPrimary: typings.materialUiCore.materialUiCoreStrings.thumbColorPrimary = "thumbColorPrimary".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.thumbColorPrimary]
    
    inline def thumbColorSecondary: typings.materialUiCore.materialUiCoreStrings.thumbColorSecondary = "thumbColorSecondary".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.thumbColorSecondary]
    
    inline def track: typings.materialUiCore.materialUiCoreStrings.track = "track".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.track]
    
    inline def trackFalse: typings.materialUiCore.materialUiCoreStrings.trackFalse = "trackFalse".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.trackFalse]
    
    inline def trackInverted: typings.materialUiCore.materialUiCoreStrings.trackInverted = "trackInverted".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.trackInverted]
    
    inline def valueLabel: typings.materialUiCore.materialUiCoreStrings.valueLabel = "valueLabel".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.valueLabel]
    
    inline def vertical: typings.materialUiCore.materialUiCoreStrings.vertical = "vertical".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.vertical]
  }
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SliderTypeMap[?, ?], P, D /* <: ElementType[Any] */] (val x: Self & (SliderTypeMap[P, D])) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueLabelProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[SliderTypeMap[js.Object, span]]
  
  /* This means you don't have to write `default`, but can instead just say `sliderSliderMod.foo` */
  override def _to: OverridableComponent[SliderTypeMap[js.Object, span]] = default
}
