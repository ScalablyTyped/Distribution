package typings.interactjsTypes.anon

import typings.interactjsTypes.coreOptionsMod.PerActionDefaults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @interactjs/types.@interactjs/core/types.HasGetRect & {  options :@interactjs/types.@interactjs/core/options.PerActionDefaults} */
trait HasGetRectoptionsPerActio extends StObject {
  
  def getRect(element: typings.interactjsTypes.coreTypesMod.Element): typings.interactjsTypes.coreTypesMod.Rect
  
  var options: PerActionDefaults
}
object HasGetRectoptionsPerActio {
  
  inline def apply(
    getRect: typings.interactjsTypes.coreTypesMod.Element => typings.interactjsTypes.coreTypesMod.Rect,
    options: PerActionDefaults
  ): HasGetRectoptionsPerActio = {
    val __obj = js.Dynamic.literal(getRect = js.Any.fromFunction1(getRect), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasGetRectoptionsPerActio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HasGetRectoptionsPerActio] (val x: Self) extends AnyVal {
    
    inline def setGetRect(value: typings.interactjsTypes.coreTypesMod.Element => typings.interactjsTypes.coreTypesMod.Rect): Self = StObject.set(x, "getRect", js.Any.fromFunction1(value))
    
    inline def setOptions(value: PerActionDefaults): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
