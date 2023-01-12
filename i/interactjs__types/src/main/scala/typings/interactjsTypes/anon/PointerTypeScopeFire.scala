package typings.interactjsTypes.anon

import typings.interactjsTypes.coreScopeMod.ListenerName
import typings.interactjsTypes.interactjsTypesBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerTypeScopeFire extends StObject {
  
  var pointerType: js.UndefOr[String] = js.undefined
  
  def scopeFire[T /* <: ListenerName */](
    name: T,
    arg: /* import warning: importer.ImportType#apply Failed type conversion: @interactjs/types.@interactjs/core/scope.SignalArgs[T] */ js.Any
  ): Unit | `false`
  @JSName("scopeFire")
  var scopeFire_Original: js.Function2[
    /* name */ ListenerName, 
    /* import warning: importer.ImportType#apply Failed type conversion: @interactjs/types.@interactjs/core/scope.SignalArgs[@interactjs/types.@interactjs/core/scope.ListenerName] */ /* arg */ js.Any, 
    Unit | `false`
  ]
}
object PointerTypeScopeFire {
  
  inline def apply(
    scopeFire: (/* name */ ListenerName, /* import warning: importer.ImportType#apply Failed type conversion: @interactjs/types.@interactjs/core/scope.SignalArgs[@interactjs/types.@interactjs/core/scope.ListenerName] */ /* arg */ js.Any) => Unit | `false`
  ): PointerTypeScopeFire = {
    val __obj = js.Dynamic.literal(scopeFire = js.Any.fromFunction2(scopeFire))
    __obj.asInstanceOf[PointerTypeScopeFire]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointerTypeScopeFire] (val x: Self) extends AnyVal {
    
    inline def setPointerType(value: String): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    inline def setPointerTypeUndefined: Self = StObject.set(x, "pointerType", js.undefined)
    
    inline def setScopeFire(
      value: (/* name */ ListenerName, /* import warning: importer.ImportType#apply Failed type conversion: @interactjs/types.@interactjs/core/scope.SignalArgs[@interactjs/types.@interactjs/core/scope.ListenerName] */ /* arg */ js.Any) => Unit | `false`
    ): Self = StObject.set(x, "scopeFire", js.Any.fromFunction2(value))
  }
}
