package typings.atGrpcGrpcDashJs.buildSrcCallDashCredentialsMod

import typings.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/call-credentials", "CallCredentials")
@js.native
abstract class CallCredentials () extends js.Object {
  /**
    * Check whether two call credentials objects are equal. Separate
    * SingleCallCredentials with identical metadata generator functions are
    * equal.
    * @param other The other CallCredentials object to compare with.
    */
  def _equals(other: CallCredentials): Boolean = js.native
  /**
    * Creates a new CallCredentials object from properties of both this and
    * another CallCredentials object. This object's metadata generator will be
    * called first.
    * @param callCredentials The other CallCredentials object.
    */
  def compose(callCredentials: CallCredentials): CallCredentials = js.native
  /**
    * Asynchronously generates a new Metadata object.
    * @param options Options used in generating the Metadata object.
    */
  def generateMetadata(options: CallMetadataOptions): js.Promise[Metadata] = js.native
}

/* static members */
@JSImport("@grpc/grpc-js/build/src/call-credentials", "CallCredentials")
@js.native
object CallCredentials extends js.Object {
  def createEmpty(): CallCredentials = js.native
  /**
    * Creates a new CallCredentials object from a given function that generates
    * Metadata objects.
    * @param metadataGenerator A function that accepts a set of options, and
    * generates a Metadata object based on these options, which is passed back
    * to the caller via a supplied (err, metadata) callback.
    */
  def createFromMetadataGenerator(metadataGenerator: CallMetadataGenerator): CallCredentials = js.native
}

