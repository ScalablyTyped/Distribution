package typings.jstimezonedetect

import typings.jstimezonedetect.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object jstz {
    
    @JSGlobal("jstz")
    @js.native
    val ^ : js.Any = js.native
    
    inline def determine(): Name = ^.asInstanceOf[js.Dynamic].applyDynamic("determine")().asInstanceOf[Name]
    inline def determine(usingIntl: Boolean): Name = ^.asInstanceOf[js.Dynamic].applyDynamic("determine")(usingIntl.asInstanceOf[js.Any]).asInstanceOf[Name]
  }
}
