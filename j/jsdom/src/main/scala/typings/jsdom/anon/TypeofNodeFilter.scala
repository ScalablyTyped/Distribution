package typings.jsdom.anon

import typings.jsdom.jsdomInts.`0x100`
import typings.jsdom.jsdomInts.`0x10`
import typings.jsdom.jsdomInts.`0x1`
import typings.jsdom.jsdomInts.`0x200`
import typings.jsdom.jsdomInts.`0x20`
import typings.jsdom.jsdomInts.`0x2`
import typings.jsdom.jsdomInts.`0x400`
import typings.jsdom.jsdomInts.`0x40`
import typings.jsdom.jsdomInts.`0x4`
import typings.jsdom.jsdomInts.`0x800`
import typings.jsdom.jsdomInts.`0x80`
import typings.jsdom.jsdomInts.`0x8`
import typings.jsdom.jsdomInts.`1`
import typings.jsdom.jsdomInts.`2`
import typings.jsdom.jsdomInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofNodeFilter extends StObject {
  
  /* standard dom */
  val FILTER_ACCEPT: `1`
  
  /* standard dom */
  val FILTER_REJECT: `2`
  
  /* standard dom */
  val FILTER_SKIP: `3`
  
  /* standard dom */
  val SHOW_ALL: /* 0xFFFFFFFF */ Double
  
  /* standard dom */
  val SHOW_ATTRIBUTE: `0x2`
  
  /* standard dom */
  val SHOW_CDATA_SECTION: `0x8`
  
  /* standard dom */
  val SHOW_COMMENT: `0x80`
  
  /* standard dom */
  val SHOW_DOCUMENT: `0x100`
  
  /* standard dom */
  val SHOW_DOCUMENT_FRAGMENT: `0x400`
  
  /* standard dom */
  val SHOW_DOCUMENT_TYPE: `0x200`
  
  /* standard dom */
  val SHOW_ELEMENT: `0x1`
  
  /* standard dom */
  val SHOW_ENTITY: `0x20`
  
  /* standard dom */
  val SHOW_ENTITY_REFERENCE: `0x10`
  
  /* standard dom */
  val SHOW_NOTATION: `0x800`
  
  /* standard dom */
  val SHOW_PROCESSING_INSTRUCTION: `0x40`
  
  /* standard dom */
  val SHOW_TEXT: `0x4`
}
object TypeofNodeFilter {
  
  inline def apply(SHOW_ALL: /* 0xFFFFFFFF */ Double): TypeofNodeFilter = {
    val __obj = js.Dynamic.literal(FILTER_ACCEPT = 1, FILTER_REJECT = 2, FILTER_SKIP = 3, SHOW_ALL = SHOW_ALL.asInstanceOf[js.Any], SHOW_ATTRIBUTE = 0x2, SHOW_CDATA_SECTION = 0x8, SHOW_COMMENT = 0x80, SHOW_DOCUMENT = 0x100, SHOW_DOCUMENT_FRAGMENT = 0x400, SHOW_DOCUMENT_TYPE = 0x200, SHOW_ELEMENT = 0x1, SHOW_ENTITY = 0x20, SHOW_ENTITY_REFERENCE = 0x10, SHOW_NOTATION = 0x800, SHOW_PROCESSING_INSTRUCTION = 0x40, SHOW_TEXT = 0x4)
    __obj.asInstanceOf[TypeofNodeFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofNodeFilter] (val x: Self) extends AnyVal {
    
    inline def setFILTER_ACCEPT(value: `1`): Self = StObject.set(x, "FILTER_ACCEPT", value.asInstanceOf[js.Any])
    
    inline def setFILTER_REJECT(value: `2`): Self = StObject.set(x, "FILTER_REJECT", value.asInstanceOf[js.Any])
    
    inline def setFILTER_SKIP(value: `3`): Self = StObject.set(x, "FILTER_SKIP", value.asInstanceOf[js.Any])
    
    inline def setSHOW_ALL(value: /* 0xFFFFFFFF */ Double): Self = StObject.set(x, "SHOW_ALL", value.asInstanceOf[js.Any])
    
    inline def setSHOW_ATTRIBUTE(value: `0x2`): Self = StObject.set(x, "SHOW_ATTRIBUTE", value.asInstanceOf[js.Any])
    
    inline def setSHOW_CDATA_SECTION(value: `0x8`): Self = StObject.set(x, "SHOW_CDATA_SECTION", value.asInstanceOf[js.Any])
    
    inline def setSHOW_COMMENT(value: `0x80`): Self = StObject.set(x, "SHOW_COMMENT", value.asInstanceOf[js.Any])
    
    inline def setSHOW_DOCUMENT(value: `0x100`): Self = StObject.set(x, "SHOW_DOCUMENT", value.asInstanceOf[js.Any])
    
    inline def setSHOW_DOCUMENT_FRAGMENT(value: `0x400`): Self = StObject.set(x, "SHOW_DOCUMENT_FRAGMENT", value.asInstanceOf[js.Any])
    
    inline def setSHOW_DOCUMENT_TYPE(value: `0x200`): Self = StObject.set(x, "SHOW_DOCUMENT_TYPE", value.asInstanceOf[js.Any])
    
    inline def setSHOW_ELEMENT(value: `0x1`): Self = StObject.set(x, "SHOW_ELEMENT", value.asInstanceOf[js.Any])
    
    inline def setSHOW_ENTITY(value: `0x20`): Self = StObject.set(x, "SHOW_ENTITY", value.asInstanceOf[js.Any])
    
    inline def setSHOW_ENTITY_REFERENCE(value: `0x10`): Self = StObject.set(x, "SHOW_ENTITY_REFERENCE", value.asInstanceOf[js.Any])
    
    inline def setSHOW_NOTATION(value: `0x800`): Self = StObject.set(x, "SHOW_NOTATION", value.asInstanceOf[js.Any])
    
    inline def setSHOW_PROCESSING_INSTRUCTION(value: `0x40`): Self = StObject.set(x, "SHOW_PROCESSING_INSTRUCTION", value.asInstanceOf[js.Any])
    
    inline def setSHOW_TEXT(value: `0x4`): Self = StObject.set(x, "SHOW_TEXT", value.asInstanceOf[js.Any])
  }
}
