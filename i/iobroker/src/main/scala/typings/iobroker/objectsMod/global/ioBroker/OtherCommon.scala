package typings.iobroker.objectsMod.global.ioBroker

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtherCommon
  extends StObject
     with ObjectCommon
     with /* propName */ StringDictionary[Any] {
  
  // Make it possible to narrow the object type using the custom property
  var custom: Unit
}
object OtherCommon {
  
  inline def apply(custom: Unit, name: StringOrTranslated): OtherCommon = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherCommon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OtherCommon] (val x: Self) extends AnyVal {
    
    inline def setCustom(value: Unit): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
  }
}
