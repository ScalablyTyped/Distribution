package typings.gulpFileInclude.mod

import org.scalablytyped.runtime.StringDictionary
import typings.gulpFileInclude.gulpFileIncludeStrings.`@file`
import typings.gulpFileInclude.gulpFileIncludeStrings.`@root`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Can be "@file" or "@root" or some base path.
    * default: "@file"
    */
  var basepath: js.UndefOr[`@file` | `@root` | String] = js.native
  /**
    * Effectively a context for variables used in 'if' statements.
    */
  var context: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Filters basically look like functions that get passed into '@@include'.
    * When one of these functions is called, something of that name is looked
    * up in this object and called to get the contents of that include.
    */
  var filters: js.UndefOr[StringDictionary[js.Function1[/* arg */ js.Any, String]]] = js.native
  /**
    * default: false
    */
  var indent: js.UndefOr[Boolean] = js.native
  /** default: "@@" */
  var prefix: js.UndefOr[String] = js.native
  /** default: "" */
  var suffix: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setBasepath(value: `@file` | `@root` | String): Self = this.set("basepath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasepath: Self = this.set("basepath", js.undefined)
    @scala.inline
    def setContext(value: StringDictionary[js.Any]): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setFilters(value: StringDictionary[js.Function1[/* arg */ js.Any, String]]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setIndent(value: Boolean): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
  }
  
}

