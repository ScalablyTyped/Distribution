package typings.inversify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncMod {
  
  @JSImport("inversify/lib/utils/async", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPromise[T](`object`: Any): /* is std.Promise<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<T> */ Boolean]
  
  inline def isPromiseOrContainsPromise[T](`object`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromiseOrContainsPromise")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
