package typings.grpcGrpcJs

import typings.grpcProtoLoader.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverRefMod {
  
  trait ServerRef extends StObject {
    
    /**
      * An optional name associated with the server.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * A globally unique identifier for this server.  Must be a positive number.
      */
    var server_id: js.UndefOr[Double | String | Long] = js.undefined
  }
  object ServerRef {
    
    inline def apply(): ServerRef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerRef]
    }
    
    extension [Self <: ServerRef](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setServer_id(value: Double | String | Long): Self = StObject.set(x, "server_id", value.asInstanceOf[js.Any])
      
      inline def setServer_idUndefined: Self = StObject.set(x, "server_id", js.undefined)
    }
  }
  
  trait ServerRefOutput extends StObject {
    
    /**
      * An optional name associated with the server.
      */
    var name: String
    
    /**
      * A globally unique identifier for this server.  Must be a positive number.
      */
    var server_id: String
  }
  object ServerRefOutput {
    
    inline def apply(name: String, server_id: String): ServerRefOutput = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], server_id = server_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerRefOutput]
    }
    
    extension [Self <: ServerRefOutput](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setServer_id(value: String): Self = StObject.set(x, "server_id", value.asInstanceOf[js.Any])
    }
  }
}
