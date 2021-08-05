package typings.lasso

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeRequireNoOpMod {
  
  @JSImport("lasso/node-require-no-op", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enable(extensions: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(extensions.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
