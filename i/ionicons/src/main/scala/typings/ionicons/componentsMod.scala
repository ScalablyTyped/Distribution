package typings.ionicons

import typings.ionicons.componentsMod.Components.IonIcon
import typings.ionicons.componentsMod.global.HTMLIonIconElement
import typings.ionicons.stencilPublicRuntimeMod.HTMLStencilElement
import typings.ionicons.stencilPublicRuntimeMod.JSXBase.HTMLAttributes
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  object global {
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("HTMLIonIconElement")
    @js.native
    class HTMLIonIconElementCls () extends HTMLIonIconElement
    
    @js.native
    trait HTMLElementTagNameMap extends StObject {
      
      var `ion-icon`: HTMLIonIconElement = js.native
    }
    object HTMLElementTagNameMap {
      
      @scala.inline
      def apply(`ion-icon`: HTMLIonIconElement): HTMLElementTagNameMap = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("ion-icon")(`ion-icon`.asInstanceOf[js.Any])
        __obj.asInstanceOf[HTMLElementTagNameMap]
      }
      
      @scala.inline
      implicit class HTMLElementTagNameMapMutableBuilder[Self <: HTMLElementTagNameMap] (val x: Self) extends AnyVal {
        
        @scala.inline
        def `setIon-icon`(value: HTMLIonIconElement): Self = StObject.set(x, "ion-icon", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait HTMLIonIconElement
      extends HTMLStencilElement
         with IonIcon {
      
      /* InferMemberOverrides */
      override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
      /* InferMemberOverrides */
      override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
      /* InferMemberOverrides */
      override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
      
      /* InferMemberOverrides */
      override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
      /* InferMemberOverrides */
      override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
      /* InferMemberOverrides */
      override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    }
  }
  
  object Components {
    
    @js.native
    trait IonIcon extends StObject {
      
      /**
        * Set the icon to hidden, respectively `true`, to remove it from the accessibility tree.
        */
      var ariaHidden: js.UndefOr[String] = js.native
      
      /**
        * Specifies the label to use for accessibility. Defaults to the icon name.
        */
      var ariaLabel: js.UndefOr[String] = js.native
      
      /**
        * The color to use for the background of the item.
        */
      var color: js.UndefOr[String] = js.native
      
      /**
        * Specifies whether the icon should horizontally flip when `dir` is `"rtl"`.
        */
      var flipRtl: js.UndefOr[Boolean] = js.native
      
      /**
        * A combination of both `name` and `src`. If a `src` url is detected it will set the `src` property. Otherwise it assumes it's a built-in named SVG and set the `name` property.
        */
      var icon: js.UndefOr[js.Any] = js.native
      
      /**
        * Specifies which icon to use on `ios` mode.
        */
      var ios: js.UndefOr[String] = js.native
      
      /**
        * If enabled, ion-icon will be loaded lazily when it's visible in the viewport. Default, `false`.
        */
      var `lazy`: Boolean = js.native
      
      /**
        * Specifies which icon to use on `md` mode.
        */
      var md: js.UndefOr[String] = js.native
      
      /**
        * The mode determines which platform styles to use.
        */
      var mode: String = js.native
      
      /**
        * Specifies which icon to use from the built-in set of icons.
        */
      var name: js.UndefOr[String] = js.native
      
      /**
        * When set to `false`, SVG content that is HTTP fetched will not be checked if the response SVG content has any `<script>` elements, or any attributes that start with `on`, such as `onclick`.
        * @default true
        */
      var sanitize: Boolean = js.native
      
      /**
        * The size of the icon. Available options are: `"small"` and `"large"`.
        */
      var size: js.UndefOr[String] = js.native
      
      /**
        * Specifies the exact `src` of an SVG file to use.
        */
      var src: js.UndefOr[String] = js.native
    }
    object IonIcon {
      
      @scala.inline
      def apply(`lazy`: Boolean, mode: String, sanitize: Boolean): IonIcon = {
        val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], sanitize = sanitize.asInstanceOf[js.Any])
        __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
        __obj.asInstanceOf[IonIcon]
      }
      
      @scala.inline
      implicit class IonIconMutableBuilder[Self <: IonIcon] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAriaHidden(value: String): Self = StObject.set(x, "ariaHidden", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAriaHiddenUndefined: Self = StObject.set(x, "ariaHidden", js.undefined)
        
        @scala.inline
        def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
        
        @scala.inline
        def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        @scala.inline
        def setFlipRtl(value: Boolean): Self = StObject.set(x, "flipRtl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFlipRtlUndefined: Self = StObject.set(x, "flipRtl", js.undefined)
        
        @scala.inline
        def setIcon(value: js.Any): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        @scala.inline
        def setIos(value: String): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
        
        @scala.inline
        def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMd(value: String): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
        
        @scala.inline
        def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setSanitize(value: Boolean): Self = StObject.set(x, "sanitize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
        
        @scala.inline
        def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      }
    }
  }
  
  object LocalJSX {
    
    @js.native
    trait IntrinsicElements extends StObject {
      
      var `ion-icon`: typings.ionicons.componentsMod.LocalJSX.IonIcon = js.native
    }
    object IntrinsicElements {
      
      @scala.inline
      def apply(`ion-icon`: typings.ionicons.componentsMod.LocalJSX.IonIcon): IntrinsicElements = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("ion-icon")(`ion-icon`.asInstanceOf[js.Any])
        __obj.asInstanceOf[IntrinsicElements]
      }
      
      @scala.inline
      implicit class IntrinsicElementsMutableBuilder[Self <: IntrinsicElements] (val x: Self) extends AnyVal {
        
        @scala.inline
        def `setIon-icon`(value: typings.ionicons.componentsMod.LocalJSX.IonIcon): Self = StObject.set(x, "ion-icon", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait IonIcon extends StObject {
      
      /**
        * Set the icon to hidden, respectively `true`, to remove it from the accessibility tree.
        */
      var ariaHidden: js.UndefOr[String] = js.native
      
      /**
        * Specifies the label to use for accessibility. Defaults to the icon name.
        */
      var ariaLabel: js.UndefOr[String] = js.native
      
      /**
        * The color to use for the background of the item.
        */
      var color: js.UndefOr[String] = js.native
      
      /**
        * Specifies whether the icon should horizontally flip when `dir` is `"rtl"`.
        */
      var flipRtl: js.UndefOr[Boolean] = js.native
      
      /**
        * A combination of both `name` and `src`. If a `src` url is detected it will set the `src` property. Otherwise it assumes it's a built-in named SVG and set the `name` property.
        */
      var icon: js.UndefOr[js.Any] = js.native
      
      /**
        * Specifies which icon to use on `ios` mode.
        */
      var ios: js.UndefOr[String] = js.native
      
      /**
        * If enabled, ion-icon will be loaded lazily when it's visible in the viewport. Default, `false`.
        */
      var `lazy`: js.UndefOr[Boolean] = js.native
      
      /**
        * Specifies which icon to use on `md` mode.
        */
      var md: js.UndefOr[String] = js.native
      
      /**
        * The mode determines which platform styles to use.
        */
      var mode: js.UndefOr[String] = js.native
      
      /**
        * Specifies which icon to use from the built-in set of icons.
        */
      var name: js.UndefOr[String] = js.native
      
      /**
        * When set to `false`, SVG content that is HTTP fetched will not be checked if the response SVG content has any `<script>` elements, or any attributes that start with `on`, such as `onclick`.
        * @default true
        */
      var sanitize: js.UndefOr[Boolean] = js.native
      
      /**
        * The size of the icon. Available options are: `"small"` and `"large"`.
        */
      var size: js.UndefOr[String] = js.native
      
      /**
        * Specifies the exact `src` of an SVG file to use.
        */
      var src: js.UndefOr[String] = js.native
    }
    object IonIcon {
      
      @scala.inline
      def apply(): typings.ionicons.componentsMod.LocalJSX.IonIcon = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.ionicons.componentsMod.LocalJSX.IonIcon]
      }
      
      @scala.inline
      implicit class IonIconMutableBuilder[Self <: typings.ionicons.componentsMod.LocalJSX.IonIcon] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAriaHidden(value: String): Self = StObject.set(x, "ariaHidden", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAriaHiddenUndefined: Self = StObject.set(x, "ariaHidden", js.undefined)
        
        @scala.inline
        def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
        
        @scala.inline
        def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        @scala.inline
        def setFlipRtl(value: Boolean): Self = StObject.set(x, "flipRtl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFlipRtlUndefined: Self = StObject.set(x, "flipRtl", js.undefined)
        
        @scala.inline
        def setIcon(value: js.Any): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        @scala.inline
        def setIos(value: String): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
        
        @scala.inline
        def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
        
        @scala.inline
        def setMd(value: String): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
        
        @scala.inline
        def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setSanitize(value: Boolean): Self = StObject.set(x, "sanitize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
        
        @scala.inline
        def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
        
        @scala.inline
        def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      }
    }
  }
  
  object stencilCoreAugmentingMod {
    
    object JSX {
      
      @js.native
      trait IntrinsicElements extends StObject {
        
        var `ion-icon`: typings.ionicons.componentsMod.LocalJSX.IonIcon with HTMLAttributes[HTMLIonIconElement] = js.native
      }
      object IntrinsicElements {
        
        @scala.inline
        def apply(
          `ion-icon`: typings.ionicons.componentsMod.LocalJSX.IonIcon with HTMLAttributes[HTMLIonIconElement]
        ): IntrinsicElements = {
          val __obj = js.Dynamic.literal()
          __obj.updateDynamic("ion-icon")(`ion-icon`.asInstanceOf[js.Any])
          __obj.asInstanceOf[IntrinsicElements]
        }
        
        @scala.inline
        implicit class IntrinsicElementsMutableBuilder[Self <: IntrinsicElements] (val x: Self) extends AnyVal {
          
          @scala.inline
          def `setIon-icon`(value: typings.ionicons.componentsMod.LocalJSX.IonIcon with HTMLAttributes[HTMLIonIconElement]): Self = StObject.set(x, "ion-icon", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
