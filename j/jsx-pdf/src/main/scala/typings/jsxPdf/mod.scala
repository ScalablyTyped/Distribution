package typings.jsxPdf

import typings.jsxPdf.anon.Content
import typings.jsxPdf.anon.EleNoChidlrenOmitContentI
import typings.jsxPdf.anon.EleNoChidlrenOmitContentQ
import typings.jsxPdf.anon.EleOmitContentColumnscolu
import typings.jsxPdf.anon.EleOmitContentOrderedList
import typings.jsxPdf.anon.EleOmitContentStackstack
import typings.jsxPdf.anon.EleOmitContentTabletableO
import typings.jsxPdf.anon.EleOmitContentTexttext
import typings.jsxPdf.anon.EleOmitContentUnorderedLi
import typings.jsxPdf.anon.EleOmitTDocumentDefinitio
import typings.jsxPdf.anon.Elewidthnumberstring
import typings.jsxPdf.mod.global.JSX.DynamicChild
import typings.jsxPdf.mod.global.JSX.Element
import typings.pdfkit.PDFKit.Mixins.OpenTypeFeatures
import typings.pdfmake.anon.X
import typings.pdfmake.interfacesMod.Alignment
import typings.pdfmake.interfacesMod.ContextPageSize
import typings.pdfmake.interfacesMod.Decoration
import typings.pdfmake.interfacesMod.DecorationStyle
import typings.pdfmake.interfacesMod.Margins
import typings.pdfmake.interfacesMod.PageBreak
import typings.pdfmake.interfacesMod.PageOrientation
import typings.pdfmake.interfacesMod.Size
import typings.pdfmake.interfacesMod.Style
import typings.pdfmake.interfacesMod.TDocumentDefinitions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsx-pdf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined jsx-pdf.jsx-pdf.<global>.JSX.Ele<std.Omit<pdfmake.pdfmake/interfaces.ContentStack, 'stack'>> */
  object Fragment {
    
    @JSImport("jsx-pdf", "Fragment")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("jsx-pdf", "Fragment.absolutePosition")
    @js.native
    def absolutePosition: js.UndefOr[X] = js.native
    inline def absolutePosition_=(x: js.UndefOr[X]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("absolutePosition")(x.asInstanceOf[js.Any])
    
    @JSImport("jsx-pdf", "Fragment.alignment")
    @js.native
    def alignment: js.UndefOr[Alignment] = js.native
    inline def alignment_=(x: js.UndefOr[Alignment]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alignment")(x.asInstanceOf[js.Any])
    
    @JSImport("jsx-pdf", "Fragment.background")
    @js.native
    def background: js.UndefOr[String] = js.native
    inline def background_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("background")(x.asInstanceOf[js.Any])
    
    @JSImport("jsx-pdf", "Fragment.bold")
    @js.native
    def bold: js.UndefOr[Boolean] = js.native
    inline def bold_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bold")(x.asInstanceOf[js.Any])
    
    @JSImport("jsx-pdf", "Fragment.characterSpacing")
    @js.native
    def characterSpacing: js.UndefOr[Double] = js.native
    inline def characterSpacing_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("characterSpacing")(x.asInstanceOf[js.Any])
    
    @JSImport("jsx-pdf", "Fragment.children")
    @js.native
    def children: DynamicChild = js.native
    inline def children_=(x: DynamicChild): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
    
    @JSImport("jsx-pdf", "Fragment.color")
    @js.native
    def color: js.UndefOr[String] = js.native
    inline def color_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("color")(x.asInstanceOf[js.Any])
    
    @JSImport("jsx-pdf", "Fragment.columnGap")
    @js.native
    def columnGap: js.UndefOr[Size] = js.native
    inline def columnGap_=(x: js.UndefOr[Size]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("columnGap")(x.asInstanceOf[js.Any])
    
    @JSImport("jsx-pdf", "Fragment.decoration")
    @js.native
    def decoration: js.UndefOr[Decoration] = js.native
    
    @JSImport("jsx-pdf", "Fragment.decorationColor")
    @js.native
    def decorationColor: js.UndefOr[String] = js.native
    inline def decorationColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorationColor")(x.asInstanceOf[js.Any])
    
    @JSImport("jsx-pdf", "Fragment.decorationStyle")
    @js.native
    def decorationStyle: js.UndefOr[DecorationStyle] = js.native
    inline def decorationStyle_=(x: js.UndefOr[DecorationStyle]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorationStyle")(x.asInstanceOf[js.Any])
    
    inline def decoration_=(x: js.UndefOr[Decoration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decoration")(x.asInstanceOf[js.Any])
    
    @JSImport("jsx-pdf", "Fragment.fillColor")
    @js.native
    def fillColor: js.UndefOr[String] = js.native
    inline def fillColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("jsx-pdf", "Fragment.fillOpacity")
    @js.native
    def fillOpacity: js.UndefOr[Double] = js.native
    inline def fillOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("jsx-pdf", "Fragment.font")
    @js.native
    def font: js.UndefOr[String] = js.native
    
    @JSImport("jsx-pdf", "Fragment.fontFeatures")
    @js.native
    def fontFeatures: js.UndefOr[js.Array[OpenTypeFeatures]] = js.native
    inline def fontFeatures_=(x: js.UndefOr[js.Array[OpenTypeFeatures]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontFeatures")(x.asInstanceOf[js.Any])
    
    @JSImport("jsx-pdf", "Fragment.fontSize")
    @js.native
    def fontSize: js.UndefOr[Double] = js.native
    inline def fontSize_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(x.asInstanceOf[js.Any])
    
    inline def font_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("font")(x.asInstanceOf[js.Any])
    
    @JSImport("jsx-pdf", "Fragment.headlineLevel")
    @js.native
    def headlineLevel: js.UndefOr[Double] = js.native
    inline def headlineLevel_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headlineLevel")(x.asInstanceOf[js.Any])
    
    @JSImport("jsx-pdf", "Fragment.italics")
    @js.native
    def italics: js.UndefOr[Boolean] = js.native
    inline def italics_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("italics")(x.asInstanceOf[js.Any])
    
    @JSImport("jsx-pdf", "Fragment.leadingIndent")
    @js.native
    def leadingIndent: js.UndefOr[Double] = js.native
    inline def leadingIndent_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leadingIndent")(x.asInstanceOf[js.Any])
    
    @JSImport("jsx-pdf", "Fragment.lineHeight")
    @js.native
    def lineHeight: js.UndefOr[Double] = js.native
    inline def lineHeight_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("jsx-pdf", "Fragment.margin")
    @js.native
    def margin: js.UndefOr[Margins] = js.native
    inline def margin_=(x: js.UndefOr[Margins]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("margin")(x.asInstanceOf[js.Any])
    
    @JSImport("jsx-pdf", "Fragment.markerColor")
    @js.native
    def markerColor: js.UndefOr[String] = js.native
    inline def markerColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("markerColor")(x.asInstanceOf[js.Any])
    
    @JSImport("jsx-pdf", "Fragment.noWrap")
    @js.native
    def noWrap: js.UndefOr[Boolean] = js.native
    inline def noWrap_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noWrap")(x.asInstanceOf[js.Any])
    
    @JSImport("jsx-pdf", "Fragment.opacity")
    @js.native
    def opacity: js.UndefOr[Double] = js.native
    inline def opacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("opacity")(x.asInstanceOf[js.Any])
    
    @JSImport("jsx-pdf", "Fragment.pageBreak")
    @js.native
    def pageBreak: js.UndefOr[PageBreak] = js.native
    inline def pageBreak_=(x: js.UndefOr[PageBreak]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pageBreak")(x.asInstanceOf[js.Any])
    
    @JSImport("jsx-pdf", "Fragment.pageOrientation")
    @js.native
    def pageOrientation: js.UndefOr[PageOrientation] = js.native
    inline def pageOrientation_=(x: js.UndefOr[PageOrientation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pageOrientation")(x.asInstanceOf[js.Any])
    
    @JSImport("jsx-pdf", "Fragment.preserveLeadingSpaces")
    @js.native
    def preserveLeadingSpaces: js.UndefOr[Boolean] = js.native
    inline def preserveLeadingSpaces_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preserveLeadingSpaces")(x.asInstanceOf[js.Any])
    
    @JSImport("jsx-pdf", "Fragment.relativePosition")
    @js.native
    def relativePosition: js.UndefOr[X] = js.native
    inline def relativePosition_=(x: js.UndefOr[X]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("relativePosition")(x.asInstanceOf[js.Any])
    
    @JSImport("jsx-pdf", "Fragment.style")
    @js.native
    def style: js.UndefOr[String | js.Array[String] | Style] = js.native
    inline def style_=(x: js.UndefOr[String | js.Array[String] | Style]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
    
    @JSImport("jsx-pdf", "Fragment.unbreakable")
    @js.native
    def unbreakable: js.UndefOr[Boolean] = js.native
    inline def unbreakable_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unbreakable")(x.asInstanceOf[js.Any])
  }
  
  inline def renderPdf(jsx: Element): TDocumentDefinitions = ^.asInstanceOf[js.Dynamic].applyDynamic("renderPdf")(jsx.asInstanceOf[js.Any]).asInstanceOf[TDocumentDefinitions]
  
  object global {
    
    object JSX {
      
      type Child = Element | js.Array[Element]
      
      type DynamicChild = Child | (js.Function3[
            /* currentPage */ Double, 
            /* pageCount */ Double, 
            /* pageSize */ ContextPageSize, 
            Child
          ])
      
      type Ele[Props] = ElementChildrenAttribute & Props
      
      type EleNoChidlren[Props] = Props
      
      // tslint:disable-next-line:no-empty-interface
      trait Element extends StObject
      
      trait ElementChildrenAttribute extends StObject {
        
        var children: DynamicChild
      }
      object ElementChildrenAttribute {
        
        inline def apply(children: DynamicChild): ElementChildrenAttribute = {
          val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
          __obj.asInstanceOf[ElementChildrenAttribute]
        }
        
        extension [Self <: ElementChildrenAttribute](x: Self) {
          
          inline def setChildren(value: DynamicChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
          
          inline def setChildrenFunction3(value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => Child): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
          
          inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
        }
      }
      
      trait IntrinsicElements extends StObject {
        
        var cell: Ele[Element]
        
        var column: Elewidthnumberstring
        
        var columns: EleOmitContentColumnscolu
        
        var content: typings.jsxPdf.anon.Ele
        
        var document: EleOmitTDocumentDefinitio
        
        var footer: typings.jsxPdf.anon.Ele
        
        var header: typings.jsxPdf.anon.Ele
        
        var image: EleNoChidlrenOmitContentI
        
        var ol: EleOmitContentOrderedList
        
        var qr: EleNoChidlrenOmitContentQ
        
        var row: Ele[Element]
        
        var stack: EleOmitContentStackstack
        
        var svg: EleNoChidlren[Content]
        
        var table: EleOmitContentTabletableO
        
        var text: EleOmitContentTexttext
        
        var ul: EleOmitContentUnorderedLi
      }
      object IntrinsicElements {
        
        inline def apply(
          cell: Ele[Element],
          column: Elewidthnumberstring,
          columns: EleOmitContentColumnscolu,
          content: typings.jsxPdf.anon.Ele,
          document: EleOmitTDocumentDefinitio,
          footer: typings.jsxPdf.anon.Ele,
          header: typings.jsxPdf.anon.Ele,
          image: EleNoChidlrenOmitContentI,
          ol: EleOmitContentOrderedList,
          qr: EleNoChidlrenOmitContentQ,
          row: Ele[Element],
          stack: EleOmitContentStackstack,
          svg: EleNoChidlren[Content],
          table: EleOmitContentTabletableO,
          text: EleOmitContentTexttext,
          ul: EleOmitContentUnorderedLi
        ): IntrinsicElements = {
          val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], ol = ol.asInstanceOf[js.Any], qr = qr.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], ul = ul.asInstanceOf[js.Any])
          __obj.asInstanceOf[IntrinsicElements]
        }
        
        extension [Self <: IntrinsicElements](x: Self) {
          
          inline def setCell(value: Ele[Element]): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
          
          inline def setColumn(value: Elewidthnumberstring): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
          
          inline def setColumns(value: EleOmitContentColumnscolu): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
          
          inline def setContent(value: typings.jsxPdf.anon.Ele): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
          
          inline def setDocument(value: EleOmitTDocumentDefinitio): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
          
          inline def setFooter(value: typings.jsxPdf.anon.Ele): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
          
          inline def setHeader(value: typings.jsxPdf.anon.Ele): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
          
          inline def setImage(value: EleNoChidlrenOmitContentI): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
          
          inline def setOl(value: EleOmitContentOrderedList): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
          
          inline def setQr(value: EleNoChidlrenOmitContentQ): Self = StObject.set(x, "qr", value.asInstanceOf[js.Any])
          
          inline def setRow(value: Ele[Element]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
          
          inline def setStack(value: EleOmitContentStackstack): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
          
          inline def setSvg(value: EleNoChidlren[Content]): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
          
          inline def setTable(value: EleOmitContentTabletableO): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
          
          inline def setText(value: EleOmitContentTexttext): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
          
          inline def setUl(value: EleOmitContentUnorderedLi): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
