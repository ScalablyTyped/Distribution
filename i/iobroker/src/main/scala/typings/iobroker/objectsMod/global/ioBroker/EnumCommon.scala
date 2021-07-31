package typings.iobroker.objectsMod.global.ioBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumCommon
  extends StObject
     with ObjectCommon {
  
  // Make it possible to narrow the object type using the custom property
  var custom: Unit
  
  /** The IDs of the enum members */
  var members: js.UndefOr[js.Array[String]] = js.undefined
}
object EnumCommon {
  
  @scala.inline
  def apply(custom: Unit, name: StringOrTranslated): EnumCommon = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumCommon]
  }
  
  @scala.inline
  implicit class EnumCommonMutableBuilder[Self <: EnumCommon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustom(value: Unit): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    @scala.inline
    def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value :_*))
  }
}
