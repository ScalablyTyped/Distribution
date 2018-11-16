package typings
package jqueryDotPrettyphotoLib.scaronUnderscorePrettyPhotoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * Pretty photo settings
    */

trait PrettyPhotoSettings extends js.Object {
  var ajaxcallback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
          * Allow the user to expand a resized image. true/false
          * @default true
          */
  var allow_expand: js.UndefOr[scala.Boolean] = js.undefined
  /**
          * Resize the photos bigger than viewport. true/false
          * @default true
          */
  var allow_resize: js.UndefOr[scala.Boolean] = js.undefined
  /**
          * fast/slow/normal
          * @default 'fast'
          */
  var animation_speed: js.UndefOr[java.lang.String] = js.undefined
  /**
          * Automatically start videos: True/False
          * @default true
          */
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  /**
          * true/false
          * @default false
          */
  var autoplay_slideshow: js.UndefOr[scala.Boolean] = js.undefined
  /**
          * Called when prettyPhoto is closed
          * @default function () { }
          */
  var callback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
          * Called everytime an item is shown/changed
          * @default function () { }
          */
  var changepicturecallback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
          * The separator for the gallery counter 1 "of" 2
          * @default '/'
          */
  var counter_separator_label: js.UndefOr[java.lang.String] = js.undefined
  /**
          * @default ''
          */
  var custom_markup: js.UndefOr[java.lang.String] = js.undefined
  /**
          * Allow prettyPhoto to update the url to enable deeplinking.
          * @default true
          */
  var deeplinking: js.UndefOr[scala.Boolean] = js.undefined
  /**
          * Pixels
          * @default 344
          */
  var default_height: js.UndefOr[scala.Double] = js.undefined
  /**
          * Pixels
          * @default 500
          */
  var default_width: js.UndefOr[scala.Double] = js.undefined
  /**
          * Markup for flash
          * @default '<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" width="{width}" height="{height}"><param name="wmode" value="{wmode}" /><param name="allowfullscreen" value="true" /><param name="allowscriptaccess" value="always" /><param name="movie" value="{path}" /><embed src="{path}" type="application/x-shockwave-flash" allowfullscreen="true" allowscriptaccess="always" width="{width}" height="{height}" wmode="{wmode}"></embed></object>'
          */
  var flash_markup: js.UndefOr[java.lang.String] = js.undefined
  /**
          * Markup for pretty photo gallery
          * @default omitted for brevity
          */
  var gallery_markup: js.UndefOr[java.lang.String] = js.undefined
  /**
          * Hides all the flash object on a page, set to TRUE if flash appears over prettyPhoto
          * @default false
          */
  var hideflash: js.UndefOr[scala.Boolean] = js.undefined
  /**
          * the attribute tag to use for prettyPhoto hooks.  For HTML5, use "data-rel" or similar.
          * @default 'rel'
          */
  var hook: js.UndefOr[java.lang.String] = js.undefined
  /**
          * The padding on each side of the picture
          * @default 20
          */
  var horizontal_padding: js.UndefOr[scala.Double] = js.undefined
  /**
          * @default true
          */
  var ie6_fallback: js.UndefOr[scala.Boolean] = js.undefined
  /**
          * Markup for iframe
          * @default '<iframe src ="{path}" width="{width}" height="{height}" frameborder="no"></iframe>'
          */
  var iframe_markup: js.UndefOr[java.lang.String] = js.undefined
  /**
          * Markup for image
          * @default '<img id="fullResImage" src="{path}" />'
          */
  var image_markup: js.UndefOr[java.lang.String] = js.undefined
  /**
          * @default '<div class="pp_inline">{content}</div>'
          */
  var inline_markup: js.UndefOr[java.lang.String] = js.undefined
  /**
          * Set to false if you open forms inside prettyPhoto
          * @default true
          */
  var keyboard_shortcuts: js.UndefOr[scala.Boolean] = js.undefined
  /**
          * Markup for pretty photo
          * @default omitted for brevity
          */
  var markup: js.UndefOr[java.lang.String] = js.undefined
  /**
          * If set to true, only the close button will close the window
          * @default false
          */
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  /**
          * Value between 0 and 1
          * @default 0.80
          */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /**
          * If set to true, a gallery will overlay the fullscreen image on mouse over
          * @default true
          */
  var overlay_gallery: js.UndefOr[scala.Boolean] = js.undefined
  /**
          * Maximum number of pictures in the overlay gallery
          * @default 30
          */
  var overlay_gallery_max: js.UndefOr[scala.Double] = js.undefined
  /**
          * Markup for quicktime
          * @default '<object classid="clsid:02BF25D5-8C17-4B23-BC80-D3488ABDDC6B" codebase="http://www.apple.com/qtactivex/qtplugin.cab" height="{height}" width="{width}"><param name="src" value="{path}"><param name="autoplay" value="{autoplay}"><param name="type" value="video/quicktime"><embed src="{path}" height="{height}" width="{width}" autoplay="{autoplay}" type="video/quicktime" pluginspage="http://www.apple.com/quicktime/download/"></embed></object>'
          */
  var quicktime_markup: js.UndefOr[java.lang.String] = js.undefined
  /**
          * true/false
          * @default true
          */
  var show_title: js.UndefOr[scala.Boolean] = js.undefined
  /**
          * false OR interval time in ms
          * @default 5000
          */
  var slideshow: js.UndefOr[js.Any] = js.undefined
  /**
          * Markup for social tools, set to html or false to disable
          * @default '<div class="twitter"><a href="http://twitter.com/share" class="twitter-share-button" data-count="none">Tweet</a><script type="text/javascript" src="http://platform.twitter.com/widgets.js"></script></div><div class="facebook"><iframe src="//www.facebook.com/plugins/like.php?locale=en_US&href={location_href}&amp;layout=button_count&amp;show_faces=true&amp;width=500&amp;action=like&amp;font&amp;colorscheme=light&amp;height=23" scrolling="no" frameborder="0" style="border:none; overflow:hidden; width:500px; height:23px;" allowTransparency="true"></iframe></div>'
          */
  var social_tools: js.UndefOr[js.Any] = js.undefined
  /**
          * light_rounded / dark_rounded / light_square / dark_square / facebook
          * @default 'pp_default'
          */
  var theme: js.UndefOr[java.lang.String] = js.undefined
  /**
          * Set the flash wmode attribute
          * @default 'opaque'
          */
  var wmode: js.UndefOr[java.lang.String] = js.undefined
}

