package typings.irc

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Channel extends StObject {
    
    var channel: Idlength
    
    var kicklength: Double
    
    var maxlist: js.Array[Double]
    
    var maxtargets: js.Array[String]
    
    var modes: Double
    
    var nicklength: Double
    
    var topiclength: Double
    
    var usermodes: String
  }
  object Channel {
    
    inline def apply(
      channel: Idlength,
      kicklength: Double,
      maxlist: js.Array[Double],
      maxtargets: js.Array[String],
      modes: Double,
      nicklength: Double,
      topiclength: Double,
      usermodes: String
    ): Channel = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], kicklength = kicklength.asInstanceOf[js.Any], maxlist = maxlist.asInstanceOf[js.Any], maxtargets = maxtargets.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any], nicklength = nicklength.asInstanceOf[js.Any], topiclength = topiclength.asInstanceOf[js.Any], usermodes = usermodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Channel]
    }
    
    extension [Self <: Channel](x: Self) {
      
      inline def setChannel(value: Idlength): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setKicklength(value: Double): Self = StObject.set(x, "kicklength", value.asInstanceOf[js.Any])
      
      inline def setMaxlist(value: js.Array[Double]): Self = StObject.set(x, "maxlist", value.asInstanceOf[js.Any])
      
      inline def setMaxlistVarargs(value: Double*): Self = StObject.set(x, "maxlist", js.Array(value :_*))
      
      inline def setMaxtargets(value: js.Array[String]): Self = StObject.set(x, "maxtargets", value.asInstanceOf[js.Any])
      
      inline def setMaxtargetsVarargs(value: String*): Self = StObject.set(x, "maxtargets", js.Array(value :_*))
      
      inline def setModes(value: Double): Self = StObject.set(x, "modes", value.asInstanceOf[js.Any])
      
      inline def setNicklength(value: Double): Self = StObject.set(x, "nicklength", value.asInstanceOf[js.Any])
      
      inline def setTopiclength(value: Double): Self = StObject.set(x, "topiclength", value.asInstanceOf[js.Any])
      
      inline def setUsermodes(value: String): Self = StObject.set(x, "usermodes", value.asInstanceOf[js.Any])
    }
  }
  
  trait Created extends StObject {
    
    var created: String
    
    var key: String
    
    var mode: String
    
    var serverName: String
    
    var users: StringDictionary[String]
  }
  object Created {
    
    inline def apply(created: String, key: String, mode: String, serverName: String, users: StringDictionary[String]): Created = {
      val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], serverName = serverName.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[Created]
    }
    
    extension [Self <: Created](x: Self) {
      
      inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setServerName(value: String): Self = StObject.set(x, "serverName", value.asInstanceOf[js.Any])
      
      inline def setUsers(value: StringDictionary[String]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    }
  }
  
  trait Idlength extends StObject {
    
    var idlength: js.Array[String]
    
    var length: Double
    
    var limit: js.Array[String]
    
    var modes: StringDictionary[String]
    
    var types: String
  }
  object Idlength {
    
    inline def apply(
      idlength: js.Array[String],
      length: Double,
      limit: js.Array[String],
      modes: StringDictionary[String],
      types: String
    ): Idlength = {
      val __obj = js.Dynamic.literal(idlength = idlength.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[Idlength]
    }
    
    extension [Self <: Idlength](x: Self) {
      
      inline def setIdlength(value: js.Array[String]): Self = StObject.set(x, "idlength", value.asInstanceOf[js.Any])
      
      inline def setIdlengthVarargs(value: String*): Self = StObject.set(x, "idlength", js.Array(value :_*))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLimit(value: js.Array[String]): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitVarargs(value: String*): Self = StObject.set(x, "limit", js.Array(value :_*))
      
      inline def setModes(value: StringDictionary[String]): Self = StObject.set(x, "modes", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: String): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    }
  }
}
