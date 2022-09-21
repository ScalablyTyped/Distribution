package typings.grpc.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object credentials {
  
  @JSImport("grpc", "credentials")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Combine any number of CallCredentials into a single CallCredentials object
    * @param credentials The CallCredentials to compose
    * @return A credentials object that combines all of the input credentials
    */
  inline def combineCallCredentials(credentials: CallCredentials*): CallCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("combineCallCredentials")(credentials.asInstanceOf[Seq[js.Any]]*).asInstanceOf[CallCredentials]
  
  /**
    * Combine a ChannelCredentials with any number of CallCredentials into a single
    * ChannelCredentials object.
    * @param channelCredential The ChannelCredentials to start with
    * @param credentials The CallCredentials to compose
    * @return A credentials object that combines all of the input credentials
    */
  inline def combineChannelCredentials(channelCredential: ChannelCredentials, credentials: CallCredentials*): ChannelCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("combineChannelCredentials")(List(channelCredential.asInstanceOf[js.Any]).`++`(credentials.asInstanceOf[Seq[js.Any]])*).asInstanceOf[ChannelCredentials]
  
  /**
    * Create a gRPC credential from a Google credential object.
    * @param googleCredential The Google credential object to use
    * @return The resulting credentials object
    */
  inline def createFromGoogleCredential(googleCredential: GoogleOAuth2Client): CallCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromGoogleCredential")(googleCredential.asInstanceOf[js.Any]).asInstanceOf[CallCredentials]
  
  /**
    * Create a gRPC credentials object from a metadata generation function. This
    * function gets the service URL and a callback as parameters. The error
    * passed to the callback can optionally have a 'code' value attached to it,
    * which corresponds to a status code that this library uses.
    * @param metadataGenerator The function that generates metadata
    * @return The credentials object
    */
  inline def createFromMetadataGenerator(metadataGenerator: metadataGenerator): CallCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromMetadataGenerator")(metadataGenerator.asInstanceOf[js.Any]).asInstanceOf[CallCredentials]
  
  /**
    * Create an insecure credentials object. This is used to create a channel that
    * does not use SSL. This cannot be composed with anything.
    * @return The insecure credentials object
    */
  inline def createInsecure(): ChannelCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createInsecure")().asInstanceOf[ChannelCredentials]
  
  /**
    * Create an SSL Credentials object. If using a client-side certificate, both
    * the second and third arguments must be passed.
    * @param rootCerts The root certificate data
    * @param privateKey The client certificate private key, if applicable
    * @param certChain The client certificate cert chain, if applicable
    * @param verifyOptions Additional peer verification options, if desired
    * @return The SSL Credentials object
    */
  inline def createSsl(): ChannelCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")().asInstanceOf[ChannelCredentials]
  inline def createSsl(rootCerts: Unit, privateKey: Unit, certChain: Unit, verifyOptions: VerifyOptions): ChannelCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], certChain.asInstanceOf[js.Any], verifyOptions.asInstanceOf[js.Any])).asInstanceOf[ChannelCredentials]
  inline def createSsl(rootCerts: Unit, privateKey: Unit, certChain: Buffer): ChannelCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], certChain.asInstanceOf[js.Any])).asInstanceOf[ChannelCredentials]
  inline def createSsl(rootCerts: Unit, privateKey: Unit, certChain: Buffer, verifyOptions: VerifyOptions): ChannelCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], certChain.asInstanceOf[js.Any], verifyOptions.asInstanceOf[js.Any])).asInstanceOf[ChannelCredentials]
  inline def createSsl(rootCerts: Unit, privateKey: Buffer): ChannelCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[ChannelCredentials]
  inline def createSsl(rootCerts: Unit, privateKey: Buffer, certChain: Unit, verifyOptions: VerifyOptions): ChannelCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], certChain.asInstanceOf[js.Any], verifyOptions.asInstanceOf[js.Any])).asInstanceOf[ChannelCredentials]
  inline def createSsl(rootCerts: Unit, privateKey: Buffer, certChain: Buffer): ChannelCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], certChain.asInstanceOf[js.Any])).asInstanceOf[ChannelCredentials]
  inline def createSsl(rootCerts: Unit, privateKey: Buffer, certChain: Buffer, verifyOptions: VerifyOptions): ChannelCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], certChain.asInstanceOf[js.Any], verifyOptions.asInstanceOf[js.Any])).asInstanceOf[ChannelCredentials]
  inline def createSsl(rootCerts: Buffer): ChannelCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any]).asInstanceOf[ChannelCredentials]
  inline def createSsl(rootCerts: Buffer, privateKey: Unit, certChain: Unit, verifyOptions: VerifyOptions): ChannelCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], certChain.asInstanceOf[js.Any], verifyOptions.asInstanceOf[js.Any])).asInstanceOf[ChannelCredentials]
  inline def createSsl(rootCerts: Buffer, privateKey: Unit, certChain: Buffer): ChannelCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], certChain.asInstanceOf[js.Any])).asInstanceOf[ChannelCredentials]
  inline def createSsl(rootCerts: Buffer, privateKey: Unit, certChain: Buffer, verifyOptions: VerifyOptions): ChannelCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], certChain.asInstanceOf[js.Any], verifyOptions.asInstanceOf[js.Any])).asInstanceOf[ChannelCredentials]
  inline def createSsl(rootCerts: Buffer, privateKey: Buffer): ChannelCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[ChannelCredentials]
  inline def createSsl(rootCerts: Buffer, privateKey: Buffer, certChain: Unit, verifyOptions: VerifyOptions): ChannelCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], certChain.asInstanceOf[js.Any], verifyOptions.asInstanceOf[js.Any])).asInstanceOf[ChannelCredentials]
  inline def createSsl(rootCerts: Buffer, privateKey: Buffer, certChain: Buffer): ChannelCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], certChain.asInstanceOf[js.Any])).asInstanceOf[ChannelCredentials]
  inline def createSsl(rootCerts: Buffer, privateKey: Buffer, certChain: Buffer, verifyOptions: VerifyOptions): ChannelCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], certChain.asInstanceOf[js.Any], verifyOptions.asInstanceOf[js.Any])).asInstanceOf[ChannelCredentials]
}
