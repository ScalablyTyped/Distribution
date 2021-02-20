package typings.kerberos

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("kerberos", "GSS_C_ANON_FLAG")
  @js.native
  val GSS_C_ANON_FLAG: Double = js.native
  
  @JSImport("kerberos", "GSS_C_CONF_FLAG")
  @js.native
  val GSS_C_CONF_FLAG: Double = js.native
  
  @JSImport("kerberos", "GSS_C_DELEG_FLAG")
  @js.native
  val GSS_C_DELEG_FLAG: Double = js.native
  
  @JSImport("kerberos", "GSS_C_INTEG_FLAG")
  @js.native
  val GSS_C_INTEG_FLAG: Double = js.native
  
  @JSImport("kerberos", "GSS_C_MUTUAL_FLAG")
  @js.native
  val GSS_C_MUTUAL_FLAG: Double = js.native
  
  @JSImport("kerberos", "GSS_C_NO_OID")
  @js.native
  val GSS_C_NO_OID: Double = js.native
  
  @JSImport("kerberos", "GSS_C_PROT_READY_FLAG")
  @js.native
  val GSS_C_PROT_READY_FLAG: Double = js.native
  
  @JSImport("kerberos", "GSS_C_REPLAY_FLAG")
  @js.native
  val GSS_C_REPLAY_FLAG: Double = js.native
  
  @JSImport("kerberos", "GSS_C_SEQUENCE_FLAG")
  @js.native
  val GSS_C_SEQUENCE_FLAG: Double = js.native
  
  @JSImport("kerberos", "GSS_C_TRANS_FLAG")
  @js.native
  val GSS_C_TRANS_FLAG: Double = js.native
  
  @JSImport("kerberos", "GSS_MECH_OID_KRB5")
  @js.native
  val GSS_MECH_OID_KRB5: Double = js.native
  
  @JSImport("kerberos", "GSS_MECH_OID_SPNEGO")
  @js.native
  val GSS_MECH_OID_SPNEGO: Double = js.native
  
  @JSImport("kerberos", "KerberosClient")
  @js.native
  class KerberosClient () extends StObject {
    
    /**
      * @description Indicates that authentication has successfully completed or not
      */
    var contextComplete: Boolean = js.native
    
    /**
      * @description The last response received during authentication steps
      */
    var response: String = js.native
    
    /**
      * @description Indicates whether confidentiality was applied or not (GSSAPI only)
      */
    var responseConf: String = js.native
    
    /**
      * Processes a single kerberos client-side step using the supplied server challenge.
      *
      * @param challenge A string containing the base64-encoded server data (which may be empty for the first step)
      * @param callback
      * @return returns Promise if no callback passed
      */
    def step(challenge: String): js.Promise[String] = js.native
    def step(challenge: String, callback: js.Function2[/* err */ String, /* clientResponse */ String, _]): Unit = js.native
    
    /**
      * Perform the client side kerberos unwrap step
      *
      * @param challenge A string containing the base64-encoded server data
      * @param callback
      * @return returns Promise if no callback passed
      */
    def unwrap(challenge: String): js.Promise[String] = js.native
    def unwrap(challenge: String, callback: js.Function2[/* err */ String, /* challengeResponse */ String, _]): Unit = js.native
    
    /**
      * @description The username used for authentication
      */
    var username: String = js.native
    
    /**
      * Perform the client side kerberos wrap step.
      *
      * @param challenge The response returned after calling `unwrap`
      * @param options Optional settings
      * @param [callback]
      * @return returns Promise if no callback passed
      */
    def wrap(challenge: String): js.Promise[String] = js.native
    def wrap(challenge: String, callback: js.Function2[/* err */ String, /* challengeResponse */ String, _]): Unit = js.native
    def wrap(challenge: String, options: WrapOptions): js.Promise[String] = js.native
    def wrap(
      challenge: String,
      options: WrapOptions,
      callback: js.Function2[/* err */ String, /* challengeResponse */ String, _]
    ): Unit = js.native
  }
  
  @JSImport("kerberos", "KerberosServer")
  @js.native
  class KerberosServer () extends StObject {
    
    /**
      * @description Indicates that authentication has successfully completed or not
      */
    var contextComplete: Boolean = js.native
    
    /**
      * @description The last response received during authentication steps
      */
    var response: String = js.native
    
    /**
      * Processes a single kerberos server-side step using the supplied client data.
      *
      * @param challenge A string containing the base64-encoded client data
      * @param callback
      * @return returns Promise if no callback passed
      */
    def step(challenge: String): js.Promise[String] = js.native
    def step(challenge: String, callback: js.Function2[/* err */ String, /* serverResponse */ String, _]): Unit = js.native
    
    /**
      * @description The target used for authentication
      */
    var targetName: String = js.native
    
    /**
      * @description  The username used for authentication
      */
    var username: String = js.native
  }
  
  @JSImport("kerberos", "checkPassword")
  @js.native
  def checkPassword(name: String, password: String, service: String): js.Promise[Unit] = js.native
  @JSImport("kerberos", "checkPassword")
  @js.native
  def checkPassword(name: String, password: String, service: String, callback: js.Function1[/* err */ String, _]): Unit = js.native
  @JSImport("kerberos", "checkPassword")
  @js.native
  def checkPassword(name: String, password: String, service: String, defaultRealm: String): js.Promise[Unit] = js.native
  @JSImport("kerberos", "checkPassword")
  @js.native
  def checkPassword(
    name: String,
    password: String,
    service: String,
    defaultRealm: String,
    callback: js.Function1[/* err */ String, _]
  ): Unit = js.native
  
  @JSImport("kerberos", "initializeClient")
  @js.native
  def initializeClient(service: String): js.Promise[KerberosClient] = js.native
  @JSImport("kerberos", "initializeClient")
  @js.native
  def initializeClient(service: String, callback: js.Function2[/* err */ String, /* client */ KerberosClient, _]): Unit = js.native
  @JSImport("kerberos", "initializeClient")
  @js.native
  def initializeClient(service: String, options: InitializeClientOptions): js.Promise[KerberosClient] = js.native
  @JSImport("kerberos", "initializeClient")
  @js.native
  def initializeClient(
    service: String,
    options: InitializeClientOptions,
    callback: js.Function2[/* err */ String, /* client */ KerberosClient, _]
  ): Unit = js.native
  
  @JSImport("kerberos", "initializeServer")
  @js.native
  def initializeServer(service: String): js.Promise[KerberosServer] = js.native
  @JSImport("kerberos", "initializeServer")
  @js.native
  def initializeServer(service: String, callback: js.Function2[/* err */ String, /* server */ KerberosServer, _]): Unit = js.native
  
  @JSImport("kerberos", "principalDetails")
  @js.native
  def principalDetails(service: String, hostname: String): js.Promise[String] = js.native
  @JSImport("kerberos", "principalDetails")
  @js.native
  def principalDetails(
    service: String,
    hostname: String,
    callback: js.Function2[/* err */ String, /* details */ String, _]
  ): Unit = js.native
  
  @js.native
  trait InitializeClientOptions extends StObject {
    
    /**
      * @description Optional integer used to set GSS flags. (e.g. GSS_C_DELEG_FLAG|GSS_C_MUTUAL_FLAG|GSS_C_SEQUENCE_FLAG will allow for forwarding credentials to the remote host)
      */
    var gssFlag: js.UndefOr[Double] = js.native
    
    /**
      * @description Optional GSS mech OID. Defaults to None (GSS_C_NO_OID). Other possible values are `GSS_MECH_OID_KRB5`, `GSS_MECH_OID_SPNEGO`
      */
    var mechOID: js.UndefOr[Double] = js.native
    
    /**
      * @description Optional string containing the client principal in the form '`user@realm`'
      */
    var principal: js.UndefOr[String] = js.native
  }
  object InitializeClientOptions {
    
    @scala.inline
    def apply(): InitializeClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitializeClientOptions]
    }
    
    @scala.inline
    implicit class InitializeClientOptionsMutableBuilder[Self <: InitializeClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGssFlag(value: Double): Self = StObject.set(x, "gssFlag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGssFlagUndefined: Self = StObject.set(x, "gssFlag", js.undefined)
      
      @scala.inline
      def setMechOID(value: Double): Self = StObject.set(x, "mechOID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMechOIDUndefined: Self = StObject.set(x, "mechOID", js.undefined)
      
      @scala.inline
      def setPrincipal(value: String): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrincipalUndefined: Self = StObject.set(x, "principal", js.undefined)
    }
  }
  
  @js.native
  trait WrapOptions extends StObject {
    
    /**
      * @description The user to authorize
      */
    var user: js.UndefOr[String] = js.native
  }
  object WrapOptions {
    
    @scala.inline
    def apply(): WrapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WrapOptions]
    }
    
    @scala.inline
    implicit class WrapOptionsMutableBuilder[Self <: WrapOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
}
