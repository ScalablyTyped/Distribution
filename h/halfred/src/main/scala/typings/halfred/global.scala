package typings.halfred

import typings.halfred.mod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object halfred {
    
    @JSGlobal("halfred")
    @js.native
    val ^ : js.Any = js.native
    
    inline def disableValidation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableValidation")().asInstanceOf[Unit]
    
    inline def enableValidation(flag: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableValidation")(flag.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def parse(`object`: Any): Resource = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(`object`.asInstanceOf[js.Any]).asInstanceOf[Resource]
  }
}
