package typings.marv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Quiet extends StObject {
    
    var quiet: js.UndefOr[Boolean] = js.undefined
  }
  object Quiet {
    
    inline def apply(): Quiet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Quiet]
    }
    
    extension [Self <: Quiet](x: Self) {
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    }
  }
}
