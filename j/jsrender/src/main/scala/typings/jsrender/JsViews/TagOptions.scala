package typings.jsrender.JsViews

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
    argDefault: js.UndefOr[Boolean] = js.undefined,
    baseTag: String | Tag = null,
    bindFrom: Double | String | (js.Array[Double | String]) = null,
    bindTo: Double | String | (js.Array[Double | String]) = null,
    contentCtx: Boolean | (js.ThisFunction1[/* this */ TagInst, /* arg0 */ js.Any, _]) = null,
    convert: String | Converter = null,
    ctx: Hash[_] = null,
    flow: js.UndefOr[Boolean] = js.undefined,
    init: js.ThisFunction3[
      /* this */ TagInst, 
      /* tagCtx */ js.UndefOr[TagCtx], 
      /* linkCtx */ js.UndefOr[LinkCtx], 
      /* ctx */ js.UndefOr[Context], 
      Unit
    ] = null,
    render: js.ThisFunction1[/* this */ TagInst, /* repeated */ js.Any, String | Unit] = null,
    template: TemplateSetter = null
  ): TagOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(argDefault)) __obj.updateDynamic("argDefault")(argDefault.asInstanceOf[js.Any])
    if (baseTag != null) __obj.updateDynamic("baseTag")(baseTag.asInstanceOf[js.Any])
    if (bindFrom != null) __obj.updateDynamic("bindFrom")(bindFrom.asInstanceOf[js.Any])
    if (bindTo != null) __obj.updateDynamic("bindTo")(bindTo.asInstanceOf[js.Any])
    if (contentCtx != null) __obj.updateDynamic("contentCtx")(contentCtx.asInstanceOf[js.Any])
    if (convert != null) __obj.updateDynamic("convert")(convert.asInstanceOf[js.Any])
    if (ctx != null) __obj.updateDynamic("ctx")(ctx.asInstanceOf[js.Any])
    if (!js.isUndefined(flow)) __obj.updateDynamic("flow")(flow.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagOptions]
  }
}

