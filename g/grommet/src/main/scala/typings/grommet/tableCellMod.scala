package typings.grommet

import typings.grommet.grommetStrings.`1Slash2`
import typings.grommet.grommetStrings.`1Slash3`
import typings.grommet.grommetStrings.`1Slash4`
import typings.grommet.grommetStrings.`2Slash3`
import typings.grommet.grommetStrings.`2Slash4`
import typings.grommet.grommetStrings.`3Slash4`
import typings.grommet.grommetStrings.auto
import typings.grommet.grommetStrings.bottom
import typings.grommet.grommetStrings.col
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.middle
import typings.grommet.grommetStrings.noPad
import typings.grommet.grommetStrings.row
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.top
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxsmall
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableCellMod {
  
  @JSImport("grommet/components/TableCell", "TableCell")
  @js.native
  val TableCell: FC[TableCellExtendedProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof grommet.grommet/components/Box.BoxTypes & react.react.DetailedHTMLProps<react.react.TdHTMLAttributes<std.HTMLTableDataCellElement>, std.HTMLTableDataCellElement>, 'scope'> ]: grommet.grommet/components/Box.BoxTypes & react.react.DetailedHTMLProps<react.react.TdHTMLAttributes<std.HTMLTableDataCellElement>, std.HTMLTableDataCellElement>[P]} */ trait TableCellExtendedProps
    extends StObject
       with TableCellProps
  object TableCellExtendedProps {
    
    inline def apply(): TableCellExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableCellExtendedProps]
    }
  }
  
  trait TableCellProps extends StObject {
    
    var plain: js.UndefOr[Boolean | noPad] = js.undefined
    
    // noPad is for internal use only
    var scope: js.UndefOr[col | row] = js.undefined
    
    var size: js.UndefOr[
        xxsmall | xsmall | small | medium | large | xlarge | `1Slash2` | `1Slash3` | `2Slash3` | `1Slash4` | `2Slash4` | `3Slash4` | auto | String
      ] = js.undefined
    
    var verticalAlign: js.UndefOr[top | middle | bottom] = js.undefined
  }
  object TableCellProps {
    
    inline def apply(): TableCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableCellProps]
    }
    
    extension [Self <: TableCellProps](x: Self) {
      
      inline def setPlain(value: Boolean | noPad): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      inline def setScope(value: col | row): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setSize(
        value: xxsmall | xsmall | small | medium | large | xlarge | `1Slash2` | `1Slash3` | `2Slash3` | `1Slash4` | `2Slash4` | `3Slash4` | auto | String
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setVerticalAlign(value: top | middle | bottom): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    }
  }
}
