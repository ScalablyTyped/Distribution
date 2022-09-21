package typings.inversify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exceptionsMod {
  
  @JSImport("inversify/lib/utils/exceptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isStackOverflowExeption(error: js.Error): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStackOverflowExeption")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def tryAndThrowErrorIfStackOverflow[T](fn: js.Function0[T], errorCallback: js.Function0[js.Error]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("tryAndThrowErrorIfStackOverflow")(fn.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[T]
}
