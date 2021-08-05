package typings.grommet.anon

import typings.grommet.grommetStrings.`bottom-left`
import typings.grommet.grommetStrings.`bottom-right`
import typings.grommet.grommetStrings.`top-left`
import typings.grommet.grommetStrings.`top-right`
import typings.grommet.grommetStrings.bottom
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.left
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.right
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.top
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.utilsMod._RoundType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Corner
  extends StObject
     with _RoundType {
  
  var corner: js.UndefOr[
    top | left | bottom | right | `top-left` | `top-right` | `bottom-left` | `bottom-right`
  ] = js.undefined
  
  var size: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.undefined
}
object Corner {
  
  inline def apply(): Corner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Corner]
  }
  
  extension [Self <: Corner](x: Self) {
    
    inline def setCorner(value: top | left | bottom | right | `top-left` | `top-right` | `bottom-left` | `bottom-right`): Self = StObject.set(x, "corner", value.asInstanceOf[js.Any])
    
    inline def setCornerUndefined: Self = StObject.set(x, "corner", js.undefined)
    
    inline def setSize(value: xsmall | small | medium | large | xlarge | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
