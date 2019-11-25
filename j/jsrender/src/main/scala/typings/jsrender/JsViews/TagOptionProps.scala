package typings.jsrender.JsViews

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Tags
trait TagOptionProps
  extends /* prop */ StringDictionary[js.Any] {
  var argDefault: js.UndefOr[Boolean] = js.undefined
  var baseTag: js.UndefOr[String | Tag] = js.undefined
  var bindFrom: js.UndefOr[Double | String | (js.Array[Double | String])] = js.undefined
  var bindTo: js.UndefOr[Double | String | (js.Array[Double | String])] = js.undefined
  var contentCtx: js.UndefOr[Boolean | (js.ThisFunction1[/* this */ TagInst, /* arg0 */ js.Any, _])] = js.undefined
  var convert: js.UndefOr[String | Converter] = js.undefined
  var ctx: js.UndefOr[Hash[_]] = js.undefined
  var flow: js.UndefOr[Boolean] = js.undefined
  /* Properties that can be set as tag options, and retrieved as Tag properties */
  var init: js.UndefOr[
    js.ThisFunction3[
      /* this */ TagInst, 
      /* tagCtx */ js.UndefOr[TagCtx], 
      /* linkCtx */ js.UndefOr[LinkCtx], 
      /* ctx */ js.UndefOr[Context], 
      Unit
    ]
  ] = js.undefined
  var render: js.UndefOr[js.ThisFunction1[/* this */ TagInst, /* repeated */ js.Any, String | Unit]] = js.undefined
}

object TagOptionProps {
  @scala.inline
  def apply(
    StringDictionary: /* prop */ StringDictionary[js.Any] = null,
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
    render: js.ThisFunction1[/* this */ TagInst, /* repeated */ js.Any, String | Unit] = null
  ): TagOptionProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
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
    __obj.asInstanceOf[TagOptionProps]
  }
}

