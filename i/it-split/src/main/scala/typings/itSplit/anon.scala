package typings.itSplit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Delimiter extends StObject {
    
    var delimiter: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  }
  object Delimiter {
    
    inline def apply(): Delimiter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Delimiter]
    }
    
    extension [Self <: Delimiter](x: Self) {
      
      inline def setDelimiter(value: js.typedarray.Uint8Array): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    }
  }
}
