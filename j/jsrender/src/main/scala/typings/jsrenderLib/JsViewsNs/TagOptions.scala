package typings
package jsrenderLib.JsViewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagOptions extends TagOptionProps {
  /* Tag options hash */
  var template: js.UndefOr[TemplateSetter] = js.undefined
}

object TagOptions {
  @scala.inline
  def apply(
    argDefault: js.UndefOr[scala.Boolean] = js.undefined,
    baseTag: java.lang.String | Tag = null,
    bindFrom: scala.Double | java.lang.String | (js.Array[scala.Double | java.lang.String]) = null,
    bindTo: scala.Double | java.lang.String | (js.Array[scala.Double | java.lang.String]) = null,
    contentCtx: scala.Boolean | (js.ThisFunction1[/* this */ TagInst, /* arg0 */ js.Any, _]) = null,
    convert: java.lang.String | Converter = null,
    ctx: Hash[_] = null,
    flow: js.UndefOr[scala.Boolean] = js.undefined,
    init: js.ThisFunction3[
      /* this */ TagInst, 
      /* tagCtx */ js.UndefOr[TagCtx], 
      /* linkCtx */ js.UndefOr[LinkCtx], 
      /* ctx */ js.UndefOr[Context], 
      scala.Unit
    ] = null,
    render: js.ThisFunction1[/* this */ TagInst, /* repeated */ js.Any, java.lang.String | scala.Unit] = null,
    template: TemplateSetter = null
  ): TagOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(argDefault)) __obj.updateDynamic("argDefault")(argDefault)
    if (baseTag != null) __obj.updateDynamic("baseTag")(baseTag.asInstanceOf[js.Any])
    if (bindFrom != null) __obj.updateDynamic("bindFrom")(bindFrom.asInstanceOf[js.Any])
    if (bindTo != null) __obj.updateDynamic("bindTo")(bindTo.asInstanceOf[js.Any])
    if (contentCtx != null) __obj.updateDynamic("contentCtx")(contentCtx.asInstanceOf[js.Any])
    if (convert != null) __obj.updateDynamic("convert")(convert.asInstanceOf[js.Any])
    if (ctx != null) __obj.updateDynamic("ctx")(ctx)
    if (!js.isUndefined(flow)) __obj.updateDynamic("flow")(flow)
    if (init != null) __obj.updateDynamic("init")(init)
    if (render != null) __obj.updateDynamic("render")(render)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagOptions]
  }
}

