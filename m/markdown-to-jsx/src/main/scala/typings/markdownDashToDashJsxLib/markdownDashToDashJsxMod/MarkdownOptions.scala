package typings
package markdownDashToDashJsxLib.markdownDashToDashJsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkdownOptions extends js.Object {
  /** Custom React.createElement behavior. */
  var createElement: js.UndefOr[
    js.Function3[
      /* type */ reactLib.reactMod.SFC[js.Object] | (reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState]) | java.lang.String, 
      /* props */ js.UndefOr[reactLib.reactMod.Attributes with (js.Object | scala.Null)], 
      /* repeated */ reactLib.reactMod.ReactNode, 
      reactLib.reactMod.ReactElement[js.Object]
    ]
  ] = js.undefined
  /** Force all input strings to use block layout. */
  var forceBlock: js.UndefOr[scala.Boolean] = js.undefined
  /** Force all input strings to use inline layout. */
  var forceInline: js.UndefOr[scala.Boolean] = js.undefined
  /** Override representation of any HTML tag or custom component. */
  var overrides: js.UndefOr[markdownDashToDashJsxLib.Anon_A] = js.undefined
  /** Custom function to generate an HTML id from headings. */
  var slugify: js.UndefOr[js.Function1[/* text */ java.lang.String, java.lang.String]] = js.undefined
}

object MarkdownOptions {
  @scala.inline
  def apply(
    createElement: (/* type */ reactLib.reactMod.SFC[js.Object] | (reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState]) | java.lang.String, /* props */ js.UndefOr[reactLib.reactMod.Attributes with (js.Object | scala.Null)], /* repeated */ reactLib.reactMod.ReactNode) => reactLib.reactMod.ReactElement[js.Object] = null,
    forceBlock: js.UndefOr[scala.Boolean] = js.undefined,
    forceInline: js.UndefOr[scala.Boolean] = js.undefined,
    overrides: markdownDashToDashJsxLib.Anon_A = null,
    slugify: /* text */ java.lang.String => java.lang.String = null
  ): MarkdownOptions = {
    val __obj = js.Dynamic.literal()
    if (createElement != null) __obj.updateDynamic("createElement")(js.Any.fromFunction3(createElement))
    if (!js.isUndefined(forceBlock)) __obj.updateDynamic("forceBlock")(forceBlock)
    if (!js.isUndefined(forceInline)) __obj.updateDynamic("forceInline")(forceInline)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (slugify != null) __obj.updateDynamic("slugify")(js.Any.fromFunction1(slugify))
    __obj.asInstanceOf[MarkdownOptions]
  }
}

