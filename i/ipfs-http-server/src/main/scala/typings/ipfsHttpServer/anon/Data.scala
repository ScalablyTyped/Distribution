package typings.ipfsHttpServer.anon

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var data: Buffer
}
object Data {
  
  inline def apply(data: Buffer): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  extension [Self <: Data](x: Self) {
    
    inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
