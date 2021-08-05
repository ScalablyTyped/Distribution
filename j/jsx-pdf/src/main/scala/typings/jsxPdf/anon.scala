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
    
    inline def apply(content: String): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    extension [Self <: Content](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setFit(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Inlined jsx-pdf.jsx-pdf.<global>.JSX.Ele<{}> */
  trait Ele extends StObject {
    
    var children: DynamicChild
  }
  object Ele {
    
    inline def apply(children: DynamicChild): Ele = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ele]
    }
    
    extension [Self <: Ele](x: Self) {
      
      inline def setChildren(value: DynamicChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction3(value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => Child): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
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
    
    inline def apply(src: String): EleNoChidlrenOmitContentI = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[EleNoChidlrenOmitContentI]
    }
    
    extension [Self <: EleNoChidlrenOmitContentI](x: Self) {
      
      inline def setAbsolutePosition(value: X): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
      
      inline def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
      
      inline def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      inline def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
      
      inline def setCharacterSpacingUndefined: Self = StObject.set(x, "characterSpacing", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColumnGap(value: Size): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      inline def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      inline def setDecoration(value: Decoration): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
      
      inline def setDecorationColor(value: String): Self = StObject.set(x, "decorationColor", value.asInstanceOf[js.Any])
      
      inline def setDecorationColorUndefined: Self = StObject.set(x, "decorationColor", js.undefined)
      
      inline def setDecorationStyle(value: DecorationStyle): Self = StObject.set(x, "decorationStyle", value.asInstanceOf[js.Any])
      
      inline def setDecorationStyleUndefined: Self = StObject.set(x, "decorationStyle", js.undefined)
      
      inline def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
      
      inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFit(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontFeatures(value: js.Array[OpenTypeFeatures]): Self = StObject.set(x, "fontFeatures", value.asInstanceOf[js.Any])
      
      inline def setFontFeaturesUndefined: Self = StObject.set(x, "fontFeatures", js.undefined)
      
      inline def setFontFeaturesVarargs(value: OpenTypeFeatures*): Self = StObject.set(x, "fontFeatures", js.Array(value :_*))
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setHeadlineLevel(value: Double): Self = StObject.set(x, "headlineLevel", value.asInstanceOf[js.Any])
      
      inline def setHeadlineLevelUndefined: Self = StObject.set(x, "headlineLevel", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
      
      inline def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
      
      inline def setLeadingIndent(value: Double): Self = StObject.set(x, "leadingIndent", value.asInstanceOf[js.Any])
      
      inline def setLeadingIndentUndefined: Self = StObject.set(x, "leadingIndent", js.undefined)
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkToDestination(value: String): Self = StObject.set(x, "linkToDestination", value.asInstanceOf[js.Any])
      
      inline def setLinkToDestinationUndefined: Self = StObject.set(x, "linkToDestination", js.undefined)
      
      inline def setLinkToPage(value: Double): Self = StObject.set(x, "linkToPage", value.asInstanceOf[js.Any])
      
      inline def setLinkToPageUndefined: Self = StObject.set(x, "linkToPage", js.undefined)
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setMargin(value: Margins): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
      
      inline def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
      
      inline def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      inline def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
      
      inline def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
      
      inline def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      inline def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      inline def setPreserveLeadingSpaces(value: Boolean): Self = StObject.set(x, "preserveLeadingSpaces", value.asInstanceOf[js.Any])
      
      inline def setPreserveLeadingSpacesUndefined: Self = StObject.set(x, "preserveLeadingSpaces", js.undefined)
      
      inline def setRelativePosition(value: X): Self = StObject.set(x, "relativePosition", value.asInstanceOf[js.Any])
      
      inline def setRelativePositionUndefined: Self = StObject.set(x, "relativePosition", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
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
    
    inline def apply(content: String): EleNoChidlrenOmitContentQ = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[EleNoChidlrenOmitContentQ]
    }
    
    extension [Self <: EleNoChidlrenOmitContentQ](x: Self) {
      
      inline def setAbsolutePosition(value: X): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
      
      inline def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
      
      inline def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      inline def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
      
      inline def setCharacterSpacingUndefined: Self = StObject.set(x, "characterSpacing", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColumnGap(value: Size): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      inline def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setDecoration(value: Decoration): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
      
      inline def setDecorationColor(value: String): Self = StObject.set(x, "decorationColor", value.asInstanceOf[js.Any])
      
      inline def setDecorationColorUndefined: Self = StObject.set(x, "decorationColor", js.undefined)
      
      inline def setDecorationStyle(value: DecorationStyle): Self = StObject.set(x, "decorationStyle", value.asInstanceOf[js.Any])
      
      inline def setDecorationStyleUndefined: Self = StObject.set(x, "decorationStyle", js.undefined)
      
      inline def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
      
      inline def setEccLevel(value: L | M | Q | H): Self = StObject.set(x, "eccLevel", value.asInstanceOf[js.Any])
      
      inline def setEccLevelUndefined: Self = StObject.set(x, "eccLevel", js.undefined)
      
      inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFit(value: Double): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontFeatures(value: js.Array[OpenTypeFeatures]): Self = StObject.set(x, "fontFeatures", value.asInstanceOf[js.Any])
      
      inline def setFontFeaturesUndefined: Self = StObject.set(x, "fontFeatures", js.undefined)
      
      inline def setFontFeaturesVarargs(value: OpenTypeFeatures*): Self = StObject.set(x, "fontFeatures", js.Array(value :_*))
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setForeground(value: String): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
      
      inline def setForegroundUndefined: Self = StObject.set(x, "foreground", js.undefined)
      
      inline def setHeadlineLevel(value: Double): Self = StObject.set(x, "headlineLevel", value.asInstanceOf[js.Any])
      
      inline def setHeadlineLevelUndefined: Self = StObject.set(x, "headlineLevel", js.undefined)
      
      inline def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
      
      inline def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
      
      inline def setLeadingIndent(value: Double): Self = StObject.set(x, "leadingIndent", value.asInstanceOf[js.Any])
      
      inline def setLeadingIndentUndefined: Self = StObject.set(x, "leadingIndent", js.undefined)
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setMargin(value: Margins): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
      
      inline def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
      
      inline def setMask(value: Double): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMode(value: numeric | alphanumeric | octet): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      inline def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
      
      inline def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
      
      inline def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      inline def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      inline def setPreserveLeadingSpaces(value: Boolean): Self = StObject.set(x, "preserveLeadingSpaces", value.asInstanceOf[js.Any])
      
      inline def setPreserveLeadingSpacesUndefined: Self = StObject.set(x, "preserveLeadingSpaces", js.undefined)
      
      inline def setRelativePosition(value: X): Self = StObject.set(x, "relativePosition", value.asInstanceOf[js.Any])
      
      inline def setRelativePositionUndefined: Self = StObject.set(x, "relativePosition", js.undefined)
      
      inline def setStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
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
    
    inline def apply(children: DynamicChild): EleOmitContentColumnscolu = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[EleOmitContentColumnscolu]
    }
    
    extension [Self <: EleOmitContentColumnscolu](x: Self) {
      
      inline def setAbsolutePosition(value: X): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
      
      inline def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
      
      inline def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      inline def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
      
      inline def setCharacterSpacingUndefined: Self = StObject.set(x, "characterSpacing", js.undefined)
      
      inline def setChildren(value: DynamicChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction3(value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => Child): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColumnGap(value: Size): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      inline def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      inline def setDecoration(value: Decoration): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
      
      inline def setDecorationColor(value: String): Self = StObject.set(x, "decorationColor", value.asInstanceOf[js.Any])
      
      inline def setDecorationColorUndefined: Self = StObject.set(x, "decorationColor", js.undefined)
      
      inline def setDecorationStyle(value: DecorationStyle): Self = StObject.set(x, "decorationStyle", value.asInstanceOf[js.Any])
      
      inline def setDecorationStyleUndefined: Self = StObject.set(x, "decorationStyle", js.undefined)
      
      inline def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
      
      inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontFeatures(value: js.Array[OpenTypeFeatures]): Self = StObject.set(x, "fontFeatures", value.asInstanceOf[js.Any])
      
      inline def setFontFeaturesUndefined: Self = StObject.set(x, "fontFeatures", js.undefined)
      
      inline def setFontFeaturesVarargs(value: OpenTypeFeatures*): Self = StObject.set(x, "fontFeatures", js.Array(value :_*))
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setHeadlineLevel(value: Double): Self = StObject.set(x, "headlineLevel", value.asInstanceOf[js.Any])
      
      inline def setHeadlineLevelUndefined: Self = StObject.set(x, "headlineLevel", js.undefined)
      
      inline def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
      
      inline def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
      
      inline def setLeadingIndent(value: Double): Self = StObject.set(x, "leadingIndent", value.asInstanceOf[js.Any])
      
      inline def setLeadingIndentUndefined: Self = StObject.set(x, "leadingIndent", js.undefined)
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setMargin(value: Margins): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
      
      inline def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
      
      inline def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      inline def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
      
      inline def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
      
      inline def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      inline def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      inline def setPreserveLeadingSpaces(value: Boolean): Self = StObject.set(x, "preserveLeadingSpaces", value.asInstanceOf[js.Any])
      
      inline def setPreserveLeadingSpacesUndefined: Self = StObject.set(x, "preserveLeadingSpaces", js.undefined)
      
      inline def setRelativePosition(value: X): Self = StObject.set(x, "relativePosition", value.asInstanceOf[js.Any])
      
      inline def setRelativePositionUndefined: Self = StObject.set(x, "relativePosition", js.undefined)
      
      inline def setStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
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
    
    inline def apply(children: DynamicChild): EleOmitContentOrderedList = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[EleOmitContentOrderedList]
    }
    
    extension [Self <: EleOmitContentOrderedList](x: Self) {
      
      inline def setAbsolutePosition(value: X): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
      
      inline def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
      
      inline def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      inline def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
      
      inline def setCharacterSpacingUndefined: Self = StObject.set(x, "characterSpacing", js.undefined)
      
      inline def setChildren(value: DynamicChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction3(value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => Child): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColumnGap(value: Size): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      inline def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      inline def setDecoration(value: Decoration): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
      
      inline def setDecorationColor(value: String): Self = StObject.set(x, "decorationColor", value.asInstanceOf[js.Any])
      
      inline def setDecorationColorUndefined: Self = StObject.set(x, "decorationColor", js.undefined)
      
      inline def setDecorationStyle(value: DecorationStyle): Self = StObject.set(x, "decorationStyle", value.asInstanceOf[js.Any])
      
      inline def setDecorationStyleUndefined: Self = StObject.set(x, "decorationStyle", js.undefined)
      
      inline def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
      
      inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontFeatures(value: js.Array[OpenTypeFeatures]): Self = StObject.set(x, "fontFeatures", value.asInstanceOf[js.Any])
      
      inline def setFontFeaturesUndefined: Self = StObject.set(x, "fontFeatures", js.undefined)
      
      inline def setFontFeaturesVarargs(value: OpenTypeFeatures*): Self = StObject.set(x, "fontFeatures", js.Array(value :_*))
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setHeadlineLevel(value: Double): Self = StObject.set(x, "headlineLevel", value.asInstanceOf[js.Any])
      
      inline def setHeadlineLevelUndefined: Self = StObject.set(x, "headlineLevel", js.undefined)
      
      inline def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
      
      inline def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
      
      inline def setLeadingIndent(value: Double): Self = StObject.set(x, "leadingIndent", value.asInstanceOf[js.Any])
      
      inline def setLeadingIndentUndefined: Self = StObject.set(x, "leadingIndent", js.undefined)
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setMargin(value: Margins): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
      
      inline def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
      
      inline def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      inline def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
      
      inline def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
      
      inline def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      inline def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      inline def setPreserveLeadingSpaces(value: Boolean): Self = StObject.set(x, "preserveLeadingSpaces", value.asInstanceOf[js.Any])
      
      inline def setPreserveLeadingSpacesUndefined: Self = StObject.set(x, "preserveLeadingSpaces", js.undefined)
      
      inline def setRelativePosition(value: X): Self = StObject.set(x, "relativePosition", value.asInstanceOf[js.Any])
      
      inline def setRelativePositionUndefined: Self = StObject.set(x, "relativePosition", js.undefined)
      
      inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      inline def setSeparator(value: String | (js.Tuple2[String, String])): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      inline def setType(value: OrderedListType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
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
    
    inline def apply(children: DynamicChild): EleOmitContentStackstack = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[EleOmitContentStackstack]
    }
    
    extension [Self <: EleOmitContentStackstack](x: Self) {
      
      inline def setAbsolutePosition(value: X): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
      
      inline def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
      
      inline def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      inline def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
      
      inline def setCharacterSpacingUndefined: Self = StObject.set(x, "characterSpacing", js.undefined)
      
      inline def setChildren(value: DynamicChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction3(value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => Child): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColumnGap(value: Size): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      inline def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      inline def setDecoration(value: Decoration): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
      
      inline def setDecorationColor(value: String): Self = StObject.set(x, "decorationColor", value.asInstanceOf[js.Any])
      
      inline def setDecorationColorUndefined: Self = StObject.set(x, "decorationColor", js.undefined)
      
      inline def setDecorationStyle(value: DecorationStyle): Self = StObject.set(x, "decorationStyle", value.asInstanceOf[js.Any])
      
      inline def setDecorationStyleUndefined: Self = StObject.set(x, "decorationStyle", js.undefined)
      
      inline def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
      
      inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontFeatures(value: js.Array[OpenTypeFeatures]): Self = StObject.set(x, "fontFeatures", value.asInstanceOf[js.Any])
      
      inline def setFontFeaturesUndefined: Self = StObject.set(x, "fontFeatures", js.undefined)
      
      inline def setFontFeaturesVarargs(value: OpenTypeFeatures*): Self = StObject.set(x, "fontFeatures", js.Array(value :_*))
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setHeadlineLevel(value: Double): Self = StObject.set(x, "headlineLevel", value.asInstanceOf[js.Any])
      
      inline def setHeadlineLevelUndefined: Self = StObject.set(x, "headlineLevel", js.undefined)
      
      inline def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
      
      inline def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
      
      inline def setLeadingIndent(value: Double): Self = StObject.set(x, "leadingIndent", value.asInstanceOf[js.Any])
      
      inline def setLeadingIndentUndefined: Self = StObject.set(x, "leadingIndent", js.undefined)
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setMargin(value: Margins): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
      
      inline def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
      
      inline def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      inline def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
      
      inline def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
      
      inline def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      inline def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      inline def setPreserveLeadingSpaces(value: Boolean): Self = StObject.set(x, "preserveLeadingSpaces", value.asInstanceOf[js.Any])
      
      inline def setPreserveLeadingSpacesUndefined: Self = StObject.set(x, "preserveLeadingSpaces", js.undefined)
      
      inline def setRelativePosition(value: X): Self = StObject.set(x, "relativePosition", value.asInstanceOf[js.Any])
      
      inline def setRelativePositionUndefined: Self = StObject.set(x, "relativePosition", js.undefined)
      
      inline def setStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      inline def setUnbreakable(value: Boolean): Self = StObject.set(x, "unbreakable", value.asInstanceOf[js.Any])
      
      inline def setUnbreakableUndefined: Self = StObject.set(x, "unbreakable", js.undefined)
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
    
    inline def apply(children: DynamicChild): EleOmitContentTabletableO = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[EleOmitContentTabletableO]
    }
    
    extension [Self <: EleOmitContentTabletableO](x: Self) {
      
      inline def setAbsolutePosition(value: X): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
      
      inline def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
      
      inline def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      inline def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
      
      inline def setCharacterSpacingUndefined: Self = StObject.set(x, "characterSpacing", js.undefined)
      
      inline def setChildren(value: DynamicChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction3(value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => Child): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColumnGap(value: Size): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      inline def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      inline def setDecoration(value: Decoration): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
      
      inline def setDecorationColor(value: String): Self = StObject.set(x, "decorationColor", value.asInstanceOf[js.Any])
      
      inline def setDecorationColorUndefined: Self = StObject.set(x, "decorationColor", js.undefined)
      
      inline def setDecorationStyle(value: DecorationStyle): Self = StObject.set(x, "decorationStyle", value.asInstanceOf[js.Any])
      
      inline def setDecorationStyleUndefined: Self = StObject.set(x, "decorationStyle", js.undefined)
      
      inline def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
      
      inline def setDontBreakRows(value: Boolean): Self = StObject.set(x, "dontBreakRows", value.asInstanceOf[js.Any])
      
      inline def setDontBreakRowsUndefined: Self = StObject.set(x, "dontBreakRows", js.undefined)
      
      inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontFeatures(value: js.Array[OpenTypeFeatures]): Self = StObject.set(x, "fontFeatures", value.asInstanceOf[js.Any])
      
      inline def setFontFeaturesUndefined: Self = StObject.set(x, "fontFeatures", js.undefined)
      
      inline def setFontFeaturesVarargs(value: OpenTypeFeatures*): Self = StObject.set(x, "fontFeatures", js.Array(value :_*))
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setHeaderRows(value: Double): Self = StObject.set(x, "headerRows", value.asInstanceOf[js.Any])
      
      inline def setHeaderRowsUndefined: Self = StObject.set(x, "headerRows", js.undefined)
      
      inline def setHeadlineLevel(value: Double): Self = StObject.set(x, "headlineLevel", value.asInstanceOf[js.Any])
      
      inline def setHeadlineLevelUndefined: Self = StObject.set(x, "headlineLevel", js.undefined)
      
      inline def setHeights(value: Double | js.Array[Double] | DynamicRowSize): Self = StObject.set(x, "heights", value.asInstanceOf[js.Any])
      
      inline def setHeightsFunction1(value: /* row */ Double => Double | typings.pdfmake.pdfmakeStrings.auto): Self = StObject.set(x, "heights", js.Any.fromFunction1(value))
      
      inline def setHeightsUndefined: Self = StObject.set(x, "heights", js.undefined)
      
      inline def setHeightsVarargs(value: Double*): Self = StObject.set(x, "heights", js.Array(value :_*))
      
      inline def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
      
      inline def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
      
      inline def setKeepWithHeaderRows(value: Double): Self = StObject.set(x, "keepWithHeaderRows", value.asInstanceOf[js.Any])
      
      inline def setKeepWithHeaderRowsUndefined: Self = StObject.set(x, "keepWithHeaderRows", js.undefined)
      
      inline def setLayout(value: TableLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setLeadingIndent(value: Double): Self = StObject.set(x, "leadingIndent", value.asInstanceOf[js.Any])
      
      inline def setLeadingIndentUndefined: Self = StObject.set(x, "leadingIndent", js.undefined)
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setMargin(value: Margins): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
      
      inline def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
      
      inline def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      inline def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
      
      inline def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
      
      inline def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      inline def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      inline def setPreserveLeadingSpaces(value: Boolean): Self = StObject.set(x, "preserveLeadingSpaces", value.asInstanceOf[js.Any])
      
      inline def setPreserveLeadingSpacesUndefined: Self = StObject.set(x, "preserveLeadingSpaces", js.undefined)
      
      inline def setRelativePosition(value: X): Self = StObject.set(x, "relativePosition", value.asInstanceOf[js.Any])
      
      inline def setRelativePositionUndefined: Self = StObject.set(x, "relativePosition", js.undefined)
      
      inline def setStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      inline def setWidths(value: Asterisk | auto | js.Array[Size]): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      inline def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
      
      inline def setWidthsVarargs(value: Size*): Self = StObject.set(x, "widths", js.Array(value :_*))
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
    
    inline def apply(children: DynamicChild): EleOmitContentTexttext = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[EleOmitContentTexttext]
    }
    
    extension [Self <: EleOmitContentTexttext](x: Self) {
      
      inline def setAbsolutePosition(value: X): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
      
      inline def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
      
      inline def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      inline def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
      
      inline def setCharacterSpacingUndefined: Self = StObject.set(x, "characterSpacing", js.undefined)
      
      inline def setChildren(value: DynamicChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction3(value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => Child): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColumnGap(value: Size): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      inline def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      inline def setDecoration(value: Decoration): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
      
      inline def setDecorationColor(value: String): Self = StObject.set(x, "decorationColor", value.asInstanceOf[js.Any])
      
      inline def setDecorationColorUndefined: Self = StObject.set(x, "decorationColor", js.undefined)
      
      inline def setDecorationStyle(value: DecorationStyle): Self = StObject.set(x, "decorationStyle", value.asInstanceOf[js.Any])
      
      inline def setDecorationStyleUndefined: Self = StObject.set(x, "decorationStyle", js.undefined)
      
      inline def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
      
      inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontFeatures(value: js.Array[OpenTypeFeatures]): Self = StObject.set(x, "fontFeatures", value.asInstanceOf[js.Any])
      
      inline def setFontFeaturesUndefined: Self = StObject.set(x, "fontFeatures", js.undefined)
      
      inline def setFontFeaturesVarargs(value: OpenTypeFeatures*): Self = StObject.set(x, "fontFeatures", js.Array(value :_*))
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setHeadlineLevel(value: Double): Self = StObject.set(x, "headlineLevel", value.asInstanceOf[js.Any])
      
      inline def setHeadlineLevelUndefined: Self = StObject.set(x, "headlineLevel", js.undefined)
      
      inline def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
      
      inline def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
      
      inline def setLeadingIndent(value: Double): Self = StObject.set(x, "leadingIndent", value.asInstanceOf[js.Any])
      
      inline def setLeadingIndentUndefined: Self = StObject.set(x, "leadingIndent", js.undefined)
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkToDestination(value: String): Self = StObject.set(x, "linkToDestination", value.asInstanceOf[js.Any])
      
      inline def setLinkToDestinationUndefined: Self = StObject.set(x, "linkToDestination", js.undefined)
      
      inline def setLinkToPage(value: Double): Self = StObject.set(x, "linkToPage", value.asInstanceOf[js.Any])
      
      inline def setLinkToPageUndefined: Self = StObject.set(x, "linkToPage", js.undefined)
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setMargin(value: Margins): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
      
      inline def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
      
      inline def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      inline def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
      
      inline def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
      
      inline def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      inline def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      inline def setPreserveLeadingSpaces(value: Boolean): Self = StObject.set(x, "preserveLeadingSpaces", value.asInstanceOf[js.Any])
      
      inline def setPreserveLeadingSpacesUndefined: Self = StObject.set(x, "preserveLeadingSpaces", js.undefined)
      
      inline def setRelativePosition(value: X): Self = StObject.set(x, "relativePosition", value.asInstanceOf[js.Any])
      
      inline def setRelativePositionUndefined: Self = StObject.set(x, "relativePosition", js.undefined)
      
      inline def setStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
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
    
    inline def apply(children: DynamicChild): EleOmitContentUnorderedLi = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[EleOmitContentUnorderedLi]
    }
    
    extension [Self <: EleOmitContentUnorderedLi](x: Self) {
      
      inline def setAbsolutePosition(value: X): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
      
      inline def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
      
      inline def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      inline def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
      
      inline def setCharacterSpacingUndefined: Self = StObject.set(x, "characterSpacing", js.undefined)
      
      inline def setChildren(value: DynamicChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction3(value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => Child): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColumnGap(value: Size): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      inline def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      inline def setDecoration(value: Decoration): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
      
      inline def setDecorationColor(value: String): Self = StObject.set(x, "decorationColor", value.asInstanceOf[js.Any])
      
      inline def setDecorationColorUndefined: Self = StObject.set(x, "decorationColor", js.undefined)
      
      inline def setDecorationStyle(value: DecorationStyle): Self = StObject.set(x, "decorationStyle", value.asInstanceOf[js.Any])
      
      inline def setDecorationStyleUndefined: Self = StObject.set(x, "decorationStyle", js.undefined)
      
      inline def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
      
      inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontFeatures(value: js.Array[OpenTypeFeatures]): Self = StObject.set(x, "fontFeatures", value.asInstanceOf[js.Any])
      
      inline def setFontFeaturesUndefined: Self = StObject.set(x, "fontFeatures", js.undefined)
      
      inline def setFontFeaturesVarargs(value: OpenTypeFeatures*): Self = StObject.set(x, "fontFeatures", js.Array(value :_*))
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setHeadlineLevel(value: Double): Self = StObject.set(x, "headlineLevel", value.asInstanceOf[js.Any])
      
      inline def setHeadlineLevelUndefined: Self = StObject.set(x, "headlineLevel", js.undefined)
      
      inline def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
      
      inline def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
      
      inline def setLeadingIndent(value: Double): Self = StObject.set(x, "leadingIndent", value.asInstanceOf[js.Any])
      
      inline def setLeadingIndentUndefined: Self = StObject.set(x, "leadingIndent", js.undefined)
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setMargin(value: Margins): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
      
      inline def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
      
      inline def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      inline def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
      
      inline def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
      
      inline def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      inline def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      inline def setPreserveLeadingSpaces(value: Boolean): Self = StObject.set(x, "preserveLeadingSpaces", value.asInstanceOf[js.Any])
      
      inline def setPreserveLeadingSpacesUndefined: Self = StObject.set(x, "preserveLeadingSpaces", js.undefined)
      
      inline def setRelativePosition(value: X): Self = StObject.set(x, "relativePosition", value.asInstanceOf[js.Any])
      
      inline def setRelativePositionUndefined: Self = StObject.set(x, "relativePosition", js.undefined)
      
      inline def setStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      inline def setType(value: UnorderedListType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
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
    
    inline def apply(children: DynamicChild): EleOmitTDocumentDefinitio = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[EleOmitTDocumentDefinitio]
    }
    
    extension [Self <: EleOmitTDocumentDefinitio](x: Self) {
      
      inline def setBackground(value: DynamicBackground | typings.pdfmake.interfacesMod.Content): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundFunction2(
        value: (/* currentPage */ Double, /* pageSize */ ContextPageSize) => js.UndefOr[typings.pdfmake.interfacesMod.Content | Null]
      ): Self = StObject.set(x, "background", js.Any.fromFunction2(value))
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setChildren(value: DynamicChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction3(value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => Child): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setDefaultStyle(value: Style): Self = StObject.set(x, "defaultStyle", value.asInstanceOf[js.Any])
      
      inline def setDefaultStyleUndefined: Self = StObject.set(x, "defaultStyle", js.undefined)
      
      inline def setImages(value: StringDictionary[String]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      inline def setInfo(value: TDocumentInformation): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setOwnerPassword(value: String): Self = StObject.set(x, "ownerPassword", value.asInstanceOf[js.Any])
      
      inline def setOwnerPasswordUndefined: Self = StObject.set(x, "ownerPassword", js.undefined)
      
      inline def setPageBreakBefore(
        value: (/* currentNode */ Node, /* followingNodesOnPage */ js.Array[Node], /* nodesOnNextPage */ js.Array[Node], /* previousNodesOnPage */ js.Array[Node]) => Boolean
      ): Self = StObject.set(x, "pageBreakBefore", js.Any.fromFunction4(value))
      
      inline def setPageBreakBeforeUndefined: Self = StObject.set(x, "pageBreakBefore", js.undefined)
      
      inline def setPageMargins(value: Margins): Self = StObject.set(x, "pageMargins", value.asInstanceOf[js.Any])
      
      inline def setPageMarginsUndefined: Self = StObject.set(x, "pageMargins", js.undefined)
      
      inline def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      inline def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      inline def setPageSize(value: PageSize): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPermissions(value: DocumentPermissions): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
      
      inline def setStyles(value: StyleDictionary): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setUserPassword(value: String): Self = StObject.set(x, "userPassword", value.asInstanceOf[js.Any])
      
      inline def setUserPasswordUndefined: Self = StObject.set(x, "userPassword", js.undefined)
      
      inline def setVersion(value: PDFVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setWatermark(value: String | Watermark): Self = StObject.set(x, "watermark", value.asInstanceOf[js.Any])
      
      inline def setWatermarkUndefined: Self = StObject.set(x, "watermark", js.undefined)
    }
  }
  
  /* Inlined jsx-pdf.jsx-pdf.<global>.JSX.Ele<{  width :number | string}> */
  trait Elewidthnumberstring extends StObject {
    
    var children: DynamicChild
    
    var width: Double | String
  }
  object Elewidthnumberstring {
    
    inline def apply(children: DynamicChild, width: Double | String): Elewidthnumberstring = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Elewidthnumberstring]
    }
    
    extension [Self <: Elewidthnumberstring](x: Self) {
      
      inline def setChildren(value: DynamicChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction3(value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => Child): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
