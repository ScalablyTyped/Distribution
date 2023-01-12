package typings.htmlhint

import org.scalablytyped.runtime.StringDictionary
import typings.htmlhint.anon.Message
import typings.htmlhint.htmlhintStrings.abs
import typings.htmlhint.htmlhintStrings.dash
import typings.htmlhint.htmlhintStrings.hump
import typings.htmlhint.htmlhintStrings.rel
import typings.htmlhint.htmlhintStrings.space
import typings.htmlhint.htmlhintStrings.space1
import typings.htmlhint.htmlhintStrings.space2
import typings.htmlhint.htmlhintStrings.space3
import typings.htmlhint.htmlhintStrings.space4
import typings.htmlhint.htmlhintStrings.space5
import typings.htmlhint.htmlhintStrings.space6
import typings.htmlhint.htmlhintStrings.space7
import typings.htmlhint.htmlhintStrings.space8
import typings.htmlhint.htmlhintStrings.tab
import typings.htmlhint.htmlhintStrings.underline
import typings.htmlhint.mod.HTMLParser
import typings.htmlhint.mod.Reporter
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  sealed trait ReportType extends StObject
  @JSImport("htmlhint/types", "ReportType")
  @js.native
  object ReportType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ReportType & String] = js.native
    
    @js.native
    sealed trait error
      extends StObject
         with ReportType
    /* "error" */ val error: typings.htmlhint.typesMod.ReportType.error & String = js.native
    
    @js.native
    sealed trait info
      extends StObject
         with ReportType
    /* "info" */ val info: typings.htmlhint.typesMod.ReportType.info & String = js.native
    
    @js.native
    sealed trait warning
      extends StObject
         with ReportType
    /* "warning" */ val warning: typings.htmlhint.typesMod.ReportType.warning & String = js.native
  }
  
  trait Hint extends StObject {
    
    var col: Double
    
    var evidence: String
    
    var line: Double
    
    var message: String
    
    var raw: String
    
    var rule: Rule
    
    var `type`: ReportType
  }
  object Hint {
    
    inline def apply(
      col: Double,
      evidence: String,
      line: Double,
      message: String,
      raw: String,
      rule: Rule,
      `type`: ReportType
    ): Hint = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], evidence = evidence.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hint] (val x: Self) extends AnyVal {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setEvidence(value: String): Self = StObject.set(x, "evidence", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRule(value: Rule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setType(value: ReportType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rule extends StObject {
    
    var description: String
    
    var id: String
    
    def init(parser: HTMLParser, reporter: Reporter, options: Any): Unit
    
    var link: js.UndefOr[String] = js.undefined
  }
  object Rule {
    
    inline def apply(description: String, id: String, init: (HTMLParser, Reporter, Any) => Unit): Rule = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], init = js.Any.fromFunction3(init))
      __obj.asInstanceOf[Rule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInit(value: (HTMLParser, Reporter, Any) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction3(value))
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    }
  }
  
  trait Ruleset
    extends StObject
       with // There may be other unknown rules
  /* ruleId */ StringDictionary[Any] {
    
    var `alt-require`: js.UndefOr[Boolean] = js.undefined
    
    var `attr-lowercase`: js.UndefOr[Boolean | (js.Array[String | js.RegExp])] = js.undefined
    
    var `attr-no-duplication`: js.UndefOr[Boolean] = js.undefined
    
    var `attr-no-unnecessary-whitespace`: js.UndefOr[Boolean] = js.undefined
    
    var `attr-sorted`: js.UndefOr[Boolean] = js.undefined
    
    var `attr-unsafe-chars`: js.UndefOr[Boolean] = js.undefined
    
    var `attr-value-double-quotes`: js.UndefOr[Boolean] = js.undefined
    
    var `attr-value-not-empty`: js.UndefOr[Boolean] = js.undefined
    
    var `attr-value-single-quotes`: js.UndefOr[Boolean] = js.undefined
    
    var `attr-whitespace`: js.UndefOr[Boolean] = js.undefined
    
    var `doctype-first`: js.UndefOr[Boolean] = js.undefined
    
    var `doctype-html5`: js.UndefOr[Boolean] = js.undefined
    
    var `empty-tag-not-self-closed`: js.UndefOr[Boolean] = js.undefined
    
    var `head-script-disabled`: js.UndefOr[Boolean] = js.undefined
    
    var `href-abs-or-rel`: js.UndefOr[abs | rel] = js.undefined
    
    var `id-class-ad-disabled`: js.UndefOr[Boolean] = js.undefined
    
    var `id-class-value`: js.UndefOr[underline | dash | hump | Message] = js.undefined
    
    var `id-unique`: js.UndefOr[Boolean] = js.undefined
    
    var `inline-script-disabled`: js.UndefOr[Boolean] = js.undefined
    
    var `inline-style-disabled`: js.UndefOr[Boolean] = js.undefined
    
    var `input-requires-label`: js.UndefOr[Boolean] = js.undefined
    
    var `script-disabled`: js.UndefOr[Boolean] = js.undefined
    
    var `space-tab-mixed-disabled`: js.UndefOr[
        Boolean | space | space1 | space2 | space3 | space4 | space5 | space6 | space7 | space8 | tab
      ] = js.undefined
    
    var `spec-char-escape`: js.UndefOr[Boolean] = js.undefined
    
    var `src-not-empty`: js.UndefOr[Boolean] = js.undefined
    
    var `style-disabled`: js.UndefOr[Boolean] = js.undefined
    
    var `tag-pair`: js.UndefOr[Boolean] = js.undefined
    
    var `tag-self-close`: js.UndefOr[Boolean] = js.undefined
    
    var `tagname-lowercase`: js.UndefOr[Boolean] = js.undefined
    
    var `tagname-specialchars`: js.UndefOr[Boolean] = js.undefined
    
    var `tags-check`: js.UndefOr[StringDictionary[Record[String, Any]]] = js.undefined
    
    var `title-require`: js.UndefOr[Boolean] = js.undefined
  }
  object Ruleset {
    
    inline def apply(): Ruleset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ruleset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ruleset] (val x: Self) extends AnyVal {
      
      inline def `setAlt-require`(value: Boolean): Self = StObject.set(x, "alt-require", value.asInstanceOf[js.Any])
      
      inline def `setAlt-requireUndefined`: Self = StObject.set(x, "alt-require", js.undefined)
      
      inline def `setAttr-lowercase`(value: Boolean | (js.Array[String | js.RegExp])): Self = StObject.set(x, "attr-lowercase", value.asInstanceOf[js.Any])
      
      inline def `setAttr-lowercaseUndefined`: Self = StObject.set(x, "attr-lowercase", js.undefined)
      
      inline def `setAttr-lowercaseVarargs`(value: (String | js.RegExp)*): Self = StObject.set(x, "attr-lowercase", js.Array(value*))
      
      inline def `setAttr-no-duplication`(value: Boolean): Self = StObject.set(x, "attr-no-duplication", value.asInstanceOf[js.Any])
      
      inline def `setAttr-no-duplicationUndefined`: Self = StObject.set(x, "attr-no-duplication", js.undefined)
      
      inline def `setAttr-no-unnecessary-whitespace`(value: Boolean): Self = StObject.set(x, "attr-no-unnecessary-whitespace", value.asInstanceOf[js.Any])
      
      inline def `setAttr-no-unnecessary-whitespaceUndefined`: Self = StObject.set(x, "attr-no-unnecessary-whitespace", js.undefined)
      
      inline def `setAttr-sorted`(value: Boolean): Self = StObject.set(x, "attr-sorted", value.asInstanceOf[js.Any])
      
      inline def `setAttr-sortedUndefined`: Self = StObject.set(x, "attr-sorted", js.undefined)
      
      inline def `setAttr-unsafe-chars`(value: Boolean): Self = StObject.set(x, "attr-unsafe-chars", value.asInstanceOf[js.Any])
      
      inline def `setAttr-unsafe-charsUndefined`: Self = StObject.set(x, "attr-unsafe-chars", js.undefined)
      
      inline def `setAttr-value-double-quotes`(value: Boolean): Self = StObject.set(x, "attr-value-double-quotes", value.asInstanceOf[js.Any])
      
      inline def `setAttr-value-double-quotesUndefined`: Self = StObject.set(x, "attr-value-double-quotes", js.undefined)
      
      inline def `setAttr-value-not-empty`(value: Boolean): Self = StObject.set(x, "attr-value-not-empty", value.asInstanceOf[js.Any])
      
      inline def `setAttr-value-not-emptyUndefined`: Self = StObject.set(x, "attr-value-not-empty", js.undefined)
      
      inline def `setAttr-value-single-quotes`(value: Boolean): Self = StObject.set(x, "attr-value-single-quotes", value.asInstanceOf[js.Any])
      
      inline def `setAttr-value-single-quotesUndefined`: Self = StObject.set(x, "attr-value-single-quotes", js.undefined)
      
      inline def `setAttr-whitespace`(value: Boolean): Self = StObject.set(x, "attr-whitespace", value.asInstanceOf[js.Any])
      
      inline def `setAttr-whitespaceUndefined`: Self = StObject.set(x, "attr-whitespace", js.undefined)
      
      inline def `setDoctype-first`(value: Boolean): Self = StObject.set(x, "doctype-first", value.asInstanceOf[js.Any])
      
      inline def `setDoctype-firstUndefined`: Self = StObject.set(x, "doctype-first", js.undefined)
      
      inline def `setDoctype-html5`(value: Boolean): Self = StObject.set(x, "doctype-html5", value.asInstanceOf[js.Any])
      
      inline def `setDoctype-html5Undefined`: Self = StObject.set(x, "doctype-html5", js.undefined)
      
      inline def `setEmpty-tag-not-self-closed`(value: Boolean): Self = StObject.set(x, "empty-tag-not-self-closed", value.asInstanceOf[js.Any])
      
      inline def `setEmpty-tag-not-self-closedUndefined`: Self = StObject.set(x, "empty-tag-not-self-closed", js.undefined)
      
      inline def `setHead-script-disabled`(value: Boolean): Self = StObject.set(x, "head-script-disabled", value.asInstanceOf[js.Any])
      
      inline def `setHead-script-disabledUndefined`: Self = StObject.set(x, "head-script-disabled", js.undefined)
      
      inline def `setHref-abs-or-rel`(value: abs | rel): Self = StObject.set(x, "href-abs-or-rel", value.asInstanceOf[js.Any])
      
      inline def `setHref-abs-or-relUndefined`: Self = StObject.set(x, "href-abs-or-rel", js.undefined)
      
      inline def `setId-class-ad-disabled`(value: Boolean): Self = StObject.set(x, "id-class-ad-disabled", value.asInstanceOf[js.Any])
      
      inline def `setId-class-ad-disabledUndefined`: Self = StObject.set(x, "id-class-ad-disabled", js.undefined)
      
      inline def `setId-class-value`(value: underline | dash | hump | Message): Self = StObject.set(x, "id-class-value", value.asInstanceOf[js.Any])
      
      inline def `setId-class-valueUndefined`: Self = StObject.set(x, "id-class-value", js.undefined)
      
      inline def `setId-unique`(value: Boolean): Self = StObject.set(x, "id-unique", value.asInstanceOf[js.Any])
      
      inline def `setId-uniqueUndefined`: Self = StObject.set(x, "id-unique", js.undefined)
      
      inline def `setInline-script-disabled`(value: Boolean): Self = StObject.set(x, "inline-script-disabled", value.asInstanceOf[js.Any])
      
      inline def `setInline-script-disabledUndefined`: Self = StObject.set(x, "inline-script-disabled", js.undefined)
      
      inline def `setInline-style-disabled`(value: Boolean): Self = StObject.set(x, "inline-style-disabled", value.asInstanceOf[js.Any])
      
      inline def `setInline-style-disabledUndefined`: Self = StObject.set(x, "inline-style-disabled", js.undefined)
      
      inline def `setInput-requires-label`(value: Boolean): Self = StObject.set(x, "input-requires-label", value.asInstanceOf[js.Any])
      
      inline def `setInput-requires-labelUndefined`: Self = StObject.set(x, "input-requires-label", js.undefined)
      
      inline def `setScript-disabled`(value: Boolean): Self = StObject.set(x, "script-disabled", value.asInstanceOf[js.Any])
      
      inline def `setScript-disabledUndefined`: Self = StObject.set(x, "script-disabled", js.undefined)
      
      inline def `setSpace-tab-mixed-disabled`(
        value: Boolean | space | space1 | space2 | space3 | space4 | space5 | space6 | space7 | space8 | tab
      ): Self = StObject.set(x, "space-tab-mixed-disabled", value.asInstanceOf[js.Any])
      
      inline def `setSpace-tab-mixed-disabledUndefined`: Self = StObject.set(x, "space-tab-mixed-disabled", js.undefined)
      
      inline def `setSpec-char-escape`(value: Boolean): Self = StObject.set(x, "spec-char-escape", value.asInstanceOf[js.Any])
      
      inline def `setSpec-char-escapeUndefined`: Self = StObject.set(x, "spec-char-escape", js.undefined)
      
      inline def `setSrc-not-empty`(value: Boolean): Self = StObject.set(x, "src-not-empty", value.asInstanceOf[js.Any])
      
      inline def `setSrc-not-emptyUndefined`: Self = StObject.set(x, "src-not-empty", js.undefined)
      
      inline def `setStyle-disabled`(value: Boolean): Self = StObject.set(x, "style-disabled", value.asInstanceOf[js.Any])
      
      inline def `setStyle-disabledUndefined`: Self = StObject.set(x, "style-disabled", js.undefined)
      
      inline def `setTag-pair`(value: Boolean): Self = StObject.set(x, "tag-pair", value.asInstanceOf[js.Any])
      
      inline def `setTag-pairUndefined`: Self = StObject.set(x, "tag-pair", js.undefined)
      
      inline def `setTag-self-close`(value: Boolean): Self = StObject.set(x, "tag-self-close", value.asInstanceOf[js.Any])
      
      inline def `setTag-self-closeUndefined`: Self = StObject.set(x, "tag-self-close", js.undefined)
      
      inline def `setTagname-lowercase`(value: Boolean): Self = StObject.set(x, "tagname-lowercase", value.asInstanceOf[js.Any])
      
      inline def `setTagname-lowercaseUndefined`: Self = StObject.set(x, "tagname-lowercase", js.undefined)
      
      inline def `setTagname-specialchars`(value: Boolean): Self = StObject.set(x, "tagname-specialchars", value.asInstanceOf[js.Any])
      
      inline def `setTagname-specialcharsUndefined`: Self = StObject.set(x, "tagname-specialchars", js.undefined)
      
      inline def `setTags-check`(value: StringDictionary[Record[String, Any]]): Self = StObject.set(x, "tags-check", value.asInstanceOf[js.Any])
      
      inline def `setTags-checkUndefined`: Self = StObject.set(x, "tags-check", js.undefined)
      
      inline def `setTitle-require`(value: Boolean): Self = StObject.set(x, "title-require", value.asInstanceOf[js.Any])
      
      inline def `setTitle-requireUndefined`: Self = StObject.set(x, "title-require", js.undefined)
    }
  }
}
