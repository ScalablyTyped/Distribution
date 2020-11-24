package typings.jsxPdf.anon

import typings.pdfkit.PDFKit.Mixins.OpenTypeFeatures
import typings.pdfmake.anon.X
import typings.pdfmake.interfacesMod.Alignment
import typings.pdfmake.interfacesMod.Decoration
import typings.pdfmake.interfacesMod.DecorationStyle
import typings.pdfmake.interfacesMod.Margins
import typings.pdfmake.interfacesMod.PageBreak
import typings.pdfmake.interfacesMod.PageOrientation
import typings.pdfmake.interfacesMod.Size
import typings.pdfmake.interfacesMod.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined jsx-pdf.jsx-pdf.<global>.JSX.EleNoChidlren<std.Omit<pdfmake.pdfmake/interfaces.ContentImage, 'image'> & {  src :string}> */
@js.native
trait EleNoChidlrenOmitContentI extends js.Object {
  
  var absolutePosition: js.UndefOr[X] = js.native
  
  var alignment: js.UndefOr[Alignment] = js.native
  
  var background: js.UndefOr[String] = js.native
  
  var bold: js.UndefOr[Boolean] = js.native
  
  var characterSpacing: js.UndefOr[Double] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var columnGap: js.UndefOr[Size] = js.native
  
  var decoration: js.UndefOr[Decoration] = js.native
  
  var decorationColor: js.UndefOr[String] = js.native
  
  var decorationStyle: js.UndefOr[DecorationStyle] = js.native
  
  var fillColor: js.UndefOr[String] = js.native
  
  var fillOpacity: js.UndefOr[Double] = js.native
  
  var fit: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var font: js.UndefOr[String] = js.native
  
  var fontFeatures: js.UndefOr[js.Array[OpenTypeFeatures]] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var headlineLevel: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var italics: js.UndefOr[Boolean] = js.native
  
  var leadingIndent: js.UndefOr[Double] = js.native
  
  var lineHeight: js.UndefOr[Double] = js.native
  
  var link: js.UndefOr[String] = js.native
  
  var linkToDestination: js.UndefOr[String] = js.native
  
  var linkToPage: js.UndefOr[Double] = js.native
  
  var margin: js.UndefOr[Margins] = js.native
  
  var markerColor: js.UndefOr[String] = js.native
  
  var noWrap: js.UndefOr[Boolean] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var pageBreak: js.UndefOr[PageBreak] = js.native
  
  var pageOrientation: js.UndefOr[PageOrientation] = js.native
  
  var preserveLeadingSpaces: js.UndefOr[Boolean] = js.native
  
  var relativePosition: js.UndefOr[X] = js.native
  
  var src: String = js.native
  
  var style: js.UndefOr[String | js.Array[String] | Style] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object EleNoChidlrenOmitContentI {
  
  @scala.inline
  def apply(src: String): EleNoChidlrenOmitContentI = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[EleNoChidlrenOmitContentI]
  }
  
  @scala.inline
  implicit class EleNoChidlrenOmitContentIOps[Self <: EleNoChidlrenOmitContentI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsolutePosition(value: X): Self = this.set("absolutePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbsolutePosition: Self = this.set("absolutePosition", js.undefined)
    
    @scala.inline
    def setAlignment(value: Alignment): Self = this.set("alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBold(value: Boolean): Self = this.set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    
    @scala.inline
    def setCharacterSpacing(value: Double): Self = this.set("characterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharacterSpacing: Self = this.set("characterSpacing", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColumnGap(value: Size): Self = this.set("columnGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnGap: Self = this.set("columnGap", js.undefined)
    
    @scala.inline
    def setDecoration(value: Decoration): Self = this.set("decoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecoration: Self = this.set("decoration", js.undefined)
    
    @scala.inline
    def setDecorationColor(value: String): Self = this.set("decorationColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecorationColor: Self = this.set("decorationColor", js.undefined)
    
    @scala.inline
    def setDecorationStyle(value: DecorationStyle): Self = this.set("decorationStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecorationStyle: Self = this.set("decorationStyle", js.undefined)
    
    @scala.inline
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    
    @scala.inline
    def setFit(value: js.Tuple2[Double, Double]): Self = this.set("fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFit: Self = this.set("fit", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setFontFeaturesVarargs(value: OpenTypeFeatures*): Self = this.set("fontFeatures", js.Array(value :_*))
    
    @scala.inline
    def setFontFeatures(value: js.Array[OpenTypeFeatures]): Self = this.set("fontFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFeatures: Self = this.set("fontFeatures", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setHeadlineLevel(value: Double): Self = this.set("headlineLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadlineLevel: Self = this.set("headlineLevel", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setItalics(value: Boolean): Self = this.set("italics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItalics: Self = this.set("italics", js.undefined)
    
    @scala.inline
    def setLeadingIndent(value: Double): Self = this.set("leadingIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeadingIndent: Self = this.set("leadingIndent", js.undefined)
    
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setLinkToDestination(value: String): Self = this.set("linkToDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkToDestination: Self = this.set("linkToDestination", js.undefined)
    
    @scala.inline
    def setLinkToPage(value: Double): Self = this.set("linkToPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkToPage: Self = this.set("linkToPage", js.undefined)
    
    @scala.inline
    def setMargin(value: Margins): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setMarkerColor(value: String): Self = this.set("markerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerColor: Self = this.set("markerColor", js.undefined)
    
    @scala.inline
    def setNoWrap(value: Boolean): Self = this.set("noWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoWrap: Self = this.set("noWrap", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPageBreak(value: PageBreak): Self = this.set("pageBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageBreak: Self = this.set("pageBreak", js.undefined)
    
    @scala.inline
    def setPageOrientation(value: PageOrientation): Self = this.set("pageOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageOrientation: Self = this.set("pageOrientation", js.undefined)
    
    @scala.inline
    def setPreserveLeadingSpaces(value: Boolean): Self = this.set("preserveLeadingSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveLeadingSpaces: Self = this.set("preserveLeadingSpaces", js.undefined)
    
    @scala.inline
    def setRelativePosition(value: X): Self = this.set("relativePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativePosition: Self = this.set("relativePosition", js.undefined)
    
    @scala.inline
    def setStyleVarargs(value: String*): Self = this.set("style", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: String | js.Array[String] | Style): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
