package typings.jsxPdf

import org.scalablytyped.runtime.StringDictionary
import typings.jsxPdf.jsxPdfStrings.Asterisk
import typings.jsxPdf.jsxPdfStrings.H
import typings.jsxPdf.jsxPdfStrings.L
import typings.jsxPdf.jsxPdfStrings.M
import typings.jsxPdf.jsxPdfStrings.Q
import typings.jsxPdf.jsxPdfStrings.alphanumeric
import typings.jsxPdf.jsxPdfStrings.auto
import typings.jsxPdf.jsxPdfStrings.numeric
import typings.jsxPdf.jsxPdfStrings.octet
import typings.jsxPdf.mod.global.JSX.Child
import typings.jsxPdf.mod.global.JSX.DynamicChild
import typings.jsxPdf.mod.global.JSX.Element
import typings.pdfkit.PDFKit.DocumentPermissions
import typings.pdfkit.PDFKit.Mixins.OpenTypeFeatures
import typings.pdfmake.anon.X
import typings.pdfmake.interfacesMod.Alignment
import typings.pdfmake.interfacesMod.ContextPageSize
import typings.pdfmake.interfacesMod.Decoration
import typings.pdfmake.interfacesMod.DecorationStyle
import typings.pdfmake.interfacesMod.DynamicBackground
import typings.pdfmake.interfacesMod.DynamicRowSize
import typings.pdfmake.interfacesMod.Margins
import typings.pdfmake.interfacesMod.Node
import typings.pdfmake.interfacesMod.OrderedListType
import typings.pdfmake.interfacesMod.PDFVersion
import typings.pdfmake.interfacesMod.PageBreak
import typings.pdfmake.interfacesMod.PageOrientation
import typings.pdfmake.interfacesMod.PageSize
import typings.pdfmake.interfacesMod.Size
import typings.pdfmake.interfacesMod.Style
import typings.pdfmake.interfacesMod.StyleDictionary
import typings.pdfmake.interfacesMod.TDocumentInformation
import typings.pdfmake.interfacesMod.TableLayout
import typings.pdfmake.interfacesMod.UnorderedListType
import typings.pdfmake.interfacesMod.Watermark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Content extends StObject {
    
    var content: String
    
    var fit: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Content {
    
    @scala.inline
    def apply(content: String): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    @scala.inline
    implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFit(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Inlined jsx-pdf.jsx-pdf.<global>.JSX.Ele<{}> */
  trait Ele extends StObject {
    
    var children: DynamicChild
  }
  object Ele {
    
    @scala.inline
    def apply(children: DynamicChild): Ele = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ele]
    }
    
    @scala.inline
    implicit class EleMutableBuilder[Self <: Ele] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: DynamicChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction3(value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => Child): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
    }
  }
  
  /* Inlined jsx-pdf.jsx-pdf.<global>.JSX.EleNoChidlren<std.Omit<pdfmake.pdfmake/interfaces.ContentImage, 'image'> & {  src :string}> */
  trait EleNoChidlrenOmitContentI extends StObject {
    
    var absolutePosition: js.UndefOr[X] = js.undefined
    
    var alignment: js.UndefOr[Alignment] = js.undefined
    
    var background: js.UndefOr[String] = js.undefined
    
    var bold: js.UndefOr[Boolean] = js.undefined
    
    var characterSpacing: js.UndefOr[Double] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var columnGap: js.UndefOr[Size] = js.undefined
    
    var decoration: js.UndefOr[Decoration] = js.undefined
    
    var decorationColor: js.UndefOr[String] = js.undefined
    
    var decorationStyle: js.UndefOr[DecorationStyle] = js.undefined
    
    var fillColor: js.UndefOr[String] = js.undefined
    
    var fillOpacity: js.UndefOr[Double] = js.undefined
    
    var fit: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var font: js.UndefOr[String] = js.undefined
    
    var fontFeatures: js.UndefOr[js.Array[OpenTypeFeatures]] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var headlineLevel: js.UndefOr[Double] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var italics: js.UndefOr[Boolean] = js.undefined
    
    var leadingIndent: js.UndefOr[Double] = js.undefined
    
    var lineHeight: js.UndefOr[Double] = js.undefined
    
    var link: js.UndefOr[String] = js.undefined
    
    var linkToDestination: js.UndefOr[String] = js.undefined
    
    var linkToPage: js.UndefOr[Double] = js.undefined
    
    var margin: js.UndefOr[Margins] = js.undefined
    
    var markerColor: js.UndefOr[String] = js.undefined
    
    var noWrap: js.UndefOr[Boolean] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var pageBreak: js.UndefOr[PageBreak] = js.undefined
    
    var pageOrientation: js.UndefOr[PageOrientation] = js.undefined
    
    var preserveLeadingSpaces: js.UndefOr[Boolean] = js.undefined
    
    var relativePosition: js.UndefOr[X] = js.undefined
    
    var src: String
    
    var style: js.UndefOr[String | js.Array[String] | Style] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object EleNoChidlrenOmitContentI {
    
    @scala.inline
    def apply(src: String): EleNoChidlrenOmitContentI = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[EleNoChidlrenOmitContentI]
    }
    
    @scala.inline
    implicit class EleNoChidlrenOmitContentIMutableBuilder[Self <: EleNoChidlrenOmitContentI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolutePosition(value: X): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
      
      @scala.inline
      def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterSpacingUndefined: Self = StObject.set(x, "characterSpacing", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColumnGap(value: Size): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      @scala.inline
      def setDecoration(value: Decoration): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColor(value: String): Self = StObject.set(x, "decorationColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColorUndefined: Self = StObject.set(x, "decorationColor", js.undefined)
      
      @scala.inline
      def setDecorationStyle(value: DecorationStyle): Self = StObject.set(x, "decorationStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationStyleUndefined: Self = StObject.set(x, "decorationStyle", js.undefined)
      
      @scala.inline
      def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFit(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeatures(value: js.Array[OpenTypeFeatures]): Self = StObject.set(x, "fontFeatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeaturesUndefined: Self = StObject.set(x, "fontFeatures", js.undefined)
      
      @scala.inline
      def setFontFeaturesVarargs(value: OpenTypeFeatures*): Self = StObject.set(x, "fontFeatures", js.Array(value :_*))
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setHeadlineLevel(value: Double): Self = StObject.set(x, "headlineLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadlineLevelUndefined: Self = StObject.set(x, "headlineLevel", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
      
      @scala.inline
      def setLeadingIndent(value: Double): Self = StObject.set(x, "leadingIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingIndentUndefined: Self = StObject.set(x, "leadingIndent", js.undefined)
      
      @scala.inline
      def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkToDestination(value: String): Self = StObject.set(x, "linkToDestination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkToDestinationUndefined: Self = StObject.set(x, "linkToDestination", js.undefined)
      
      @scala.inline
      def setLinkToPage(value: Double): Self = StObject.set(x, "linkToPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkToPageUndefined: Self = StObject.set(x, "linkToPage", js.undefined)
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      @scala.inline
      def setMargin(value: Margins): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
      
      @scala.inline
      def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
      
      @scala.inline
      def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      @scala.inline
      def setPreserveLeadingSpaces(value: Boolean): Self = StObject.set(x, "preserveLeadingSpaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveLeadingSpacesUndefined: Self = StObject.set(x, "preserveLeadingSpaces", js.undefined)
      
      @scala.inline
      def setRelativePosition(value: X): Self = StObject.set(x, "relativePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativePositionUndefined: Self = StObject.set(x, "relativePosition", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Inlined jsx-pdf.jsx-pdf.<global>.JSX.EleNoChidlren<std.Omit<pdfmake.pdfmake/interfaces.ContentQr, 'qr'> & {  content :string}> */
  trait EleNoChidlrenOmitContentQ extends StObject {
    
    var absolutePosition: js.UndefOr[X] = js.undefined
    
    var alignment: js.UndefOr[Alignment] = js.undefined
    
    var background: js.UndefOr[String] = js.undefined
    
    var bold: js.UndefOr[Boolean] = js.undefined
    
    var characterSpacing: js.UndefOr[Double] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var columnGap: js.UndefOr[Size] = js.undefined
    
    var content: String
    
    var decoration: js.UndefOr[Decoration] = js.undefined
    
    var decorationColor: js.UndefOr[String] = js.undefined
    
    var decorationStyle: js.UndefOr[DecorationStyle] = js.undefined
    
    var eccLevel: js.UndefOr[L | M | Q | H] = js.undefined
    
    var fillColor: js.UndefOr[String] = js.undefined
    
    var fillOpacity: js.UndefOr[Double] = js.undefined
    
    var fit: js.UndefOr[Double] = js.undefined
    
    var font: js.UndefOr[String] = js.undefined
    
    var fontFeatures: js.UndefOr[js.Array[OpenTypeFeatures]] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var foreground: js.UndefOr[String] = js.undefined
    
    var headlineLevel: js.UndefOr[Double] = js.undefined
    
    var italics: js.UndefOr[Boolean] = js.undefined
    
    var leadingIndent: js.UndefOr[Double] = js.undefined
    
    var lineHeight: js.UndefOr[Double] = js.undefined
    
    var margin: js.UndefOr[Margins] = js.undefined
    
    var markerColor: js.UndefOr[String] = js.undefined
    
    var mask: js.UndefOr[Double] = js.undefined
    
    var mode: js.UndefOr[numeric | alphanumeric | octet] = js.undefined
    
    var noWrap: js.UndefOr[Boolean] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var pageBreak: js.UndefOr[PageBreak] = js.undefined
    
    var pageOrientation: js.UndefOr[PageOrientation] = js.undefined
    
    var preserveLeadingSpaces: js.UndefOr[Boolean] = js.undefined
    
    var relativePosition: js.UndefOr[X] = js.undefined
    
    var style: js.UndefOr[String | js.Array[String] | Style] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object EleNoChidlrenOmitContentQ {
    
    @scala.inline
    def apply(content: String): EleNoChidlrenOmitContentQ = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[EleNoChidlrenOmitContentQ]
    }
    
    @scala.inline
    implicit class EleNoChidlrenOmitContentQMutableBuilder[Self <: EleNoChidlrenOmitContentQ] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolutePosition(value: X): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
      
      @scala.inline
      def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterSpacingUndefined: Self = StObject.set(x, "characterSpacing", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColumnGap(value: Size): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecoration(value: Decoration): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColor(value: String): Self = StObject.set(x, "decorationColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColorUndefined: Self = StObject.set(x, "decorationColor", js.undefined)
      
      @scala.inline
      def setDecorationStyle(value: DecorationStyle): Self = StObject.set(x, "decorationStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationStyleUndefined: Self = StObject.set(x, "decorationStyle", js.undefined)
      
      @scala.inline
      def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
      
      @scala.inline
      def setEccLevel(value: L | M | Q | H): Self = StObject.set(x, "eccLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEccLevelUndefined: Self = StObject.set(x, "eccLevel", js.undefined)
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFit(value: Double): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeatures(value: js.Array[OpenTypeFeatures]): Self = StObject.set(x, "fontFeatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeaturesUndefined: Self = StObject.set(x, "fontFeatures", js.undefined)
      
      @scala.inline
      def setFontFeaturesVarargs(value: OpenTypeFeatures*): Self = StObject.set(x, "fontFeatures", js.Array(value :_*))
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setForeground(value: String): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForegroundUndefined: Self = StObject.set(x, "foreground", js.undefined)
      
      @scala.inline
      def setHeadlineLevel(value: Double): Self = StObject.set(x, "headlineLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadlineLevelUndefined: Self = StObject.set(x, "headlineLevel", js.undefined)
      
      @scala.inline
      def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
      
      @scala.inline
      def setLeadingIndent(value: Double): Self = StObject.set(x, "leadingIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingIndentUndefined: Self = StObject.set(x, "leadingIndent", js.undefined)
      
      @scala.inline
      def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setMargin(value: Margins): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
      
      @scala.inline
      def setMask(value: Double): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setMode(value: numeric | alphanumeric | octet): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
      
      @scala.inline
      def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      @scala.inline
      def setPreserveLeadingSpaces(value: Boolean): Self = StObject.set(x, "preserveLeadingSpaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveLeadingSpacesUndefined: Self = StObject.set(x, "preserveLeadingSpaces", js.undefined)
      
      @scala.inline
      def setRelativePosition(value: X): Self = StObject.set(x, "relativePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativePositionUndefined: Self = StObject.set(x, "relativePosition", js.undefined)
      
      @scala.inline
      def setStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /* Inlined jsx-pdf.jsx-pdf.<global>.JSX.Ele<std.Omit<pdfmake.pdfmake/interfaces.ContentColumns, 'columns'>> */
  trait EleOmitContentColumnscolu extends StObject {
    
    var absolutePosition: js.UndefOr[X] = js.undefined
    
    var alignment: js.UndefOr[Alignment] = js.undefined
    
    var background: js.UndefOr[String] = js.undefined
    
    var bold: js.UndefOr[Boolean] = js.undefined
    
    var characterSpacing: js.UndefOr[Double] = js.undefined
    
    var children: DynamicChild
    
    var color: js.UndefOr[String] = js.undefined
    
    var columnGap: js.UndefOr[Size] = js.undefined
    
    var decoration: js.UndefOr[Decoration] = js.undefined
    
    var decorationColor: js.UndefOr[String] = js.undefined
    
    var decorationStyle: js.UndefOr[DecorationStyle] = js.undefined
    
    var fillColor: js.UndefOr[String] = js.undefined
    
    var fillOpacity: js.UndefOr[Double] = js.undefined
    
    var font: js.UndefOr[String] = js.undefined
    
    var fontFeatures: js.UndefOr[js.Array[OpenTypeFeatures]] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var headlineLevel: js.UndefOr[Double] = js.undefined
    
    var italics: js.UndefOr[Boolean] = js.undefined
    
    var leadingIndent: js.UndefOr[Double] = js.undefined
    
    var lineHeight: js.UndefOr[Double] = js.undefined
    
    var margin: js.UndefOr[Margins] = js.undefined
    
    var markerColor: js.UndefOr[String] = js.undefined
    
    var noWrap: js.UndefOr[Boolean] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var pageBreak: js.UndefOr[PageBreak] = js.undefined
    
    var pageOrientation: js.UndefOr[PageOrientation] = js.undefined
    
    var preserveLeadingSpaces: js.UndefOr[Boolean] = js.undefined
    
    var relativePosition: js.UndefOr[X] = js.undefined
    
    var style: js.UndefOr[String | js.Array[String] | Style] = js.undefined
  }
  object EleOmitContentColumnscolu {
    
    @scala.inline
    def apply(children: DynamicChild): EleOmitContentColumnscolu = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[EleOmitContentColumnscolu]
    }
    
    @scala.inline
    implicit class EleOmitContentColumnscoluMutableBuilder[Self <: EleOmitContentColumnscolu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolutePosition(value: X): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
      
      @scala.inline
      def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterSpacingUndefined: Self = StObject.set(x, "characterSpacing", js.undefined)
      
      @scala.inline
      def setChildren(value: DynamicChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction3(value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => Child): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColumnGap(value: Size): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      @scala.inline
      def setDecoration(value: Decoration): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColor(value: String): Self = StObject.set(x, "decorationColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColorUndefined: Self = StObject.set(x, "decorationColor", js.undefined)
      
      @scala.inline
      def setDecorationStyle(value: DecorationStyle): Self = StObject.set(x, "decorationStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationStyleUndefined: Self = StObject.set(x, "decorationStyle", js.undefined)
      
      @scala.inline
      def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeatures(value: js.Array[OpenTypeFeatures]): Self = StObject.set(x, "fontFeatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeaturesUndefined: Self = StObject.set(x, "fontFeatures", js.undefined)
      
      @scala.inline
      def setFontFeaturesVarargs(value: OpenTypeFeatures*): Self = StObject.set(x, "fontFeatures", js.Array(value :_*))
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setHeadlineLevel(value: Double): Self = StObject.set(x, "headlineLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadlineLevelUndefined: Self = StObject.set(x, "headlineLevel", js.undefined)
      
      @scala.inline
      def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
      
      @scala.inline
      def setLeadingIndent(value: Double): Self = StObject.set(x, "leadingIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingIndentUndefined: Self = StObject.set(x, "leadingIndent", js.undefined)
      
      @scala.inline
      def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setMargin(value: Margins): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
      
      @scala.inline
      def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
      
      @scala.inline
      def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      @scala.inline
      def setPreserveLeadingSpaces(value: Boolean): Self = StObject.set(x, "preserveLeadingSpaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveLeadingSpacesUndefined: Self = StObject.set(x, "preserveLeadingSpaces", js.undefined)
      
      @scala.inline
      def setRelativePosition(value: X): Self = StObject.set(x, "relativePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativePositionUndefined: Self = StObject.set(x, "relativePosition", js.undefined)
      
      @scala.inline
      def setStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
    }
  }
  
  /* Inlined jsx-pdf.jsx-pdf.<global>.JSX.Ele<std.Omit<pdfmake.pdfmake/interfaces.ContentOrderedList, 'ol'>> */
  trait EleOmitContentOrderedList extends StObject {
    
    var absolutePosition: js.UndefOr[X] = js.undefined
    
    var alignment: js.UndefOr[Alignment] = js.undefined
    
    var background: js.UndefOr[String] = js.undefined
    
    var bold: js.UndefOr[Boolean] = js.undefined
    
    var characterSpacing: js.UndefOr[Double] = js.undefined
    
    var children: DynamicChild
    
    var color: js.UndefOr[String] = js.undefined
    
    var columnGap: js.UndefOr[Size] = js.undefined
    
    var decoration: js.UndefOr[Decoration] = js.undefined
    
    var decorationColor: js.UndefOr[String] = js.undefined
    
    var decorationStyle: js.UndefOr[DecorationStyle] = js.undefined
    
    var fillColor: js.UndefOr[String] = js.undefined
    
    var fillOpacity: js.UndefOr[Double] = js.undefined
    
    var font: js.UndefOr[String] = js.undefined
    
    var fontFeatures: js.UndefOr[js.Array[OpenTypeFeatures]] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var headlineLevel: js.UndefOr[Double] = js.undefined
    
    var italics: js.UndefOr[Boolean] = js.undefined
    
    var leadingIndent: js.UndefOr[Double] = js.undefined
    
    var lineHeight: js.UndefOr[Double] = js.undefined
    
    var margin: js.UndefOr[Margins] = js.undefined
    
    var markerColor: js.UndefOr[String] = js.undefined
    
    var noWrap: js.UndefOr[Boolean] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var pageBreak: js.UndefOr[PageBreak] = js.undefined
    
    var pageOrientation: js.UndefOr[PageOrientation] = js.undefined
    
    var preserveLeadingSpaces: js.UndefOr[Boolean] = js.undefined
    
    var relativePosition: js.UndefOr[X] = js.undefined
    
    var reversed: js.UndefOr[Boolean] = js.undefined
    
    var separator: js.UndefOr[String | (js.Tuple2[String, String])] = js.undefined
    
    var start: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[String | js.Array[String] | Style] = js.undefined
    
    var `type`: js.UndefOr[OrderedListType] = js.undefined
  }
  object EleOmitContentOrderedList {
    
    @scala.inline
    def apply(children: DynamicChild): EleOmitContentOrderedList = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[EleOmitContentOrderedList]
    }
    
    @scala.inline
    implicit class EleOmitContentOrderedListMutableBuilder[Self <: EleOmitContentOrderedList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolutePosition(value: X): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
      
      @scala.inline
      def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterSpacingUndefined: Self = StObject.set(x, "characterSpacing", js.undefined)
      
      @scala.inline
      def setChildren(value: DynamicChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction3(value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => Child): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColumnGap(value: Size): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      @scala.inline
      def setDecoration(value: Decoration): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColor(value: String): Self = StObject.set(x, "decorationColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColorUndefined: Self = StObject.set(x, "decorationColor", js.undefined)
      
      @scala.inline
      def setDecorationStyle(value: DecorationStyle): Self = StObject.set(x, "decorationStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationStyleUndefined: Self = StObject.set(x, "decorationStyle", js.undefined)
      
      @scala.inline
      def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeatures(value: js.Array[OpenTypeFeatures]): Self = StObject.set(x, "fontFeatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeaturesUndefined: Self = StObject.set(x, "fontFeatures", js.undefined)
      
      @scala.inline
      def setFontFeaturesVarargs(value: OpenTypeFeatures*): Self = StObject.set(x, "fontFeatures", js.Array(value :_*))
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setHeadlineLevel(value: Double): Self = StObject.set(x, "headlineLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadlineLevelUndefined: Self = StObject.set(x, "headlineLevel", js.undefined)
      
      @scala.inline
      def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
      
      @scala.inline
      def setLeadingIndent(value: Double): Self = StObject.set(x, "leadingIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingIndentUndefined: Self = StObject.set(x, "leadingIndent", js.undefined)
      
      @scala.inline
      def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setMargin(value: Margins): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
      
      @scala.inline
      def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
      
      @scala.inline
      def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      @scala.inline
      def setPreserveLeadingSpaces(value: Boolean): Self = StObject.set(x, "preserveLeadingSpaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveLeadingSpacesUndefined: Self = StObject.set(x, "preserveLeadingSpaces", js.undefined)
      
      @scala.inline
      def setRelativePosition(value: X): Self = StObject.set(x, "relativePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativePositionUndefined: Self = StObject.set(x, "relativePosition", js.undefined)
      
      @scala.inline
      def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      @scala.inline
      def setSeparator(value: String | (js.Tuple2[String, String])): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setType(value: OrderedListType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined jsx-pdf.jsx-pdf.<global>.JSX.Ele<std.Omit<pdfmake.pdfmake/interfaces.ContentStack, 'stack'>> */
  trait EleOmitContentStackstack extends StObject {
    
    var absolutePosition: js.UndefOr[X] = js.undefined
    
    var alignment: js.UndefOr[Alignment] = js.undefined
    
    var background: js.UndefOr[String] = js.undefined
    
    var bold: js.UndefOr[Boolean] = js.undefined
    
    var characterSpacing: js.UndefOr[Double] = js.undefined
    
    var children: DynamicChild
    
    var color: js.UndefOr[String] = js.undefined
    
    var columnGap: js.UndefOr[Size] = js.undefined
    
    var decoration: js.UndefOr[Decoration] = js.undefined
    
    var decorationColor: js.UndefOr[String] = js.undefined
    
    var decorationStyle: js.UndefOr[DecorationStyle] = js.undefined
    
    var fillColor: js.UndefOr[String] = js.undefined
    
    var fillOpacity: js.UndefOr[Double] = js.undefined
    
    var font: js.UndefOr[String] = js.undefined
    
    var fontFeatures: js.UndefOr[js.Array[OpenTypeFeatures]] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var headlineLevel: js.UndefOr[Double] = js.undefined
    
    var italics: js.UndefOr[Boolean] = js.undefined
    
    var leadingIndent: js.UndefOr[Double] = js.undefined
    
    var lineHeight: js.UndefOr[Double] = js.undefined
    
    var margin: js.UndefOr[Margins] = js.undefined
    
    var markerColor: js.UndefOr[String] = js.undefined
    
    var noWrap: js.UndefOr[Boolean] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var pageBreak: js.UndefOr[PageBreak] = js.undefined
    
    var pageOrientation: js.UndefOr[PageOrientation] = js.undefined
    
    var preserveLeadingSpaces: js.UndefOr[Boolean] = js.undefined
    
    var relativePosition: js.UndefOr[X] = js.undefined
    
    var style: js.UndefOr[String | js.Array[String] | Style] = js.undefined
    
    var unbreakable: js.UndefOr[Boolean] = js.undefined
  }
  object EleOmitContentStackstack {
    
    @scala.inline
    def apply(children: DynamicChild): EleOmitContentStackstack = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[EleOmitContentStackstack]
    }
    
    @scala.inline
    implicit class EleOmitContentStackstackMutableBuilder[Self <: EleOmitContentStackstack] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolutePosition(value: X): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
      
      @scala.inline
      def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterSpacingUndefined: Self = StObject.set(x, "characterSpacing", js.undefined)
      
      @scala.inline
      def setChildren(value: DynamicChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction3(value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => Child): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColumnGap(value: Size): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      @scala.inline
      def setDecoration(value: Decoration): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColor(value: String): Self = StObject.set(x, "decorationColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColorUndefined: Self = StObject.set(x, "decorationColor", js.undefined)
      
      @scala.inline
      def setDecorationStyle(value: DecorationStyle): Self = StObject.set(x, "decorationStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationStyleUndefined: Self = StObject.set(x, "decorationStyle", js.undefined)
      
      @scala.inline
      def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeatures(value: js.Array[OpenTypeFeatures]): Self = StObject.set(x, "fontFeatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeaturesUndefined: Self = StObject.set(x, "fontFeatures", js.undefined)
      
      @scala.inline
      def setFontFeaturesVarargs(value: OpenTypeFeatures*): Self = StObject.set(x, "fontFeatures", js.Array(value :_*))
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setHeadlineLevel(value: Double): Self = StObject.set(x, "headlineLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadlineLevelUndefined: Self = StObject.set(x, "headlineLevel", js.undefined)
      
      @scala.inline
      def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
      
      @scala.inline
      def setLeadingIndent(value: Double): Self = StObject.set(x, "leadingIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingIndentUndefined: Self = StObject.set(x, "leadingIndent", js.undefined)
      
      @scala.inline
      def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setMargin(value: Margins): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
      
      @scala.inline
      def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
      
      @scala.inline
      def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      @scala.inline
      def setPreserveLeadingSpaces(value: Boolean): Self = StObject.set(x, "preserveLeadingSpaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveLeadingSpacesUndefined: Self = StObject.set(x, "preserveLeadingSpaces", js.undefined)
      
      @scala.inline
      def setRelativePosition(value: X): Self = StObject.set(x, "relativePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativePositionUndefined: Self = StObject.set(x, "relativePosition", js.undefined)
      
      @scala.inline
      def setStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setUnbreakable(value: Boolean): Self = StObject.set(x, "unbreakable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnbreakableUndefined: Self = StObject.set(x, "unbreakable", js.undefined)
    }
  }
  
  /* Inlined jsx-pdf.jsx-pdf.<global>.JSX.Ele<std.Omit<pdfmake.pdfmake/interfaces.ContentTable, 'table'> & std.Omit<pdfmake.pdfmake/interfaces.Table, 'body'>> */
  trait EleOmitContentTabletableO extends StObject {
    
    var absolutePosition: js.UndefOr[X] = js.undefined
    
    var alignment: js.UndefOr[Alignment] = js.undefined
    
    var background: js.UndefOr[String] = js.undefined
    
    var bold: js.UndefOr[Boolean] = js.undefined
    
    var characterSpacing: js.UndefOr[Double] = js.undefined
    
    var children: DynamicChild
    
    var color: js.UndefOr[String] = js.undefined
    
    var columnGap: js.UndefOr[Size] = js.undefined
    
    var decoration: js.UndefOr[Decoration] = js.undefined
    
    var decorationColor: js.UndefOr[String] = js.undefined
    
    var decorationStyle: js.UndefOr[DecorationStyle] = js.undefined
    
    var dontBreakRows: js.UndefOr[Boolean] = js.undefined
    
    var fillColor: js.UndefOr[String] = js.undefined
    
    var fillOpacity: js.UndefOr[Double] = js.undefined
    
    var font: js.UndefOr[String] = js.undefined
    
    var fontFeatures: js.UndefOr[js.Array[OpenTypeFeatures]] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var headerRows: js.UndefOr[Double] = js.undefined
    
    var headlineLevel: js.UndefOr[Double] = js.undefined
    
    var heights: js.UndefOr[Double | js.Array[Double] | DynamicRowSize] = js.undefined
    
    var italics: js.UndefOr[Boolean] = js.undefined
    
    var keepWithHeaderRows: js.UndefOr[Double] = js.undefined
    
    var layout: js.UndefOr[TableLayout] = js.undefined
    
    var leadingIndent: js.UndefOr[Double] = js.undefined
    
    var lineHeight: js.UndefOr[Double] = js.undefined
    
    var margin: js.UndefOr[Margins] = js.undefined
    
    var markerColor: js.UndefOr[String] = js.undefined
    
    var noWrap: js.UndefOr[Boolean] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var pageBreak: js.UndefOr[PageBreak] = js.undefined
    
    var pageOrientation: js.UndefOr[PageOrientation] = js.undefined
    
    var preserveLeadingSpaces: js.UndefOr[Boolean] = js.undefined
    
    var relativePosition: js.UndefOr[X] = js.undefined
    
    var style: js.UndefOr[String | js.Array[String] | Style] = js.undefined
    
    var widths: js.UndefOr[Asterisk | auto | js.Array[Size]] = js.undefined
  }
  object EleOmitContentTabletableO {
    
    @scala.inline
    def apply(children: DynamicChild): EleOmitContentTabletableO = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[EleOmitContentTabletableO]
    }
    
    @scala.inline
    implicit class EleOmitContentTabletableOMutableBuilder[Self <: EleOmitContentTabletableO] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolutePosition(value: X): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
      
      @scala.inline
      def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterSpacingUndefined: Self = StObject.set(x, "characterSpacing", js.undefined)
      
      @scala.inline
      def setChildren(value: DynamicChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction3(value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => Child): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColumnGap(value: Size): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      @scala.inline
      def setDecoration(value: Decoration): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColor(value: String): Self = StObject.set(x, "decorationColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColorUndefined: Self = StObject.set(x, "decorationColor", js.undefined)
      
      @scala.inline
      def setDecorationStyle(value: DecorationStyle): Self = StObject.set(x, "decorationStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationStyleUndefined: Self = StObject.set(x, "decorationStyle", js.undefined)
      
      @scala.inline
      def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
      
      @scala.inline
      def setDontBreakRows(value: Boolean): Self = StObject.set(x, "dontBreakRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDontBreakRowsUndefined: Self = StObject.set(x, "dontBreakRows", js.undefined)
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeatures(value: js.Array[OpenTypeFeatures]): Self = StObject.set(x, "fontFeatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeaturesUndefined: Self = StObject.set(x, "fontFeatures", js.undefined)
      
      @scala.inline
      def setFontFeaturesVarargs(value: OpenTypeFeatures*): Self = StObject.set(x, "fontFeatures", js.Array(value :_*))
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setHeaderRows(value: Double): Self = StObject.set(x, "headerRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderRowsUndefined: Self = StObject.set(x, "headerRows", js.undefined)
      
      @scala.inline
      def setHeadlineLevel(value: Double): Self = StObject.set(x, "headlineLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadlineLevelUndefined: Self = StObject.set(x, "headlineLevel", js.undefined)
      
      @scala.inline
      def setHeights(value: Double | js.Array[Double] | DynamicRowSize): Self = StObject.set(x, "heights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightsFunction1(value: /* row */ Double => Double | typings.pdfmake.pdfmakeStrings.auto): Self = StObject.set(x, "heights", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeightsUndefined: Self = StObject.set(x, "heights", js.undefined)
      
      @scala.inline
      def setHeightsVarargs(value: Double*): Self = StObject.set(x, "heights", js.Array(value :_*))
      
      @scala.inline
      def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
      
      @scala.inline
      def setKeepWithHeaderRows(value: Double): Self = StObject.set(x, "keepWithHeaderRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepWithHeaderRowsUndefined: Self = StObject.set(x, "keepWithHeaderRows", js.undefined)
      
      @scala.inline
      def setLayout(value: TableLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setLeadingIndent(value: Double): Self = StObject.set(x, "leadingIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingIndentUndefined: Self = StObject.set(x, "leadingIndent", js.undefined)
      
      @scala.inline
      def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setMargin(value: Margins): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
      
      @scala.inline
      def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
      
      @scala.inline
      def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      @scala.inline
      def setPreserveLeadingSpaces(value: Boolean): Self = StObject.set(x, "preserveLeadingSpaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveLeadingSpacesUndefined: Self = StObject.set(x, "preserveLeadingSpaces", js.undefined)
      
      @scala.inline
      def setRelativePosition(value: X): Self = StObject.set(x, "relativePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativePositionUndefined: Self = StObject.set(x, "relativePosition", js.undefined)
      
      @scala.inline
      def setStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setWidths(value: Asterisk | auto | js.Array[Size]): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
      
      @scala.inline
      def setWidthsVarargs(value: Size*): Self = StObject.set(x, "widths", js.Array(value :_*))
    }
  }
  
  /* Inlined jsx-pdf.jsx-pdf.<global>.JSX.Ele<std.Omit<pdfmake.pdfmake/interfaces.ContentText, 'text'>> */
  trait EleOmitContentTexttext extends StObject {
    
    var absolutePosition: js.UndefOr[X] = js.undefined
    
    var alignment: js.UndefOr[Alignment] = js.undefined
    
    var background: js.UndefOr[String] = js.undefined
    
    var bold: js.UndefOr[Boolean] = js.undefined
    
    var characterSpacing: js.UndefOr[Double] = js.undefined
    
    var children: DynamicChild
    
    var color: js.UndefOr[String] = js.undefined
    
    var columnGap: js.UndefOr[Size] = js.undefined
    
    var decoration: js.UndefOr[Decoration] = js.undefined
    
    var decorationColor: js.UndefOr[String] = js.undefined
    
    var decorationStyle: js.UndefOr[DecorationStyle] = js.undefined
    
    var fillColor: js.UndefOr[String] = js.undefined
    
    var fillOpacity: js.UndefOr[Double] = js.undefined
    
    var font: js.UndefOr[String] = js.undefined
    
    var fontFeatures: js.UndefOr[js.Array[OpenTypeFeatures]] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var headlineLevel: js.UndefOr[Double] = js.undefined
    
    var italics: js.UndefOr[Boolean] = js.undefined
    
    var leadingIndent: js.UndefOr[Double] = js.undefined
    
    var lineHeight: js.UndefOr[Double] = js.undefined
    
    var link: js.UndefOr[String] = js.undefined
    
    var linkToDestination: js.UndefOr[String] = js.undefined
    
    var linkToPage: js.UndefOr[Double] = js.undefined
    
    var margin: js.UndefOr[Margins] = js.undefined
    
    var markerColor: js.UndefOr[String] = js.undefined
    
    var noWrap: js.UndefOr[Boolean] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var pageBreak: js.UndefOr[PageBreak] = js.undefined
    
    var pageOrientation: js.UndefOr[PageOrientation] = js.undefined
    
    var preserveLeadingSpaces: js.UndefOr[Boolean] = js.undefined
    
    var relativePosition: js.UndefOr[X] = js.undefined
    
    var style: js.UndefOr[String | js.Array[String] | Style] = js.undefined
  }
  object EleOmitContentTexttext {
    
    @scala.inline
    def apply(children: DynamicChild): EleOmitContentTexttext = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[EleOmitContentTexttext]
    }
    
    @scala.inline
    implicit class EleOmitContentTexttextMutableBuilder[Self <: EleOmitContentTexttext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolutePosition(value: X): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
      
      @scala.inline
      def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterSpacingUndefined: Self = StObject.set(x, "characterSpacing", js.undefined)
      
      @scala.inline
      def setChildren(value: DynamicChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction3(value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => Child): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColumnGap(value: Size): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      @scala.inline
      def setDecoration(value: Decoration): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColor(value: String): Self = StObject.set(x, "decorationColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColorUndefined: Self = StObject.set(x, "decorationColor", js.undefined)
      
      @scala.inline
      def setDecorationStyle(value: DecorationStyle): Self = StObject.set(x, "decorationStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationStyleUndefined: Self = StObject.set(x, "decorationStyle", js.undefined)
      
      @scala.inline
      def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeatures(value: js.Array[OpenTypeFeatures]): Self = StObject.set(x, "fontFeatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeaturesUndefined: Self = StObject.set(x, "fontFeatures", js.undefined)
      
      @scala.inline
      def setFontFeaturesVarargs(value: OpenTypeFeatures*): Self = StObject.set(x, "fontFeatures", js.Array(value :_*))
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setHeadlineLevel(value: Double): Self = StObject.set(x, "headlineLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadlineLevelUndefined: Self = StObject.set(x, "headlineLevel", js.undefined)
      
      @scala.inline
      def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
      
      @scala.inline
      def setLeadingIndent(value: Double): Self = StObject.set(x, "leadingIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingIndentUndefined: Self = StObject.set(x, "leadingIndent", js.undefined)
      
      @scala.inline
      def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkToDestination(value: String): Self = StObject.set(x, "linkToDestination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkToDestinationUndefined: Self = StObject.set(x, "linkToDestination", js.undefined)
      
      @scala.inline
      def setLinkToPage(value: Double): Self = StObject.set(x, "linkToPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkToPageUndefined: Self = StObject.set(x, "linkToPage", js.undefined)
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      @scala.inline
      def setMargin(value: Margins): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
      
      @scala.inline
      def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
      
      @scala.inline
      def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      @scala.inline
      def setPreserveLeadingSpaces(value: Boolean): Self = StObject.set(x, "preserveLeadingSpaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveLeadingSpacesUndefined: Self = StObject.set(x, "preserveLeadingSpaces", js.undefined)
      
      @scala.inline
      def setRelativePosition(value: X): Self = StObject.set(x, "relativePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativePositionUndefined: Self = StObject.set(x, "relativePosition", js.undefined)
      
      @scala.inline
      def setStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
    }
  }
  
  /* Inlined jsx-pdf.jsx-pdf.<global>.JSX.Ele<std.Omit<pdfmake.pdfmake/interfaces.ContentUnorderedList, 'ul'>> */
  trait EleOmitContentUnorderedLi extends StObject {
    
    var absolutePosition: js.UndefOr[X] = js.undefined
    
    var alignment: js.UndefOr[Alignment] = js.undefined
    
    var background: js.UndefOr[String] = js.undefined
    
    var bold: js.UndefOr[Boolean] = js.undefined
    
    var characterSpacing: js.UndefOr[Double] = js.undefined
    
    var children: DynamicChild
    
    var color: js.UndefOr[String] = js.undefined
    
    var columnGap: js.UndefOr[Size] = js.undefined
    
    var decoration: js.UndefOr[Decoration] = js.undefined
    
    var decorationColor: js.UndefOr[String] = js.undefined
    
    var decorationStyle: js.UndefOr[DecorationStyle] = js.undefined
    
    var fillColor: js.UndefOr[String] = js.undefined
    
    var fillOpacity: js.UndefOr[Double] = js.undefined
    
    var font: js.UndefOr[String] = js.undefined
    
    var fontFeatures: js.UndefOr[js.Array[OpenTypeFeatures]] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var headlineLevel: js.UndefOr[Double] = js.undefined
    
    var italics: js.UndefOr[Boolean] = js.undefined
    
    var leadingIndent: js.UndefOr[Double] = js.undefined
    
    var lineHeight: js.UndefOr[Double] = js.undefined
    
    var margin: js.UndefOr[Margins] = js.undefined
    
    var markerColor: js.UndefOr[String] = js.undefined
    
    var noWrap: js.UndefOr[Boolean] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var pageBreak: js.UndefOr[PageBreak] = js.undefined
    
    var pageOrientation: js.UndefOr[PageOrientation] = js.undefined
    
    var preserveLeadingSpaces: js.UndefOr[Boolean] = js.undefined
    
    var relativePosition: js.UndefOr[X] = js.undefined
    
    var style: js.UndefOr[String | js.Array[String] | Style] = js.undefined
    
    var `type`: js.UndefOr[UnorderedListType] = js.undefined
  }
  object EleOmitContentUnorderedLi {
    
    @scala.inline
    def apply(children: DynamicChild): EleOmitContentUnorderedLi = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[EleOmitContentUnorderedLi]
    }
    
    @scala.inline
    implicit class EleOmitContentUnorderedLiMutableBuilder[Self <: EleOmitContentUnorderedLi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolutePosition(value: X): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
      
      @scala.inline
      def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterSpacingUndefined: Self = StObject.set(x, "characterSpacing", js.undefined)
      
      @scala.inline
      def setChildren(value: DynamicChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction3(value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => Child): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColumnGap(value: Size): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      @scala.inline
      def setDecoration(value: Decoration): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColor(value: String): Self = StObject.set(x, "decorationColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColorUndefined: Self = StObject.set(x, "decorationColor", js.undefined)
      
      @scala.inline
      def setDecorationStyle(value: DecorationStyle): Self = StObject.set(x, "decorationStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationStyleUndefined: Self = StObject.set(x, "decorationStyle", js.undefined)
      
      @scala.inline
      def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeatures(value: js.Array[OpenTypeFeatures]): Self = StObject.set(x, "fontFeatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeaturesUndefined: Self = StObject.set(x, "fontFeatures", js.undefined)
      
      @scala.inline
      def setFontFeaturesVarargs(value: OpenTypeFeatures*): Self = StObject.set(x, "fontFeatures", js.Array(value :_*))
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setHeadlineLevel(value: Double): Self = StObject.set(x, "headlineLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadlineLevelUndefined: Self = StObject.set(x, "headlineLevel", js.undefined)
      
      @scala.inline
      def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
      
      @scala.inline
      def setLeadingIndent(value: Double): Self = StObject.set(x, "leadingIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingIndentUndefined: Self = StObject.set(x, "leadingIndent", js.undefined)
      
      @scala.inline
      def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setMargin(value: Margins): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
      
      @scala.inline
      def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
      
      @scala.inline
      def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      @scala.inline
      def setPreserveLeadingSpaces(value: Boolean): Self = StObject.set(x, "preserveLeadingSpaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveLeadingSpacesUndefined: Self = StObject.set(x, "preserveLeadingSpaces", js.undefined)
      
      @scala.inline
      def setRelativePosition(value: X): Self = StObject.set(x, "relativePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativePositionUndefined: Self = StObject.set(x, "relativePosition", js.undefined)
      
      @scala.inline
      def setStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setType(value: UnorderedListType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined jsx-pdf.jsx-pdf.<global>.JSX.Ele<std.Omit<pdfmake.pdfmake/interfaces.TDocumentDefinitions, 'content' | 'header' | 'footer'>> */
  trait EleOmitTDocumentDefinitio extends StObject {
    
    var background: js.UndefOr[DynamicBackground | typings.pdfmake.interfacesMod.Content] = js.undefined
    
    var children: DynamicChild
    
    var compress: js.UndefOr[Boolean] = js.undefined
    
    var defaultStyle: js.UndefOr[Style] = js.undefined
    
    var images: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var info: js.UndefOr[TDocumentInformation] = js.undefined
    
    var ownerPassword: js.UndefOr[String] = js.undefined
    
    var pageBreakBefore: js.UndefOr[
        js.Function4[
          /* currentNode */ Node, 
          /* followingNodesOnPage */ js.Array[Node], 
          /* nodesOnNextPage */ js.Array[Node], 
          /* previousNodesOnPage */ js.Array[Node], 
          Boolean
        ]
      ] = js.undefined
    
    var pageMargins: js.UndefOr[Margins] = js.undefined
    
    var pageOrientation: js.UndefOr[PageOrientation] = js.undefined
    
    var pageSize: js.UndefOr[PageSize] = js.undefined
    
    var permissions: js.UndefOr[DocumentPermissions] = js.undefined
    
    var styles: js.UndefOr[StyleDictionary] = js.undefined
    
    var userPassword: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[PDFVersion] = js.undefined
    
    var watermark: js.UndefOr[String | Watermark] = js.undefined
  }
  object EleOmitTDocumentDefinitio {
    
    @scala.inline
    def apply(children: DynamicChild): EleOmitTDocumentDefinitio = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[EleOmitTDocumentDefinitio]
    }
    
    @scala.inline
    implicit class EleOmitTDocumentDefinitioMutableBuilder[Self <: EleOmitTDocumentDefinitio] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: DynamicBackground | typings.pdfmake.interfacesMod.Content): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundFunction2(
        value: (/* currentPage */ Double, /* pageSize */ ContextPageSize) => js.UndefOr[typings.pdfmake.interfacesMod.Content | Null]
      ): Self = StObject.set(x, "background", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setChildren(value: DynamicChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction3(value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => Child): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setDefaultStyle(value: Style): Self = StObject.set(x, "defaultStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultStyleUndefined: Self = StObject.set(x, "defaultStyle", js.undefined)
      
      @scala.inline
      def setImages(value: StringDictionary[String]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      @scala.inline
      def setInfo(value: TDocumentInformation): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setOwnerPassword(value: String): Self = StObject.set(x, "ownerPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerPasswordUndefined: Self = StObject.set(x, "ownerPassword", js.undefined)
      
      @scala.inline
      def setPageBreakBefore(
        value: (/* currentNode */ Node, /* followingNodesOnPage */ js.Array[Node], /* nodesOnNextPage */ js.Array[Node], /* previousNodesOnPage */ js.Array[Node]) => Boolean
      ): Self = StObject.set(x, "pageBreakBefore", js.Any.fromFunction4(value))
      
      @scala.inline
      def setPageBreakBeforeUndefined: Self = StObject.set(x, "pageBreakBefore", js.undefined)
      
      @scala.inline
      def setPageMargins(value: Margins): Self = StObject.set(x, "pageMargins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageMarginsUndefined: Self = StObject.set(x, "pageMargins", js.undefined)
      
      @scala.inline
      def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      @scala.inline
      def setPageSize(value: PageSize): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      @scala.inline
      def setPermissions(value: DocumentPermissions): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
      
      @scala.inline
      def setStyles(value: StyleDictionary): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setUserPassword(value: String): Self = StObject.set(x, "userPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPasswordUndefined: Self = StObject.set(x, "userPassword", js.undefined)
      
      @scala.inline
      def setVersion(value: PDFVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def setWatermark(value: String | Watermark): Self = StObject.set(x, "watermark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatermarkUndefined: Self = StObject.set(x, "watermark", js.undefined)
    }
  }
  
  /* Inlined jsx-pdf.jsx-pdf.<global>.JSX.Ele<{  width :number | string}> */
  trait Elewidthnumberstring extends StObject {
    
    var children: DynamicChild
    
    var width: Double | String
  }
  object Elewidthnumberstring {
    
    @scala.inline
    def apply(children: DynamicChild, width: Double | String): Elewidthnumberstring = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Elewidthnumberstring]
    }
    
    @scala.inline
    implicit class ElewidthnumberstringMutableBuilder[Self <: Elewidthnumberstring] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: DynamicChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction3(value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => Child): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
