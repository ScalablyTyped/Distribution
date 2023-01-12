package typings.grommet.anon

import typings.grommet.grommetStrings.`100Percentsign`
import typings.grommet.grommetStrings.xxlarge
import typings.grommet.grommetStrings.xxsmall
import typings.grommet.utilsMod.TShirtSizeType
import typings.grommet.utilsMod._HeightType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeightMax
  extends StObject
     with _HeightType {
  
  var height: js.UndefOr[xxsmall | xxlarge | TShirtSizeType | `100Percentsign`] = js.undefined
  
  var max: js.UndefOr[xxsmall | xxlarge | TShirtSizeType | `100Percentsign`] = js.undefined
  
  var min: js.UndefOr[xxsmall | xxlarge | TShirtSizeType | `100Percentsign`] = js.undefined
}
object HeightMax {
  
  inline def apply(): HeightMax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeightMax]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeightMax] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: xxsmall | xxlarge | TShirtSizeType | `100Percentsign`): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMax(value: xxsmall | xxlarge | TShirtSizeType | `100Percentsign`): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: xxsmall | xxlarge | TShirtSizeType | `100Percentsign`): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
