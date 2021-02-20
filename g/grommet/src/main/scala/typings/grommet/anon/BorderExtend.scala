package typings.grommet.anon

import typings.grommet.baseMod.ExtendProps
import typings.grommet.baseMod.ExtendType
import typings.grommet.baseMod.ExtendValue
import typings.grommet.utilsMod.BackgroundType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderExtend extends StObject {
  
  var background: js.UndefOr[BackgroundType] = js.native
  
  var border: js.UndefOr[Style] = js.native
  
  var extend: js.UndefOr[ExtendType[Record[String, _]]] = js.native
}
object BorderExtend {
  
  @scala.inline
  def apply(): BorderExtend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderExtend]
  }
  
  @scala.inline
  implicit class BorderExtendMutableBuilder[Self <: BorderExtend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: BackgroundType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBorder(value: Style): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setExtend(value: ExtendType[Record[String, _]]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendFunction1(value: /* props */ ExtendProps[Record[String, _]] => ExtendValue[Record[String, _]]): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
  }
}
