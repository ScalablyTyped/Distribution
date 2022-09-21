package typings.grpcGrpcJs

import typings.grpcProtoLoader.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subchannelRefMod {
  
  trait SubchannelRef extends StObject {
    
    /**
      * An optional name associated with the subchannel.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The globally unique id for this subchannel.  Must be a positive number.
      */
    var subchannel_id: js.UndefOr[Double | String | Long] = js.undefined
  }
  object SubchannelRef {
    
    inline def apply(): SubchannelRef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubchannelRef]
    }
    
    extension [Self <: SubchannelRef](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSubchannel_id(value: Double | String | Long): Self = StObject.set(x, "subchannel_id", value.asInstanceOf[js.Any])
      
      inline def setSubchannel_idUndefined: Self = StObject.set(x, "subchannel_id", js.undefined)
    }
  }
  
  trait SubchannelRefOutput extends StObject {
    
    /**
      * An optional name associated with the subchannel.
      */
    var name: String
    
    /**
      * The globally unique id for this subchannel.  Must be a positive number.
      */
    var subchannel_id: String
  }
  object SubchannelRefOutput {
    
    inline def apply(name: String, subchannel_id: String): SubchannelRefOutput = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], subchannel_id = subchannel_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubchannelRefOutput]
    }
    
    extension [Self <: SubchannelRefOutput](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSubchannel_id(value: String): Self = StObject.set(x, "subchannel_id", value.asInstanceOf[js.Any])
    }
  }
}
