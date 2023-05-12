package typings.gremlin.mod.process

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scope {
  
  @JSImport("gremlin", "process.scope")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gremlin", "process.scope.global")
  @js.native
  def global: EnumValue = js.native
  inline def global_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("global")(x.asInstanceOf[js.Any])
  
  @JSImport("gremlin", "process.scope.local")
  @js.native
  def local: EnumValue = js.native
  inline def local_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("local")(x.asInstanceOf[js.Any])
}
