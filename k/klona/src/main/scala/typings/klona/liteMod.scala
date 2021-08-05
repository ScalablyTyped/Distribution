package typings.klona

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liteMod {
  
  @JSImport("klona/lite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def klona[T](input: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("klona")(input.asInstanceOf[js.Any]).asInstanceOf[T]
}
