package typings.marked.mod.marked

import typings.marked.markedBooleans.`false`
import typings.marked.mod.marked.Tokens.Blockquote
import typings.marked.mod.marked.Tokens.Br
import typings.marked.mod.marked.Tokens.Code
import typings.marked.mod.marked.Tokens.Codespan
import typings.marked.mod.marked.Tokens.Def
import typings.marked.mod.marked.Tokens.Del
import typings.marked.mod.marked.Tokens.Em
import typings.marked.mod.marked.Tokens.Escape
import typings.marked.mod.marked.Tokens.HTML
import typings.marked.mod.marked.Tokens.Heading
import typings.marked.mod.marked.Tokens.Hr
import typings.marked.mod.marked.Tokens.Image
import typings.marked.mod.marked.Tokens.Link
import typings.marked.mod.marked.Tokens.Paragraph
import typings.marked.mod.marked.Tokens.Space
import typings.marked.mod.marked.Tokens.Strong
import typings.marked.mod.marked.Tokens.Table
import typings.marked.mod.marked.Tokens.Tag
import typings.marked.mod.marked.Tokens.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Omit<marked.marked.marked.Tokenizer<false>, 'constructor' | 'options'>> */
trait TokenizerObject extends StObject {
  
  var autolink: js.UndefOr[
    js.ThisFunction2[
      /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
      /* src */ String, 
      /* mangle */ js.Function1[/* cap */ String, String], 
      Link | `false`
    ]
  ] = js.undefined
  
  var blockquote: js.UndefOr[
    js.ThisFunction1[
      /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
      /* src */ String, 
      Blockquote | `false`
    ]
  ] = js.undefined
  
  var br: js.UndefOr[
    js.ThisFunction1[/* this */ Tokenizer[scala.Nothing] & TokenizerThis, /* src */ String, Br | `false`]
  ] = js.undefined
  
  var code: js.UndefOr[
    js.ThisFunction1[
      /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
      /* src */ String, 
      Code | `false`
    ]
  ] = js.undefined
  
  var codespan: js.UndefOr[
    js.ThisFunction1[
      /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
      /* src */ String, 
      Codespan | `false`
    ]
  ] = js.undefined
  
  var `def`: js.UndefOr[
    js.ThisFunction1[/* this */ Tokenizer[scala.Nothing] & TokenizerThis, /* src */ String, Def | `false`]
  ] = js.undefined
  
  var del: js.UndefOr[
    js.ThisFunction1[/* this */ Tokenizer[scala.Nothing] & TokenizerThis, /* src */ String, Del | `false`]
  ] = js.undefined
  
  var emStrong: js.UndefOr[
    js.ThisFunction3[
      /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
      /* src */ String, 
      /* maskedSrc */ String, 
      /* prevChar */ String, 
      Em | Strong | `false`
    ]
  ] = js.undefined
  
  var escape: js.UndefOr[
    js.ThisFunction1[
      /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
      /* src */ String, 
      Escape | `false`
    ]
  ] = js.undefined
  
  var fences: js.UndefOr[
    js.ThisFunction1[
      /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
      /* src */ String, 
      Code | `false`
    ]
  ] = js.undefined
  
  var heading: js.UndefOr[
    js.ThisFunction1[
      /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
      /* src */ String, 
      Heading | `false`
    ]
  ] = js.undefined
  
  var hr: js.UndefOr[
    js.ThisFunction1[/* this */ Tokenizer[scala.Nothing] & TokenizerThis, /* src */ String, Hr | `false`]
  ] = js.undefined
  
  var html: js.UndefOr[
    js.ThisFunction1[
      /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
      /* src */ String, 
      HTML | `false`
    ]
  ] = js.undefined
  
  var inlineText: js.UndefOr[
    js.ThisFunction2[
      /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
      /* src */ String, 
      /* smartypants */ js.Function1[/* cap */ String, String], 
      Text | `false`
    ]
  ] = js.undefined
  
