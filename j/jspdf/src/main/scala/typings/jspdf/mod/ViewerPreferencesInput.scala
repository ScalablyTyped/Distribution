package typings.jspdf.mod

import typings.jspdf.jspdfStrings.AppDefault
import typings.jspdf.jspdfStrings.ArtBox
import typings.jspdf.jspdfStrings.BleedBox
import typings.jspdf.jspdfStrings.CropBox
import typings.jspdf.jspdfStrings.DuplexFlipLongEdge
import typings.jspdf.jspdfStrings.DuplexFlipShortEdge
import typings.jspdf.jspdfStrings.L2R
import typings.jspdf.jspdfStrings.MediaBox
import typings.jspdf.jspdfStrings.None_
import typings.jspdf.jspdfStrings.R2L
import typings.jspdf.jspdfStrings.Simplex
import typings.jspdf.jspdfStrings.TrimBox
import typings.jspdf.jspdfStrings.UseNone
import typings.jspdf.jspdfStrings.UseOC
import typings.jspdf.jspdfStrings.UseOutlines
import typings.jspdf.jspdfStrings.UseThumbs
import typings.jspdf.jspdfStrings.none__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewerPreferencesInput extends StObject {
  
  var CenterWindow: js.UndefOr[Boolean] = js.undefined
  
  var Direction: js.UndefOr[L2R | R2L] = js.undefined
  
  var DisplayDocTitle: js.UndefOr[Boolean] = js.undefined
  
  var Duplex: js.UndefOr[Simplex | DuplexFlipShortEdge | DuplexFlipLongEdge | none__] = js.undefined
  
  var FitWindow: js.UndefOr[Boolean] = js.undefined
  
  var HideMenubar: js.UndefOr[Boolean] = js.undefined
  
  var HideToolbar: js.UndefOr[Boolean] = js.undefined
  
  var HideWindowUI: js.UndefOr[Boolean] = js.undefined
  
  var NonFullScreenPageMode: js.UndefOr[UseNone | UseOutlines | UseThumbs | UseOC] = js.undefined
  
  var NumCopies: js.UndefOr[Double] = js.undefined
  
  var PickTrayByPDFSize: js.UndefOr[Boolean] = js.undefined
  
  var PrintArea: js.UndefOr[MediaBox | CropBox | TrimBox | BleedBox | ArtBox] = js.undefined
  
  var PrintClip: js.UndefOr[MediaBox | CropBox | TrimBox | BleedBox | ArtBox] = js.undefined
  
  var PrintPageRange: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  
  var PrintScaling: js.UndefOr[AppDefault | None_] = js.undefined
  
  var ViewArea: js.UndefOr[MediaBox | CropBox | TrimBox | BleedBox | ArtBox] = js.undefined
  
  var ViewClip: js.UndefOr[MediaBox | CropBox | TrimBox | BleedBox | ArtBox] = js.undefined
}
object ViewerPreferencesInput {
  
