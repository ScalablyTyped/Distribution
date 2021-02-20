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
trait DisabledExtend extends StObject {
  
  var disabled: js.UndefOr[OpacityType] = js.native
  
  var extend: js.UndefOr[ExtendType[Record[String, _]]] = js.native
}
object DisabledExtend {
  
  @scala.inline
  def apply(): DisabledExtend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisabledExtend]
  }
  
  @scala.inline
  implicit class DisabledExtendMutableBuilder[Self <: DisabledExtend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: OpacityType): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setExtend(value: ExtendType[Record[String, _]]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendFunction1(value: /* props */ ExtendProps[Record[String, _]] => ExtendValue[Record[String, _]]): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
  }
}
