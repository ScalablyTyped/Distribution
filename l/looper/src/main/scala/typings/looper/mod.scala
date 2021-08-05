package typings.looper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(fn: Fn): Fn = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[Fn]
  
  @JSImport("looper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Fn = js.Function0[js.Any]
}