  inline def apply(): ViewerPreferencesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewerPreferencesInput]
  }
  
  extension [Self <: ViewerPreferencesInput](x: Self) {
    
    inline def setCenterWindow(value: Boolean): Self = StObject.set(x, "CenterWindow", value.asInstanceOf[js.Any])
    
    inline def setCenterWindowUndefined: Self = StObject.set(x, "CenterWindow", js.undefined)
    
    inline def setDirection(value: L2R | R2L): Self = StObject.set(x, "Direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "Direction", js.undefined)
    
    inline def setDisplayDocTitle(value: Boolean): Self = StObject.set(x, "DisplayDocTitle", value.asInstanceOf[js.Any])
    
    inline def setDisplayDocTitleUndefined: Self = StObject.set(x, "DisplayDocTitle", js.undefined)
    
    inline def setDuplex(value: Simplex | DuplexFlipShortEdge | DuplexFlipLongEdge | none__): Self = StObject.set(x, "Duplex", value.asInstanceOf[js.Any])
    
    inline def setDuplexUndefined: Self = StObject.set(x, "Duplex", js.undefined)
    
    inline def setFitWindow(value: Boolean): Self = StObject.set(x, "FitWindow", value.asInstanceOf[js.Any])
    
    inline def setFitWindowUndefined: Self = StObject.set(x, "FitWindow", js.undefined)
    
    inline def setHideMenubar(value: Boolean): Self = StObject.set(x, "HideMenubar", value.asInstanceOf[js.Any])
    
    inline def setHideMenubarUndefined: Self = StObject.set(x, "HideMenubar", js.undefined)
    
    inline def setHideToolbar(value: Boolean): Self = StObject.set(x, "HideToolbar", value.asInstanceOf[js.Any])
    
    inline def setHideToolbarUndefined: Self = StObject.set(x, "HideToolbar", js.undefined)
    
    inline def setHideWindowUI(value: Boolean): Self = StObject.set(x, "HideWindowUI", value.asInstanceOf[js.Any])
    
    inline def setHideWindowUIUndefined: Self = StObject.set(x, "HideWindowUI", js.undefined)
    
    inline def setNonFullScreenPageMode(value: UseNone | UseOutlines | UseThumbs | UseOC): Self = StObject.set(x, "NonFullScreenPageMode", value.asInstanceOf[js.Any])
    
    inline def setNonFullScreenPageModeUndefined: Self = StObject.set(x, "NonFullScreenPageMode", js.undefined)
    
    inline def setNumCopies(value: Double): Self = StObject.set(x, "NumCopies", value.asInstanceOf[js.Any])
    
    inline def setNumCopiesUndefined: Self = StObject.set(x, "NumCopies", js.undefined)
    
    inline def setPickTrayByPDFSize(value: Boolean): Self = StObject.set(x, "PickTrayByPDFSize", value.asInstanceOf[js.Any])
    
    inline def setPickTrayByPDFSizeUndefined: Self = StObject.set(x, "PickTrayByPDFSize", js.undefined)
    
    inline def setPrintArea(value: MediaBox | CropBox | TrimBox | BleedBox | ArtBox): Self = StObject.set(x, "PrintArea", value.asInstanceOf[js.Any])
    
    inline def setPrintAreaUndefined: Self = StObject.set(x, "PrintArea", js.undefined)
    
    inline def setPrintClip(value: MediaBox | CropBox | TrimBox | BleedBox | ArtBox): Self = StObject.set(x, "PrintClip", value.asInstanceOf[js.Any])
    
    inline def setPrintClipUndefined: Self = StObject.set(x, "PrintClip", js.undefined)
    
    inline def setPrintPageRange(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "PrintPageRange", value.asInstanceOf[js.Any])
    
    inline def setPrintPageRangeUndefined: Self = StObject.set(x, "PrintPageRange", js.undefined)
    
    inline def setPrintPageRangeVarargs(value: js.Array[Double]*): Self = StObject.set(x, "PrintPageRange", js.Array(value*))
    
    inline def setPrintScaling(value: AppDefault | None_): Self = StObject.set(x, "PrintScaling", value.asInstanceOf[js.Any])
    
    inline def setPrintScalingUndefined: Self = StObject.set(x, "PrintScaling", js.undefined)
    
    inline def setViewArea(value: MediaBox | CropBox | TrimBox | BleedBox | ArtBox): Self = StObject.set(x, "ViewArea", value.asInstanceOf[js.Any])
    
    inline def setViewAreaUndefined: Self = StObject.set(x, "ViewArea", js.undefined)
    
    inline def setViewClip(value: MediaBox | CropBox | TrimBox | BleedBox | ArtBox): Self = StObject.set(x, "ViewClip", value.asInstanceOf[js.Any])
    
    inline def setViewClipUndefined: Self = StObject.set(x, "ViewClip", js.undefined)
  }
}
