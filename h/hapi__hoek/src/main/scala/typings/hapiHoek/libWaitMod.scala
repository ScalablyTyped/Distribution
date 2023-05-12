package typings.hapiHoek

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWaitMod {
  
  inline def apply[T](): js.Promise[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[T]]
  inline def apply[T](timeout: Double): js.Promise[T] = ^.asInstanceOf[js.Dynamic].apply(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def apply[T](timeout: Double, returnValue: T): js.Promise[T] = (^.asInstanceOf[js.Dynamic].apply(timeout.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def apply[T](timeout: Unit, returnValue: T): js.Promise[T] = (^.asInstanceOf[js.Dynamic].apply(timeout.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  @JSImport("@hapi/hoek/lib/wait", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
