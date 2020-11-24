package typings.jqueryPrettyphoto.scaronPrettyPhoto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Pretty photo settings
  */
@js.native
trait PrettyPhotoSettings extends js.Object {
  
  var ajaxcallback: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Allow the user to expand a resized image. true/false
    * @default true
    */
  var allow_expand: js.UndefOr[Boolean] = js.native
  
  /**
    * Resize the photos bigger than viewport. true/false
    * @default true
    */
  var allow_resize: js.UndefOr[Boolean] = js.native
  
  /**
    * fast/slow/normal
    * @default 'fast'
    */
  var animation_speed: js.UndefOr[String] = js.native
  
  /**
    * Automatically start videos: True/False
    * @default true
    */
  var autoplay: js.UndefOr[Boolean] = js.native
  
  /**
    * true/false
    * @default false
    */
  var autoplay_slideshow: js.UndefOr[Boolean] = js.native
  
  /**
    * Called when prettyPhoto is closed
    * @default function () { }
    */
  var callback: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Called everytime an item is shown/changed
    * @default function () { }
    */
  var changepicturecallback: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * The separator for the gallery counter 1 "of" 2
    * @default '/'
    */
  var counter_separator_label: js.UndefOr[String] = js.native
  
  /**
    * @default ''
    */
  var custom_markup: js.UndefOr[String] = js.native
  
  /**
    * Allow prettyPhoto to update the url to enable deeplinking.
    * @default true
    */
  var deeplinking: js.UndefOr[Boolean] = js.native
  
  /**
    * Pixels
    * @default 344
    */
  var default_height: js.UndefOr[Double] = js.native
  
  /**
    * Pixels
    * @default 500
    */
  var default_width: js.UndefOr[Double] = js.native
  
  /**
    * Markup for flash
    * @default '<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" width="{width}" height="{height}"><param name="wmode" value="{wmode}" /><param name="allowfullscreen" value="true" /><param name="allowscriptaccess" value="always" /><param name="movie" value="{path}" /><embed src="{path}" type="application/x-shockwave-flash" allowfullscreen="true" allowscriptaccess="always" width="{width}" height="{height}" wmode="{wmode}"></embed></object>'
    */
  var flash_markup: js.UndefOr[String] = js.native
  
  /**
    * Markup for pretty photo gallery
    * @default omitted for brevity
    */
  var gallery_markup: js.UndefOr[String] = js.native
  
  /**
    * Hides all the flash object on a page, set to TRUE if flash appears over prettyPhoto
    * @default false
    */
  var hideflash: js.UndefOr[Boolean] = js.native
  
  /**
    * the attribute tag to use for prettyPhoto hooks.  For HTML5, use "data-rel" or similar.
    * @default 'rel'
    */
  var hook: js.UndefOr[String] = js.native
  
  /**
    * The padding on each side of the picture
    * @default 20
    */
  var horizontal_padding: js.UndefOr[Double] = js.native
  
  /**
    * @default true
    */
  var ie6_fallback: js.UndefOr[Boolean] = js.native
  
  /**
    * Markup for iframe
    * @default '<iframe src ="{path}" width="{width}" height="{height}" frameborder="no"></iframe>'
    */
  var iframe_markup: js.UndefOr[String] = js.native
  
  /**
    * Markup for image
    * @default '<img id="fullResImage" src="{path}" />'
    */
  var image_markup: js.UndefOr[String] = js.native
  
  /**
    * @default '<div class="pp_inline">{content}</div>'
    */
  var inline_markup: js.UndefOr[String] = js.native
  
  /**
    * Set to false if you open forms inside prettyPhoto
    * @default true
    */
  var keyboard_shortcuts: js.UndefOr[Boolean] = js.native
  
  /**
    * Markup for pretty photo
    * @default omitted for brevity
    */
  var markup: js.UndefOr[String] = js.native
  
  /**
    * If set to true, only the close button will close the window
    * @default false
    */
  var modal: js.UndefOr[Boolean] = js.native
  
  /**
    * Value between 0 and 1
    * @default 0.80
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * If set to true, a gallery will overlay the fullscreen image on mouse over
    * @default true
    */
  var overlay_gallery: js.UndefOr[Boolean] = js.native
  
  /**
    * Maximum number of pictures in the overlay gallery
    * @default 30
    */
  var overlay_gallery_max: js.UndefOr[Double] = js.native
  
  /**
    * Markup for quicktime
    * @default '<object classid="clsid:02BF25D5-8C17-4B23-BC80-D3488ABDDC6B" codebase="http://www.apple.com/qtactivex/qtplugin.cab" height="{height}" width="{width}"><param name="src" value="{path}"><param name="autoplay" value="{autoplay}"><param name="type" value="video/quicktime"><embed src="{path}" height="{height}" width="{width}" autoplay="{autoplay}" type="video/quicktime" pluginspage="http://www.apple.com/quicktime/download/"></embed></object>'
    */
  var quicktime_markup: js.UndefOr[String] = js.native
  
  /**
    * true/false
    * @default true
    */
  var show_title: js.UndefOr[Boolean] = js.native
  
  /**
    * false OR interval time in ms
    * @default 5000
    */
  var slideshow: js.UndefOr[js.Any] = js.native
  
  /**
    * Markup for social tools, set to html or false to disable
    * @default '<div class="twitter"><a href="http://twitter.com/share" class="twitter-share-button" data-count="none">Tweet</a><script type="text/javascript" src="http://platform.twitter.com/widgets.js"></script></div><div class="facebook"><iframe src="//www.facebook.com/plugins/like.php?locale=en_US&href={location_href}&amp;layout=button_count&amp;show_faces=true&amp;width=500&amp;action=like&amp;font&amp;colorscheme=light&amp;height=23" scrolling="no" frameborder="0" style="border:none; overflow:hidden; width:500px; height:23px;" allowTransparency="true"></iframe></div>'
    */
  var social_tools: js.UndefOr[js.Any] = js.native
  
