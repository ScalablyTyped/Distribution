package typings.grpcGrpcJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Protobuf extends StObject {
  
  var protobuf: Any
}
object Protobuf {
  
  inline def apply(protobuf: Any): Protobuf = {
    val __obj = js.Dynamic.literal(protobuf = protobuf.asInstanceOf[js.Any])
    __obj.asInstanceOf[Protobuf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Protobuf] (val x: Self) extends AnyVal {
    
    inline def setProtobuf(value: Any): Self = StObject.set(x, "protobuf", value.asInstanceOf[js.Any])
  }
}
