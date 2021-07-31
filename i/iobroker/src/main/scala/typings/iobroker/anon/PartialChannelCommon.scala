package typings.iobroker.anon

import typings.iobroker.iobrokerBooleans.`true`
import typings.iobroker.objectsMod.global.ioBroker.StringOrTranslated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<iobroker.iobroker/objects.<global>.ioBroker.ChannelCommon> */
trait PartialChannelCommon extends StObject {
  
  var custom: Unit
  
  var desc: js.UndefOr[String] = js.undefined
  
  var dontDelete: js.UndefOr[`true`] = js.undefined
  
  var expert: js.UndefOr[`true`] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[StringOrTranslated] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
}
object PartialChannelCommon {
  
  @scala.inline
  def apply(custom: Unit): PartialChannelCommon = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialChannelCommon]
  }
  
  @scala.inline
  implicit class PartialChannelCommonMutableBuilder[Self <: PartialChannelCommon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustom(value: Unit): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
    
    @scala.inline
    def setDontDelete(value: `true`): Self = StObject.set(x, "dontDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDontDeleteUndefined: Self = StObject.set(x, "dontDelete", js.undefined)
    
    @scala.inline
    def setExpert(value: `true`): Self = StObject.set(x, "expert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpertUndefined: Self = StObject.set(x, "expert", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setName(value: StringOrTranslated): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
