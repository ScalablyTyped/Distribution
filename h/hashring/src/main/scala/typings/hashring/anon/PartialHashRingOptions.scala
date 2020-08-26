package typings.hashring.anon

import typings.hashring.hashringStrings.hash_ring
import typings.hashring.hashringStrings.ketama
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<hashring.hashring.HashRingOptions> */
@js.native
trait PartialHashRingOptions extends js.Object {
  var compatibility: js.UndefOr[hash_ring | ketama] = js.native
  var `default port`: js.UndefOr[Double] = js.native
  var `max cache size`: js.UndefOr[Double] = js.native
  var replicas: js.UndefOr[Double] = js.native
  var `vnode count`: js.UndefOr[Double] = js.native
}

object PartialHashRingOptions {
  @scala.inline
  def apply(): PartialHashRingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHashRingOptions]
  }
  @scala.inline
  implicit class PartialHashRingOptionsOps[Self <: PartialHashRingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompatibility(value: hash_ring | ketama): Self = this.set("compatibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompatibility: Self = this.set("compatibility", js.undefined)
    @scala.inline
    def `setDefault port`(value: Double): Self = this.set("default port", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDefault port`: Self = this.set("default port", js.undefined)
    @scala.inline
    def `setMax cache size`(value: Double): Self = this.set("max cache size", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMax cache size`: Self = this.set("max cache size", js.undefined)
    @scala.inline
    def setReplicas(value: Double): Self = this.set("replicas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicas: Self = this.set("replicas", js.undefined)
    @scala.inline
    def `setVnode count`(value: Double): Self = this.set("vnode count", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteVnode count`: Self = this.set("vnode count", js.undefined)
  }
  
}

