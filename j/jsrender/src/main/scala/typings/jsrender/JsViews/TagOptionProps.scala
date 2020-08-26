package typings.jsrender.JsViews

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Tags
@js.native
trait TagOptionProps
  extends /* prop */ StringDictionary[js.Any] {
  var argDefault: js.UndefOr[Boolean] = js.native
  var baseTag: js.UndefOr[String | Tag] = js.native
  var bindFrom: js.UndefOr[Double | String | (js.Array[Double | String])] = js.native
  var bindTo: js.UndefOr[Double | String | (js.Array[Double | String])] = js.native
  var contentCtx: js.UndefOr[Boolean | (js.ThisFunction1[/* this */ TagInst, /* arg0 */ js.Any, _])] = js.native
  var convert: js.UndefOr[String | Converter] = js.native
  var ctx: js.UndefOr[Hash[_]] = js.native
  var flow: js.UndefOr[Boolean] = js.native
  /* Properties that can be set as tag options, and retrieved as Tag properties */
  var init: js.UndefOr[
    js.ThisFunction3[
      /* this */ TagInst, 
      /* tagCtx */ js.UndefOr[TagCtx], 
      /* linkCtx */ js.UndefOr[LinkCtx], 
      /* ctx */ js.UndefOr[Context], 
      Unit
    ]
  ] = js.native
  var render: js.UndefOr[js.ThisFunction1[/* this */ TagInst, /* repeated */ js.Any, String | Unit]] = js.native
}

object TagOptionProps {
  @scala.inline
  def apply(): TagOptionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagOptionProps]
  }
  @scala.inline
  implicit class TagOptionPropsOps[Self <: TagOptionProps] (val x: Self) extends AnyVal {
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
    def setArgDefault(value: Boolean): Self = this.set("argDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgDefault: Self = this.set("argDefault", js.undefined)
    @scala.inline
    def setBaseTag(value: String | Tag): Self = this.set("baseTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseTag: Self = this.set("baseTag", js.undefined)
    @scala.inline
    def setBindFromVarargs(value: (Double | String)*): Self = this.set("bindFrom", js.Array(value :_*))
    @scala.inline
    def setBindFrom(value: Double | String | (js.Array[Double | String])): Self = this.set("bindFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindFrom: Self = this.set("bindFrom", js.undefined)
    @scala.inline
    def setBindToVarargs(value: (Double | String)*): Self = this.set("bindTo", js.Array(value :_*))
    @scala.inline
    def setBindTo(value: Double | String | (js.Array[Double | String])): Self = this.set("bindTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindTo: Self = this.set("bindTo", js.undefined)
    @scala.inline
    def setContentCtx(value: Boolean | (js.ThisFunction1[/* this */ TagInst, /* arg0 */ js.Any, _])): Self = this.set("contentCtx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentCtx: Self = this.set("contentCtx", js.undefined)
    @scala.inline
    def setConvertFunction2(value: (/* value */ js.Any, /* repeated */ js.Any) => js.Any): Self = this.set("convert", js.Any.fromFunction2(value))
    @scala.inline
    def setConvert(value: String | Converter): Self = this.set("convert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConvert: Self = this.set("convert", js.undefined)
    @scala.inline
    def setCtx(value: Hash[_]): Self = this.set("ctx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCtx: Self = this.set("ctx", js.undefined)
    @scala.inline
    def setFlow(value: Boolean): Self = this.set("flow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlow: Self = this.set("flow", js.undefined)
    @scala.inline
    def setInit(
      value: js.ThisFunction3[
          /* this */ TagInst, 
          /* tagCtx */ js.UndefOr[TagCtx], 
          /* linkCtx */ js.UndefOr[LinkCtx], 
          /* ctx */ js.UndefOr[Context], 
          Unit
        ]
    ): Self = this.set("init", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setRender(value: js.ThisFunction1[/* this */ TagInst, /* repeated */ js.Any, String | Unit]): Self = this.set("render", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
  }
  
}

