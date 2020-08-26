package typings.jqueryTypeahead.RunningCoder.Typeahead

import typings.jqueryTypeahead.jqueryTypeaheadBooleans.`false`
import typings.jqueryTypeahead.jqueryTypeaheadStrings.localStorage
import typings.jqueryTypeahead.jqueryTypeaheadStrings.sessionStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Source extends js.Object {
  /** En extended version of `JQuery Ajax` */
  var ajax: js.UndefOr[AJaxSettings | (js.Function1[/* query */ js.UndefOr[String], AJaxSettings])] = js.native
  /** Overrides the default configuration for the specified group. */
  var cache: js.UndefOr[Boolean | localStorage | sessionStorage] = js.native
  /** Overrides the default configuration for the specified group. */
  var compression: js.UndefOr[Boolean] = js.native
  /**  Array or function that returns an Array. The items in your array can either be strings or objects */
  var data: js.UndefOr[js.Array[_] | js.Function0[js.Array[_]]] = js.native
  /** Overrides the default configuration for the specified group. */
  var display: js.UndefOr[String | js.Array[String]] = js.native
  /** Overrides the default configuration for the specified group. */
  var dynamic: js.UndefOr[Boolean] = js.native
  /** Overrides the default configuration for the specified group. */
  var filter: js.UndefOr[
    Boolean | (js.Function2[/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String], Boolean])
  ] = js.native
  /** Overrides the default configuration for the specified group. */
  var matcher: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String], Boolean]
  ] = js.native
  /** Overrides the default configuration for the specified group. */
  var maxLength: js.UndefOr[`false` | Double] = js.native
  /** Overrides the default configuration for the specified group. */
  var minLength: js.UndefOr[Double] = js.native
  /** Overrides the default configuration for the specified group. */
  var template: js.UndefOr[
    String | (js.Function2[/* query */ js.UndefOr[String], /* item */ js.UndefOr[js.Any], String])
  ] = js.native
  /** Overrides the default configuration for the specified group. */
  var ttl: js.UndefOr[Double] = js.native
}

object Source {
  @scala.inline
  def apply(): Source = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Source]
  }
  @scala.inline
  implicit class SourceOps[Self <: Source] (val x: Self) extends AnyVal {
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
    def setAjaxFunction1(value: /* query */ js.UndefOr[String] => AJaxSettings): Self = this.set("ajax", js.Any.fromFunction1(value))
    @scala.inline
    def setAjax(value: AJaxSettings | (js.Function1[/* query */ js.UndefOr[String], AJaxSettings])): Self = this.set("ajax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAjax: Self = this.set("ajax", js.undefined)
    @scala.inline
    def setCache(value: Boolean | localStorage | sessionStorage): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setCompression(value: Boolean): Self = this.set("compression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setDataFunction0(value: () => js.Array[_]): Self = this.set("data", js.Any.fromFunction0(value))
    @scala.inline
    def setData(value: js.Array[_] | js.Function0[js.Array[_]]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDisplayVarargs(value: String*): Self = this.set("display", js.Array(value :_*))
    @scala.inline
    def setDisplay(value: String | js.Array[String]): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setDynamic(value: Boolean): Self = this.set("dynamic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamic: Self = this.set("dynamic", js.undefined)
    @scala.inline
    def setFilterFunction2(value: (/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String]) => Boolean): Self = this.set("filter", js.Any.fromFunction2(value))
    @scala.inline
    def setFilter(
      value: Boolean | (js.Function2[/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String], Boolean])
    ): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setMatcher(value: (/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String]) => Boolean): Self = this.set("matcher", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMatcher: Self = this.set("matcher", js.undefined)
    @scala.inline
    def setMaxLength(value: `false` | Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    @scala.inline
    def setTemplateFunction2(value: (/* query */ js.UndefOr[String], /* item */ js.UndefOr[js.Any]) => String): Self = this.set("template", js.Any.fromFunction2(value))
    @scala.inline
    def setTemplate(
      value: String | (js.Function2[/* query */ js.UndefOr[String], /* item */ js.UndefOr[js.Any], String])
    ): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
  
}

