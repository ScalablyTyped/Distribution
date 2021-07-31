package typings.keystonejsLogger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@keystonejs/logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def logger(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logger")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
