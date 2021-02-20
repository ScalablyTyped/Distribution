package typings.htmlCodesniffer

import org.scalablytyped.runtime.StringDictionary
import typings.std.ArrayLike
import typings.std.CSSStyleDeclaration
import typings.std.ChildNode
import typings.std.Document
import typings.std.Element
import typings.std.Node
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("html_codesniffer", "ERROR")
  @js.native
  val ERROR: /* 1 */ Double = js.native
  
  @JSImport("html_codesniffer", "NOTICE")
  @js.native
  val NOTICE: /* 3 */ Double = js.native
  
  object Util {
    
    /**
      * Convert a hue-saturation-value structure into an RGB structure.
      *
      * The hue element should be a degree value in the region of [0.0, 360.0).
      * The saturation and value elements should be in the range [0.0, 1.0].
      * Use RGBtoColourStr to convert back into a hex colour.
      *
      * @param hsvColour A HSV structure to convert.
      */
    @JSImport("html_codesniffer", "Util.HSVtosRGB")
    @js.native
    def HSVtosRGB(hsvColour: HsvColour): Colour = js.native
    
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
    @JSImport("html_codesniffer", "Util.RGBtoColourStr")
    @js.native
    def RGBtoColourStr(colou: Colour): String = js.native
    
    /**
      * Convert a colour string to a structure with red/green/blue/alpha elements.
      *
      * Supports rgb() and hex colours (3, 4, 6 or 8 hex digits, optional "#").
      * Each red/green/blue element is in the range [0.0, 1.0].
      *
      * @param colour The colour to convert.
      */
    @JSImport("html_codesniffer", "Util.colourStrToRGB")
    @js.native
    def colourStrToRGB(colour: String): Colour = js.native
    
    @JSImport("html_codesniffer", "Util.contains")
    @js.native
    def contains(parent: Document, child: DocumentType): Boolean = js.native
    @JSImport("html_codesniffer", "Util.contains")
    @js.native
    def contains(parent: Document, child: Element): Boolean = js.native
    @JSImport("html_codesniffer", "Util.contains")
    @js.native
    def contains(parent: Element, child: DocumentType): Boolean = js.native
    /**
      * Returns true if the passed child is contained by the passed parent.
      *
      * Uses either the IE contains() method or the W3C compareDocumentPosition()
      * method, as appropriate.
      *
      * @param parent The parent element or document.
      * @param child The child.
      */
    @JSImport("html_codesniffer", "Util.contains")
    @js.native
    def contains(parent: Element, child: Element): Boolean = js.native
    
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
    @JSImport("html_codesniffer", "Util.contrastRatio")
    @js.native
    def contrastRatio(colour1: String, colour2: String): Double = js.native
    
    /**
      * Iterate parent nodes of an element.
      *
      * @param node Node to search from.
      * @param cb Callback function providing each parent node.
      */
    @JSImport("html_codesniffer", "Util.eachParentNode")
    @js.native
    def eachParentNode(node: Node, cb: js.Function1[/* parent */ Node, Unit]): Unit = js.native
    
    /**
      * Find a parent node matching a selector.
      *
      * @param node  Node to search from.
      * @param selector The selector to search.
      */
    @JSImport("html_codesniffer", "Util.findParentNode")
    @js.native
    def findParentNode(node: Node, selector: String): Node | Null = js.native
    
    /**
      * Get the accessible name.
      *
      * @param element Element to process.
      * @param top Scoped container element.
      */
    @JSImport("html_codesniffer", "Util.getAccessibleName")
    @js.native
    def getAccessibleName(element: Node, top: Node): String = js.native
    
    /**
      * Returns all elements that are visible to the accessibility API.
      *
      * @param element The parent element to search.
      * @param selector Optional selector to pass to
      */
    @JSImport("html_codesniffer", "Util.getAllElements")
    @js.native
    def getAllElements(element: Element, selector: String): ArrayLike[Element] = js.native
    
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
    @JSImport("html_codesniffer", "Util.getCellHeaders")
    @js.native
    def getCellHeaders(table: Element): js.Array[CellHeaderInfo] = js.native
    
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
    @JSImport("html_codesniffer", "Util.getDocumentType")
    @js.native
    def getDocumentType(document: Document): DocumentType = js.native
    
    /**
      * Gets the text contents of an element.
      *
      * @param element The element being inspected.
      * @param [includeAlt=true] Include alt text from images.
      * @returns The text contents.
      */
    @JSImport("html_codesniffer", "Util.getElementTextContent")
    @js.native
    def getElementTextContent(element: Element): String = js.native
    @JSImport("html_codesniffer", "Util.getElementTextContent")
    @js.native
    def getElementTextContent(element: Element, includeAlt: Boolean): String = js.native
    
    @JSImport("html_codesniffer", "Util.getElementWindow")
    @js.native
    def getElementWindow(element: Document): Window = js.native
    /**
      * Get the window object relating to the passed element.
      *
      * @param element The element (or document) to pass.
      */
    @JSImport("html_codesniffer", "Util.getElementWindow")
    @js.native
    def getElementWindow(element: Element): Window = js.native
    
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
    @JSImport("html_codesniffer", "Util.getNextSiblingElement")
    @js.native
    def getNextSiblingElement(element: Node): ChildNode | Null = js.native
    @JSImport("html_codesniffer", "Util.getNextSiblingElement")
    @js.native
    def getNextSiblingElement(element: Node, tagName: js.UndefOr[scala.Nothing], immediate: Boolean): ChildNode | Null = js.native
    @JSImport("html_codesniffer", "Util.getNextSiblingElement")
    @js.native
    def getNextSiblingElement(element: Node, tagName: String): ChildNode | Null = js.native
    @JSImport("html_codesniffer", "Util.getNextSiblingElement")
    @js.native
    def getNextSiblingElement(element: Node, tagName: String, immediate: Boolean): ChildNode | Null = js.native
    
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
    @JSImport("html_codesniffer", "Util.getPreviousSiblingElement")
    @js.native
    def getPreviousSiblingElement(element: Node): ChildNode | Null = js.native
    @JSImport("html_codesniffer", "Util.getPreviousSiblingElement")
    @js.native
    def getPreviousSiblingElement(element: Node, tagName: js.UndefOr[scala.Nothing], immediate: Boolean): ChildNode | Null = js.native
    @JSImport("html_codesniffer", "Util.getPreviousSiblingElement")
    @js.native
    def getPreviousSiblingElement(element: Node, tagName: String): ChildNode | Null = js.native
    @JSImport("html_codesniffer", "Util.getPreviousSiblingElement")
    @js.native
    def getPreviousSiblingElement(element: Node, tagName: String, immediate: Boolean): ChildNode | Null = js.native
    
    /**
      * Get the text content of a DOM node.
      *
      * @param element Element to process.
      */
    @JSImport("html_codesniffer", "Util.getTextContent")
    @js.native
    def getTextContent(element: Node): String = js.native
    
    /**
      * Returns true if the element has a valid aria label.
      *
      * @param element The element we are checking.
      */
    @JSImport("html_codesniffer", "Util.hasValidAriaLabel")
    @js.native
    def hasValidAriaLabel(element: Element): Boolean = js.native
    
    /**
      * Returns true if the element is deliberately hidden from Accessibility APIs.
      *
      * @param element The element to check.
      */
    @JSImport("html_codesniffer", "Util.isAccessibilityHidden")
    @js.native
    def isAccessibilityHidden(element: Element): Boolean = js.native
    
    /**
      * Returns true if the element is deliberately hidden from Accessibility APIs using ARIA hidden.
      *
      * Not: This is separate to isAccessibilityHidden() due to a need to check specifically for aria hidden.
      *
      * @param element The element to check.
      */
    @JSImport("html_codesniffer", "Util.isAriaHidden")
    @js.native
    def isAriaHidden(element: Element): Boolean = js.native
    
    /**
      * Return true if an element is disabled.
      *
      * If the computed style of an element cannot be determined for some reason,
      * it is presumed it is NOT hidden.
      *
      * @param element The element that is hiding, or not.
      */
    @JSImport("html_codesniffer", "Util.isDisabled")
    @js.native
    def isDisabled(element: Element): Boolean = js.native
    
    /**
      * Returns TRUE if the element is able to be focused .
      *
      * @param element DOM Node to test.
      */
    @JSImport("html_codesniffer", "Util.isFocusable")
    @js.native
    def isFocusable(element: Element): Boolean = js.native
    
    /**
      * Return true if an element is in a document.
      *
      * @param element The element that is in a doc, or not.
      */
    @JSImport("html_codesniffer", "Util.isInDocument")
    @js.native
    def isInDocument(element: Element): Boolean = js.native
    
    /**
      * Returns TRUE if the element is able to be accessed via the keyboard.
      *
      * @param element DOM Node to test.
      */
    @JSImport("html_codesniffer", "Util.isKeyboardNavigable")
    @js.native
    def isKeyboardNavigable(element: Element): Boolean = js.native
    
    /**
      * Returns TRUE if the element is able to be focused by keyboard tabbing.
      *
      * @param element DOM Node to test.
      */
    @JSImport("html_codesniffer", "Util.isKeyboardTabbable")
    @js.native
    def isKeyboardTabbable(element: Element): Boolean = js.native
    
    /**
      * Returns true if the table passed is a layout table.
      *
      * If the passed table contains headings - through the use of the th
      * element - HTML_CodeSniffer will assume it is a data table. This is in line
      * with most other online checkers.
      *
      * @param table The table to check.
      */
    @JSImport("html_codesniffer", "Util.isLayoutTable")
    @js.native
    def isLayoutTable(table: Element): Boolean = js.native
    
    /**
      * Returns TRUE if the provided node name is not a valid phrasing node.
      *
      * @param nodeName The node name to test.
      */
    @JSImport("html_codesniffer", "Util.isPhrasingNode")
    @js.native
    def isPhrasingNode(nodeName: String): Boolean = js.native
    
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
    @JSImport("html_codesniffer", "Util.isStringEmpty")
    @js.native
    def isStringEmpty(string: String): Boolean = js.native
    
    /**
      * Return true if an element is hidden visually.
      *
      * If the computed style of an element cannot be determined for some reason,
      * it is presumed it is NOT hidden.
      *
      * @param element The element that is hiding, or not.
      */
    @JSImport("html_codesniffer", "Util.isVisuallyHidden")
    @js.native
    def isVisuallyHidden(element: Element): Boolean = js.native
    
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
    @JSImport("html_codesniffer", "Util.relativeLum")
    @js.native
    def relativeLum(colour: String): Double = js.native
    
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
    @JSImport("html_codesniffer", "Util.sRGBtoHSV")
    @js.native
    def sRGBtoHSV(colour: String): HsvColour = js.native
    @JSImport("html_codesniffer", "Util.sRGBtoHSV")
    @js.native
    def sRGBtoHSV(colour: Colour): HsvColour = js.native
    
    /**
      * Return the appropriate computed style object for an element.
      *
      * It's accessed in different ways depending on whether it's IE or not.
      *
      * @param element An element with style.
      */
    @JSImport("html_codesniffer", "Util.style")
    @js.native
    def style(element: Element): CSSStyleDeclaration = js.native
    @JSImport("html_codesniffer", "Util.style")
    @js.native
    def style(element: Element, pseudo: String): CSSStyleDeclaration = js.native
    
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
    @JSImport("html_codesniffer", "Util.testTableHeaders")
    @js.native
    def testTableHeaders(element: Node): TestTableHeadersResult = js.native
    
    /**
      * Trim off excess spaces on either side.
      *
      * @param string The string with potentially extraneous whitespace.
      */
    @JSImport("html_codesniffer", "Util.trim")
    @js.native
    def trim(string: String): String = js.native
    
    @js.native
    trait CellHeaderInfo extends StObject {
      
      var cell: Element = js.native
      
      var headers: String = js.native
    }
    object CellHeaderInfo {
      
      @scala.inline
      def apply(cell: Element, headers: String): CellHeaderInfo = {
        val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
        __obj.asInstanceOf[CellHeaderInfo]
      }
      
      @scala.inline
      implicit class CellHeaderInfoMutableBuilder[Self <: CellHeaderInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCell(value: Element): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Colour extends StObject {
      
      var alpha: Double = js.native
      
      var blue: Double = js.native
      
      var green: Double = js.native
      
      var red: Double = js.native
    }
    object Colour {
      
      @scala.inline
      def apply(alpha: Double, blue: Double, green: Double, red: Double): Colour = {
        val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
        __obj.asInstanceOf[Colour]
      }
      
      @scala.inline
      implicit class ColourMutableBuilder[Self <: Colour] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.htmlCodesniffer.htmlCodesnifferStrings.html5
      - typings.htmlCodesniffer.htmlCodesnifferStrings.xhtml5
      - typings.htmlCodesniffer.htmlCodesnifferStrings.xhtml11
      - typings.htmlCodesniffer.htmlCodesnifferStrings.xhtml10
      - typings.htmlCodesniffer.htmlCodesnifferStrings.html401
      - typings.htmlCodesniffer.htmlCodesnifferStrings.html40
      - typings.htmlCodesniffer.htmlCodesnifferStrings._empty
    */
    trait DocumentType extends StObject
    object DocumentType {
      
      @scala.inline
      def _empty: typings.htmlCodesniffer.htmlCodesnifferStrings._empty = "".asInstanceOf[typings.htmlCodesniffer.htmlCodesnifferStrings._empty]
      
      @scala.inline
      def html40: typings.htmlCodesniffer.htmlCodesnifferStrings.html40 = "html40".asInstanceOf[typings.htmlCodesniffer.htmlCodesnifferStrings.html40]
      
      @scala.inline
      def html401: typings.htmlCodesniffer.htmlCodesnifferStrings.html401 = "html401".asInstanceOf[typings.htmlCodesniffer.htmlCodesnifferStrings.html401]
      
      @scala.inline
      def html5: typings.htmlCodesniffer.htmlCodesnifferStrings.html5 = "html5".asInstanceOf[typings.htmlCodesniffer.htmlCodesnifferStrings.html5]
      
      @scala.inline
      def xhtml10: typings.htmlCodesniffer.htmlCodesnifferStrings.xhtml10 = "xhtml10".asInstanceOf[typings.htmlCodesniffer.htmlCodesnifferStrings.xhtml10]
      
      @scala.inline
      def xhtml11: typings.htmlCodesniffer.htmlCodesnifferStrings.xhtml11 = "xhtml11".asInstanceOf[typings.htmlCodesniffer.htmlCodesnifferStrings.xhtml11]
      
      @scala.inline
      def xhtml5: typings.htmlCodesniffer.htmlCodesnifferStrings.xhtml5 = "xhtml5".asInstanceOf[typings.htmlCodesniffer.htmlCodesnifferStrings.xhtml5]
    }
    
    @js.native
    trait HeaderInfo extends StObject {
      
      var actual: String = js.native
      
      var element: Element = js.native
      
      var expected: String = js.native
    }
    object HeaderInfo {
      
      @scala.inline
      def apply(actual: String, element: Element, expected: String): HeaderInfo = {
        val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any])
        __obj.asInstanceOf[HeaderInfo]
      }
      
      @scala.inline
      implicit class HeaderInfoMutableBuilder[Self <: HeaderInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActual(value: String): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpected(value: String): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait HsvColour extends StObject {
      
      var hue: Double = js.native
      
      var saturation: Double = js.native
      
      var value: Double = js.native
    }
    object HsvColour {
      
      @scala.inline
      def apply(hue: Double, saturation: Double, value: Double): HsvColour = {
        val __obj = js.Dynamic.literal(hue = hue.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[HsvColour]
      }
      
      @scala.inline
      implicit class HsvColourMutableBuilder[Self <: HsvColour] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHue(value: Double): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSaturation(value: Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait TestTableHeadersResult extends StObject {
      
      /** Whether scope is allowed to satisfy the association requirement (ie. max one row/one column). */
      var allowScope: Boolean = js.native
      
      /** Whether headers have been correctly used. */
      var correct: Boolean = js.native
      
      /** Array of elements without headers attribute. */
      var missingTd: js.Array[Element] = js.native
      
      /** Array of th elements without IDs. */
      var missingThId: js.Array[Element] = js.native
      
      /** Whether header association at all is required. */
      var required: Boolean = js.native
      
      /** Whether headers attribute has been used on at least one table data (td) cell. */
      var used: Boolean = js.native
      
      /** Array of elements where headers attr is incorrect. */
      var wrongHeaders: js.Array[HeaderInfo] = js.native
    }
    object TestTableHeadersResult {
      
      @scala.inline
      def apply(
        allowScope: Boolean,
        correct: Boolean,
        missingTd: js.Array[Element],
        missingThId: js.Array[Element],
        required: Boolean,
        used: Boolean,
        wrongHeaders: js.Array[HeaderInfo]
      ): TestTableHeadersResult = {
        val __obj = js.Dynamic.literal(allowScope = allowScope.asInstanceOf[js.Any], correct = correct.asInstanceOf[js.Any], missingTd = missingTd.asInstanceOf[js.Any], missingThId = missingThId.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any], wrongHeaders = wrongHeaders.asInstanceOf[js.Any])
        __obj.asInstanceOf[TestTableHeadersResult]
      }
      
      @scala.inline
      implicit class TestTableHeadersResultMutableBuilder[Self <: TestTableHeadersResult] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAllowScope(value: Boolean): Self = StObject.set(x, "allowScope", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCorrect(value: Boolean): Self = StObject.set(x, "correct", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMissingTd(value: js.Array[Element]): Self = StObject.set(x, "missingTd", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMissingTdVarargs(value: Element*): Self = StObject.set(x, "missingTd", js.Array(value :_*))
        
        @scala.inline
        def setMissingThId(value: js.Array[Element]): Self = StObject.set(x, "missingThId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMissingThIdVarargs(value: Element*): Self = StObject.set(x, "missingThId", js.Array(value :_*))
        
        @scala.inline
        def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUsed(value: Boolean): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWrongHeaders(value: js.Array[HeaderInfo]): Self = StObject.set(x, "wrongHeaders", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWrongHeadersVarargs(value: HeaderInfo*): Self = StObject.set(x, "wrongHeaders", js.Array(value :_*))
      }
    }
  }
  
  @JSImport("html_codesniffer", "WARNING")
  @js.native
  val WARNING: /* 2 */ Double = js.native
  
  @JSImport("html_codesniffer", "addMessage")
  @js.native
  def addMessage(`type`: Double, element: Element, msg: String, code: String): Unit = js.native
  @JSImport("html_codesniffer", "addMessage")
  @js.native
  def addMessage(`type`: Double, element: Element, msg: String, code: String, data: MessageData): Unit = js.native
  
  @JSImport("html_codesniffer", "getMessages")
  @js.native
  def getMessages(): js.Array[Message] = js.native
  
  @JSImport("html_codesniffer", "getTranslation")
  @js.native
  def getTranslation(text: String): String = js.native
  
  @JSImport("html_codesniffer", "isFullDoc")
  @js.native
  def isFullDoc(content: String): Boolean = js.native
  @JSImport("html_codesniffer", "isFullDoc")
  @js.native
  def isFullDoc(content: Element): Boolean = js.native
  
  @JSImport("html_codesniffer", "lang")
  @js.native
  val lang: String = js.native
  
  @JSImport("html_codesniffer", "loadStandard")
  @js.native
  def loadStandard(standard: String, callback: Callback): Unit = js.native
  @JSImport("html_codesniffer", "loadStandard")
  @js.native
  def loadStandard(standard: String, callback: Callback, failCallback: FailCallback): Unit = js.native
  
  @JSImport("html_codesniffer", "process")
  @js.native
  def process(standard: String, content: String, callback: Callback): Unit = js.native
  @JSImport("html_codesniffer", "process")
  @js.native
  def process(
    standard: String,
    content: String,
    callback: Callback,
    failCallback: js.UndefOr[scala.Nothing],
    language: String
  ): Unit = js.native
  @JSImport("html_codesniffer", "process")
  @js.native
  def process(standard: String, content: String, callback: Callback, failCallback: FailCallback): Unit = js.native
  @JSImport("html_codesniffer", "process")
  @js.native
  def process(
    standard: String,
    content: String,
    callback: Callback,
    failCallback: FailCallback,
    language: String
  ): Unit = js.native
  @JSImport("html_codesniffer", "process")
  @js.native
  def process(standard: String, content: Element, callback: Callback): Unit = js.native
  @JSImport("html_codesniffer", "process")
  @js.native
  def process(
    standard: String,
    content: Element,
    callback: Callback,
    failCallback: js.UndefOr[scala.Nothing],
    language: String
  ): Unit = js.native
  @JSImport("html_codesniffer", "process")
  @js.native
  def process(standard: String, content: Element, callback: Callback, failCallback: FailCallback): Unit = js.native
  @JSImport("html_codesniffer", "process")
  @js.native
  def process(
    standard: String,
    content: Element,
    callback: Callback,
    failCallback: FailCallback,
    language: String
  ): Unit = js.native
  
  @JSImport("html_codesniffer", "run")
  @js.native
  def run(callback: Callback, content: String): String = js.native
  @JSImport("html_codesniffer", "run")
  @js.native
  def run(callback: Callback, content: Node): String = js.native
  
  type Callback = js.Function0[Unit]
  
  type FailCallback = js.Function0[Unit]
  
  @js.native
  trait Message extends StObject {
    
    var code: String = js.native
    
    var data: js.UndefOr[MessageData] = js.native
    
    var element: Element = js.native
    
    var msg: String = js.native
    
    var `type`: Double = js.native
  }
  object Message {
    
    @scala.inline
    def apply(code: String, element: Element, msg: String, `type`: Double): Message = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: MessageData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type MessageData = StringDictionary[js.Any]
}
