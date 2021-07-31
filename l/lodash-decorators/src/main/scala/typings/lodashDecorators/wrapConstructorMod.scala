package typings.lodashDecorators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wrapConstructorMod {
  
  @JSImport("lodash-decorators/utils/wrapConstructor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def wrapConstructor(Ctor: js.Function, wrapper: js.Function2[/* Ctor */ js.Function, /* repeated */ js.Any, js.Any]): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapConstructor")(Ctor.asInstanceOf[js.Any], wrapper.asInstanceOf[js.Any])).asInstanceOf[js.Function]
}
