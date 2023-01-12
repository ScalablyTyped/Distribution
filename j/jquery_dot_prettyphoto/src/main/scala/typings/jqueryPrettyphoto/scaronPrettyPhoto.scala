package typings.jqueryPrettyphoto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scaronPrettyPhoto {
  
  /**
    * Pretty photo settings
    */
  trait PrettyPhotoSettings extends StObject {
    
    var ajaxcallback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Allow the user to expand a resized image. true/false
      * @default true
      */
    var allow_expand: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Resize the photos bigger than viewport. true/false
      * @default true
      */
    var allow_resize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * fast/slow/normal
      * @default 'fast'
      */
    var animation_speed: js.UndefOr[String] = js.undefined
    
    /**
      * Automatically start videos: True/False
      * @default true
      */
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    /**
      * true/false
      * @default false
      */
    var autoplay_slideshow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Called when prettyPhoto is closed
      * @default function () { }
      */
    var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Called everytime an item is shown/changed
      * @default function () { }
      */
    var changepicturecallback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * The separator for the gallery counter 1 "of" 2
      * @default '/'
      */
    var counter_separator_label: js.UndefOr[String] = js.undefined
    
    /**
      * @default ''
      */
    var custom_markup: js.UndefOr[String] = js.undefined
    
    /**
      * Allow prettyPhoto to update the url to enable deeplinking.
      * @default true
      */
    var deeplinking: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Pixels
      * @default 344
      */
    var default_height: js.UndefOr[Double] = js.undefined
    
    /**
      * Pixels
      * @default 500
      */
    var default_width: js.UndefOr[Double] = js.undefined
    
    /**
      * Markup for flash
      * @default '<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" width="{width}" height="{height}"><param name="wmode" value="{wmode}" /><param name="allowfullscreen" value="true" /><param name="allowscriptaccess" value="always" /><param name="movie" value="{path}" /><embed src="{path}" type="application/x-shockwave-flash" allowfullscreen="true" allowscriptaccess="always" width="{width}" height="{height}" wmode="{wmode}"></embed></object>'
      */
    var flash_markup: js.UndefOr[String] = js.undefined
    
    /**
      * Markup for pretty photo gallery
      * @default omitted for brevity
      */
    var gallery_markup: js.UndefOr[String] = js.undefined
    
    /**
      * Hides all the flash object on a page, set to TRUE if flash appears over prettyPhoto
      * @default false
      */
    var hideflash: js.UndefOr[Boolean] = js.undefined
    
    /**
      * the attribute tag to use for prettyPhoto hooks.  For HTML5, use "data-rel" or similar.
      * @default 'rel'
      */
    var hook: js.UndefOr[String] = js.undefined
    
    /**
      * The padding on each side of the picture
      * @default 20
      */
    var horizontal_padding: js.UndefOr[Double] = js.undefined
    
    /**
      * @default true
      */
    var ie6_fallback: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Markup for iframe
      * @default '<iframe src ="{path}" width="{width}" height="{height}" frameborder="no"></iframe>'
      */
    var iframe_markup: js.UndefOr[String] = js.undefined
    
    /**
      * Markup for image
      * @default '<img id="fullResImage" src="{path}" />'
      */
    var image_markup: js.UndefOr[String] = js.undefined
    
    /**
      * @default '<div class="pp_inline">{content}</div>'
      */
    var inline_markup: js.UndefOr[String] = js.undefined
    
    /**
      * Set to false if you open forms inside prettyPhoto
      * @default true
      */
    var keyboard_shortcuts: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Markup for pretty photo
      * @default omitted for brevity
      */
    var markup: js.UndefOr[String] = js.undefined
    
    /**
      * If set to true, only the close button will close the window
      * @default false
      */
    var modal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Value between 0 and 1
      * @default 0.80
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /**
      * If set to true, a gallery will overlay the fullscreen image on mouse over
      * @default true
      */
    var overlay_gallery: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Maximum number of pictures in the overlay gallery
      * @default 30
      */
    var overlay_gallery_max: js.UndefOr[Double] = js.undefined
    
    /**
      * Markup for quicktime
      * @default '<object classid="clsid:02BF25D5-8C17-4B23-BC80-D3488ABDDC6B" codebase="http://www.apple.com/qtactivex/qtplugin.cab" height="{height}" width="{width}"><param name="src" value="{path}"><param name="autoplay" value="{autoplay}"><param name="type" value="video/quicktime"><embed src="{path}" height="{height}" width="{width}" autoplay="{autoplay}" type="video/quicktime" pluginspage="http://www.apple.com/quicktime/download/"></embed></object>'
      */
    var quicktime_markup: js.UndefOr[String] = js.undefined
    
    /**
      * true/false
      * @default true
      */
    var show_title: js.UndefOr[Boolean] = js.undefined
    
    /**
      * false OR interval time in ms
      * @default 5000
      */
    var slideshow: js.UndefOr[Any] = js.undefined
    
    /**
      * Markup for social tools, set to html or false to disable
      * @default '<div class="twitter"><a href="http://twitter.com/share" class="twitter-share-button" data-count="none">Tweet</a><script type="text/javascript" src="http://platform.twitter.com/widgets.js"></script></div><div class="facebook"><iframe src="//www.facebook.com/plugins/like.php?locale=en_US&href={location_href}&amp;layout=button_count&amp;show_faces=true&amp;width=500&amp;action=like&amp;font&amp;colorscheme=light&amp;height=23" scrolling="no" frameborder="0" style="border:none; overflow:hidden; width:500px; height:23px;" allowTransparency="true"></iframe></div>'
      */
    var social_tools: js.UndefOr[Any] = js.undefined
    
    /**
      * light_rounded / dark_rounded / light_square / dark_square / facebook
      * @default 'pp_default'
      */
    var theme: js.UndefOr[String] = js.undefined
    
    /**
      * Set the flash wmode attribute
      * @default 'opaque'
      */
    var wmode: js.UndefOr[String] = js.undefined
  }
  object PrettyPhotoSettings {
    
    inline def apply(): PrettyPhotoSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrettyPhotoSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrettyPhotoSettings] (val x: Self) extends AnyVal {
      
      inline def setAjaxcallback(value: () => Unit): Self = StObject.set(x, "ajaxcallback", js.Any.fromFunction0(value))
      
      inline def setAjaxcallbackUndefined: Self = StObject.set(x, "ajaxcallback", js.undefined)
      
      inline def setAllow_expand(value: Boolean): Self = StObject.set(x, "allow_expand", value.asInstanceOf[js.Any])
      
      inline def setAllow_expandUndefined: Self = StObject.set(x, "allow_expand", js.undefined)
      
      inline def setAllow_resize(value: Boolean): Self = StObject.set(x, "allow_resize", value.asInstanceOf[js.Any])
      
      inline def setAllow_resizeUndefined: Self = StObject.set(x, "allow_resize", js.undefined)
      
      inline def setAnimation_speed(value: String): Self = StObject.set(x, "animation_speed", value.asInstanceOf[js.Any])
      
      inline def setAnimation_speedUndefined: Self = StObject.set(x, "animation_speed", js.undefined)
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setAutoplay_slideshow(value: Boolean): Self = StObject.set(x, "autoplay_slideshow", value.asInstanceOf[js.Any])
      
      inline def setAutoplay_slideshowUndefined: Self = StObject.set(x, "autoplay_slideshow", js.undefined)
      
      inline def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setChangepicturecallback(value: () => Unit): Self = StObject.set(x, "changepicturecallback", js.Any.fromFunction0(value))
      
      inline def setChangepicturecallbackUndefined: Self = StObject.set(x, "changepicturecallback", js.undefined)
      
      inline def setCounter_separator_label(value: String): Self = StObject.set(x, "counter_separator_label", value.asInstanceOf[js.Any])
      
      inline def setCounter_separator_labelUndefined: Self = StObject.set(x, "counter_separator_label", js.undefined)
      
      inline def setCustom_markup(value: String): Self = StObject.set(x, "custom_markup", value.asInstanceOf[js.Any])
      
      inline def setCustom_markupUndefined: Self = StObject.set(x, "custom_markup", js.undefined)
      
      inline def setDeeplinking(value: Boolean): Self = StObject.set(x, "deeplinking", value.asInstanceOf[js.Any])
      
      inline def setDeeplinkingUndefined: Self = StObject.set(x, "deeplinking", js.undefined)
      
      inline def setDefault_height(value: Double): Self = StObject.set(x, "default_height", value.asInstanceOf[js.Any])
      
      inline def setDefault_heightUndefined: Self = StObject.set(x, "default_height", js.undefined)
      
      inline def setDefault_width(value: Double): Self = StObject.set(x, "default_width", value.asInstanceOf[js.Any])
      
      inline def setDefault_widthUndefined: Self = StObject.set(x, "default_width", js.undefined)
      
      inline def setFlash_markup(value: String): Self = StObject.set(x, "flash_markup", value.asInstanceOf[js.Any])
      
      inline def setFlash_markupUndefined: Self = StObject.set(x, "flash_markup", js.undefined)
      
      inline def setGallery_markup(value: String): Self = StObject.set(x, "gallery_markup", value.asInstanceOf[js.Any])
      
      inline def setGallery_markupUndefined: Self = StObject.set(x, "gallery_markup", js.undefined)
      
      inline def setHideflash(value: Boolean): Self = StObject.set(x, "hideflash", value.asInstanceOf[js.Any])
      
      inline def setHideflashUndefined: Self = StObject.set(x, "hideflash", js.undefined)
      
      inline def setHook(value: String): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
      
      inline def setHookUndefined: Self = StObject.set(x, "hook", js.undefined)
      
      inline def setHorizontal_padding(value: Double): Self = StObject.set(x, "horizontal_padding", value.asInstanceOf[js.Any])
      
      inline def setHorizontal_paddingUndefined: Self = StObject.set(x, "horizontal_padding", js.undefined)
      
      inline def setIe6_fallback(value: Boolean): Self = StObject.set(x, "ie6_fallback", value.asInstanceOf[js.Any])
      
      inline def setIe6_fallbackUndefined: Self = StObject.set(x, "ie6_fallback", js.undefined)
      
      inline def setIframe_markup(value: String): Self = StObject.set(x, "iframe_markup", value.asInstanceOf[js.Any])
      
      inline def setIframe_markupUndefined: Self = StObject.set(x, "iframe_markup", js.undefined)
      
      inline def setImage_markup(value: String): Self = StObject.set(x, "image_markup", value.asInstanceOf[js.Any])
      
      inline def setImage_markupUndefined: Self = StObject.set(x, "image_markup", js.undefined)
      
      inline def setInline_markup(value: String): Self = StObject.set(x, "inline_markup", value.asInstanceOf[js.Any])
      
      inline def setInline_markupUndefined: Self = StObject.set(x, "inline_markup", js.undefined)
      
      inline def setKeyboard_shortcuts(value: Boolean): Self = StObject.set(x, "keyboard_shortcuts", value.asInstanceOf[js.Any])
      
      inline def setKeyboard_shortcutsUndefined: Self = StObject.set(x, "keyboard_shortcuts", js.undefined)
      
      inline def setMarkup(value: String): Self = StObject.set(x, "markup", value.asInstanceOf[js.Any])
      
      inline def setMarkupUndefined: Self = StObject.set(x, "markup", js.undefined)
      
      inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOverlay_gallery(value: Boolean): Self = StObject.set(x, "overlay_gallery", value.asInstanceOf[js.Any])
      
      inline def setOverlay_galleryUndefined: Self = StObject.set(x, "overlay_gallery", js.undefined)
      
      inline def setOverlay_gallery_max(value: Double): Self = StObject.set(x, "overlay_gallery_max", value.asInstanceOf[js.Any])
      
      inline def setOverlay_gallery_maxUndefined: Self = StObject.set(x, "overlay_gallery_max", js.undefined)
      
      inline def setQuicktime_markup(value: String): Self = StObject.set(x, "quicktime_markup", value.asInstanceOf[js.Any])
      
      inline def setQuicktime_markupUndefined: Self = StObject.set(x, "quicktime_markup", js.undefined)
      
      inline def setShow_title(value: Boolean): Self = StObject.set(x, "show_title", value.asInstanceOf[js.Any])
      
      inline def setShow_titleUndefined: Self = StObject.set(x, "show_title", js.undefined)
      
      inline def setSlideshow(value: Any): Self = StObject.set(x, "slideshow", value.asInstanceOf[js.Any])
      
      inline def setSlideshowUndefined: Self = StObject.set(x, "slideshow", js.undefined)
      
      inline def setSocial_tools(value: Any): Self = StObject.set(x, "social_tools", value.asInstanceOf[js.Any])
      
      inline def setSocial_toolsUndefined: Self = StObject.set(x, "social_tools", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setWmode(value: String): Self = StObject.set(x, "wmode", value.asInstanceOf[js.Any])
      
      inline def setWmodeUndefined: Self = StObject.set(x, "wmode", js.undefined)
    }
  }
  
  @js.native
  trait moduleJQuery extends StObject {
    
    /**
      * Initialises prettyPhoto
      */
    def apply(): JQuery = js.native
    /**
      * Initialises prettyPhoto specificying overrides for the defaults
      * @param pp_settings custom prettyPhoto settings
      */
    def apply(pp_settings: PrettyPhotoSettings): JQuery = js.native
  }
  
  @js.native
  trait moduleJQueryStatic extends StObject {
    
    /**
      * Change gallery page in the prettyPhoto modal box
      * @param direction {String} Direction of the paging, previous or next.
      */
    def changeGalleryPage(direction: String): Unit = js.native
    
    /**
      * Change page in the prettyPhoto modal box
      * @param direction {String} Direction of the paging, previous or next.
      */
    def changePage(direction: String): Unit = js.native
    
    /**
      * Closes prettyPhoto.
      */
    def close(): Unit = js.native
    
    /**
      * Opens the prettyPhoto modal box.
      * Note: Always returns false.
      */
    def open(): Boolean = js.native
    /**
      * Opens the prettyPhoto modal box.
      * Note: Always returns false.
      * @param image {String} Full path to the image to be open, can also be an array containing full images paths.
      * @param title {String} The title to be displayed with the picture, can also be an array containing all the titles.
      * @param description {String} The description to be displayed with the picture, can also be an array containing all the descriptions.
      */
    def open(image: String, title: String, description: String): Boolean = js.native
    /**
      * Opens the prettyPhoto modal box.
      * Note: Always returns false.
      * @param image {Array} Full path to the image to be open, can also be an array containing full images paths.
      * @param title {Array} The title to be displayed with the picture, can also be an array containing all the titles.
      * @param description {Array} The description to be displayed with the picture, can also be an array containing all the descriptions.
      */
    def open(images: js.Array[String], titles: js.Array[String], descriptions: js.Array[String]): Boolean = js.native
    
    /**
      * Start the slideshow...
      */
    def startSlideshow(): Unit = js.native
    
    /**
      * Stop the slideshow...
      */
    def stopSlideshow(): Unit = js.native
    
    /**
      * prettyPhoto version number
      */
    var version: String = js.native
  }
}
