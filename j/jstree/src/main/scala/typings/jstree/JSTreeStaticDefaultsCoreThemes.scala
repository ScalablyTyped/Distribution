package typings.jstree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSTreeStaticDefaultsCoreThemes extends js.Object {
  /**
    * the location of all jstree themes - only used if `url` is set to `true`
    * @name $.jstree.defaults.core.themes.dir
    */
  var dir: js.UndefOr[String] = js.undefined
  /**
    * a boolean indicating if connecting dots are shown
    * @name $.jstree.defaults.core.themes.dots
    */
  var dots: js.UndefOr[Boolean] = js.undefined
  /**
    * a boolean indicating if node ellipsis should be shown - this only works with a fixed with on the container
    * @name $.jstree.defaults.core.themes.ellipsis
    */
  var ellipsis: js.UndefOr[Boolean] = js.undefined
  /**
    * a boolean indicating if node icons are shown
    * @name $.jstree.defaults.core.themes.icons
    */
  var icons: js.UndefOr[Boolean] = js.undefined
  /**
    * the name of the theme to use (if left as `false` the default theme is used)
    * @name $.jstree.defaults.core.themes.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * a boolean specifying if a reponsive version of the theme should kick in on smaller screens (if the theme supports it).
    * Defaults to `false`.
    * @name $.jstree.defaults.core.themes.responsive
    */
  var responsive: js.UndefOr[Boolean] = js.undefined
  /**
    * a boolean indicating if the tree background is striped
    * @name $.jstree.defaults.core.themes.stripes
    */
  var stripes: js.UndefOr[Boolean] = js.undefined
  /**
    * the URL of the theme's CSS file, leave this as `false` if you have manually included the theme CSS (recommended).
    * You can set this to `true` too which will try to autoload the theme.
    * @name $.jstree.defaults.core.themes.url
    */
  var url: js.UndefOr[String] = js.undefined
  /**
    * a string (or boolean `false`) specifying the theme variant to use (if the theme supports variants)
    * @name $.jstree.defaults.core.themes.variant
    */
  var variant: js.UndefOr[js.Any] = js.undefined
}

object JSTreeStaticDefaultsCoreThemes {
  @scala.inline
  def apply(
    dir: String = null,
    dots: js.UndefOr[Boolean] = js.undefined,
    ellipsis: js.UndefOr[Boolean] = js.undefined,
    icons: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    stripes: js.UndefOr[Boolean] = js.undefined,
    url: String = null,
    variant: js.Any = null
  ): JSTreeStaticDefaultsCoreThemes = {
    val __obj = js.Dynamic.literal()
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.asInstanceOf[js.Any])
    if (!js.isUndefined(ellipsis)) __obj.updateDynamic("ellipsis")(ellipsis.asInstanceOf[js.Any])
    if (!js.isUndefined(icons)) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(stripes)) __obj.updateDynamic("stripes")(stripes.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSTreeStaticDefaultsCoreThemes]
  }
}