  var lheading: js.UndefOr[
    js.ThisFunction1[
      /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
      /* src */ String, 
      Heading | `false`
    ]
  ] = js.undefined
  
  var link: js.UndefOr[
    js.ThisFunction1[
      /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
      /* src */ String, 
      Image | Link | `false`
    ]
  ] = js.undefined
  
  var list: js.UndefOr[
    js.ThisFunction1[
      /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
      /* src */ String, 
      typings.marked.mod.marked.Tokens.List | `false`
    ]
  ] = js.undefined
  
  var paragraph: js.UndefOr[
    js.ThisFunction1[
      /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
      /* src */ String, 
      Paragraph | `false`
    ]
  ] = js.undefined
  
  var reflink: js.UndefOr[
    js.ThisFunction2[
      /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
      /* src */ String, 
      /* links */ js.Array[Image | Link], 
      Link | Image | Text | `false`
    ]
  ] = js.undefined
  
  var space: js.UndefOr[
    js.ThisFunction1[
      /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
      /* src */ String, 
      Space | `false`
    ]
  ] = js.undefined
  
  var table: js.UndefOr[
    js.ThisFunction1[
      /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
      /* src */ String, 
      Table | `false`
    ]
  ] = js.undefined
  
  var tag: js.UndefOr[
    js.ThisFunction1[/* this */ Tokenizer[scala.Nothing] & TokenizerThis, /* src */ String, Tag | `false`]
  ] = js.undefined
  
  var text: js.UndefOr[
    js.ThisFunction1[
      /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
      /* src */ String, 
      Text | `false`
    ]
  ] = js.undefined
  
  var url: js.UndefOr[
    js.ThisFunction2[
      /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
      /* src */ String, 
      /* mangle */ js.Function1[/* cap */ String, String], 
      Link | `false`
    ]
  ] = js.undefined
}
object TokenizerObject {
  
