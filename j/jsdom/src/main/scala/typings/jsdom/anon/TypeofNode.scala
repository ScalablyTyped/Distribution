package typings.jsdom.anon

import typings.jsdom.jsdomInts.`0x01`
import typings.jsdom.jsdomInts.`0x02`
import typings.jsdom.jsdomInts.`0x04`
import typings.jsdom.jsdomInts.`0x08`
import typings.jsdom.jsdomInts.`0x10`
import typings.jsdom.jsdomInts.`0x20`
import typings.jsdom.jsdomInts.`10`
import typings.jsdom.jsdomInts.`11`
import typings.jsdom.jsdomInts.`12`
import typings.jsdom.jsdomInts.`1`
import typings.jsdom.jsdomInts.`2`
import typings.jsdom.jsdomInts.`3`
import typings.jsdom.jsdomInts.`4`
import typings.jsdom.jsdomInts.`5`
import typings.jsdom.jsdomInts.`6`
import typings.jsdom.jsdomInts.`7`
import typings.jsdom.jsdomInts.`8`
import typings.jsdom.jsdomInts.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofNode extends StObject {
  
  /* standard dom */
  val ATTRIBUTE_NODE: `2`
  
  /** node is a CDATASection node. */
  /* standard dom */
  val CDATA_SECTION_NODE: `4`
  
  /** node is a Comment node. */
  /* standard dom */
  val COMMENT_NODE: `8`
  
  /** node is a DocumentFragment node. */
  /* standard dom */
  val DOCUMENT_FRAGMENT_NODE: `11`
  
  /** node is a document. */
  /* standard dom */
  val DOCUMENT_NODE: `9`
  
  /** Set when other is a descendant of node. */
  /* standard dom */
  val DOCUMENT_POSITION_CONTAINED_BY: `0x10`
  
  /** Set when other is an ancestor of node. */
  /* standard dom */
  val DOCUMENT_POSITION_CONTAINS: `0x08`
  
  /** Set when node and other are not in the same tree. */
  /* standard dom */
  val DOCUMENT_POSITION_DISCONNECTED: `0x01`
  
  /** Set when other is following node. */
  /* standard dom */
  val DOCUMENT_POSITION_FOLLOWING: `0x04`
  
  /* standard dom */
  val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: `0x20`
  
  /** Set when other is preceding node. */
  /* standard dom */
  val DOCUMENT_POSITION_PRECEDING: `0x02`
  
  /** node is a doctype. */
  /* standard dom */
  val DOCUMENT_TYPE_NODE: `10`
  
  /** node is an element. */
  /* standard dom */
  val ELEMENT_NODE: `1`
  
  /* standard dom */
  val ENTITY_NODE: `6`
  
  /* standard dom */
  val ENTITY_REFERENCE_NODE: `5`
  
  /* standard dom */
  val NOTATION_NODE: `12`
  
  /** node is a ProcessingInstruction node. */
  /* standard dom */
  val PROCESSING_INSTRUCTION_NODE: `7`
  
  /** node is a Text node. */
  /* standard dom */
  val TEXT_NODE: `3`
}
object TypeofNode {
  
  inline def apply(): TypeofNode = {
    val __obj = js.Dynamic.literal(ATTRIBUTE_NODE = 2, CDATA_SECTION_NODE = 4, COMMENT_NODE = 8, DOCUMENT_FRAGMENT_NODE = 11, DOCUMENT_NODE = 9, DOCUMENT_POSITION_CONTAINED_BY = 0x10, DOCUMENT_POSITION_CONTAINS = 0x08, DOCUMENT_POSITION_DISCONNECTED = 0x01, DOCUMENT_POSITION_FOLLOWING = 0x04, DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC = 0x20, DOCUMENT_POSITION_PRECEDING = 0x02, DOCUMENT_TYPE_NODE = 10, ELEMENT_NODE = 1, ENTITY_NODE = 6, ENTITY_REFERENCE_NODE = 5, NOTATION_NODE = 12, PROCESSING_INSTRUCTION_NODE = 7, TEXT_NODE = 3)
    __obj.asInstanceOf[TypeofNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofNode] (val x: Self) extends AnyVal {
    
    inline def setATTRIBUTE_NODE(value: `2`): Self = StObject.set(x, "ATTRIBUTE_NODE", value.asInstanceOf[js.Any])
    
    inline def setCDATA_SECTION_NODE(value: `4`): Self = StObject.set(x, "CDATA_SECTION_NODE", value.asInstanceOf[js.Any])
    
    inline def setCOMMENT_NODE(value: `8`): Self = StObject.set(x, "COMMENT_NODE", value.asInstanceOf[js.Any])
    
    inline def setDOCUMENT_FRAGMENT_NODE(value: `11`): Self = StObject.set(x, "DOCUMENT_FRAGMENT_NODE", value.asInstanceOf[js.Any])
    
    inline def setDOCUMENT_NODE(value: `9`): Self = StObject.set(x, "DOCUMENT_NODE", value.asInstanceOf[js.Any])
    
    inline def setDOCUMENT_POSITION_CONTAINED_BY(value: `0x10`): Self = StObject.set(x, "DOCUMENT_POSITION_CONTAINED_BY", value.asInstanceOf[js.Any])
    
    inline def setDOCUMENT_POSITION_CONTAINS(value: `0x08`): Self = StObject.set(x, "DOCUMENT_POSITION_CONTAINS", value.asInstanceOf[js.Any])
    
    inline def setDOCUMENT_POSITION_DISCONNECTED(value: `0x01`): Self = StObject.set(x, "DOCUMENT_POSITION_DISCONNECTED", value.asInstanceOf[js.Any])
    
    inline def setDOCUMENT_POSITION_FOLLOWING(value: `0x04`): Self = StObject.set(x, "DOCUMENT_POSITION_FOLLOWING", value.asInstanceOf[js.Any])
    
    inline def setDOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC(value: `0x20`): Self = StObject.set(x, "DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC", value.asInstanceOf[js.Any])
    
    inline def setDOCUMENT_POSITION_PRECEDING(value: `0x02`): Self = StObject.set(x, "DOCUMENT_POSITION_PRECEDING", value.asInstanceOf[js.Any])
    
    inline def setDOCUMENT_TYPE_NODE(value: `10`): Self = StObject.set(x, "DOCUMENT_TYPE_NODE", value.asInstanceOf[js.Any])
    
    inline def setELEMENT_NODE(value: `1`): Self = StObject.set(x, "ELEMENT_NODE", value.asInstanceOf[js.Any])
    
    inline def setENTITY_NODE(value: `6`): Self = StObject.set(x, "ENTITY_NODE", value.asInstanceOf[js.Any])
    
    inline def setENTITY_REFERENCE_NODE(value: `5`): Self = StObject.set(x, "ENTITY_REFERENCE_NODE", value.asInstanceOf[js.Any])
    
    inline def setNOTATION_NODE(value: `12`): Self = StObject.set(x, "NOTATION_NODE", value.asInstanceOf[js.Any])
    
    inline def setPROCESSING_INSTRUCTION_NODE(value: `7`): Self = StObject.set(x, "PROCESSING_INSTRUCTION_NODE", value.asInstanceOf[js.Any])
    
    inline def setTEXT_NODE(value: `3`): Self = StObject.set(x, "TEXT_NODE", value.asInstanceOf[js.Any])
  }
}
