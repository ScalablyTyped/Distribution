package typings.ipfsUnixfsExporter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Length extends StObject {
    
    var length: js.BigInt
    
    var offset: js.BigInt
  }
  object Length {
    
    inline def apply(length: js.BigInt, offset: js.BigInt): Length = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Length] (val x: Self) extends AnyVal {
      
      inline def setLength(value: js.BigInt): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: js.BigInt): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
}
