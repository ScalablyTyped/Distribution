package typings.materialUi.MaterialUI

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Card {
  
  type Card = Component[CardProps, js.Object, js.Any]
  
  type CardActions = Component[CardActionsProps, js.Object, js.Any]
  
  @js.native
  trait CardActionsProps extends StObject {
    
    var actAsExpander: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var expandable: js.UndefOr[Boolean] = js.native
    
    var showExpandableButton: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object CardActionsProps {
    
    @scala.inline
    def apply(): CardActionsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardActionsProps]
    }
    
    @scala.inline
    implicit class CardActionsPropsMutableBuilder[Self <: CardActionsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActAsExpander(value: Boolean): Self = StObject.set(x, "actAsExpander", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActAsExpanderUndefined: Self = StObject.set(x, "actAsExpander", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
      
      @scala.inline
      def setShowExpandableButton(value: Boolean): Self = StObject.set(x, "showExpandableButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowExpandableButtonUndefined: Self = StObject.set(x, "showExpandableButton", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type CardExpandable = Component[CardExpandableProps, js.Object, js.Any]
  
  @js.native
  trait CardExpandableProps extends StObject {
    
    var expanded: js.UndefOr[Boolean] = js.native
    
    var onExpanding: js.UndefOr[js.Function1[/* isExpanded */ Boolean, Unit]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object CardExpandableProps {
    
    @scala.inline
    def apply(): CardExpandableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardExpandableProps]
    }
    
    @scala.inline
    implicit class CardExpandablePropsMutableBuilder[Self <: CardExpandableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      @scala.inline
      def setOnExpanding(value: /* isExpanded */ Boolean => Unit): Self = StObject.set(x, "onExpanding", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExpandingUndefined: Self = StObject.set(x, "onExpanding", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type CardHeader = Component[CardHeaderProps, js.Object, js.Any]
  
  @js.native
  trait CardHeaderProps extends StObject {
    
    var actAsExpander: js.UndefOr[Boolean] = js.native
    
    var avatar: js.UndefOr[ReactNode] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var closeIcon: js.UndefOr[ReactNode] = js.native
    
    var expandable: js.UndefOr[Boolean] = js.native
    
    var iconStyle: js.UndefOr[CSSProperties] = js.native
    
    var openIcon: js.UndefOr[ReactNode] = js.native
    
    var showExpandableButton: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var subtitle: js.UndefOr[ReactNode] = js.native
    
    var subtitleColor: js.UndefOr[String] = js.native
    
    var subtitleStyle: js.UndefOr[CSSProperties] = js.native
    
    var textStyle: js.UndefOr[CSSProperties] = js.native
    
    var title: js.UndefOr[ReactNode] = js.native
    
    var titleColor: js.UndefOr[String] = js.native
    
    var titleStyle: js.UndefOr[CSSProperties] = js.native
  }
  object CardHeaderProps {
    
    @scala.inline
    def apply(): CardHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardHeaderProps]
    }
    
    @scala.inline
    implicit class CardHeaderPropsMutableBuilder[Self <: CardHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActAsExpander(value: Boolean): Self = StObject.set(x, "actAsExpander", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActAsExpanderUndefined: Self = StObject.set(x, "actAsExpander", js.undefined)
      
      @scala.inline
      def setAvatar(value: ReactNode): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCloseIcon(value: ReactNode): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      @scala.inline
      def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
      
      @scala.inline
      def setIconStyle(value: CSSProperties): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      @scala.inline
      def setOpenIcon(value: ReactNode): Self = StObject.set(x, "openIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenIconUndefined: Self = StObject.set(x, "openIcon", js.undefined)
      
      @scala.inline
      def setShowExpandableButton(value: Boolean): Self = StObject.set(x, "showExpandableButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowExpandableButtonUndefined: Self = StObject.set(x, "showExpandableButton", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleColor(value: String): Self = StObject.set(x, "subtitleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleColorUndefined: Self = StObject.set(x, "subtitleColor", js.undefined)
      
      @scala.inline
      def setSubtitleStyle(value: CSSProperties): Self = StObject.set(x, "subtitleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleStyleUndefined: Self = StObject.set(x, "subtitleStyle", js.undefined)
      
      @scala.inline
      def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      @scala.inline
      def setTextStyle(value: CSSProperties): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleColor(value: String): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
      
      @scala.inline
      def setTitleStyle(value: CSSProperties): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type CardMedia = Component[CardMediaProps, js.Object, js.Any]
  
  @js.native
  trait CardMediaProps extends StObject {
    
    var actAsExpander: js.UndefOr[Boolean] = js.native
    
    var expandable: js.UndefOr[Boolean] = js.native
    
    var mediaStyle: js.UndefOr[CSSProperties] = js.native
    
    var overlay: js.UndefOr[ReactNode] = js.native
    
    var overlayContainerStyle: js.UndefOr[CSSProperties] = js.native
    
    var overlayContentStyle: js.UndefOr[CSSProperties] = js.native
    
    var overlayStyle: js.UndefOr[CSSProperties] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object CardMediaProps {
    
    @scala.inline
    def apply(): CardMediaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardMediaProps]
    }
    
    @scala.inline
    implicit class CardMediaPropsMutableBuilder[Self <: CardMediaProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActAsExpander(value: Boolean): Self = StObject.set(x, "actAsExpander", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActAsExpanderUndefined: Self = StObject.set(x, "actAsExpander", js.undefined)
      
      @scala.inline
      def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
      
      @scala.inline
      def setMediaStyle(value: CSSProperties): Self = StObject.set(x, "mediaStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaStyleUndefined: Self = StObject.set(x, "mediaStyle", js.undefined)
      
      @scala.inline
      def setOverlay(value: ReactNode): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayContainerStyle(value: CSSProperties): Self = StObject.set(x, "overlayContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayContainerStyleUndefined: Self = StObject.set(x, "overlayContainerStyle", js.undefined)
      
      @scala.inline
      def setOverlayContentStyle(value: CSSProperties): Self = StObject.set(x, "overlayContentStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayContentStyleUndefined: Self = StObject.set(x, "overlayContentStyle", js.undefined)
      
      @scala.inline
      def setOverlayStyle(value: CSSProperties): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait CardProps extends StObject {
    
    var actAsExpander: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var containerStyle: js.UndefOr[CSSProperties] = js.native
    
    var expandable: js.UndefOr[Boolean] = js.native
    
    var expanded: js.UndefOr[Boolean] = js.native
    
    var initiallyExpanded: js.UndefOr[Boolean] = js.native
    
    var onExpandChange: js.UndefOr[js.Function1[/* isExpanded */ Boolean, Unit]] = js.native
    
    var showExpandableButton: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object CardProps {
    
    @scala.inline
    def apply(): CardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardProps]
    }
    
    @scala.inline
    implicit class CardPropsMutableBuilder[Self <: CardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActAsExpander(value: Boolean): Self = StObject.set(x, "actAsExpander", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActAsExpanderUndefined: Self = StObject.set(x, "actAsExpander", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContainerStyle(value: CSSProperties): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      @scala.inline
      def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      @scala.inline
      def setInitiallyExpanded(value: Boolean): Self = StObject.set(x, "initiallyExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitiallyExpandedUndefined: Self = StObject.set(x, "initiallyExpanded", js.undefined)
      
      @scala.inline
      def setOnExpandChange(value: /* isExpanded */ Boolean => Unit): Self = StObject.set(x, "onExpandChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExpandChangeUndefined: Self = StObject.set(x, "onExpandChange", js.undefined)
      
      @scala.inline
      def setShowExpandableButton(value: Boolean): Self = StObject.set(x, "showExpandableButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowExpandableButtonUndefined: Self = StObject.set(x, "showExpandableButton", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type CardText = Component[CardTextProps, js.Object, js.Any]
  
  @js.native
  trait CardTextProps extends StObject {
    
    var actAsExpander: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var expandable: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object CardTextProps {
    
    @scala.inline
    def apply(): CardTextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardTextProps]
    }
    
    @scala.inline
    implicit class CardTextPropsMutableBuilder[Self <: CardTextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActAsExpander(value: Boolean): Self = StObject.set(x, "actAsExpander", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActAsExpanderUndefined: Self = StObject.set(x, "actAsExpander", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type CardTitle = Component[CardTitleProps, js.Object, js.Any]
  
  @js.native
  trait CardTitleProps extends StObject {
    
    var actAsExpander: js.UndefOr[Boolean] = js.native
    
    var expandable: js.UndefOr[Boolean] = js.native
    
    var showExpandableButton: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var subtitle: js.UndefOr[ReactNode] = js.native
    
    var subtitleColor: js.UndefOr[String] = js.native
    
    var subtitleStyle: js.UndefOr[CSSProperties] = js.native
    
    var title: js.UndefOr[ReactNode] = js.native
    
    var titleColor: js.UndefOr[String] = js.native
    
    var titleStyle: js.UndefOr[CSSProperties] = js.native
  }
  object CardTitleProps {
    
    @scala.inline
    def apply(): CardTitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardTitleProps]
    }
    
    @scala.inline
    implicit class CardTitlePropsMutableBuilder[Self <: CardTitleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActAsExpander(value: Boolean): Self = StObject.set(x, "actAsExpander", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActAsExpanderUndefined: Self = StObject.set(x, "actAsExpander", js.undefined)
      
      @scala.inline
      def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
      
      @scala.inline
      def setShowExpandableButton(value: Boolean): Self = StObject.set(x, "showExpandableButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowExpandableButtonUndefined: Self = StObject.set(x, "showExpandableButton", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleColor(value: String): Self = StObject.set(x, "subtitleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleColorUndefined: Self = StObject.set(x, "subtitleColor", js.undefined)
      
      @scala.inline
      def setSubtitleStyle(value: CSSProperties): Self = StObject.set(x, "subtitleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleStyleUndefined: Self = StObject.set(x, "subtitleStyle", js.undefined)
      
      @scala.inline
      def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleColor(value: String): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
      
      @scala.inline
      def setTitleStyle(value: CSSProperties): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