  /**
    * light_rounded / dark_rounded / light_square / dark_square / facebook
    * @default 'pp_default'
    */
  var theme: js.UndefOr[String] = js.native
  
  /**
    * Set the flash wmode attribute
    * @default 'opaque'
    */
  var wmode: js.UndefOr[String] = js.native
}
object PrettyPhotoSettings {
  
  @scala.inline
  def apply(): PrettyPhotoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrettyPhotoSettings]
  }
  
  @scala.inline
  implicit class PrettyPhotoSettingsOps[Self <: PrettyPhotoSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAjaxcallback(value: () => Unit): Self = this.set("ajaxcallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAjaxcallback: Self = this.set("ajaxcallback", js.undefined)
    
    @scala.inline
    def setAllow_expand(value: Boolean): Self = this.set("allow_expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_expand: Self = this.set("allow_expand", js.undefined)
    
    @scala.inline
    def setAllow_resize(value: Boolean): Self = this.set("allow_resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_resize: Self = this.set("allow_resize", js.undefined)
    
    @scala.inline
    def setAnimation_speed(value: String): Self = this.set("animation_speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation_speed: Self = this.set("animation_speed", js.undefined)
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    
    @scala.inline
    def setAutoplay_slideshow(value: Boolean): Self = this.set("autoplay_slideshow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplay_slideshow: Self = this.set("autoplay_slideshow", js.undefined)
    
    @scala.inline
    def setCallback(value: () => Unit): Self = this.set("callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setChangepicturecallback(value: () => Unit): Self = this.set("changepicturecallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteChangepicturecallback: Self = this.set("changepicturecallback", js.undefined)
    
    @scala.inline
    def setCounter_separator_label(value: String): Self = this.set("counter_separator_label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounter_separator_label: Self = this.set("counter_separator_label", js.undefined)
    
    @scala.inline
    def setCustom_markup(value: String): Self = this.set("custom_markup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom_markup: Self = this.set("custom_markup", js.undefined)
    
    @scala.inline
    def setDeeplinking(value: Boolean): Self = this.set("deeplinking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeeplinking: Self = this.set("deeplinking", js.undefined)
    
    @scala.inline
    def setDefault_height(value: Double): Self = this.set("default_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault_height: Self = this.set("default_height", js.undefined)
    
    @scala.inline
    def setDefault_width(value: Double): Self = this.set("default_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault_width: Self = this.set("default_width", js.undefined)
    
    @scala.inline
    def setFlash_markup(value: String): Self = this.set("flash_markup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlash_markup: Self = this.set("flash_markup", js.undefined)
    
    @scala.inline
    def setGallery_markup(value: String): Self = this.set("gallery_markup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGallery_markup: Self = this.set("gallery_markup", js.undefined)
    
    @scala.inline
    def setHideflash(value: Boolean): Self = this.set("hideflash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideflash: Self = this.set("hideflash", js.undefined)
    
    @scala.inline
    def setHook(value: String): Self = this.set("hook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHook: Self = this.set("hook", js.undefined)
    
    @scala.inline
    def setHorizontal_padding(value: Double): Self = this.set("horizontal_padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontal_padding: Self = this.set("horizontal_padding", js.undefined)
    
    @scala.inline
    def setIe6_fallback(value: Boolean): Self = this.set("ie6_fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIe6_fallback: Self = this.set("ie6_fallback", js.undefined)
    
    @scala.inline
    def setIframe_markup(value: String): Self = this.set("iframe_markup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIframe_markup: Self = this.set("iframe_markup", js.undefined)
    
    @scala.inline
    def setImage_markup(value: String): Self = this.set("image_markup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage_markup: Self = this.set("image_markup", js.undefined)
    
    @scala.inline
    def setInline_markup(value: String): Self = this.set("inline_markup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline_markup: Self = this.set("inline_markup", js.undefined)
    
    @scala.inline
    def setKeyboard_shortcuts(value: Boolean): Self = this.set("keyboard_shortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboard_shortcuts: Self = this.set("keyboard_shortcuts", js.undefined)
    
    @scala.inline
    def setMarkup(value: String): Self = this.set("markup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkup: Self = this.set("markup", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setOverlay_gallery(value: Boolean): Self = this.set("overlay_gallery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlay_gallery: Self = this.set("overlay_gallery", js.undefined)
    
    @scala.inline
    def setOverlay_gallery_max(value: Double): Self = this.set("overlay_gallery_max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlay_gallery_max: Self = this.set("overlay_gallery_max", js.undefined)
    
    @scala.inline
    def setQuicktime_markup(value: String): Self = this.set("quicktime_markup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuicktime_markup: Self = this.set("quicktime_markup", js.undefined)
    
    @scala.inline
    def setShow_title(value: Boolean): Self = this.set("show_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow_title: Self = this.set("show_title", js.undefined)
    
    @scala.inline
    def setSlideshow(value: js.Any): Self = this.set("slideshow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideshow: Self = this.set("slideshow", js.undefined)
    
    @scala.inline
    def setSocial_tools(value: js.Any): Self = this.set("social_tools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocial_tools: Self = this.set("social_tools", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setWmode(value: String): Self = this.set("wmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWmode: Self = this.set("wmode", js.undefined)
  }
}
