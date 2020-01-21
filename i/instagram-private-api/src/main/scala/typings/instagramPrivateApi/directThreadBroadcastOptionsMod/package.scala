package typings.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object directThreadBroadcastOptionsMod {
  type DirectThreadBroadcastOptions = typings.instagramPrivateApi.directThreadBroadcastOptionsMod.DirectTreadBroadcastBaseOptions with (typings.tsXor.xorTypeMod.XOR[
    typings.instagramPrivateApi.directThreadBroadcastOptionsMod.ExistingThreadOptions, 
    typings.instagramPrivateApi.directThreadBroadcastOptionsMod.CreateThreadOptions
  ])
}
