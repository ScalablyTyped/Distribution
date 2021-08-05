package typings.isSecret

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-secret", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def key(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("key")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def value(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("value")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
