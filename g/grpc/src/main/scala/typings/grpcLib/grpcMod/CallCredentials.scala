package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallCredentials extends js.Object {
  /**
    * Creates a new CallCredentials object from properties of both this and
    * another CallCredentials object. This object's metadata generator will be
    * called first.
    * @param callCredentials The other CallCredentials object.
    */
  def compose(callCredentials: CallCredentials): CallCredentials
  /**
    * Asynchronously generates a new Metadata object.
    * @param options Options used in generating the Metadata object.
    */
  def generateMetadata(options: js.Object): js.Promise[Metadata]
}

object CallCredentials {
  @scala.inline
  def apply(
    compose: js.Function1[CallCredentials, CallCredentials],
    generateMetadata: js.Function1[js.Object, js.Promise[Metadata]]
  ): CallCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compose")(compose)
    __obj.updateDynamic("generateMetadata")(generateMetadata)
    __obj.asInstanceOf[CallCredentials]
  }
}

