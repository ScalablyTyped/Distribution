package typings.jackrabbit.jackrabbitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jackrabbitNs {
  import typings.amqplib.propertiesMod.OptionsNs.AssertQueue
  import typings.amqplib.propertiesMod.OptionsNs.Publish
  import typings.jackrabbit.Anon_Key
  import typings.jackrabbit.Anon_KeyKeys

  type AckCallback = js.Function1[/* data */ js.UndefOr[js.Any], Unit]
  type PublishOptions = Publish with Anon_Key
  type QueueOptions = AssertQueue with Anon_KeyKeys
}
