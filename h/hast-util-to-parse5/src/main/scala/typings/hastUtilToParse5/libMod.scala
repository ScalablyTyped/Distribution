package typings.hastUtilToParse5

import typings.hast.mod.DocType
import typings.std.Document
import typings.std.DocumentFragment
import typings.std.DocumentType
import typings.std.ParentNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("hast-util-to-parse5/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toParse5(tree: Node): P5Node = ^.asInstanceOf[js.Dynamic].applyDynamic("toParse5")(tree.asInstanceOf[js.Any]).asInstanceOf[P5Node]
  inline def toParse5(tree: Node, space: Space): P5Node = (^.asInstanceOf[js.Dynamic].applyDynamic("toParse5")(tree.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[P5Node]
  
  type Child = /* import warning: importer.ImportType#apply Failed type conversion: std.Array<hast.hast.Content>[number] */ js.Any
  
  type Comment = typings.hast.mod.Comment
  
  type Doctype = DocType
  
  type Element = typings.hast.mod.Element
  
  type Handle = js.Function2[/* node */ Node, /* schema */ Schema, P5Node]
  
  type Info = typings.propertyInformation.mod.Info
  
  type Node = Child | Root
  
  type P5Attribute = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_parse5.Attribute */ Any
  
  /* Inlined std.Exclude<hast-util-to-parse5.hast-util-to-parse5/lib.P5Node, hast-util-to-parse5.hast-util-to-parse5/lib.P5Document | hast-util-to-parse5.hast-util-to-parse5/lib.P5Fragment> */
  /* Rewritten from type alias, can be one of: 
    - typings.hastUtilToParse5.hastUtilToParse5Strings.ATTRIBUTE_NODE
    - typings.hastUtilToParse5.hastUtilToParse5Strings.isEqualNode
    - typings.hastUtilToParse5.hastUtilToParse5Strings.baseURI
    - typings.hastUtilToParse5.hastUtilToParse5Strings.NOTATION_NODE
    - typings.hastUtilToParse5.hastUtilToParse5Strings.replaceChild
    - typings.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_TYPE_NODE
    - typings.hastUtilToParse5.hastUtilToParse5Strings.getRootNode
    - typings.hastUtilToParse5.hastUtilToParse5Strings.CDATA_SECTION_NODE
    - typings.hastUtilToParse5.hastUtilToParse5Strings.firstChild
    - typings.hastUtilToParse5.hastUtilToParse5Strings.normalize
    - typings.hastUtilToParse5.hastUtilToParse5Strings.PROCESSING_INSTRUCTION_NODE
    - typings.hastUtilToParse5.hastUtilToParse5Strings.contains
    - typings.hastUtilToParse5.hastUtilToParse5Strings.isConnected
    - typings.hastUtilToParse5.hastUtilToParse5Strings.appendChild
    - typings.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_CONTAINED_BY
    - typings.hastUtilToParse5.hastUtilToParse5Strings.TEXT_NODE
    - typings.hastUtilToParse5.hastUtilToParse5Strings.childNodes
    - typings.hastUtilToParse5.hastUtilToParse5Strings.lastChild
    - typings.hastUtilToParse5.hastUtilToParse5Strings.insertBefore
    - typings.hastUtilToParse5.hastUtilToParse5Strings.ENTITY_NODE
    - typings.hastUtilToParse5.hastUtilToParse5Strings.nextSibling
    - typings.hastUtilToParse5.hastUtilToParse5Strings.textContent
    - typings.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC
    - typings.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_PRECEDING
    - typings.hastUtilToParse5.hastUtilToParse5Strings.cloneNode
    - typings.hastUtilToParse5.hastUtilToParse5Strings.ENTITY_REFERENCE_NODE
    - typings.hastUtilToParse5.hastUtilToParse5Strings.compareDocumentPosition
    - typings.hastUtilToParse5.hastUtilToParse5Strings.removeChild
    - typings.hastUtilToParse5.hastUtilToParse5Strings.previousSibling
    - typings.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_DISCONNECTED
    - typings.hastUtilToParse5.hastUtilToParse5Strings.lookupNamespaceURI
    - typings.hastUtilToParse5.hastUtilToParse5Strings.isSameNode
    - typings.hastUtilToParse5.hastUtilToParse5Strings.parentNode
    - typings.hastUtilToParse5.hastUtilToParse5Strings.nodeValue
    - typings.hastUtilToParse5.hastUtilToParse5Strings.nodeType
    - typings.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_CONTAINS
    - typings.hastUtilToParse5.hastUtilToParse5Strings.COMMENT_NODE
    - typings.hastUtilToParse5.hastUtilToParse5Strings.lookupPrefix
    - typings.hastUtilToParse5.hastUtilToParse5Strings.isDefaultNamespace
    - typings.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_FRAGMENT_NODE
    - typings.hastUtilToParse5.hastUtilToParse5Strings.parentElement
    - typings.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_NODE
    - typings.hastUtilToParse5.hastUtilToParse5Strings.hasChildNodes
    - typings.hastUtilToParse5.hastUtilToParse5Strings.nodeName
    - typings.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_FOLLOWING
    - typings.hastUtilToParse5.hastUtilToParse5Strings.ELEMENT_NODE
  */
  trait P5Child extends StObject
  object P5Child {
    
    inline def ATTRIBUTE_NODE: typings.hastUtilToParse5.hastUtilToParse5Strings.ATTRIBUTE_NODE = "ATTRIBUTE_NODE".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.ATTRIBUTE_NODE]
    
    inline def CDATA_SECTION_NODE: typings.hastUtilToParse5.hastUtilToParse5Strings.CDATA_SECTION_NODE = "CDATA_SECTION_NODE".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.CDATA_SECTION_NODE]
    
    inline def COMMENT_NODE: typings.hastUtilToParse5.hastUtilToParse5Strings.COMMENT_NODE = "COMMENT_NODE".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.COMMENT_NODE]
    
    inline def DOCUMENT_FRAGMENT_NODE: typings.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_FRAGMENT_NODE = "DOCUMENT_FRAGMENT_NODE".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_FRAGMENT_NODE]
    
    inline def DOCUMENT_NODE: typings.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_NODE = "DOCUMENT_NODE".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_NODE]
    
    inline def DOCUMENT_POSITION_CONTAINED_BY: typings.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_CONTAINED_BY = "DOCUMENT_POSITION_CONTAINED_BY".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_CONTAINED_BY]
    
    inline def DOCUMENT_POSITION_CONTAINS: typings.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_CONTAINS = "DOCUMENT_POSITION_CONTAINS".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_CONTAINS]
    
    inline def DOCUMENT_POSITION_DISCONNECTED: typings.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_DISCONNECTED = "DOCUMENT_POSITION_DISCONNECTED".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_DISCONNECTED]
    
    inline def DOCUMENT_POSITION_FOLLOWING: typings.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_FOLLOWING = "DOCUMENT_POSITION_FOLLOWING".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_FOLLOWING]
    
    inline def DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: typings.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC = "DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC]
    
    inline def DOCUMENT_POSITION_PRECEDING: typings.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_PRECEDING = "DOCUMENT_POSITION_PRECEDING".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_PRECEDING]
    
    inline def DOCUMENT_TYPE_NODE: typings.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_TYPE_NODE = "DOCUMENT_TYPE_NODE".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_TYPE_NODE]
    
    inline def ELEMENT_NODE: typings.hastUtilToParse5.hastUtilToParse5Strings.ELEMENT_NODE = "ELEMENT_NODE".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.ELEMENT_NODE]
    
    inline def ENTITY_NODE: typings.hastUtilToParse5.hastUtilToParse5Strings.ENTITY_NODE = "ENTITY_NODE".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.ENTITY_NODE]
    
    inline def ENTITY_REFERENCE_NODE: typings.hastUtilToParse5.hastUtilToParse5Strings.ENTITY_REFERENCE_NODE = "ENTITY_REFERENCE_NODE".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.ENTITY_REFERENCE_NODE]
    
    inline def NOTATION_NODE: typings.hastUtilToParse5.hastUtilToParse5Strings.NOTATION_NODE = "NOTATION_NODE".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.NOTATION_NODE]
    
    inline def PROCESSING_INSTRUCTION_NODE: typings.hastUtilToParse5.hastUtilToParse5Strings.PROCESSING_INSTRUCTION_NODE = "PROCESSING_INSTRUCTION_NODE".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.PROCESSING_INSTRUCTION_NODE]
    
    inline def TEXT_NODE: typings.hastUtilToParse5.hastUtilToParse5Strings.TEXT_NODE = "TEXT_NODE".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.TEXT_NODE]
    
    inline def appendChild: typings.hastUtilToParse5.hastUtilToParse5Strings.appendChild = "appendChild".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.appendChild]
    
    inline def baseURI: typings.hastUtilToParse5.hastUtilToParse5Strings.baseURI = "baseURI".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.baseURI]
    
    inline def childNodes: typings.hastUtilToParse5.hastUtilToParse5Strings.childNodes = "childNodes".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.childNodes]
    
    inline def cloneNode: typings.hastUtilToParse5.hastUtilToParse5Strings.cloneNode = "cloneNode".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.cloneNode]
    
    inline def compareDocumentPosition: typings.hastUtilToParse5.hastUtilToParse5Strings.compareDocumentPosition = "compareDocumentPosition".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.compareDocumentPosition]
    
    inline def contains: typings.hastUtilToParse5.hastUtilToParse5Strings.contains = "contains".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.contains]
    
    inline def firstChild: typings.hastUtilToParse5.hastUtilToParse5Strings.firstChild = "firstChild".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.firstChild]
    
    inline def getRootNode: typings.hastUtilToParse5.hastUtilToParse5Strings.getRootNode = "getRootNode".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.getRootNode]
    
    inline def hasChildNodes: typings.hastUtilToParse5.hastUtilToParse5Strings.hasChildNodes = "hasChildNodes".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.hasChildNodes]
    
    inline def insertBefore: typings.hastUtilToParse5.hastUtilToParse5Strings.insertBefore = "insertBefore".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.insertBefore]
    
    inline def isConnected: typings.hastUtilToParse5.hastUtilToParse5Strings.isConnected = "isConnected".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.isConnected]
    
    inline def isDefaultNamespace: typings.hastUtilToParse5.hastUtilToParse5Strings.isDefaultNamespace = "isDefaultNamespace".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.isDefaultNamespace]
    
    inline def isEqualNode: typings.hastUtilToParse5.hastUtilToParse5Strings.isEqualNode = "isEqualNode".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.isEqualNode]
    
    inline def isSameNode: typings.hastUtilToParse5.hastUtilToParse5Strings.isSameNode = "isSameNode".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.isSameNode]
    
    inline def lastChild: typings.hastUtilToParse5.hastUtilToParse5Strings.lastChild = "lastChild".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.lastChild]
    
    inline def lookupNamespaceURI: typings.hastUtilToParse5.hastUtilToParse5Strings.lookupNamespaceURI = "lookupNamespaceURI".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.lookupNamespaceURI]
    
    inline def lookupPrefix: typings.hastUtilToParse5.hastUtilToParse5Strings.lookupPrefix = "lookupPrefix".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.lookupPrefix]
    
    inline def nextSibling: typings.hastUtilToParse5.hastUtilToParse5Strings.nextSibling = "nextSibling".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.nextSibling]
    
    inline def nodeName: typings.hastUtilToParse5.hastUtilToParse5Strings.nodeName = "nodeName".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.nodeName]
    
    inline def nodeType: typings.hastUtilToParse5.hastUtilToParse5Strings.nodeType = "nodeType".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.nodeType]
    
    inline def nodeValue: typings.hastUtilToParse5.hastUtilToParse5Strings.nodeValue = "nodeValue".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.nodeValue]
    
    inline def normalize: typings.hastUtilToParse5.hastUtilToParse5Strings.normalize = "normalize".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.normalize]
    
    inline def parentElement: typings.hastUtilToParse5.hastUtilToParse5Strings.parentElement = "parentElement".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.parentElement]
    
    inline def parentNode: typings.hastUtilToParse5.hastUtilToParse5Strings.parentNode = "parentNode".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.parentNode]
    
    inline def previousSibling: typings.hastUtilToParse5.hastUtilToParse5Strings.previousSibling = "previousSibling".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.previousSibling]
    
    inline def removeChild: typings.hastUtilToParse5.hastUtilToParse5Strings.removeChild = "removeChild".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.removeChild]
    
    inline def replaceChild: typings.hastUtilToParse5.hastUtilToParse5Strings.replaceChild = "replaceChild".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.replaceChild]
    
    inline def textContent: typings.hastUtilToParse5.hastUtilToParse5Strings.textContent = "textContent".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.textContent]
  }
  
  type P5Comment = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_parse5.CommentNode */ Any
  
  type P5Doctype = DocumentType
  
  type P5Document = Document
  
  type P5Element = typings.std.Element
  
  type P5Fragment = DocumentFragment
  
  type P5Node = typings.std.Node
  
  type P5Parent = ParentNode
  
  type P5Text = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_parse5.TextNode */ Any
  
  type Parent = typings.hast.mod.Parent
  
  type Root = typings.hast.mod.Root
  
  type Schema = typings.propertyInformation.mod.Schema
  
  /* Rewritten from type alias, can be one of: 
    - typings.hastUtilToParse5.hastUtilToParse5Strings.html
    - typings.hastUtilToParse5.hastUtilToParse5Strings.svg
  */
  trait Space extends StObject
  object Space {
    
    inline def html: typings.hastUtilToParse5.hastUtilToParse5Strings.html = "html".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.html]
    
    inline def svg: typings.hastUtilToParse5.hastUtilToParse5Strings.svg = "svg".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.svg]
  }
  
  type Text = typings.hast.mod.Text
}
