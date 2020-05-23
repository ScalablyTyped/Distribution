package typings.hashring.anon

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
    `default port`: js.UndefOr[Double] = js.undefined,
    `max cache size`: js.UndefOr[Double] = js.undefined,
    replicas: js.UndefOr[Double] = js.undefined,
    `vnode count`: js.UndefOr[Double] = js.undefined
  ): PartialHashRingOptions = {
    val __obj = js.Dynamic.literal()
    if (compatibility != null) __obj.updateDynamic("compatibility")(compatibility.asInstanceOf[js.Any])
    if (!js.isUndefined(`default port`)) __obj.updateDynamic("default port")(((`default port`).get).asInstanceOf[js.Any])
    if (!js.isUndefined(`max cache size`)) __obj.updateDynamic("max cache size")(((`max cache size`).get).asInstanceOf[js.Any])
    if (!js.isUndefined(replicas)) __obj.updateDynamic("replicas")(replicas.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`vnode count`)) __obj.updateDynamic("vnode count")(((`vnode count`).get).asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialHashRingOptions]
  }
}

