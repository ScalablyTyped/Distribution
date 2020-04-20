package typings.hashring

import typings.hashring.hashringStrings.hash_ring
import typings.hashring.hashringStrings.ketama
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<hashring.hashring.HashRingOptions> */
trait PartialHashRingOptions extends js.Object {
  var compatibility: js.UndefOr[hash_ring | ketama] = js.undefined
  var `default port`: js.UndefOr[Double] = js.undefined
  var `max cache size`: js.UndefOr[Double] = js.undefined
  var replicas: js.UndefOr[Double] = js.undefined
  var `vnode count`: js.UndefOr[Double] = js.undefined
}

object PartialHashRingOptions {
  @scala.inline
  def apply(
    compatibility: hash_ring | ketama = null,
    `default port`: Int | Double = null,
    `max cache size`: Int | Double = null,
    replicas: Int | Double = null,
    `vnode count`: Int | Double = null
  ): PartialHashRingOptions = {
    val __obj = js.Dynamic.literal()
    if (compatibility != null) __obj.updateDynamic("compatibility")(compatibility.asInstanceOf[js.Any])
    if (`default port` != null) __obj.updateDynamic("default port")((`default port`).asInstanceOf[js.Any])
    if (`max cache size` != null) __obj.updateDynamic("max cache size")((`max cache size`).asInstanceOf[js.Any])
    if (replicas != null) __obj.updateDynamic("replicas")(replicas.asInstanceOf[js.Any])
    if (`vnode count` != null) __obj.updateDynamic("vnode count")((`vnode count`).asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialHashRingOptions]
  }
}

