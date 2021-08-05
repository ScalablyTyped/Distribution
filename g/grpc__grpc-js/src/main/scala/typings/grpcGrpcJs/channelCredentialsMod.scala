package typings.grpcGrpcJs

import typings.grpcGrpcJs.callCredentialsMod.CallCredentials
import typings.node.Buffer
import typings.node.tlsMod.ConnectionOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object channelCredentialsMod {
  
  @JSImport("@grpc/grpc-js/build/src/channel-credentials", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@grpc/grpc-js/build/src/channel-credentials", "ChannelCredentials")
  @js.native
  /* protected */ abstract class ChannelCredentials () extends StObject {
    /* protected */ def this(callCredentials: CallCredentials) = this()
    
    /**
      * Check whether two channel credentials objects are equal. Two secure
      * credentials are equal if they were constructed with the same parameters.
      * @param other The other ChannelCredentials Object
      */
    def _equals(other: ChannelCredentials): Boolean = js.native
    
    /**
      * Gets the set of per-call credentials associated with this instance.
      */
    def _getCallCredentials(): CallCredentials = js.native
    
    /**
      * Gets a SecureContext object generated from input parameters if this
      * instance was created with createSsl, or null if this instance was created
      * with createInsecure.
      */
    def _getConnectionOptions(): ConnectionOptions | Null = js.native
    
    /**
      * Indicates whether this credentials object creates a secure channel.
      */
    def _isSecure(): Boolean = js.native
    
    /* protected */ var callCredentials: CallCredentials = js.native
    
    /**
      * Returns a copy of this object with the included set of per-call credentials
      * expanded to include callCredentials.
      * @param callCredentials A CallCredentials object to associate with this
      * instance.
      */
    def compose(callCredentials: CallCredentials): ChannelCredentials = js.native
  }
  /* static members */
  object ChannelCredentials {
    
    @JSImport("@grpc/grpc-js/build/src/channel-credentials", "ChannelCredentials")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Return a new ChannelCredentials instance with no credentials.
      */
    inline def createInsecure(): ChannelCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createInsecure")().asInstanceOf[ChannelCredentials]
    
    /**
      * Return a new ChannelCredentials instance with a given set of credentials.
      * The resulting instance can be used to construct a Channel that communicates
      * over TLS.
      * @param rootCerts The root certificate data.
      * @param privateKey The client certificate private key, if available.
      * @param certChain The client certificate key chain, if available.
      */
    inline def createSsl(
      rootCerts: js.UndefOr[Buffer | Null],
      privateKey: js.UndefOr[Buffer | Null],
      certChain: js.UndefOr[Buffer | Null],
      verifyOptions: js.UndefOr[VerifyOptions]
    ): ChannelCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], certChain.asInstanceOf[js.Any], verifyOptions.asInstanceOf[js.Any])).asInstanceOf[ChannelCredentials]
  }
  
  inline def createGoogleDefaultCredentials(): ChannelCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createGoogleDefaultCredentials")().asInstanceOf[ChannelCredentials]
  
  trait Certificate extends StObject {
    
    /**
      * The raw certificate in DER form.
      */
    var raw: Buffer
  }
  object Certificate {
    
    inline def apply(raw: Buffer): Certificate = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Certificate]
    }
    
    extension [Self <: Certificate](x: Self) {
      
      inline def setRaw(value: Buffer): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
  
  type CheckServerIdentityCallback = js.Function2[/* hostname */ String, /* cert */ Certificate, js.UndefOr[Error]]
  
  trait VerifyOptions extends StObject {
    
    /**
      * If set, this callback will be invoked after the usual hostname verification
      * has been performed on the peer certificate.
      */
    var checkServerIdentity: js.UndefOr[CheckServerIdentityCallback] = js.undefined
  }
  object VerifyOptions {
    
    inline def apply(): VerifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerifyOptions]
    }
    
    extension [Self <: VerifyOptions](x: Self) {
      
      inline def setCheckServerIdentity(value: (/* hostname */ String, /* cert */ Certificate) => js.UndefOr[Error]): Self = StObject.set(x, "checkServerIdentity", js.Any.fromFunction2(value))
      
      inline def setCheckServerIdentityUndefined: Self = StObject.set(x, "checkServerIdentity", js.undefined)
    }
  }
}
