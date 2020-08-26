package typings.jstree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSTreeStaticDefaultsCoreThemes extends js.Object {
  /**
    * the location of all jstree themes - only used if `url` is set to `true`
    * @name $.jstree.defaults.core.themes.dir
    */
  var dir: js.UndefOr[String] = js.native
  /**
    * a boolean indicating if connecting dots are shown
    * @name $.jstree.defaults.core.themes.dots
    */
  var dots: js.UndefOr[Boolean] = js.native
  /**
    * a boolean indicating if node ellipsis should be shown - this only works with a fixed with on the container
    * @name $.jstree.defaults.core.themes.ellipsis
    */
  var ellipsis: js.UndefOr[Boolean] = js.native
  /**
    * a boolean indicating if node icons are shown
    * @name $.jstree.defaults.core.themes.icons
    */
  var icons: js.UndefOr[Boolean] = js.native
  /**
    * the name of the theme to use (if left as `false` the default theme is used)
    * @name $.jstree.defaults.core.themes.name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * a boolean specifying if a reponsive version of the theme should kick in on smaller screens (if the theme supports it).
    * Defaults to `false`.
    * @name $.jstree.defaults.core.themes.responsive
    */
  var responsive: js.UndefOr[Boolean] = js.native
  /**
    * a boolean indicating if the tree background is striped
    * @name $.jstree.defaults.core.themes.stripes
    */
  var stripes: js.UndefOr[Boolean] = js.native
  /**
    * the URL of the theme's CSS file, leave this as `false` if you have manually included the theme CSS (recommended).
    * You can set this to `true` too which will try to autoload the theme.
    * @name $.jstree.defaults.core.themes.url
    */
  var url: js.UndefOr[String] = js.native
  /**
    * a string (or boolean `false`) specifying the theme variant to use (if the theme supports variants)
    * @name $.jstree.defaults.core.themes.variant
    */
  var variant: js.UndefOr[js.Any] = js.native
}

object JSTreeStaticDefaultsCoreThemes {
  @scala.inline
  def apply(): JSTreeStaticDefaultsCoreThemes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSTreeStaticDefaultsCoreThemes]
  }
  @scala.inline
  implicit class JSTreeStaticDefaultsCoreThemesOps[Self <: JSTreeStaticDefaultsCoreThemes] (val x: Self) extends AnyVal {
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
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setDots(value: Boolean): Self = this.set("dots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDots: Self = this.set("dots", js.undefined)
    @scala.inline
    def setEllipsis(value: Boolean): Self = this.set("ellipsis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipsis: Self = this.set("ellipsis", js.undefined)
    @scala.inline
    def setIcons(value: Boolean): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setResponsive(value: Boolean): Self = this.set("responsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    @scala.inline
    def setStripes(value: Boolean): Self = this.set("stripes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripes: Self = this.set("stripes", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setVariant(value: js.Any): Self = this.set("variant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
  }
  
}

