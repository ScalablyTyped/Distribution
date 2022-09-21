package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferEOSData extends StObject {
  
  var `type`: js.UndefOr[SourceBufferName] = js.undefined
}
object BufferEOSData {
  
  inline def apply(): BufferEOSData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferEOSData]
  }
  
  extension [Self <: BufferEOSData](x: Self) {
    
    inline def setType(value: SourceBufferName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
