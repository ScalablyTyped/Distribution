package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.PDFViewer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPDFViewer extends StObject {
  
  /* static member */
  def extend(proto: js.Object): PDFViewer = js.native
  
  /* static member */
  var fn: PDFViewer = js.native
}
object TypeofPDFViewer {
  
  @scala.inline
  def apply(extend: js.Object => PDFViewer, fn: PDFViewer): TypeofPDFViewer = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPDFViewer]
  }
  
  @scala.inline
  implicit class TypeofPDFViewerMutableBuilder[Self <: TypeofPDFViewer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => PDFViewer): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: PDFViewer): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
