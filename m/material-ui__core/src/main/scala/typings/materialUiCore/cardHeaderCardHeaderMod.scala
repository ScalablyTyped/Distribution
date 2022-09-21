package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.Avatar
import typings.materialUiCore.anon.`2`
import typings.materialUiCore.materialUiCoreStrings.div
import typings.materialUiCore.materialUiCoreStrings.span
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardHeaderCardHeaderMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Cards](https://mui.com/components/cards/)
    *
    * API:
    *
    * - [CardHeader API](https://mui.com/api/card-header/)
    */
  @JSImport("@material-ui/core/CardHeader/CardHeader", JSImport.Default)
  @js.native
  val default: OverridableCardHeader = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.avatar
    - typings.materialUiCore.materialUiCoreStrings.action
    - typings.materialUiCore.materialUiCoreStrings.content
    - typings.materialUiCore.materialUiCoreStrings.title
    - typings.materialUiCore.materialUiCoreStrings.subheader
  */
  trait CardHeaderClassKey extends StObject
  object CardHeaderClassKey {
    
    inline def action: typings.materialUiCore.materialUiCoreStrings.action = "action".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.action]
    
    inline def avatar: typings.materialUiCore.materialUiCoreStrings.avatar = "avatar".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.avatar]
    
    inline def content: typings.materialUiCore.materialUiCoreStrings.content = "content".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.content]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
    
    inline def subheader: typings.materialUiCore.materialUiCoreStrings.subheader = "subheader".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.subheader]
    
    inline def title: typings.materialUiCore.materialUiCoreStrings.title = "title".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.title]
  }
  
  type CardHeaderProps[DefaultComponent /* <: ElementType[Any] */, Props, TitleTypographyComponent /* <: ElementType[Any] */, SubheaderTypographyComponent /* <: ElementType[Any] */] = OverrideProps[
    CardHeaderTypeMap[Props, DefaultComponent, TitleTypographyComponent, SubheaderTypographyComponent], 
    DefaultComponent
  ]
  
  type CardHeaderPropsWithComponent[DefaultComponent /* <: ElementType[Any] */, Props, TitleTypographyComponent /* <: ElementType[Any] */, SubheaderTypographyComponent /* <: ElementType[Any] */] = `2`[DefaultComponent] & (CardHeaderProps[DefaultComponent, Props, TitleTypographyComponent, SubheaderTypographyComponent])
  
  trait CardHeaderTypeMap[Props, DefaultComponent /* <: ElementType[Any] */, TitleTypographyComponent /* <: ElementType[Any] */, SubheaderTypographyComponent /* <: ElementType[Any] */] extends StObject {
    
    var classKey: CardHeaderClassKey
    
    var defaultComponent: DefaultComponent
    
    var props: Props & (Avatar[SubheaderTypographyComponent, TitleTypographyComponent])
  }
  object CardHeaderTypeMap {
    
    inline def apply[Props, DefaultComponent /* <: ElementType[Any] */, TitleTypographyComponent /* <: ElementType[Any] */, SubheaderTypographyComponent /* <: ElementType[Any] */](
      classKey: CardHeaderClassKey,
      defaultComponent: DefaultComponent,
      props: Props & (Avatar[SubheaderTypographyComponent, TitleTypographyComponent])
    ): CardHeaderTypeMap[Props, DefaultComponent, TitleTypographyComponent, SubheaderTypographyComponent] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardHeaderTypeMap[Props, DefaultComponent, TitleTypographyComponent, SubheaderTypographyComponent]]
    }
    
    extension [Self <: CardHeaderTypeMap[?, ?, ?, ?], Props, DefaultComponent /* <: ElementType[Any] */, TitleTypographyComponent /* <: ElementType[Any] */, SubheaderTypographyComponent /* <: ElementType[Any] */](x: Self & (CardHeaderTypeMap[Props, DefaultComponent, TitleTypographyComponent, SubheaderTypographyComponent])) {
      
      inline def setClassKey(value: CardHeaderClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: DefaultComponent): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props & (Avatar[SubheaderTypographyComponent, TitleTypographyComponent])): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OverridableCardHeader
    extends StObject
       with OverridableComponent[CardHeaderTypeMap[js.Object, div, span, span]]
  
  type _To = OverridableCardHeader
  
  /* This means you don't have to write `default`, but can instead just say `cardHeaderCardHeaderMod.foo` */
  override def _to: OverridableCardHeader = default
}
