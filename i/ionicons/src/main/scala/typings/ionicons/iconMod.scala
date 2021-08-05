package typings.ionicons

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconMod {
  
  @JSImport("ionicons/dist/types/components/icon/icon", "Icon")
  @js.native
  class Icon () extends StObject {
    
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
    
    def connectedCallback(): Unit = js.native
    
    def disconnectedCallback(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    /**
      * Specifies whether the icon should horizontally flip when `dir` is `"rtl"`.
      */
    var flipRtl: js.UndefOr[Boolean] = js.native
    
    /**
      * A combination of both `name` and `src`. If a `src` url is detected
      * it will set the `src` property. Otherwise it assumes it's a built-in named
      * SVG and set the `name` property.
      */
    var icon: js.UndefOr[js.Any] = js.native
    
    /* private */ var io: js.Any = js.native
    
    /**
      * Specifies which icon to use on `ios` mode.
      */
    var ios: js.UndefOr[String] = js.native
    
    /* private */ var isVisible: js.Any = js.native
    
    /**
      * If enabled, ion-icon will be loaded lazily when it's visible in the viewport.
      * Default, `false`.
      */
    var `lazy`: Boolean = js.native
    
    def loadIcon(): Unit = js.native
    
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
    
    def render(): js.Any = js.native
    
    /**
      * When set to `false`, SVG content that is HTTP fetched will not be checked
      * if the response SVG content has any `<script>` elements, or any attributes
      * that start with `on`, such as `onclick`.
      * @default true
      */
    var sanitize: Boolean = js.native
    
    /**
      * The size of the icon.
      * Available options are: `"small"` and `"large"`.
      */
    var size: js.UndefOr[String] = js.native
    
    /**
      * Specifies the exact `src` of an SVG file to use.
      */
    var src: js.UndefOr[String] = js.native
    
    /* private */ var svgContent: js.Any = js.native
    
    /* private */ var waitUntilVisible: js.Any = js.native
  }
}
