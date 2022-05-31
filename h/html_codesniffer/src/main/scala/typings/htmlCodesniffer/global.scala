package typings.htmlCodesniffer

import typings.htmlCodesniffer.mod.Callback
import typings.htmlCodesniffer.mod.FailCallback
import typings.htmlCodesniffer.mod.Message
import typings.htmlCodesniffer.mod.MessageData
import typings.htmlCodesniffer.mod.Util.CellHeaderInfo
import typings.htmlCodesniffer.mod.Util.Colour
import typings.htmlCodesniffer.mod.Util.DocumentType
import typings.htmlCodesniffer.mod.Util.HsvColour
import typings.htmlCodesniffer.mod.Util.TestTableHeadersResult
import typings.std.ArrayLike
import typings.std.CSSStyleDeclaration
import typings.std.ChildNode
import typings.std.Document
import typings.std.Element
import typings.std.Node
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object HTMLCS {
    
    @JSGlobal("HTMLCS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("HTMLCS.ERROR")
    @js.native
    val ERROR: /* 1 */ Double = js.native
    
    @JSGlobal("HTMLCS.NOTICE")
    @js.native
    val NOTICE: /* 3 */ Double = js.native
    
    object Util {
      
      @JSGlobal("HTMLCS.Util")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Convert a hue-saturation-value structure into an RGB structure.
        *
        * The hue element should be a degree value in the region of [0.0, 360.0).
        * The saturation and value elements should be in the range [0.0, 1.0].
        * Use RGBtoColourStr to convert back into a hex colour.
        *
        * @param hsvColour A HSV structure to convert.
        */
      inline def HSVtosRGB(hsvColour: HsvColour): Colour = ^.asInstanceOf[js.Dynamic].applyDynamic("HSVtosRGB")(hsvColour.asInstanceOf[js.Any]).asInstanceOf[Colour]
      
      /**
        * Convert an RGB colour structure to a hex colour.
        *
        * The red/green/blue colour elements should be on a [0.0, 1.0] scale.
        * Colours that can be converted into a three Hex-digit string will be
        * converted as such (eg. rgb(34,34,34) => #222). Others will be converted
        * to a six-digit string (eg. rgb(48,48,48) => #303030).
        *
        * @param colour Structure with "red", "green" and "blue" elements.
        */
      inline def RGBtoColourStr(colou: Colour): String = ^.asInstanceOf[js.Dynamic].applyDynamic("RGBtoColourStr")(colou.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Convert a colour string to a structure with red/green/blue/alpha elements.
        *
        * Supports rgb() and hex colours (3, 4, 6 or 8 hex digits, optional "#").
        * Each red/green/blue element is in the range [0.0, 1.0].
        *
        * @param colour The colour to convert.
        */
      inline def colourStrToRGB(colour: String): Colour = ^.asInstanceOf[js.Dynamic].applyDynamic("colourStrToRGB")(colour.asInstanceOf[js.Any]).asInstanceOf[Colour]
      
      inline def contains(parent: Document, child: DocumentType): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      inline def contains(parent: Document, child: Element): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      inline def contains(parent: Element, child: DocumentType): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      /**
        * Returns true if the passed child is contained by the passed parent.
        *
        * Uses either the IE contains() method or the W3C compareDocumentPosition()
        * method, as appropriate.
        *
        * @param parent The parent element or document.
        * @param child The child.
        */
      inline def contains(parent: Element, child: Element): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      /**
        * Calculate the contrast ratio between two colours.
        *
        * Colours should be in rgb() or 3/6-digit hex format; order does not matter
        * (ie. it doesn't matter which is the lighter and which is the darker).
        * Values should be in the range [1.0, 21.0]... a ratio of 1.0 means "they're
        * exactly the same contrast", 21.0 means it's white-on-black or v.v.
        * Formula as per WCAG 2.0 definitions.
        *
        * @param colour1 The first colour to compare.
        * @param colour2 The second colour to compare.
        */
      inline def contrastRatio(colour1: String, colour2: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("contrastRatio")(colour1.asInstanceOf[js.Any], colour2.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      /**
        * Iterate parent nodes of an element.
        *
        * @param node Node to search from.
        * @param cb Callback function providing each parent node.
        */
      inline def eachParentNode(node: Node, cb: js.Function1[/* parent */ Node, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachParentNode")(node.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Find a parent node matching a selector.
        *
        * @param node  Node to search from.
        * @param selector The selector to search.
        */
      inline def findParentNode(node: Node, selector: String): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findParentNode")(node.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
      
      /**
        * Get the accessible name.
        *
        * @param element Element to process.
        * @param top Scoped container element.
        */
      inline def getAccessibleName(element: Node, top: Node): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAccessibleName")(element.asInstanceOf[js.Any], top.asInstanceOf[js.Any])).asInstanceOf[String]
      
      /**
        * Returns all elements that are visible to the accessibility API.
        *
        * @param element The parent element to search.
        * @param selector Optional selector to pass to
        */
      inline def getAllElements(element: Element, selector: String): ArrayLike[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllElements")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[ArrayLike[Element]]
      
      /**
        * Return expected cell headers from a table.
        *
        * Returns null if not a table.
        *
        * Returns an array of objects with two properties:
        * - cell (Object) - the TD element referred to,
        * - headers (String) - the normalised list of expected headers.
        *
        * Cells are returned in DOM order. This may mean cells in a tfoot (which
        * normally precedes tbody if used) would come before tbody cells.
        *
        * If there are missing IDs on relevant table header (th) elements, this
        * method won't complain about it - it will just return them as empty. Its
        * job is to take the IDs it can get, not to complain about it (see, eg. the
        * test in WCAG2's sniff 1_3_1). If there are no headers for a cell, it
        * won't be included.
        *
        * @param table The table to test.
        */
      inline def getCellHeaders(table: Element): js.Array[CellHeaderInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCellHeaders")(table.asInstanceOf[js.Any]).asInstanceOf[js.Array[CellHeaderInfo]]
      
      /**
        * Get the document type being tested.
        *
        * Possible values: html5, xhtml5, xhtml11, xhtml10, html401, html40
        * ... or empty string if it couldn't work out the doctype.
        *
        * This will only give the thumbs-up to the "strict" doctypes.
        *
        * @param document The document being tested.
        */
      inline def getDocumentType(document: Document): DocumentType = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentType")(document.asInstanceOf[js.Any]).asInstanceOf[DocumentType]
      
      /**
        * Gets the text contents of an element.
        *
        * @param element The element being inspected.
        * @param [includeAlt=true] Include alt text from images.
        * @returns The text contents.
        */
      inline def getElementTextContent(element: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementTextContent")(element.asInstanceOf[js.Any]).asInstanceOf[String]
      inline def getElementTextContent(element: Element, includeAlt: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementTextContent")(element.asInstanceOf[js.Any], includeAlt.asInstanceOf[js.Any])).asInstanceOf[String]
      
      inline def getElementWindow(element: Document): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementWindow")(element.asInstanceOf[js.Any]).asInstanceOf[Window]
      /**
        * Get the window object relating to the passed element.
        *
        * @param element The element (or document) to pass.
        */
      inline def getElementWindow(element: Element): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementWindow")(element.asInstanceOf[js.Any]).asInstanceOf[Window]
      
      /**
        * Get the next sibling element.
        *
        * This is a substitute for nextSibling where there are text, comment and
        * other nodes between elements.
        *
        * If tagName is null, immediate is ignored and effectively defaults to true: the
        * next element will be returned regardless of what it is.
        *
        * @param element Element to start from.
        * @param [tagName=null]  Only match this tag. If null, match any. Not case-sensitive.
        * @param [immediate=false] Only match if the tag in tagName is the immediately following non-whitespace node.
        */
      inline def getNextSiblingElement(element: Node): ChildNode | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextSiblingElement")(element.asInstanceOf[js.Any]).asInstanceOf[ChildNode | Null]
      inline def getNextSiblingElement(element: Node, tagName: String): ChildNode | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextSiblingElement")(element.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[ChildNode | Null]
      inline def getNextSiblingElement(element: Node, tagName: String, immediate: Boolean): ChildNode | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextSiblingElement")(element.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[ChildNode | Null]
      inline def getNextSiblingElement(element: Node, tagName: Unit, immediate: Boolean): ChildNode | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextSiblingElement")(element.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[ChildNode | Null]
      
      /**
        * Get the previous sibling element.
        *
        * This is a substitute for previousSibling where there are text, comment and
        * other nodes between elements.
        *
        * If tagName is null, immediate is ignored and effectively defaults to true: the
        * previous element will be returned regardless of what it is.
        *
        * @param element Element to start from.
        * @param [tagName=null] Only match this tag. If null, match any. Not case-sensitive.
        * @param [immediate=false] Only match if the tag in tagName is the immediately preceding non-whitespace node.
        */
      inline def getPreviousSiblingElement(element: Node): ChildNode | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousSiblingElement")(element.asInstanceOf[js.Any]).asInstanceOf[ChildNode | Null]
      inline def getPreviousSiblingElement(element: Node, tagName: String): ChildNode | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousSiblingElement")(element.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[ChildNode | Null]
      inline def getPreviousSiblingElement(element: Node, tagName: String, immediate: Boolean): ChildNode | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousSiblingElement")(element.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[ChildNode | Null]
      inline def getPreviousSiblingElement(element: Node, tagName: Unit, immediate: Boolean): ChildNode | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousSiblingElement")(element.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[ChildNode | Null]
      
      /**
        * Get the text content of a DOM node.
        *
        * @param element Element to process.
        */
      inline def getTextContent(element: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTextContent")(element.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Returns true if the element has a valid aria label.
        *
        * @param element The element we are checking.
        */
      inline def hasValidAriaLabel(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasValidAriaLabel")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * Returns true if the element is deliberately hidden from Accessibility APIs.
        *
        * @param element The element to check.
        */
      inline def isAccessibilityHidden(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAccessibilityHidden")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * Returns true if the element is deliberately hidden from Accessibility APIs using ARIA hidden.
        *
        * Not: This is separate to isAccessibilityHidden() due to a need to check specifically for aria hidden.
        *
        * @param element The element to check.
        */
      inline def isAriaHidden(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAriaHidden")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * Return true if an element is disabled.
        *
        * If the computed style of an element cannot be determined for some reason,
        * it is presumed it is NOT hidden.
        *
        * @param element The element that is hiding, or not.
        */
      inline def isDisabled(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDisabled")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * Returns TRUE if the element is able to be focused .
        *
        * @param element DOM Node to test.
        */
      inline def isFocusable(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFocusable")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * Return true if an element is in a document.
        *
        * @param element The element that is in a doc, or not.
        */
      inline def isInDocument(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInDocument")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * Returns TRUE if the element is able to be accessed via the keyboard.
        *
        * @param element DOM Node to test.
        */
      inline def isKeyboardNavigable(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKeyboardNavigable")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * Returns TRUE if the element is able to be focused by keyboard tabbing.
        *
        * @param element DOM Node to test.
        */
      inline def isKeyboardTabbable(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKeyboardTabbable")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * Returns true if the table passed is a layout table.
        *
        * If the passed table contains headings - through the use of the th
        * element - HTML_CodeSniffer will assume it is a data table. This is in line
        * with most other online checkers.
        *
        * @param table The table to check.
        */
      inline def isLayoutTable(table: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLayoutTable")(table.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * Returns TRUE if the provided node name is not a valid phrasing node.
        *
        * @param nodeName The node name to test.
        */
      inline def isPhrasingNode(nodeName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPhrasingNode")(nodeName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * Returns true if the string is "empty" according to WCAG standards.
        *
        * We can test for whether the string is entirely composed of whitespace, but
        * WCAG standards explicitly state that non-breaking spaces (&nbsp;, &#160;)
        * are not considered "empty". So we need this function to filter out that
        * situation.
        *
        * @param string The potentially empty string.
        */
      inline def isStringEmpty(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringEmpty")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * Return true if an element is hidden visually.
        *
        * If the computed style of an element cannot be determined for some reason,
        * it is presumed it is NOT hidden.
        *
        * @param element The element that is hiding, or not.
        */
      inline def isVisuallyHidden(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVisuallyHidden")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * Calculate relative luminescence for a colour in the sRGB colour profile.
        *
        * Supports rgb() and hex colours. rgba() also supported but the alpha
        * channel is currently ignored.
        * Hex colours can have an optional "#" at the front, which is stripped.
        * Relative luminescence formula is defined in the definitions of WCAG 2.0.
        * It can be either three or six hex digits, as per CSS conventions.
        * It should return a value in the range [0.0, 1.0].
        *
        * @param colour The colour to calculate from.
        */
      inline def relativeLum(colour: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("relativeLum")(colour.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      /**
        * Convert an RGB colour into hue-saturation-value.
        *
        * This is used for calculations changing the colour (for colour contrast
        * purposes) to ensure that the hue is maintained.
        * The parameter accepts either a string (hex or rgb() format) or a
        * red/green/blue structure.
        * The returned structure has hue, saturation, and value components: the
        * latter two are in the range [0.0, 1.0]; hue is in degrees,
        * range [0.0, 360.0).
        * If there is no saturation then hue is technically undefined.
        *
        * @param colour A colour to convert.
        */
      inline def sRGBtoHSV(colour: String): HsvColour = ^.asInstanceOf[js.Dynamic].applyDynamic("sRGBtoHSV")(colour.asInstanceOf[js.Any]).asInstanceOf[HsvColour]
      inline def sRGBtoHSV(colour: Colour): HsvColour = ^.asInstanceOf[js.Dynamic].applyDynamic("sRGBtoHSV")(colour.asInstanceOf[js.Any]).asInstanceOf[HsvColour]
      
      /**
        * Return the appropriate computed style object for an element.
        *
        * It's accessed in different ways depending on whether it's IE or not.
        *
        * @param element An element with style.
        */
      inline def style(element: Element): CSSStyleDeclaration = ^.asInstanceOf[js.Dynamic].applyDynamic("style")(element.asInstanceOf[js.Any]).asInstanceOf[CSSStyleDeclaration]
      inline def style(element: Element, pseudo: String): CSSStyleDeclaration = (^.asInstanceOf[js.Dynamic].applyDynamic("style")(element.asInstanceOf[js.Any], pseudo.asInstanceOf[js.Any])).asInstanceOf[CSSStyleDeclaration]
      
      /**
        * Test for the correct headers attributes on table cell elements.
        *
        * Return value contains the following elements:
        * - required (Boolean): Whether header association at all is required.
        * - used (Boolean):  Whether headers attribute has been used on at least
        *  one table data (td) cell.
        * - allowScope (Boolean): Whether scope is allowed to satisfy the association
        *  requirement (ie. max one row/one column).
        * - correct (Boolean): Whether headers have been correctly used.
        * - missingThId (Array): Array of th elements without IDs.
        * - missingTd (Array): Array of elements without headers attribute.
        * - wrongHeaders (Array): Array of elements where headers attr is incorrect.
        *  Each is a structure with following keys: element,
        *  expected [headers attr], actual [headers attr].
        *
        * @param element Table element to test upon.
        */
      inline def testTableHeaders(element: Node): TestTableHeadersResult = ^.asInstanceOf[js.Dynamic].applyDynamic("testTableHeaders")(element.asInstanceOf[js.Any]).asInstanceOf[TestTableHeadersResult]
      
      /**
        * Trim off excess spaces on either side.
        *
        * @param string The string with potentially extraneous whitespace.
        */
      inline def trim(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trim")(string.asInstanceOf[js.Any]).asInstanceOf[String]
    }
    
    @JSGlobal("HTMLCS.WARNING")
    @js.native
    val WARNING: /* 2 */ Double = js.native
    
    inline def addMessage(`type`: Double, element: Element, msg: String, code: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addMessage")(`type`.asInstanceOf[js.Any], element.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addMessage(`type`: Double, element: Element, msg: String, code: String, data: MessageData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addMessage")(`type`.asInstanceOf[js.Any], element.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], code.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def getMessages(): js.Array[Message] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessages")().asInstanceOf[js.Array[Message]]
    
    inline def getTranslation(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTranslation")(text.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def isFullDoc(content: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFullDoc")(content.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isFullDoc(content: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFullDoc")(content.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSGlobal("HTMLCS.lang")
    @js.native
    val lang: String = js.native
    
    inline def loadStandard(standard: String, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadStandard")(standard.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loadStandard(standard: String, callback: Callback, failCallback: FailCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadStandard")(standard.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], failCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def process(standard: String, content: String, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("process")(standard.asInstanceOf[js.Any], content.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def process(standard: String, content: String, callback: Callback, failCallback: Unit, language: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("process")(standard.asInstanceOf[js.Any], content.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], failCallback.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def process(standard: String, content: String, callback: Callback, failCallback: FailCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("process")(standard.asInstanceOf[js.Any], content.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], failCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def process(
      standard: String,
      content: String,
      callback: Callback,
      failCallback: FailCallback,
      language: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("process")(standard.asInstanceOf[js.Any], content.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], failCallback.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def process(standard: String, content: Element, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("process")(standard.asInstanceOf[js.Any], content.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def process(standard: String, content: Element, callback: Callback, failCallback: Unit, language: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("process")(standard.asInstanceOf[js.Any], content.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], failCallback.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def process(standard: String, content: Element, callback: Callback, failCallback: FailCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("process")(standard.asInstanceOf[js.Any], content.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], failCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def process(
      standard: String,
      content: Element,
      callback: Callback,
      failCallback: FailCallback,
      language: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("process")(standard.asInstanceOf[js.Any], content.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], failCallback.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def run(callback: Callback, content: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(callback.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def run(callback: Callback, content: Node): String = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(callback.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
