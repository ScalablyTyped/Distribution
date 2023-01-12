package typings.kolite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutBindingHandlers extends StObject {
  
  var activity: KoLiteActivityBindingHandler
  
  var command: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ Any
}
object KnockoutBindingHandlers {
  
  inline def apply(
    activity: KoLiteActivityBindingHandler,
    command: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ Any
  ): KnockoutBindingHandlers = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutBindingHandlers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnockoutBindingHandlers] (val x: Self) extends AnyVal {
    
    inline def setActivity(value: KoLiteActivityBindingHandler): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    inline def setCommand(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ Any
    ): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
