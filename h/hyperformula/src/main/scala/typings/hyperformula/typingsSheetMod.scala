package typings.hyperformula

import typings.hyperformula.typingsCellContentParserMod.RawCellContent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsSheetMod {
  
  @JSImport("hyperformula/typings/Sheet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findBoundaries(sheet: Sheet): SheetBoundaries = ^.asInstanceOf[js.Dynamic].applyDynamic("findBoundaries")(sheet.asInstanceOf[js.Any]).asInstanceOf[SheetBoundaries]
  
  inline def validateAsSheet(sheet: Sheet): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateAsSheet")(sheet.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type Sheet = js.Array[js.Array[RawCellContent]]
  
  trait SheetBoundaries extends StObject {
    
    var fill: Double
    
    var height: Double
    
    var width: Double
  }
  object SheetBoundaries {
    
    inline def apply(fill: Double, height: Double, width: Double): SheetBoundaries = {
      val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[SheetBoundaries]
    }
    
    extension [Self <: SheetBoundaries](x: Self) {
      
      inline def setFill(value: Double): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait SheetDimensions extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object SheetDimensions {
    
    inline def apply(height: Double, width: Double): SheetDimensions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[SheetDimensions]
    }
    
    extension [Self <: SheetDimensions](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type Sheets = Record[String, Sheet]
}
