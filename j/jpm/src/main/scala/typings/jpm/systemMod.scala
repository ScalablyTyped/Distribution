package typings.jpm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Query the add-on's environment and access arguments passed to it
  */
object systemMod {
  
  @JSImport("sdk/system", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sdk/system", "architecture")
  @js.native
  val architecture: String = js.native
  
  @JSImport("sdk/system", "build")
  @js.native
  val build: String = js.native
  
  @JSImport("sdk/system", "compiler")
  @js.native
  val compiler: String = js.native
  
  @JSImport("sdk/system", "env")
  @js.native
  val env: Any = js.native
  
  inline def exit(code: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exit")(code.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("sdk/system", "id")
  @js.native
  val id: String = js.native
  
  @JSImport("sdk/system", "name")
  @js.native
  val name: String = js.native
  
  inline def pathFor(id: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pathFor")(id.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("sdk/system", "platform")
  @js.native
  val platform: String = js.native
  
  @JSImport("sdk/system", "platformVersion")
  @js.native
  val platformVersion: String = js.native
  
  @JSImport("sdk/system", "vendor")
  @js.native
  val vendor: String = js.native
  
  @JSImport("sdk/system", "version")
  @js.native
  val version: String = js.native
}
