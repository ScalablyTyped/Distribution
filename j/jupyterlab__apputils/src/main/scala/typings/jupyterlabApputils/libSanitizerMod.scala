package typings.jupyterlabApputils

import typings.jupyterlabApputils.libTokensMod.ISanitizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSanitizerMod {
  
  @JSImport("@jupyterlab/apputils/lib/sanitizer", "Sanitizer")
  @js.native
  open class Sanitizer ()
    extends StObject
       with ISanitizer {
    
    /* private */ var _options: Any = js.native
  }
  
  @JSImport("@jupyterlab/apputils/lib/sanitizer", "defaultSanitizer")
  @js.native
  val defaultSanitizer: ISanitizer = js.native
}
