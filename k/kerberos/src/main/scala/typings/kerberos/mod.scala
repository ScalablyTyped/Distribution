package typings.kerberos

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("kerberos", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    def step(challenge: String, callback: js.Function2[/* err */ String, /* clientResponse */ String, js.Any]): Unit = js.native
    
    /**
      * Perform the client side kerberos unwrap step
      *
      * @param challenge A string containing the base64-encoded server data
      * @param callback
      * @return returns Promise if no callback passed
      */
    def unwrap(challenge: String): js.Promise[String] = js.native
    def unwrap(
      challenge: String,
      callback: js.Function2[/* err */ String, /* challengeResponse */ String, js.Any]
    ): Unit = js.native
    
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
    def wrap(
      challenge: String,
      callback: js.Function2[/* err */ String, /* challengeResponse */ String, js.Any]
    ): Unit = js.native
    def wrap(challenge: String, options: WrapOptions): js.Promise[String] = js.native
    def wrap(
      challenge: String,
      options: WrapOptions,
      callback: js.Function2[/* err */ String, /* challengeResponse */ String, js.Any]
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
    def step(challenge: String, callback: js.Function2[/* err */ String, /* serverResponse */ String, js.Any]): Unit = js.native
    
    /**
      * @description The target used for authentication
      */
    var targetName: String = js.native
    
    /**
      * @description  The username used for authentication
      */
    var username: String = js.native
  }
  
  inline def checkPassword(name: String, password: String, service: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPassword")(name.asInstanceOf[js.Any], password.asInstanceOf[js.Any], service.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def checkPassword(name: String, password: String, service: String, callback: js.Function1[/* err */ String, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPassword")(name.asInstanceOf[js.Any], password.asInstanceOf[js.Any], service.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkPassword(name: String, password: String, service: String, defaultRealm: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPassword")(name.asInstanceOf[js.Any], password.asInstanceOf[js.Any], service.asInstanceOf[js.Any], defaultRealm.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def checkPassword(
    name: String,
    password: String,
    service: String,
    defaultRealm: String,
    callback: js.Function1[/* err */ String, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPassword")(name.asInstanceOf[js.Any], password.asInstanceOf[js.Any], service.asInstanceOf[js.Any], defaultRealm.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def initializeClient(service: String): js.Promise[KerberosClient] = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeClient")(service.asInstanceOf[js.Any]).asInstanceOf[js.Promise[KerberosClient]]
  inline def initializeClient(service: String, callback: js.Function2[/* err */ String, /* client */ KerberosClient, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeClient")(service.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def initializeClient(service: String, options: InitializeClientOptions): js.Promise[KerberosClient] = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeClient")(service.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KerberosClient]]
  inline def initializeClient(
    service: String,
    options: InitializeClientOptions,
    callback: js.Function2[/* err */ String, /* client */ KerberosClient, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeClient")(service.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def initializeServer(service: String): js.Promise[KerberosServer] = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeServer")(service.asInstanceOf[js.Any]).asInstanceOf[js.Promise[KerberosServer]]
  inline def initializeServer(service: String, callback: js.Function2[/* err */ String, /* server */ KerberosServer, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeServer")(service.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def principalDetails(service: String, hostname: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("principalDetails")(service.asInstanceOf[js.Any], hostname.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def principalDetails(
    service: String,
    hostname: String,
    callback: js.Function2[/* err */ String, /* details */ String, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("principalDetails")(service.asInstanceOf[js.Any], hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait InitializeClientOptions extends StObject {
    
    /**
      * @description Optional integer used to set GSS flags. (e.g. GSS_C_DELEG_FLAG|GSS_C_MUTUAL_FLAG|GSS_C_SEQUENCE_FLAG will allow for forwarding credentials to the remote host)
      */
    var gssFlag: js.UndefOr[Double] = js.undefined
    
    /**
      * @description Optional GSS mech OID. Defaults to None (GSS_C_NO_OID). Other possible values are `GSS_MECH_OID_KRB5`, `GSS_MECH_OID_SPNEGO`
      */
    var mechOID: js.UndefOr[Double] = js.undefined
    
    /**
      * @description Optional string containing the client principal in the form '`user@realm`'
      */
    var principal: js.UndefOr[String] = js.undefined
  }
  object InitializeClientOptions {
    
    inline def apply(): InitializeClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitializeClientOptions]
    }
    
    extension [Self <: InitializeClientOptions](x: Self) {
      
      inline def setGssFlag(value: Double): Self = StObject.set(x, "gssFlag", value.asInstanceOf[js.Any])
      
      inline def setGssFlagUndefined: Self = StObject.set(x, "gssFlag", js.undefined)
      
      inline def setMechOID(value: Double): Self = StObject.set(x, "mechOID", value.asInstanceOf[js.Any])
      
      inline def setMechOIDUndefined: Self = StObject.set(x, "mechOID", js.undefined)
      
      inline def setPrincipal(value: String): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
      
      inline def setPrincipalUndefined: Self = StObject.set(x, "principal", js.undefined)
    }
  }
  
  trait WrapOptions extends StObject {
    
    /**
      * @description The user to authorize
      */
    var user: js.UndefOr[String] = js.undefined
  }
  object WrapOptions {
    
    inline def apply(): WrapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WrapOptions]
    }
    
    extension [Self <: WrapOptions](x: Self) {
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
}
