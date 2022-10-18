package typings.ioTsTypes

import typings.ioTs.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFromRefinementMod {
  
  @JSImport("io-ts-types/lib/fromRefinement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromRefinement[A](name: String, is: js.Function1[/* u */ Any, /* is A */ Boolean]): Type_[A, A, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRefinement")(name.asInstanceOf[js.Any], is.asInstanceOf[js.Any])).asInstanceOf[Type_[A, A, Any]]
}
