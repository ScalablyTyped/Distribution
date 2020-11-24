package typings.jsxPdf.anon

import org.scalablytyped.runtime.StringDictionary
import typings.jsxPdf.mod.global.JSX.Child
import typings.jsxPdf.mod.global.JSX.DynamicChild
import typings.jsxPdf.mod.global.JSX.Element
import typings.pdfkit.PDFKit.DocumentPermissions
import typings.pdfmake.interfacesMod.ContextPageSize
import typings.pdfmake.interfacesMod.DynamicBackground
import typings.pdfmake.interfacesMod.Margins
import typings.pdfmake.interfacesMod.Node
import typings.pdfmake.interfacesMod.PDFVersion
import typings.pdfmake.interfacesMod.PageOrientation
import typings.pdfmake.interfacesMod.PageSize
import typings.pdfmake.interfacesMod.Style
import typings.pdfmake.interfacesMod.StyleDictionary
import typings.pdfmake.interfacesMod.TDocumentInformation
import typings.pdfmake.interfacesMod.Watermark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined jsx-pdf.jsx-pdf.<global>.JSX.Ele<std.Omit<pdfmake.pdfmake/interfaces.TDocumentDefinitions, 'content' | 'header' | 'footer'>> */
@js.native
trait EleOmitTDocumentDefinitio extends js.Object {
  
  var background: js.UndefOr[DynamicBackground | typings.pdfmake.interfacesMod.Content] = js.native
  
  var children: DynamicChild = js.native
  
  var compress: js.UndefOr[Boolean] = js.native
  
  var defaultStyle: js.UndefOr[Style] = js.native
  
  var images: js.UndefOr[StringDictionary[String]] = js.native
  
  var info: js.UndefOr[TDocumentInformation] = js.native
  
  var ownerPassword: js.UndefOr[String] = js.native
  
  var pageBreakBefore: js.UndefOr[
    js.Function4[
      /* currentNode */ Node, 
      /* followingNodesOnPage */ js.Array[Node], 
      /* nodesOnNextPage */ js.Array[Node], 
      /* previousNodesOnPage */ js.Array[Node], 
      Boolean
    ]
  ] = js.native
  
  var pageMargins: js.UndefOr[Margins] = js.native
  
  var pageOrientation: js.UndefOr[PageOrientation] = js.native
  
  var pageSize: js.UndefOr[PageSize] = js.native
  
  var permissions: js.UndefOr[DocumentPermissions] = js.native
  
  var styles: js.UndefOr[StyleDictionary] = js.native
  
  var userPassword: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[PDFVersion] = js.native
  
  var watermark: js.UndefOr[String | Watermark] = js.native
}
object EleOmitTDocumentDefinitio {
  
  @scala.inline
  def apply(children: DynamicChild): EleOmitTDocumentDefinitio = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[EleOmitTDocumentDefinitio]
  }
  
  @scala.inline
  implicit class EleOmitTDocumentDefinitioOps[Self <: EleOmitTDocumentDefinitio] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: Element*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildrenFunction3(value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => Child): Self = this.set("children", js.Any.fromFunction3(value))
    
    @scala.inline
    def setChildren(value: DynamicChild): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundFunction2(
      value: (/* currentPage */ Double, /* pageSize */ ContextPageSize) => js.UndefOr[typings.pdfmake.interfacesMod.Content | Null]
    ): Self = this.set("background", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBackground(value: DynamicBackground | typings.pdfmake.interfacesMod.Content): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setCompress(value: Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    
    @scala.inline
    def setDefaultStyle(value: Style): Self = this.set("defaultStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultStyle: Self = this.set("defaultStyle", js.undefined)
    
    @scala.inline
    def setImages(value: StringDictionary[String]): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    
    @scala.inline
    def setInfo(value: TDocumentInformation): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    
    @scala.inline
    def setOwnerPassword(value: String): Self = this.set("ownerPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerPassword: Self = this.set("ownerPassword", js.undefined)
    
    @scala.inline
    def setPageBreakBefore(
      value: (/* currentNode */ Node, /* followingNodesOnPage */ js.Array[Node], /* nodesOnNextPage */ js.Array[Node], /* previousNodesOnPage */ js.Array[Node]) => Boolean
    ): Self = this.set("pageBreakBefore", js.Any.fromFunction4(value))
    
    @scala.inline
    def deletePageBreakBefore: Self = this.set("pageBreakBefore", js.undefined)
    
    @scala.inline
    def setPageMargins(value: Margins): Self = this.set("pageMargins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageMargins: Self = this.set("pageMargins", js.undefined)
    
    @scala.inline
    def setPageOrientation(value: PageOrientation): Self = this.set("pageOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageOrientation: Self = this.set("pageOrientation", js.undefined)
    
    @scala.inline
    def setPageSize(value: PageSize): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPermissions(value: DocumentPermissions): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    
    @scala.inline
    def setStyles(value: StyleDictionary): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setUserPassword(value: String): Self = this.set("userPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserPassword: Self = this.set("userPassword", js.undefined)
    
    @scala.inline
    def setVersion(value: PDFVersion): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setWatermark(value: String | Watermark): Self = this.set("watermark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatermark: Self = this.set("watermark", js.undefined)
  }
}
