package typings
package jsrenderLib.JsViewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Tags
trait TagOptionProps
  extends /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var argDefault: js.UndefOr[scala.Boolean] = js.undefined
  var baseTag: js.UndefOr[java.lang.String | Tag] = js.undefined
  var bindFrom: js.UndefOr[scala.Double | java.lang.String | (js.Array[scala.Double | java.lang.String])] = js.undefined
  var bindTo: js.UndefOr[scala.Double | java.lang.String | (js.Array[scala.Double | java.lang.String])] = js.undefined
  var contentCtx: js.UndefOr[scala.Boolean | (js.ThisFunction1[/* this */ TagInst, /* arg0 */ js.Any, _])] = js.undefined
  var convert: js.UndefOr[java.lang.String | Converter] = js.undefined
  var ctx: js.UndefOr[Hash[_]] = js.undefined
  var flow: js.UndefOr[scala.Boolean] = js.undefined
  /* Properties that can be set as tag options, and retrieved as Tag properties */
  var init: js.UndefOr[
    js.ThisFunction3[
      /* this */ TagInst, 
      /* tagCtx */ js.UndefOr[TagCtx], 
      /* linkCtx */ js.UndefOr[LinkCtx], 
      /* ctx */ js.UndefOr[Context], 
      scala.Unit
    ]
  ] = js.undefined
  var render: js.UndefOr[
    js.ThisFunction1[/* this */ TagInst, /* repeated */ js.Any, java.lang.String | scala.Unit]
  ] = js.undefined
}

object TagOptionProps {
  @scala.inline
  def apply(
    StringDictionary: /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
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
    render: js.ThisFunction1[/* this */ TagInst, /* repeated */ js.Any, java.lang.String | scala.Unit] = null
  ): TagOptionProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
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
    __obj.asInstanceOf[TagOptionProps]
  }
}

