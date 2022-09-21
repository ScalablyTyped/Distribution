package typings.marked.mod.marked

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SluggerOptions extends StObject {
  
  var dryrun: Boolean
}
object SluggerOptions {
  
  inline def apply(dryrun: Boolean): SluggerOptions = {
    val __obj = js.Dynamic.literal(dryrun = dryrun.asInstanceOf[js.Any])
    __obj.asInstanceOf[SluggerOptions]
  }
  
  extension [Self <: SluggerOptions](x: Self) {
    
    inline def setDryrun(value: Boolean): Self = StObject.set(x, "dryrun", value.asInstanceOf[js.Any])
  }
}
