package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelCredentials extends js.Object {
  /**
    * Returns a copy of this object with the included set of per-call credentials
    * expanded to include callCredentials.
    * @param callCredentials A CallCredentials object to associate with this
    * instance.
    */
  def compose(callCredentials: CallCredentials): ChannelCredentials
  /**
    * Gets the set of per-call credentials associated with this instance.
    */
  def getCallCredentials(): CallCredentials
  /**
    * Gets a SecureContext object generated from input parameters if this
    * instance was created with createSsl, or null if this instance was created
    * with createInsecure.
    */
  def getSecureContext(): nodeLib.tlsMod.SecureContext | scala.Null
}

object ChannelCredentials {
  @scala.inline
  def apply(
    compose: CallCredentials => ChannelCredentials,
    getCallCredentials: () => CallCredentials,
    getSecureContext: () => nodeLib.tlsMod.SecureContext | scala.Null
  ): ChannelCredentials = {
    val __obj = js.Dynamic.literal(compose = js.Any.fromFunction1(compose), getCallCredentials = js.Any.fromFunction0(getCallCredentials), getSecureContext = js.Any.fromFunction0(getSecureContext))
  
    __obj.asInstanceOf[ChannelCredentials]
  }
}

