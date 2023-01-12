package typings.materialUi.MaterialUI

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Card {
  
  type Card = Component[CardProps, js.Object, Any]
  
  type CardActions = Component[CardActionsProps, js.Object, Any]
  
  trait CardActionsProps extends StObject {
    
    var actAsExpander: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var expandable: js.UndefOr[Boolean] = js.undefined
    
    var showExpandableButton: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object CardActionsProps {
    
    inline def apply(): CardActionsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardActionsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardActionsProps] (val x: Self) extends AnyVal {
      
      inline def setActAsExpander(value: Boolean): Self = StObject.set(x, "actAsExpander", value.asInstanceOf[js.Any])
      
      inline def setActAsExpanderUndefined: Self = StObject.set(x, "actAsExpander", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      inline def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
      
      inline def setShowExpandableButton(value: Boolean): Self = StObject.set(x, "showExpandableButton", value.asInstanceOf[js.Any])
      
      inline def setShowExpandableButtonUndefined: Self = StObject.set(x, "showExpandableButton", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type CardExpandable = Component[CardExpandableProps, js.Object, Any]
  
  trait CardExpandableProps extends StObject {
    
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    var onExpanding: js.UndefOr[js.Function1[/* isExpanded */ Boolean, Unit]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object CardExpandableProps {
    
    inline def apply(): CardExpandableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardExpandableProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardExpandableProps] (val x: Self) extends AnyVal {
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setOnExpanding(value: /* isExpanded */ Boolean => Unit): Self = StObject.set(x, "onExpanding", js.Any.fromFunction1(value))
      
      inline def setOnExpandingUndefined: Self = StObject.set(x, "onExpanding", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type CardHeader = Component[CardHeaderProps, js.Object, Any]
  
  trait CardHeaderProps extends StObject {
    
    var actAsExpander: js.UndefOr[Boolean] = js.undefined
    
    var avatar: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var closeIcon: js.UndefOr[ReactNode] = js.undefined
    
    var expandable: js.UndefOr[Boolean] = js.undefined
    
    var iconStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var openIcon: js.UndefOr[ReactNode] = js.undefined
    
    var showExpandableButton: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var subtitle: js.UndefOr[ReactNode] = js.undefined
    
    var subtitleColor: js.UndefOr[String] = js.undefined
    
    var subtitleStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var textStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
    
    var titleColor: js.UndefOr[String] = js.undefined
    
    var titleStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object CardHeaderProps {
    
    inline def apply(): CardHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardHeaderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardHeaderProps] (val x: Self) extends AnyVal {
      
      inline def setActAsExpander(value: Boolean): Self = StObject.set(x, "actAsExpander", value.asInstanceOf[js.Any])
      
      inline def setActAsExpanderUndefined: Self = StObject.set(x, "actAsExpander", js.undefined)
      
      inline def setAvatar(value: ReactNode): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCloseIcon(value: ReactNode): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      inline def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
      
      inline def setIconStyle(value: CSSProperties): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      inline def setOpenIcon(value: ReactNode): Self = StObject.set(x, "openIcon", value.asInstanceOf[js.Any])
      
      inline def setOpenIconUndefined: Self = StObject.set(x, "openIcon", js.undefined)
      
      inline def setShowExpandableButton(value: Boolean): Self = StObject.set(x, "showExpandableButton", value.asInstanceOf[js.Any])
      
      inline def setShowExpandableButtonUndefined: Self = StObject.set(x, "showExpandableButton", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleColor(value: String): Self = StObject.set(x, "subtitleColor", value.asInstanceOf[js.Any])
      
      inline def setSubtitleColorUndefined: Self = StObject.set(x, "subtitleColor", js.undefined)
      
      inline def setSubtitleStyle(value: CSSProperties): Self = StObject.set(x, "subtitleStyle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleStyleUndefined: Self = StObject.set(x, "subtitleStyle", js.undefined)
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTextStyle(value: CSSProperties): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleColor(value: String): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
      
      inline def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
      
      inline def setTitleStyle(value: CSSProperties): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
      
      inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type CardMedia = Component[CardMediaProps, js.Object, Any]
  
  trait CardMediaProps extends StObject {
    
    var actAsExpander: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var expandable: js.UndefOr[Boolean] = js.undefined
    
    var mediaStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var overlay: js.UndefOr[ReactNode] = js.undefined
    
    var overlayContainerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var overlayContentStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object CardMediaProps {
    
    inline def apply(): CardMediaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardMediaProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardMediaProps] (val x: Self) extends AnyVal {
      
      inline def setActAsExpander(value: Boolean): Self = StObject.set(x, "actAsExpander", value.asInstanceOf[js.Any])
      
      inline def setActAsExpanderUndefined: Self = StObject.set(x, "actAsExpander", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      inline def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
      
      inline def setMediaStyle(value: CSSProperties): Self = StObject.set(x, "mediaStyle", value.asInstanceOf[js.Any])
      
      inline def setMediaStyleUndefined: Self = StObject.set(x, "mediaStyle", js.undefined)
      
      inline def setOverlay(value: ReactNode): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayContainerStyle(value: CSSProperties): Self = StObject.set(x, "overlayContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setOverlayContainerStyleUndefined: Self = StObject.set(x, "overlayContainerStyle", js.undefined)
      
      inline def setOverlayContentStyle(value: CSSProperties): Self = StObject.set(x, "overlayContentStyle", value.asInstanceOf[js.Any])
      
      inline def setOverlayContentStyleUndefined: Self = StObject.set(x, "overlayContentStyle", js.undefined)
      
      inline def setOverlayStyle(value: CSSProperties): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      inline def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait CardProps extends StObject {
    
    var actAsExpander: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var containerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var expandable: js.UndefOr[Boolean] = js.undefined
    
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    var initiallyExpanded: js.UndefOr[Boolean] = js.undefined
    
    var onExpandChange: js.UndefOr[js.Function1[/* isExpanded */ Boolean, Unit]] = js.undefined
    
    var showExpandableButton: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object CardProps {
    
    inline def apply(): CardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardProps] (val x: Self) extends AnyVal {
      
      inline def setActAsExpander(value: Boolean): Self = StObject.set(x, "actAsExpander", value.asInstanceOf[js.Any])
      
      inline def setActAsExpanderUndefined: Self = StObject.set(x, "actAsExpander", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContainerStyle(value: CSSProperties): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      inline def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setInitiallyExpanded(value: Boolean): Self = StObject.set(x, "initiallyExpanded", value.asInstanceOf[js.Any])
      
      inline def setInitiallyExpandedUndefined: Self = StObject.set(x, "initiallyExpanded", js.undefined)
      
      inline def setOnExpandChange(value: /* isExpanded */ Boolean => Unit): Self = StObject.set(x, "onExpandChange", js.Any.fromFunction1(value))
      
      inline def setOnExpandChangeUndefined: Self = StObject.set(x, "onExpandChange", js.undefined)
      
      inline def setShowExpandableButton(value: Boolean): Self = StObject.set(x, "showExpandableButton", value.asInstanceOf[js.Any])
      
      inline def setShowExpandableButtonUndefined: Self = StObject.set(x, "showExpandableButton", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type CardText = Component[CardTextProps, js.Object, Any]
  
  trait CardTextProps extends StObject {
    
    var actAsExpander: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var expandable: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object CardTextProps {
    
    inline def apply(): CardTextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardTextProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardTextProps] (val x: Self) extends AnyVal {
      
      inline def setActAsExpander(value: Boolean): Self = StObject.set(x, "actAsExpander", value.asInstanceOf[js.Any])
      
      inline def setActAsExpanderUndefined: Self = StObject.set(x, "actAsExpander", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      inline def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type CardTitle = Component[CardTitleProps, js.Object, Any]
  
  trait CardTitleProps extends StObject {
    
    var actAsExpander: js.UndefOr[Boolean] = js.undefined
    
    var expandable: js.UndefOr[Boolean] = js.undefined
    
    var showExpandableButton: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var subtitle: js.UndefOr[ReactNode] = js.undefined
    
    var subtitleColor: js.UndefOr[String] = js.undefined
    
    var subtitleStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
    
    var titleColor: js.UndefOr[String] = js.undefined
    
    var titleStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object CardTitleProps {
    
    inline def apply(): CardTitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardTitleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardTitleProps] (val x: Self) extends AnyVal {
      
      inline def setActAsExpander(value: Boolean): Self = StObject.set(x, "actAsExpander", value.asInstanceOf[js.Any])
      
      inline def setActAsExpanderUndefined: Self = StObject.set(x, "actAsExpander", js.undefined)
      
      inline def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      inline def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
      
      inline def setShowExpandableButton(value: Boolean): Self = StObject.set(x, "showExpandableButton", value.asInstanceOf[js.Any])
      
      inline def setShowExpandableButtonUndefined: Self = StObject.set(x, "showExpandableButton", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleColor(value: String): Self = StObject.set(x, "subtitleColor", value.asInstanceOf[js.Any])
      
      inline def setSubtitleColorUndefined: Self = StObject.set(x, "subtitleColor", js.undefined)
      
      inline def setSubtitleStyle(value: CSSProperties): Self = StObject.set(x, "subtitleStyle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleStyleUndefined: Self = StObject.set(x, "subtitleStyle", js.undefined)
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleColor(value: String): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
      
      inline def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
      
      inline def setTitleStyle(value: CSSProperties): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
      
      inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
