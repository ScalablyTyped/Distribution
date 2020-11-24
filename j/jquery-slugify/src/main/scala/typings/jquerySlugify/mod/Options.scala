package typings.jquerySlugify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{preSlug (source : string): string, postSlug (source : string): string, slugFunc (input : string, options : jquery-slugify.jquery-slugify.Options): string,   separator :string,   lang :string | boolean,   symbols :boolean,   maintainCase :boolean,   titleCase :std.Array<string> | boolean,   truncate :number,   uric :boolean,   uricNoSlash :boolean,   mark :boolean,   custom :std.Array<string>}> */
@js.native
trait Options extends js.Object {
  
  var custom: js.UndefOr[js.Array[String]] = js.native
  
  var lang: js.UndefOr[String | Boolean] = js.native
  
  var maintainCase: js.UndefOr[Boolean] = js.native
  
  var mark: js.UndefOr[Boolean] = js.native
  
  var postSlug: js.UndefOr[js.Function1[/* source */ String, String]] = js.native
  
  var preSlug: js.UndefOr[js.Function1[/* source */ String, String]] = js.native
  
  var separator: js.UndefOr[String] = js.native
  
  var slugFunc: js.UndefOr[js.Function2[/* input */ String, /* options */ this.type, String]] = js.native
  
  var symbols: js.UndefOr[Boolean] = js.native
  
  var titleCase: js.UndefOr[js.Array[String] | Boolean] = js.native
  
  var truncate: js.UndefOr[Double] = js.native
  
  var uric: js.UndefOr[Boolean] = js.native
  
  var uricNoSlash: js.UndefOr[Boolean] = js.native
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
    def setCustomVarargs(value: String*): Self = this.set("custom", js.Array(value :_*))
    
    @scala.inline
    def setCustom(value: js.Array[String]): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
    @scala.inline
    def setLang(value: String | Boolean): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setMaintainCase(value: Boolean): Self = this.set("maintainCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaintainCase: Self = this.set("maintainCase", js.undefined)
    
    @scala.inline
    def setMark(value: Boolean): Self = this.set("mark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMark: Self = this.set("mark", js.undefined)
    
    @scala.inline
    def setPostSlug(value: /* source */ String => String): Self = this.set("postSlug", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePostSlug: Self = this.set("postSlug", js.undefined)
    
    @scala.inline
    def setPreSlug(value: /* source */ String => String): Self = this.set("preSlug", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePreSlug: Self = this.set("preSlug", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setSlugFunc(value: (/* input */ String, Options) => String): Self = this.set("slugFunc", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSlugFunc: Self = this.set("slugFunc", js.undefined)
    
    @scala.inline
    def setSymbols(value: Boolean): Self = this.set("symbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbols: Self = this.set("symbols", js.undefined)
    
    @scala.inline
    def setTitleCaseVarargs(value: String*): Self = this.set("titleCase", js.Array(value :_*))
    
    @scala.inline
    def setTitleCase(value: js.Array[String] | Boolean): Self = this.set("titleCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleCase: Self = this.set("titleCase", js.undefined)
    
    @scala.inline
    def setTruncate(value: Double): Self = this.set("truncate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTruncate: Self = this.set("truncate", js.undefined)
    
    @scala.inline
    def setUric(value: Boolean): Self = this.set("uric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUric: Self = this.set("uric", js.undefined)
    
    @scala.inline
    def setUricNoSlash(value: Boolean): Self = this.set("uricNoSlash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUricNoSlash: Self = this.set("uricNoSlash", js.undefined)
  }
}
