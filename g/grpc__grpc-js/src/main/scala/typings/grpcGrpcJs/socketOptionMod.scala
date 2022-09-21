package typings.grpcGrpcJs

import typings.grpcGrpcJs.anyMod.Any
import typings.grpcGrpcJs.anyMod.AnyOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socketOptionMod {
  
  trait SocketOption extends StObject {
    
    /**
      * Additional data associated with the socket option.  At least one of value
      * or additional will be set.
      */
    var additional: js.UndefOr[Any | Null] = js.undefined
    
    /**
      * The full name of the socket option.  Typically this will be the upper case
      * name, such as "SO_REUSEPORT".
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The human readable value of this socket option.  At least one of value or
      * additional will be set.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object SocketOption {
    
    inline def apply(): SocketOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocketOption]
    }
    
    extension [Self <: SocketOption](x: Self) {
      
      inline def setAdditional(value: Any): Self = StObject.set(x, "additional", value.asInstanceOf[js.Any])
      
      inline def setAdditionalNull: Self = StObject.set(x, "additional", null)
      
      inline def setAdditionalUndefined: Self = StObject.set(x, "additional", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait SocketOptionOutput extends StObject {
    
    /**
      * Additional data associated with the socket option.  At least one of value
      * or additional will be set.
      */
    var additional: AnyOutput | Null
    
    /**
      * The full name of the socket option.  Typically this will be the upper case
      * name, such as "SO_REUSEPORT".
      */
    var name: String
    
    /**
      * The human readable value of this socket option.  At least one of value or
      * additional will be set.
      */
    var value: String
  }
  object SocketOptionOutput {
    
    inline def apply(name: String, value: String): SocketOptionOutput = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], additional = null)
      __obj.asInstanceOf[SocketOptionOutput]
    }
    
    extension [Self <: SocketOptionOutput](x: Self) {
      
      inline def setAdditional(value: AnyOutput): Self = StObject.set(x, "additional", value.asInstanceOf[js.Any])
      
      inline def setAdditionalNull: Self = StObject.set(x, "additional", null)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
