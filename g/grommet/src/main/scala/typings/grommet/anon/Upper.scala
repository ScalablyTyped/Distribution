package typings.grommet.anon

import typings.grommet.baseMod.ExtendProps
import typings.grommet.baseMod.ExtendType
import typings.grommet.baseMod.ExtendValue
import typings.grommet.utilsMod.OpacityType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Upper extends StObject {
  
  var color: js.UndefOr[js.Any] = js.native
  
  var extend: js.UndefOr[ExtendType[Record[String, _]]] = js.native
  
  var height: js.UndefOr[String] = js.native
  
  var lower: js.UndefOr[`7`] = js.native
  
  var opacity: js.UndefOr[OpacityType] = js.native
  
  var upper: js.UndefOr[`7`] = js.native
}
object Upper {
  
  @scala.inline
  def apply(): Upper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Upper]
  }
  
  @scala.inline
  implicit class UpperMutableBuilder[Self <: Upper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: js.Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setExtend(value: ExtendType[Record[String, _]]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendFunction1(value: /* props */ ExtendProps[Record[String, _]] => ExtendValue[Record[String, _]]): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLower(value: `7`): Self = StObject.set(x, "lower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerUndefined: Self = StObject.set(x, "lower", js.undefined)
    
    @scala.inline
    def setOpacity(value: OpacityType): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setUpper(value: `7`): Self = StObject.set(x, "upper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperUndefined: Self = StObject.set(x, "upper", js.undefined)
  }
}
