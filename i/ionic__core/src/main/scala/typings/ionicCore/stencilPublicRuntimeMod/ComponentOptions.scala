package typings.ionicCore.stencilPublicRuntimeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentOptions extends js.Object {
  /**
    * @deprecated Use `assetsDirs` instead
    */
  var assetsDir: js.UndefOr[String] = js.undefined
  /**
    * Array of relative links to folders of assets required by the component.
    */
  var assetsDirs: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * If `true`, the component will use scoped stylesheets. Similar to shadow-dom,
    * but without native isolation. Defaults to `false`.
    */
  var scoped: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the component will use native shadow-dom encapsulation, it will fallback to
    * `scoped` if the browser does not support shadow-dom natively. Defaults to `false`.
    * Additionally, `shadow` can also be given options when attaching the shadow root.
    */
  var shadow: js.UndefOr[Boolean | ShadowRootOptions] = js.undefined
  /**
    * Relative URL to some external stylesheet file. It should be a `.css` file unless some
    * external plugin is installed like `@stencil/sass`.
    */
  var styleUrl: js.UndefOr[String] = js.undefined
  /**
    * Similar as `styleUrl` but allows to specify different stylesheets for different modes.
    */
  var styleUrls: js.UndefOr[js.Array[String] | ModeStyles] = js.undefined
  /**
    * String that contains inlined CSS instead of using an external stylesheet.
    * The performance characteristics of this feature are the same as using an external stylesheet.
    *
    * Notice, you can't use sass, or less, only `css` is allowed using `styles`, use `styleUrl` is you need more advanced features.
    */
  var styles: js.UndefOr[String | StringDictionary[js.Any]] = js.undefined
  /**
    * Tag name of the web component. Ideally, the tag name must be globally unique,
    * so it's recommended to choose an unique prefix for all your components within the same collection.
    *
    * In addition, tag name must contain a '-'
    */
  var tag: String
}

object ComponentOptions {
  @scala.inline
  def apply(
    tag: String,
    assetsDir: String = null,
    assetsDirs: js.Array[String] = null,
    scoped: js.UndefOr[Boolean] = js.undefined,
    shadow: Boolean | ShadowRootOptions = null,
    styleUrl: String = null,
    styleUrls: js.Array[String] | ModeStyles = null,
    styles: String | StringDictionary[js.Any] = null
  ): ComponentOptions = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    if (assetsDir != null) __obj.updateDynamic("assetsDir")(assetsDir.asInstanceOf[js.Any])
    if (assetsDirs != null) __obj.updateDynamic("assetsDirs")(assetsDirs.asInstanceOf[js.Any])
    if (!js.isUndefined(scoped)) __obj.updateDynamic("scoped")(scoped.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (styleUrl != null) __obj.updateDynamic("styleUrl")(styleUrl.asInstanceOf[js.Any])
    if (styleUrls != null) __obj.updateDynamic("styleUrls")(styleUrls.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentOptions]
  }
}

