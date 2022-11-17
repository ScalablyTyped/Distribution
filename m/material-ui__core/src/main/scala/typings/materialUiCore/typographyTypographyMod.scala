package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.Align
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typographyTypographyMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Breadcrumbs](https://mui.com/components/breadcrumbs/)
    * - [Typography](https://mui.com/components/typography/)
    *
    * API:
    *
    * - [Typography API](https://mui.com/api/typography/)
    */
  @JSImport("@material-ui/core/Typography/Typography", JSImport.Default)
  @js.native
  val default: OverridableComponent[TypographyTypeMap[js.Object, "span"]] = js.native
  
  object TypographyClassKey {
    
    inline def alignCenter: "alignCenter" = "alignCenter".asInstanceOf["alignCenter"]
    
    inline def alignJustify: "alignJustify" = "alignJustify".asInstanceOf["alignJustify"]
    
    inline def alignLeft: "alignLeft" = "alignLeft".asInstanceOf["alignLeft"]
    
    inline def alignRight: "alignRight" = "alignRight".asInstanceOf["alignRight"]
    
    inline def body1: "body1" = "body1".asInstanceOf["body1"]
    
    inline def body2: "body2" = "body2".asInstanceOf["body2"]
    
    inline def button: "button" = "button".asInstanceOf["button"]
    
    inline def caption: "caption" = "caption".asInstanceOf["caption"]
    
    inline def colorError: "colorError" = "colorError".asInstanceOf["colorError"]
    
    inline def colorInherit: "colorInherit" = "colorInherit".asInstanceOf["colorInherit"]
    
    inline def colorPrimary: "colorPrimary" = "colorPrimary".asInstanceOf["colorPrimary"]
    
    inline def colorSecondary: "colorSecondary" = "colorSecondary".asInstanceOf["colorSecondary"]
    
    inline def colorTextPrimary: "colorTextPrimary" = "colorTextPrimary".asInstanceOf["colorTextPrimary"]
    
    inline def colorTextSecondary: "colorTextSecondary" = "colorTextSecondary".asInstanceOf["colorTextSecondary"]
    
    inline def displayBlock: "displayBlock" = "displayBlock".asInstanceOf["displayBlock"]
    
    inline def displayInline: "displayInline" = "displayInline".asInstanceOf["displayInline"]
    
    inline def gutterBottom: "gutterBottom" = "gutterBottom".asInstanceOf["gutterBottom"]
    
    inline def h1: "h1" = "h1".asInstanceOf["h1"]
    
    inline def h2: "h2" = "h2".asInstanceOf["h2"]
    
    inline def h3: "h3" = "h3".asInstanceOf["h3"]
    
    inline def h4: "h4" = "h4".asInstanceOf["h4"]
    
    inline def h5: "h5" = "h5".asInstanceOf["h5"]
    
    inline def h6: "h6" = "h6".asInstanceOf["h6"]
    
    inline def noWrap: "noWrap" = "noWrap".asInstanceOf["noWrap"]
    
    inline def overline: "overline" = "overline".asInstanceOf["overline"]
    
    inline def paragraph: "paragraph" = "paragraph".asInstanceOf["paragraph"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def srOnly: "srOnly" = "srOnly".asInstanceOf["srOnly"]
    
    inline def subtitle1: "subtitle1" = "subtitle1".asInstanceOf["subtitle1"]
    
    inline def subtitle2: "subtitle2" = "subtitle2".asInstanceOf["subtitle2"]
  }
  type TypographyClassKey = "root" | "h1" | "h2" | "h3" | "h4" | "h5" | "h6" | "subtitle1" | "subtitle2" | "body1" | "body2" | "caption" | "button" | "overline" | "srOnly" | "alignLeft" | "alignCenter" | "alignRight" | "alignJustify" | "noWrap" | "gutterBottom" | "paragraph" | "colorInherit" | "colorPrimary" | "colorSecondary" | "colorTextPrimary" | "colorTextSecondary" | "colorError" | "displayInline" | "displayBlock"
  
  type TypographyProps[D /* <: ElementType[Any] */, P] = OverrideProps[TypographyTypeMap[P, D], D]
  
  trait TypographyTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: TypographyClassKey
    
    var defaultComponent: D
    
    var props: P & Align
  }
  object TypographyTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: TypographyClassKey, defaultComponent: D, props: P & Align): TypographyTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypographyTypeMap[P, D]]
    }
    
    extension [Self <: TypographyTypeMap[?, ?], P, D /* <: ElementType[Any] */](x: Self & (TypographyTypeMap[P, D])) {
      
      inline def setClassKey(value: TypographyClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Align): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  object Variant {
    
    inline def body1: "body1" = "body1".asInstanceOf["body1"]
    
    inline def body2: "body2" = "body2".asInstanceOf["body2"]
    
    inline def button: "button" = "button".asInstanceOf["button"]
    
    inline def caption: "caption" = "caption".asInstanceOf["caption"]
    
    inline def h1: "h1" = "h1".asInstanceOf["h1"]
    
    inline def h2: "h2" = "h2".asInstanceOf["h2"]
    
    inline def h3: "h3" = "h3".asInstanceOf["h3"]
    
    inline def h4: "h4" = "h4".asInstanceOf["h4"]
    
    inline def h5: "h5" = "h5".asInstanceOf["h5"]
    
    inline def h6: "h6" = "h6".asInstanceOf["h6"]
    
    inline def overline: "overline" = "overline".asInstanceOf["overline"]
    
    inline def srOnly: "srOnly" = "srOnly".asInstanceOf["srOnly"]
    
    inline def subtitle1: "subtitle1" = "subtitle1".asInstanceOf["subtitle1"]
    
    inline def subtitle2: "subtitle2" = "subtitle2".asInstanceOf["subtitle2"]
  }
  type Variant = "srOnly" | "h1" | "h2" | "h3" | "h4" | "h5" | "h6" | "subtitle1" | "subtitle2" | "body1" | "body2" | "caption" | "button" | "overline"
  
  type _To = OverridableComponent[TypographyTypeMap[js.Object, "span"]]
  
  /* This means you don't have to write `default`, but can instead just say `typographyTypographyMod.foo` */
  override def _to: OverridableComponent[TypographyTypeMap[js.Object, "span"]] = default
}
