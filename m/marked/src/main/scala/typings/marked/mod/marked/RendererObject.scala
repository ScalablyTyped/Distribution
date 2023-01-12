package typings.marked.mod.marked

import typings.marked.anon.Align
import typings.marked.markedBooleans.`false`
import typings.marked.markedInts.`1`
import typings.marked.markedInts.`2`
import typings.marked.markedInts.`3`
import typings.marked.markedInts.`4`
import typings.marked.markedInts.`5`
import typings.marked.markedInts.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Omit<marked.marked.marked.Renderer<false>, 'constructor' | 'options'>> */
trait RendererObject extends StObject {
  
  var blockquote: js.UndefOr[
    js.ThisFunction1[
      /* this */ Renderer[scala.Nothing] | RendererThis, 
      /* quote */ String, 
      String | `false`
    ]
  ] = js.undefined
  
  var br: js.UndefOr[
    js.ThisFunction0[/* this */ Renderer[scala.Nothing] | RendererThis, String | `false`]
  ] = js.undefined
  
  var checkbox: js.UndefOr[
    js.ThisFunction1[
      /* this */ Renderer[scala.Nothing] | RendererThis, 
      /* checked */ Boolean, 
      String | `false`
    ]
  ] = js.undefined
  
  var code: js.UndefOr[
    js.ThisFunction3[
      /* this */ Renderer[scala.Nothing] | RendererThis, 
      /* code */ String, 
      /* language */ js.UndefOr[String], 
      /* isEscaped */ Boolean, 
      String | `false`
    ]
  ] = js.undefined
  
  var codespan: js.UndefOr[
    js.ThisFunction1[
      /* this */ Renderer[scala.Nothing] | RendererThis, 
      /* code */ String, 
      String | `false`
    ]
  ] = js.undefined
  
  var del: js.UndefOr[
    js.ThisFunction1[
      /* this */ Renderer[scala.Nothing] | RendererThis, 
      /* text */ String, 
      String | `false`
    ]
  ] = js.undefined
  
  var em: js.UndefOr[
    js.ThisFunction1[
      /* this */ Renderer[scala.Nothing] | RendererThis, 
      /* text */ String, 
      String | `false`
    ]
  ] = js.undefined
  
  var heading: js.UndefOr[
    js.ThisFunction4[
      /* this */ Renderer[scala.Nothing] | RendererThis, 
      /* text */ String, 
      /* level */ `1` | `2` | `3` | `4` | `5` | `6`, 
      /* raw */ String, 
      /* slugger */ Slugger, 
      String | `false`
    ]
  ] = js.undefined
  
  var hr: js.UndefOr[
    js.ThisFunction0[/* this */ Renderer[scala.Nothing] | RendererThis, String | `false`]
  ] = js.undefined
  
  var html: js.UndefOr[
    js.ThisFunction1[
      /* this */ Renderer[scala.Nothing] | RendererThis, 
      /* html */ String, 
      String | `false`
    ]
  ] = js.undefined
  
  var image: js.UndefOr[
    js.ThisFunction3[
      /* this */ Renderer[scala.Nothing] | RendererThis, 
      /* href */ String | Null, 
      /* title */ String | Null, 
      /* text */ String, 
      String | `false`
    ]
  ] = js.undefined
  
  var link: js.UndefOr[
    js.ThisFunction3[
      /* this */ Renderer[scala.Nothing] | RendererThis, 
      /* href */ String | Null, 
      /* title */ String | Null, 
      /* text */ String, 
      String | `false`
    ]
  ] = js.undefined
  
  var list: js.UndefOr[
    js.ThisFunction3[
      /* this */ Renderer[scala.Nothing] | RendererThis, 
      /* body */ String, 
      /* ordered */ Boolean, 
      /* start */ Double, 
      String | `false`
    ]
  ] = js.undefined
  
  var listitem: js.UndefOr[
    js.ThisFunction3[
      /* this */ Renderer[scala.Nothing] | RendererThis, 
      /* text */ String, 
      /* task */ Boolean, 
      /* checked */ Boolean, 
      String | `false`
    ]
  ] = js.undefined
  
  var paragraph: js.UndefOr[
    js.ThisFunction1[
      /* this */ Renderer[scala.Nothing] | RendererThis, 
      /* text */ String, 
      String | `false`
    ]
  ] = js.undefined
  
  var strong: js.UndefOr[
    js.ThisFunction1[
      /* this */ Renderer[scala.Nothing] | RendererThis, 
      /* text */ String, 
      String | `false`
    ]
  ] = js.undefined
  
  var table: js.UndefOr[
    js.ThisFunction2[
      /* this */ Renderer[scala.Nothing] | RendererThis, 
      /* header */ String, 
      /* body */ String, 
      String | `false`
    ]
  ] = js.undefined
  
  var tablecell: js.UndefOr[
    js.ThisFunction2[
      /* this */ Renderer[scala.Nothing] | RendererThis, 
      /* content */ String, 
      /* flags */ Align, 
      String | `false`
    ]
  ] = js.undefined
  
  var tablerow: js.UndefOr[
    js.ThisFunction1[
      /* this */ Renderer[scala.Nothing] | RendererThis, 
      /* content */ String, 
      String | `false`
    ]
  ] = js.undefined
  
  var text: js.UndefOr[
    js.ThisFunction1[
      /* this */ Renderer[scala.Nothing] | RendererThis, 
      /* text */ String, 
      String | `false`
    ]
  ] = js.undefined
}
object RendererObject {
  
