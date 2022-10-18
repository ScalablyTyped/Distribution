package typings.jssha.anon

import typings.jssha.distSha3Mod.EncodingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  var encoding: js.UndefOr[EncodingType] = js.undefined
}
object `12` {
  
  inline def apply(): `12` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`12`]
  }
  
  extension [Self <: `12`](x: Self) {
    
    inline def setEncoding(value: EncodingType): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
  }
}
