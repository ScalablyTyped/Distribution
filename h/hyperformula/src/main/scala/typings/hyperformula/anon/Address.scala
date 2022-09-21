package typings.hyperformula.anon

import typings.hyperformula.cellContentParserMod.RawCellContent
import typings.hyperformula.cellMod.SimpleCellAddress_
import typings.hyperformula.clipboardOperationsMod.ClipboardCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  var address: SimpleCellAddress_
  
  var newContent: RawCellContent
  
  var oldContent: js.Tuple2[SimpleCellAddress_, ClipboardCell]
}
object Address {
  
  inline def apply(address: SimpleCellAddress_, oldContent: js.Tuple2[SimpleCellAddress_, ClipboardCell]): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], oldContent = oldContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setAddress(value: SimpleCellAddress_): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setNewContent(value: RawCellContent): Self = StObject.set(x, "newContent", value.asInstanceOf[js.Any])
    
    inline def setNewContentNull: Self = StObject.set(x, "newContent", null)
    
    inline def setNewContentUndefined: Self = StObject.set(x, "newContent", js.undefined)
    
    inline def setOldContent(value: js.Tuple2[SimpleCellAddress_, ClipboardCell]): Self = StObject.set(x, "oldContent", value.asInstanceOf[js.Any])
  }
}
