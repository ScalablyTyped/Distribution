package typings.materialUiCore.anon

import typings.materialUiCore.typographyTypographyMod.TypographyProps
import typings.react.mod.ElementType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Avatar[SubheaderTypographyComponent /* <: ElementType[Any] */, TitleTypographyComponent /* <: ElementType[Any] */] extends StObject {
  
  /**
    * The action to display in the card header.
    */
  var action: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * The Avatar for the Card Header.
    */
  var avatar: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * If `true`, `subheader` and `title` won't be wrapped by a Typography component.
    * This can be useful to render an alternative Typography variant by wrapping
    * the `title` text, and optional `subheader` text
    * with the Typography component.
    */
  var disableTypography: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The content of the component.
    */
  var subheader: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * These props will be forwarded to the subheader
    * (as long as disableTypography is not `true`).
    */
  var subheaderTypographyProps: js.UndefOr[
    TypographyProps[SubheaderTypographyComponent, Component[SubheaderTypographyComponent]]
  ] = js.undefined
  
  /**
    * The content of the Card Title.
    */
  var title: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * These props will be forwarded to the title
    * (as long as disableTypography is not `true`).
    */
  var titleTypographyProps: js.UndefOr[TypographyProps[TitleTypographyComponent, `1`[TitleTypographyComponent]]] = js.undefined
}
object Avatar {
  
  inline def apply[SubheaderTypographyComponent /* <: ElementType[Any] */, TitleTypographyComponent /* <: ElementType[Any] */](): Avatar[SubheaderTypographyComponent, TitleTypographyComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Avatar[SubheaderTypographyComponent, TitleTypographyComponent]]
  }
  
  extension [Self <: Avatar[?, ?], SubheaderTypographyComponent /* <: ElementType[Any] */, TitleTypographyComponent /* <: ElementType[Any] */](x: Self & (Avatar[SubheaderTypographyComponent, TitleTypographyComponent])) {
    
    inline def setAction(value: ReactNode): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAvatar(value: ReactNode): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    
    inline def setDisableTypography(value: Boolean): Self = StObject.set(x, "disableTypography", value.asInstanceOf[js.Any])
    
    inline def setDisableTypographyUndefined: Self = StObject.set(x, "disableTypography", js.undefined)
    
    inline def setSubheader(value: ReactNode): Self = StObject.set(x, "subheader", value.asInstanceOf[js.Any])
    
    inline def setSubheaderTypographyProps(value: TypographyProps[SubheaderTypographyComponent, Component[SubheaderTypographyComponent]]): Self = StObject.set(x, "subheaderTypographyProps", value.asInstanceOf[js.Any])
    
    inline def setSubheaderTypographyPropsUndefined: Self = StObject.set(x, "subheaderTypographyProps", js.undefined)
    
    inline def setSubheaderUndefined: Self = StObject.set(x, "subheader", js.undefined)
    
    inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleTypographyProps(value: TypographyProps[TitleTypographyComponent, `1`[TitleTypographyComponent]]): Self = StObject.set(x, "titleTypographyProps", value.asInstanceOf[js.Any])
    
    inline def setTitleTypographyPropsUndefined: Self = StObject.set(x, "titleTypographyProps", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
