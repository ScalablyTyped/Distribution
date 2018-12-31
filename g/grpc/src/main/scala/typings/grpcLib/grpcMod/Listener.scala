package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Listener extends js.Object {
  var onReceiveMessage: js.UndefOr[MessageListener] = js.undefined
  var onReceiveMetadata: js.UndefOr[MetadataListener] = js.undefined
  var onReceiveStatus: js.UndefOr[StatusListener] = js.undefined
}

