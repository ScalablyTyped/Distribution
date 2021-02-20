package typings.irc

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Channel extends StObject {
    
    var channel: Idlength = js.native
    
    var kicklength: Double = js.native
    
    var maxlist: js.Array[Double] = js.native
    
    var maxtargets: js.Array[String] = js.native
    
    var modes: Double = js.native
    
    var nicklength: Double = js.native
    
    var topiclength: Double = js.native
    
    var usermodes: String = js.native
  }
  object Channel {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ChannelMutableBuilder[Self <: Channel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(value: Idlength): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKicklength(value: Double): Self = StObject.set(x, "kicklength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxlist(value: js.Array[Double]): Self = StObject.set(x, "maxlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxlistVarargs(value: Double*): Self = StObject.set(x, "maxlist", js.Array(value :_*))
      
      @scala.inline
      def setMaxtargets(value: js.Array[String]): Self = StObject.set(x, "maxtargets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxtargetsVarargs(value: String*): Self = StObject.set(x, "maxtargets", js.Array(value :_*))
      
      @scala.inline
      def setModes(value: Double): Self = StObject.set(x, "modes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNicklength(value: Double): Self = StObject.set(x, "nicklength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopiclength(value: Double): Self = StObject.set(x, "topiclength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsermodes(value: String): Self = StObject.set(x, "usermodes", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Created extends StObject {
    
    var created: String = js.native
    
    var key: String = js.native
    
    var mode: String = js.native
    
    var serverName: String = js.native
    
    var users: StringDictionary[String] = js.native
  }
  object Created {
    
    @scala.inline
    def apply(created: String, key: String, mode: String, serverName: String, users: StringDictionary[String]): Created = {
      val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], serverName = serverName.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[Created]
    }
    
    @scala.inline
    implicit class CreatedMutableBuilder[Self <: Created] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerName(value: String): Self = StObject.set(x, "serverName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsers(value: StringDictionary[String]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Idlength extends StObject {
    
    var idlength: js.Array[String] = js.native
    
    var length: Double = js.native
    
    var limit: js.Array[String] = js.native
    
    var modes: StringDictionary[String] = js.native
    
    var types: String = js.native
  }
  object Idlength {
    
    @scala.inline
    def apply(
      idlength: js.Array[String],
      length: Double,
      limit: js.Array[String],
      modes: StringDictionary[String],
      types: String
    ): Idlength = {
      val __obj = js.Dynamic.literal(idlength = idlength.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[Idlength]
    }
    
    @scala.inline
    implicit class IdlengthMutableBuilder[Self <: Idlength] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdlength(value: js.Array[String]): Self = StObject.set(x, "idlength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdlengthVarargs(value: String*): Self = StObject.set(x, "idlength", js.Array(value :_*))
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit(value: js.Array[String]): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitVarargs(value: String*): Self = StObject.set(x, "limit", js.Array(value :_*))
      
      @scala.inline
      def setModes(value: StringDictionary[String]): Self = StObject.set(x, "modes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypes(value: String): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    }
  }
}
