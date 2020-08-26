package typings.lasso.lassoMod

import typings.lasso.dependenciesMod.Bundle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LassoConfig extends js.Object {
  var baseDir: js.UndefOr[String] = js.native
  var bundles: js.UndefOr[js.Array[Bundle]] = js.native
  var bundlingEnabled: js.UndefOr[Boolean] = js.native
  var cspNonceProvider: js.UndefOr[js.Function1[/* out */ js.Any, String]] = js.native
  var fingerprintInlineCode: js.UndefOr[js.Function1[/* code */ js.Any, String]] = js.native
  var fingerprintsEnabled: js.UndefOr[Boolean] = js.native
  var includeSlotNames: js.UndefOr[Boolean] = js.native
  var minify: js.UndefOr[Boolean] = js.native
  var minifyCSS: js.UndefOr[Boolean] = js.native
  var minifyInlineCSSOnly: js.UndefOr[Boolean] = js.native
  var minifyInlineJSOnly: js.UndefOr[Boolean] = js.native
  var minifyInlineOnly: js.UndefOr[Boolean] = js.native
  var minifyJS: js.UndefOr[Boolean] = js.native
  var noConflict: js.UndefOr[String] = js.native
  var outputDir: js.UndefOr[String] = js.native
  var plugins: js.UndefOr[js.Array[CustomPlugin | String]] = js.native
  var relativeUrlsEnabled: js.UndefOr[Boolean] = js.native
  var require: js.UndefOr[js.Any] = js.native
  var resolveCssUrls: js.UndefOr[Boolean] = js.native
  var urlPrefix: js.UndefOr[String] = js.native
}

object LassoConfig {
  @scala.inline
  def apply(): LassoConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LassoConfig]
  }
  @scala.inline
  implicit class LassoConfigOps[Self <: LassoConfig] (val x: Self) extends AnyVal {
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
    def setBaseDir(value: String): Self = this.set("baseDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseDir: Self = this.set("baseDir", js.undefined)
    @scala.inline
    def setBundlesVarargs(value: Bundle*): Self = this.set("bundles", js.Array(value :_*))
    @scala.inline
    def setBundles(value: js.Array[Bundle]): Self = this.set("bundles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundles: Self = this.set("bundles", js.undefined)
    @scala.inline
    def setBundlingEnabled(value: Boolean): Self = this.set("bundlingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundlingEnabled: Self = this.set("bundlingEnabled", js.undefined)
    @scala.inline
    def setCspNonceProvider(value: /* out */ js.Any => String): Self = this.set("cspNonceProvider", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCspNonceProvider: Self = this.set("cspNonceProvider", js.undefined)
    @scala.inline
    def setFingerprintInlineCode(value: /* code */ js.Any => String): Self = this.set("fingerprintInlineCode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFingerprintInlineCode: Self = this.set("fingerprintInlineCode", js.undefined)
    @scala.inline
    def setFingerprintsEnabled(value: Boolean): Self = this.set("fingerprintsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFingerprintsEnabled: Self = this.set("fingerprintsEnabled", js.undefined)
    @scala.inline
    def setIncludeSlotNames(value: Boolean): Self = this.set("includeSlotNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeSlotNames: Self = this.set("includeSlotNames", js.undefined)
    @scala.inline
    def setMinify(value: Boolean): Self = this.set("minify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinify: Self = this.set("minify", js.undefined)
    @scala.inline
    def setMinifyCSS(value: Boolean): Self = this.set("minifyCSS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinifyCSS: Self = this.set("minifyCSS", js.undefined)
    @scala.inline
    def setMinifyInlineCSSOnly(value: Boolean): Self = this.set("minifyInlineCSSOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinifyInlineCSSOnly: Self = this.set("minifyInlineCSSOnly", js.undefined)
    @scala.inline
    def setMinifyInlineJSOnly(value: Boolean): Self = this.set("minifyInlineJSOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinifyInlineJSOnly: Self = this.set("minifyInlineJSOnly", js.undefined)
    @scala.inline
    def setMinifyInlineOnly(value: Boolean): Self = this.set("minifyInlineOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinifyInlineOnly: Self = this.set("minifyInlineOnly", js.undefined)
    @scala.inline
    def setMinifyJS(value: Boolean): Self = this.set("minifyJS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinifyJS: Self = this.set("minifyJS", js.undefined)
    @scala.inline
    def setNoConflict(value: String): Self = this.set("noConflict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoConflict: Self = this.set("noConflict", js.undefined)
    @scala.inline
    def setOutputDir(value: String): Self = this.set("outputDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputDir: Self = this.set("outputDir", js.undefined)
    @scala.inline
    def setPluginsVarargs(value: (CustomPlugin | String)*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[CustomPlugin | String]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setRelativeUrlsEnabled(value: Boolean): Self = this.set("relativeUrlsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelativeUrlsEnabled: Self = this.set("relativeUrlsEnabled", js.undefined)
    @scala.inline
    def setRequire(value: js.Any): Self = this.set("require", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequire: Self = this.set("require", js.undefined)
    @scala.inline
    def setResolveCssUrls(value: Boolean): Self = this.set("resolveCssUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolveCssUrls: Self = this.set("resolveCssUrls", js.undefined)
    @scala.inline
    def setUrlPrefix(value: String): Self = this.set("urlPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlPrefix: Self = this.set("urlPrefix", js.undefined)
  }
  
}

