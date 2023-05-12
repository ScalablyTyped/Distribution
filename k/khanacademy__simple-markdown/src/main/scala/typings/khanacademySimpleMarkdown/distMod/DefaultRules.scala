package typings.khanacademySimpleMarkdown.distMod

import typings.khanacademySimpleMarkdown.anon.Html
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultRules extends StObject {
  
  val Array: Html
  
  val autolink: DefaultInRule
  
  val blockQuote: DefaultInOutRule
  
  val br: DefaultInOutRule
  
  val codeBlock: DefaultInOutRule
  
  val `def`: LenientInOutRule
  
  val del: DefaultInOutRule
  
  val em: DefaultInOutRule
  
  val escape: DefaultInRule
  
  val fence: DefaultInRule
  
  val heading: DefaultInOutRule
  
  val hr: DefaultInOutRule
  
  val image: DefaultInOutRule
  
  val inlineCode: DefaultInOutRule
  
  val lheading: DefaultInRule
  
  val link: DefaultInOutRule
  
  val list: DefaultInOutRule
  
  val mailto: DefaultInRule
  
  val newline: TextInOutRule
  
  val nptable: DefaultInRule
  
  val paragraph: DefaultInOutRule
  
  val refimage: DefaultInRule
  
  val reflink: DefaultInRule
  
  val strong: DefaultInOutRule
  
  val table: DefaultInOutRule
  
  val tableSeparator: DefaultInRule
  
  val text: TextInOutRule
  
  val u: DefaultInOutRule
  
  val url: DefaultInRule
}
object DefaultRules {
  
  inline def apply(
    Array: Html,
    autolink: DefaultInRule,
    blockQuote: DefaultInOutRule,
    br: DefaultInOutRule,
    codeBlock: DefaultInOutRule,
    `def`: LenientInOutRule,
    del: DefaultInOutRule,
    em: DefaultInOutRule,
    escape: DefaultInRule,
    fence: DefaultInRule,
    heading: DefaultInOutRule,
    hr: DefaultInOutRule,
    image: DefaultInOutRule,
    inlineCode: DefaultInOutRule,
    lheading: DefaultInRule,
    link: DefaultInOutRule,
    list: DefaultInOutRule,
    mailto: DefaultInRule,
    newline: TextInOutRule,
    nptable: DefaultInRule,
    paragraph: DefaultInOutRule,
    refimage: DefaultInRule,
    reflink: DefaultInRule,
    strong: DefaultInOutRule,
    table: DefaultInOutRule,
    tableSeparator: DefaultInRule,
    text: TextInOutRule,
    u: DefaultInOutRule,
    url: DefaultInRule
  ): DefaultRules = {
    val __obj = js.Dynamic.literal(Array = Array.asInstanceOf[js.Any], autolink = autolink.asInstanceOf[js.Any], blockQuote = blockQuote.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], codeBlock = codeBlock.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], em = em.asInstanceOf[js.Any], escape = escape.asInstanceOf[js.Any], fence = fence.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], hr = hr.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], inlineCode = inlineCode.asInstanceOf[js.Any], lheading = lheading.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], mailto = mailto.asInstanceOf[js.Any], newline = newline.asInstanceOf[js.Any], nptable = nptable.asInstanceOf[js.Any], paragraph = paragraph.asInstanceOf[js.Any], refimage = refimage.asInstanceOf[js.Any], reflink = reflink.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], tableSeparator = tableSeparator.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultRules]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultRules] (val x: Self) extends AnyVal {
    
    inline def setArray(value: Html): Self = StObject.set(x, "Array", value.asInstanceOf[js.Any])
    
    inline def setAutolink(value: DefaultInRule): Self = StObject.set(x, "autolink", value.asInstanceOf[js.Any])
    
    inline def setBlockQuote(value: DefaultInOutRule): Self = StObject.set(x, "blockQuote", value.asInstanceOf[js.Any])
    
    inline def setBr(value: DefaultInOutRule): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
    
    inline def setCodeBlock(value: DefaultInOutRule): Self = StObject.set(x, "codeBlock", value.asInstanceOf[js.Any])
    
    inline def setDef(value: LenientInOutRule): Self = StObject.set(x, "def", value.asInstanceOf[js.Any])
    
    inline def setDel(value: DefaultInOutRule): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
    
    inline def setEm(value: DefaultInOutRule): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
    
    inline def setEscape(value: DefaultInRule): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
    
    inline def setFence(value: DefaultInRule): Self = StObject.set(x, "fence", value.asInstanceOf[js.Any])
    
    inline def setHeading(value: DefaultInOutRule): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHr(value: DefaultInOutRule): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
    
    inline def setImage(value: DefaultInOutRule): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setInlineCode(value: DefaultInOutRule): Self = StObject.set(x, "inlineCode", value.asInstanceOf[js.Any])
    
    inline def setLheading(value: DefaultInRule): Self = StObject.set(x, "lheading", value.asInstanceOf[js.Any])
    
    inline def setLink(value: DefaultInOutRule): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setList(value: DefaultInOutRule): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setMailto(value: DefaultInRule): Self = StObject.set(x, "mailto", value.asInstanceOf[js.Any])
    
    inline def setNewline(value: TextInOutRule): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
    
    inline def setNptable(value: DefaultInRule): Self = StObject.set(x, "nptable", value.asInstanceOf[js.Any])
    
    inline def setParagraph(value: DefaultInOutRule): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
    
    inline def setRefimage(value: DefaultInRule): Self = StObject.set(x, "refimage", value.asInstanceOf[js.Any])
    
    inline def setReflink(value: DefaultInRule): Self = StObject.set(x, "reflink", value.asInstanceOf[js.Any])
    
    inline def setStrong(value: DefaultInOutRule): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
    
    inline def setTable(value: DefaultInOutRule): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableSeparator(value: DefaultInRule): Self = StObject.set(x, "tableSeparator", value.asInstanceOf[js.Any])
    
    inline def setText(value: TextInOutRule): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setU(value: DefaultInOutRule): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: DefaultInRule): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