  inline def apply(): RendererObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RendererObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RendererObject] (val x: Self) extends AnyVal {
    
    inline def setBlockquote(
      value: js.ThisFunction1[
          /* this */ Renderer[scala.Nothing] | RendererThis, 
          /* quote */ String, 
          String | `false`
        ]
    ): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
    
    inline def setBlockquoteUndefined: Self = StObject.set(x, "blockquote", js.undefined)
    
    inline def setBr(value: js.ThisFunction0[/* this */ Renderer[scala.Nothing] | RendererThis, String | `false`]): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
    
    inline def setBrUndefined: Self = StObject.set(x, "br", js.undefined)
    
    inline def setCheckbox(
      value: js.ThisFunction1[
          /* this */ Renderer[scala.Nothing] | RendererThis, 
          /* checked */ Boolean, 
          String | `false`
        ]
    ): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
    
    inline def setCheckboxUndefined: Self = StObject.set(x, "checkbox", js.undefined)
    
    inline def setCode(
      value: js.ThisFunction3[
          /* this */ Renderer[scala.Nothing] | RendererThis, 
          /* code */ String, 
          /* language */ js.UndefOr[String], 
          /* isEscaped */ Boolean, 
          String | `false`
        ]
    ): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCodespan(
      value: js.ThisFunction1[
          /* this */ Renderer[scala.Nothing] | RendererThis, 
          /* code */ String, 
          String | `false`
        ]
    ): Self = StObject.set(x, "codespan", value.asInstanceOf[js.Any])
    
    inline def setCodespanUndefined: Self = StObject.set(x, "codespan", js.undefined)
    
    inline def setDel(
      value: js.ThisFunction1[
          /* this */ Renderer[scala.Nothing] | RendererThis, 
          /* text */ String, 
          String | `false`
        ]
    ): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
    
    inline def setDelUndefined: Self = StObject.set(x, "del", js.undefined)
    
    inline def setEm(
      value: js.ThisFunction1[
          /* this */ Renderer[scala.Nothing] | RendererThis, 
          /* text */ String, 
          String | `false`
        ]
    ): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
    
    inline def setEmUndefined: Self = StObject.set(x, "em", js.undefined)
    
    inline def setHeading(
      value: js.ThisFunction4[
          /* this */ Renderer[scala.Nothing] | RendererThis, 
          /* text */ String, 
          /* level */ `1` | `2` | `3` | `4` | `5` | `6`, 
          /* raw */ String, 
          /* slugger */ Slugger, 
          String | `false`
        ]
    ): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    inline def setHr(value: js.ThisFunction0[/* this */ Renderer[scala.Nothing] | RendererThis, String | `false`]): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
    
    inline def setHrUndefined: Self = StObject.set(x, "hr", js.undefined)
    
    inline def setHtml(
      value: js.ThisFunction1[
          /* this */ Renderer[scala.Nothing] | RendererThis, 
          /* html */ String, 
          String | `false`
        ]
    ): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setImage(
      value: js.ThisFunction3[
          /* this */ Renderer[scala.Nothing] | RendererThis, 
          /* href */ String | Null, 
          /* title */ String | Null, 
          /* text */ String, 
          String | `false`
        ]
    ): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLink(
      value: js.ThisFunction3[
          /* this */ Renderer[scala.Nothing] | RendererThis, 
          /* href */ String | Null, 
          /* title */ String | Null, 
          /* text */ String, 
          String | `false`
        ]
    ): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setList(
      value: js.ThisFunction3[
          /* this */ Renderer[scala.Nothing] | RendererThis, 
          /* body */ String, 
          /* ordered */ Boolean, 
          /* start */ Double, 
          String | `false`
        ]
    ): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    inline def setListitem(
      value: js.ThisFunction3[
          /* this */ Renderer[scala.Nothing] | RendererThis, 
          /* text */ String, 
          /* task */ Boolean, 
          /* checked */ Boolean, 
          String | `false`
        ]
    ): Self = StObject.set(x, "listitem", value.asInstanceOf[js.Any])
    
    inline def setListitemUndefined: Self = StObject.set(x, "listitem", js.undefined)
    
    inline def setParagraph(
      value: js.ThisFunction1[
          /* this */ Renderer[scala.Nothing] | RendererThis, 
          /* text */ String, 
          String | `false`
        ]
    ): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
    
    inline def setParagraphUndefined: Self = StObject.set(x, "paragraph", js.undefined)
    
    inline def setStrong(
      value: js.ThisFunction1[
          /* this */ Renderer[scala.Nothing] | RendererThis, 
          /* text */ String, 
          String | `false`
        ]
    ): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
    
    inline def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
    
    inline def setTable(
      value: js.ThisFunction2[
          /* this */ Renderer[scala.Nothing] | RendererThis, 
          /* header */ String, 
          /* body */ String, 
          String | `false`
        ]
    ): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    inline def setTablecell(
      value: js.ThisFunction2[
          /* this */ Renderer[scala.Nothing] | RendererThis, 
          /* content */ String, 
          /* flags */ Align, 
          String | `false`
        ]
    ): Self = StObject.set(x, "tablecell", value.asInstanceOf[js.Any])
    
    inline def setTablecellUndefined: Self = StObject.set(x, "tablecell", js.undefined)
    
    inline def setTablerow(
      value: js.ThisFunction1[
          /* this */ Renderer[scala.Nothing] | RendererThis, 
          /* content */ String, 
          String | `false`
        ]
    ): Self = StObject.set(x, "tablerow", value.asInstanceOf[js.Any])
    
    inline def setTablerowUndefined: Self = StObject.set(x, "tablerow", js.undefined)
    
    inline def setText(
      value: js.ThisFunction1[
          /* this */ Renderer[scala.Nothing] | RendererThis, 
          /* text */ String, 
          String | `false`
        ]
    ): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
