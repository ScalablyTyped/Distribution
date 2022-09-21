package typings.hyperformula

import typings.hyperformula.cellMod.SimpleCellAddress_
import typings.hyperformula.cellMod.SimpleColumnAddress_
import typings.hyperformula.cellMod.SimpleRowAddress_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addressMod {
  
  @js.native
  trait AddressWithColumn
    extends StObject
       with AddressWithSheet {
    
    var col: Double = js.native
    
    def isColumnAbsolute(): Boolean = js.native
    
    def isColumnRelative(): Boolean = js.native
    
    def shiftedByColumns(columns: Double): AddressWithColumn = js.native
    
    def toSimpleColumnAddress(baseAddress: SimpleCellAddress_): SimpleColumnAddress_ = js.native
  }
  
  @js.native
  trait AddressWithRow
    extends StObject
       with AddressWithSheet {
    
    def isRowAbsolute(): Boolean = js.native
    
    def isRowRelative(): Boolean = js.native
    
    var row: Double = js.native
    
    def shiftedByRows(rows: Double): AddressWithRow = js.native
    
    def toSimpleRowAddress(baseAddress: SimpleCellAddress_): SimpleRowAddress_ = js.native
  }
  
  @js.native
  trait AddressWithSheet extends StObject {
    
    def moved(toSheet: Double, toRight: Double, toBottom: Double): AddressWithSheet = js.native
    
    var sheet: js.UndefOr[Double] = js.native
    
    def shiftAbsoluteDimensions(toRight: Double, toBottom: Double): AddressWithSheet = js.native
    
    def shiftRelativeDimensions(toRight: Double, toBottom: Double): AddressWithSheet = js.native
    
    def withSheet(): AddressWithSheet = js.native
    def withSheet(sheet: Double): AddressWithSheet = js.native
  }
}
