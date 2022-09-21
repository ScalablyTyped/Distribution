package typings.jspdf.mod

import typings.jspdf.jspdfStrings.cm
import typings.jspdf.jspdfStrings.em
import typings.jspdf.jspdfStrings.ex
import typings.jspdf.jspdfStrings.in
import typings.jspdf.jspdfStrings.l
import typings.jspdf.jspdfStrings.landscape
import typings.jspdf.jspdfStrings.mm
import typings.jspdf.jspdfStrings.p
import typings.jspdf.jspdfStrings.pc
import typings.jspdf.jspdfStrings.portrait
import typings.jspdf.jspdfStrings.pt
import typings.jspdf.jspdfStrings.px
import typings.jspdf.jspdfStrings.smart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait jsPDFOptions extends StObject {
  
  var compress: js.UndefOr[Boolean] = js.undefined
  
  var encryption: js.UndefOr[EncryptionOptions] = js.undefined
  
  var filters: js.UndefOr[js.Array[String]] = js.undefined
  
  var floatPrecision: js.UndefOr[Double | smart] = js.undefined
  
  var format: js.UndefOr[String | js.Array[Double]] = js.undefined
  
  var hotfixes: js.UndefOr[js.Array[String]] = js.undefined
  
  var orientation: js.UndefOr[p | portrait | l | landscape] = js.undefined
  
  var precision: js.UndefOr[Double] = js.undefined
  
  var putOnlyUsedFonts: js.UndefOr[Boolean] = js.undefined
  
  var unit: js.UndefOr[pt | px | in | mm | cm | ex | em | pc] = js.undefined
  
  var userUnit: js.UndefOr[Double] = js.undefined
}
object jsPDFOptions {
  
  inline def apply(): jsPDFOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[jsPDFOptions]
  }
  
  extension [Self <: jsPDFOptions](x: Self) {
    
    inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    
    inline def setEncryption(value: EncryptionOptions): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
    
    inline def setFilters(value: js.Array[String]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: String*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setFloatPrecision(value: Double | smart): Self = StObject.set(x, "floatPrecision", value.asInstanceOf[js.Any])
    
    inline def setFloatPrecisionUndefined: Self = StObject.set(x, "floatPrecision", js.undefined)
    
    inline def setFormat(value: String | js.Array[Double]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFormatVarargs(value: Double*): Self = StObject.set(x, "format", js.Array(value*))
    
    inline def setHotfixes(value: js.Array[String]): Self = StObject.set(x, "hotfixes", value.asInstanceOf[js.Any])
    
    inline def setHotfixesUndefined: Self = StObject.set(x, "hotfixes", js.undefined)
    
    inline def setHotfixesVarargs(value: String*): Self = StObject.set(x, "hotfixes", js.Array(value*))
    
    inline def setOrientation(value: p | portrait | l | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setPutOnlyUsedFonts(value: Boolean): Self = StObject.set(x, "putOnlyUsedFonts", value.asInstanceOf[js.Any])
    
    inline def setPutOnlyUsedFontsUndefined: Self = StObject.set(x, "putOnlyUsedFonts", js.undefined)
    
    inline def setUnit(value: pt | px | in | mm | cm | ex | em | pc): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setUserUnit(value: Double): Self = StObject.set(x, "userUnit", value.asInstanceOf[js.Any])
    
    inline def setUserUnitUndefined: Self = StObject.set(x, "userUnit", js.undefined)
  }
}
