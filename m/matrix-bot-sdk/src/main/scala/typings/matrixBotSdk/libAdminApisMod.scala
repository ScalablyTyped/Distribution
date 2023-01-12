package typings.matrixBotSdk

import org.scalablytyped.runtime.StringDictionary
import typings.matrixBotSdk.anon.Sessions
import typings.matrixBotSdk.libMatrixClientMod.MatrixClient
import typings.matrixBotSdk.libSynapseAdminApisMod.SynapseAdminApis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdminApisMod {
  
  @JSImport("matrix-bot-sdk/lib/AdminApis", "AdminApis")
  @js.native
  open class AdminApis protected () extends StObject {
    def this(client: MatrixClient) = this()
    
    /* private */ var client: Any = js.native
    
    /**
      * Gets access to the Synapse administrative APIs object.
      */
    def synapse: SynapseAdminApis = js.native
    
    /**
      * Gets information about a particular user.
      * @param {string} userId the user ID to lookup
      * @returns {Promise<WhoisInfo>} resolves to the whois information
      */
    def whoisUser(userId: String): js.Promise[WhoisInfo] = js.native
  }
  
  trait WhoisConnectionInfo extends StObject {
    
    /**
      * Most recently seen IP address of the session.
      */
    var ip: String
    
    /**
      * Unix timestamp that the session was last active.
      */
    var last_seen: Double
    
    /**
      * User agent string last seen in the session.
      */
    var user_agent: String
  }
  object WhoisConnectionInfo {
    
    inline def apply(ip: String, last_seen: Double, user_agent: String): WhoisConnectionInfo = {
      val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], last_seen = last_seen.asInstanceOf[js.Any], user_agent = user_agent.asInstanceOf[js.Any])
      __obj.asInstanceOf[WhoisConnectionInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WhoisConnectionInfo] (val x: Self) extends AnyVal {
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setLast_seen(value: Double): Self = StObject.set(x, "last_seen", value.asInstanceOf[js.Any])
      
      inline def setUser_agent(value: String): Self = StObject.set(x, "user_agent", value.asInstanceOf[js.Any])
    }
  }
  
  trait WhoisInfo extends StObject {
    
    var devices: StringDictionary[Sessions]
    
    var user_id: String
  }
  object WhoisInfo {
    
    inline def apply(devices: StringDictionary[Sessions], user_id: String): WhoisInfo = {
      val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[WhoisInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WhoisInfo] (val x: Self) extends AnyVal {
      
      inline def setDevices(value: StringDictionary[Sessions]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
      
      inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
}
