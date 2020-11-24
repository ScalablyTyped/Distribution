package typings.markJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.markJs.markJsStrings.disabled
import typings.markJs.markJsStrings.enabled
import typings.markJs.markJsStrings.withSpaces
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkOptions extends js.Object {
  
  var accuracy: js.UndefOr[MarkAccuracy | MarkAccuracyObject] = js.native
  
  var acrossElements: js.UndefOr[Boolean] = js.native
  
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var diacritics: js.UndefOr[Boolean] = js.native
  
  var done: js.UndefOr[js.Function1[/* marksTotal */ Double, Unit]] = js.native
  
  var each: js.UndefOr[js.Function1[/* element */ Element, Unit]] = js.native
  
  var element: js.UndefOr[String] = js.native
  
  var exclude: js.UndefOr[js.Array[String]] = js.native
  
  var filter: js.UndefOr[
    js.Function4[
      /* textNode */ Element, 
      /* term */ String, 
      /* marksSoFar */ Double, 
      /* marksTotal */ Double, 
      Boolean
    ]
  ] = js.native
  
  var iframes: js.UndefOr[Boolean] = js.native
  
  var iframesTimeout: js.UndefOr[Double] = js.native
  
  var ignoreJoiners: js.UndefOr[Boolean] = js.native
  
  var ignorePunctuation: js.UndefOr[js.Array[String]] = js.native
  
  var log: js.UndefOr[js.Object] = js.native
  
  var noMatch: js.UndefOr[js.Function1[/* term */ String, Unit]] = js.native
  
  var separateWordSearch: js.UndefOr[Boolean] = js.native
  
  var synonyms: js.UndefOr[StringDictionary[String]] = js.native
  
  var wildcards: js.UndefOr[disabled | enabled | withSpaces] = js.native
}
object MarkOptions {
  
  @scala.inline
  def apply(): MarkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkOptions]
  }
  
  @scala.inline
  implicit class MarkOptionsOps[Self <: MarkOptions] (val x: Self) extends AnyVal {
    
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
    def setAccuracy(value: MarkAccuracy | MarkAccuracyObject): Self = this.set("accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccuracy: Self = this.set("accuracy", js.undefined)
    
    @scala.inline
    def setAcrossElements(value: Boolean): Self = this.set("acrossElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcrossElements: Self = this.set("acrossElements", js.undefined)
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDiacritics(value: Boolean): Self = this.set("diacritics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiacritics: Self = this.set("diacritics", js.undefined)
    
    @scala.inline
    def setDone(value: /* marksTotal */ Double => Unit): Self = this.set("done", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    
    @scala.inline
    def setEach(value: /* element */ Element => Unit): Self = this.set("each", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEach: Self = this.set("each", js.undefined)
    
    @scala.inline
    def setElement(value: String): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setFilter(
      value: (/* textNode */ Element, /* term */ String, /* marksSoFar */ Double, /* marksTotal */ Double) => Boolean
    ): Self = this.set("filter", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setIframes(value: Boolean): Self = this.set("iframes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIframes: Self = this.set("iframes", js.undefined)
    
    @scala.inline
    def setIframesTimeout(value: Double): Self = this.set("iframesTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIframesTimeout: Self = this.set("iframesTimeout", js.undefined)
    
    @scala.inline
    def setIgnoreJoiners(value: Boolean): Self = this.set("ignoreJoiners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreJoiners: Self = this.set("ignoreJoiners", js.undefined)
    
    @scala.inline
    def setIgnorePunctuationVarargs(value: String*): Self = this.set("ignorePunctuation", js.Array(value :_*))
    
    @scala.inline
    def setIgnorePunctuation(value: js.Array[String]): Self = this.set("ignorePunctuation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnorePunctuation: Self = this.set("ignorePunctuation", js.undefined)
    
    @scala.inline
    def setLog(value: js.Object): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setNoMatch(value: /* term */ String => Unit): Self = this.set("noMatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNoMatch: Self = this.set("noMatch", js.undefined)
    
    @scala.inline
    def setSeparateWordSearch(value: Boolean): Self = this.set("separateWordSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparateWordSearch: Self = this.set("separateWordSearch", js.undefined)
    
    @scala.inline
    def setSynonyms(value: StringDictionary[String]): Self = this.set("synonyms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSynonyms: Self = this.set("synonyms", js.undefined)
    
    @scala.inline
    def setWildcards(value: disabled | enabled | withSpaces): Self = this.set("wildcards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWildcards: Self = this.set("wildcards", js.undefined)
  }
}
