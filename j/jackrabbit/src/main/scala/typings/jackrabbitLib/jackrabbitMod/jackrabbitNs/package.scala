package typings
package jackrabbitLib.jackrabbitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jackrabbitNs {
  type AckCallback = js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit]
  type PublishOptions = amqplibLib.propertiesMod.OptionsNs.Publish with jackrabbitLib.Anon_Key
  type QueueOptions = amqplibLib.propertiesMod.OptionsNs.AssertQueue with jackrabbitLib.Anon_KeyKeys
}