  inline def apply(): TokenizerObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenizerObject]
  }
  
  extension [Self <: TokenizerObject](x: Self) {
    
    inline def setAutolink(
      value: js.ThisFunction2[
          /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
          /* src */ String, 
          /* mangle */ js.Function1[/* cap */ String, String], 
          Link | `false`
        ]
    ): Self = StObject.set(x, "autolink", value.asInstanceOf[js.Any])
    
    inline def setAutolinkUndefined: Self = StObject.set(x, "autolink", js.undefined)
    
    inline def setBlockquote(
      value: js.ThisFunction1[
          /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
          /* src */ String, 
          Blockquote | `false`
        ]
    ): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
    
    inline def setBlockquoteUndefined: Self = StObject.set(x, "blockquote", js.undefined)
    
    inline def setBr(
      value: js.ThisFunction1[/* this */ Tokenizer[scala.Nothing] & TokenizerThis, /* src */ String, Br | `false`]
    ): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
    
    inline def setBrUndefined: Self = StObject.set(x, "br", js.undefined)
    
    inline def setCode(
      value: js.ThisFunction1[
          /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
          /* src */ String, 
          Code | `false`
        ]
    ): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCodespan(
      value: js.ThisFunction1[
          /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
          /* src */ String, 
          Codespan | `false`
        ]
    ): Self = StObject.set(x, "codespan", value.asInstanceOf[js.Any])
    
    inline def setCodespanUndefined: Self = StObject.set(x, "codespan", js.undefined)
    
    inline def setDef(
      value: js.ThisFunction1[/* this */ Tokenizer[scala.Nothing] & TokenizerThis, /* src */ String, Def | `false`]
    ): Self = StObject.set(x, "def", value.asInstanceOf[js.Any])
    
    inline def setDefUndefined: Self = StObject.set(x, "def", js.undefined)
    
    inline def setDel(
      value: js.ThisFunction1[/* this */ Tokenizer[scala.Nothing] & TokenizerThis, /* src */ String, Del | `false`]
    ): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
    
    inline def setDelUndefined: Self = StObject.set(x, "del", js.undefined)
    
    inline def setEmStrong(
      value: js.ThisFunction3[
          /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
          /* src */ String, 
          /* maskedSrc */ String, 
          /* prevChar */ String, 
          Em | Strong | `false`
        ]
    ): Self = StObject.set(x, "emStrong", value.asInstanceOf[js.Any])
    
    inline def setEmStrongUndefined: Self = StObject.set(x, "emStrong", js.undefined)
    
    inline def setEscape(
      value: js.ThisFunction1[
          /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
          /* src */ String, 
          Escape | `false`
        ]
    ): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
    
    inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
    
    inline def setFences(
      value: js.ThisFunction1[
          /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
          /* src */ String, 
          Code | `false`
        ]
    ): Self = StObject.set(x, "fences", value.asInstanceOf[js.Any])
    
    inline def setFencesUndefined: Self = StObject.set(x, "fences", js.undefined)
    
    inline def setHeading(
      value: js.ThisFunction1[
          /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
          /* src */ String, 
          Heading | `false`
        ]
    ): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    inline def setHr(
      value: js.ThisFunction1[/* this */ Tokenizer[scala.Nothing] & TokenizerThis, /* src */ String, Hr | `false`]
    ): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
    
    inline def setHrUndefined: Self = StObject.set(x, "hr", js.undefined)
    
    inline def setHtml(
      value: js.ThisFunction1[
          /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
          /* src */ String, 
          HTML | `false`
        ]
    ): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setInlineText(
      value: js.ThisFunction2[
          /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
          /* src */ String, 
          /* smartypants */ js.Function1[/* cap */ String, String], 
          Text | `false`
        ]
    ): Self = StObject.set(x, "inlineText", value.asInstanceOf[js.Any])
    
    inline def setInlineTextUndefined: Self = StObject.set(x, "inlineText", js.undefined)
    
    inline def setLheading(
      value: js.ThisFunction1[
          /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
          /* src */ String, 
          Heading | `false`
        ]
    ): Self = StObject.set(x, "lheading", value.asInstanceOf[js.Any])
    
    inline def setLheadingUndefined: Self = StObject.set(x, "lheading", js.undefined)
    
    inline def setLink(
      value: js.ThisFunction1[
          /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
          /* src */ String, 
          Image | Link | `false`
        ]
    ): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setList(
      value: js.ThisFunction1[
          /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
          /* src */ String, 
          typings.marked.mod.marked.Tokens.List | `false`
        ]
    ): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    inline def setParagraph(
      value: js.ThisFunction1[
          /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
          /* src */ String, 
          Paragraph | `false`
        ]
    ): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
    
    inline def setParagraphUndefined: Self = StObject.set(x, "paragraph", js.undefined)
    
    inline def setReflink(
      value: js.ThisFunction2[
          /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
          /* src */ String, 
          /* links */ js.Array[Image | Link], 
          Link | Image | Text | `false`
        ]
    ): Self = StObject.set(x, "reflink", value.asInstanceOf[js.Any])
    
    inline def setReflinkUndefined: Self = StObject.set(x, "reflink", js.undefined)
    
    inline def setSpace(
      value: js.ThisFunction1[
          /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
          /* src */ String, 
          Space | `false`
        ]
    ): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    
    inline def setTable(
      value: js.ThisFunction1[
          /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
          /* src */ String, 
          Table | `false`
        ]
    ): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    inline def setTag(
      value: js.ThisFunction1[/* this */ Tokenizer[scala.Nothing] & TokenizerThis, /* src */ String, Tag | `false`]
    ): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setText(
      value: js.ThisFunction1[
          /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
          /* src */ String, 
          Text | `false`
        ]
    ): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUrl(
      value: js.ThisFunction2[
          /* this */ Tokenizer[scala.Nothing] & TokenizerThis, 
          /* src */ String, 
          /* mangle */ js.Function1[/* cap */ String, String], 
          Link | `false`
        ]
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
