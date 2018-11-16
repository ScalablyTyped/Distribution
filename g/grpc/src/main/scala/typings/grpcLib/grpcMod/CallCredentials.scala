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
  def generateMetadata(options: js.Object): stdLib.Promise[Metadata]
}

