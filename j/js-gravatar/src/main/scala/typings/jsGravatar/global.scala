package typings.jsGravatar

import typings.jsGravatar.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object jsGravatar {
    
    inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
    inline def apply(options: Options): String = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSGlobal("jsGravatar")
    @js.native
    val ^ : js.Any = js.native
    
    inline def buildQueryStringFromOptions(options: Options): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildQueryStringFromOptions")(options.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def validateOptions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateOptions")().asInstanceOf[Unit]
    inline def validateOptions(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
