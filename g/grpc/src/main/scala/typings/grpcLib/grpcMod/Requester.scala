package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Requester extends js.Object {
  var cancel: js.UndefOr[CancelRequester] = js.undefined
  var getPeer: js.UndefOr[GetPeerRequester] = js.undefined
  var halfClose: js.UndefOr[CloseRequester] = js.undefined
  var sendMessage: js.UndefOr[MessageRequester] = js.undefined
  var start: js.UndefOr[MetadataRequester] = js.undefined
}

