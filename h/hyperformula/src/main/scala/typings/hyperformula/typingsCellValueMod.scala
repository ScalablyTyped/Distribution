package typings.hyperformula

import typings.hyperformula.typingsCellMod.CellError
import typings.hyperformula.typingsCellMod.ErrorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsCellValueMod {
  
  @JSImport("hyperformula/typings/CellValue", "DetailedCellError")
  @js.native
  open class DetailedCellError protected () extends StObject {
    def this(error: CellError, value: String) = this()
    def this(error: CellError, value: String, address: String) = this()
    
    val address: js.UndefOr[String] = js.native
    
    val message: String = js.native
    
    val `type`: ErrorType = js.native
    
    val value: String = js.native
  }
  
  type CellValue = NoErrorCellValue | DetailedCellError
  
  type NoErrorCellValue = Double | String | Boolean | Null
}
