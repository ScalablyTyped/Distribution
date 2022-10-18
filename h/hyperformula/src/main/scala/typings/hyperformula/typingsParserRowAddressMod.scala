package typings.hyperformula

import typings.hyperformula.typingsCellMod.SimpleCellAddress_
import typings.hyperformula.typingsMaybeMod.Maybe
import typings.hyperformula.typingsParserAddressMod.AddressWithRow
import typings.hyperformula.typingsParserColumnAddressMod.ReferenceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsParserRowAddressMod {
  
  @JSImport("hyperformula/typings/parser/RowAddress", "RowAddress")
  @js.native
  open class RowAddress protected ()
    extends StObject
       with AddressWithRow {
    def this(`type`: ReferenceType, row: Double) = this()
    def this(`type`: ReferenceType, row: Double, sheet: Double) = this()
    
    def exceedsSheetSizeLimits(maxRows: Double): Boolean = js.native
    
    def hash(withSheet: Boolean): String = js.native
    
    def isAbsolute(): Boolean = js.native
    
    def isInvalid(baseAddress: SimpleCellAddress_): Boolean = js.native
    
    val `type`: ReferenceType = js.native
    
    def unparse(baseAddress: SimpleCellAddress_): Maybe[String] = js.native
  }
  /* static members */
  object RowAddress {
    
    @JSImport("hyperformula/typings/parser/RowAddress", "RowAddress")
    @js.native
    val ^ : js.Any = js.native
    
    inline def absolute(row: Double): RowAddress = ^.asInstanceOf[js.Dynamic].applyDynamic("absolute")(row.asInstanceOf[js.Any]).asInstanceOf[RowAddress]
    inline def absolute(row: Double, sheet: Double): RowAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("absolute")(row.asInstanceOf[js.Any], sheet.asInstanceOf[js.Any])).asInstanceOf[RowAddress]
    
    inline def compareByAbsoluteAddress(baseAddress: SimpleCellAddress_): js.Function2[/* rowA */ this.type, /* rowB */ this.type, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("compareByAbsoluteAddress")(baseAddress.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* rowA */ this.type, /* rowB */ this.type, Double]]
    
    inline def relative(row: Double): RowAddress = ^.asInstanceOf[js.Dynamic].applyDynamic("relative")(row.asInstanceOf[js.Any]).asInstanceOf[RowAddress]
    inline def relative(row: Double, sheet: Double): RowAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(row.asInstanceOf[js.Any], sheet.asInstanceOf[js.Any])).asInstanceOf[RowAddress]
  }
}
