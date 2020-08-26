package typings.jointjs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.mod.dia.Paper
import typings.jointjs.mod.dia.Paper.BeforeRenderCallback
import typings.jointjs.mod.dia.Paper.ProgressCallback
import typings.jointjs.mod.dia.Paper.UpdateStats
import typings.jointjs.mod.dia.Paper.ViewportCallback
import typings.jointjs.mod.mvc.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Before extends js.Object {
  var batchSize: js.UndefOr[Double] = js.native
  var before: js.UndefOr[BeforeRenderCallback] = js.native
  var mountBatchSize: js.UndefOr[Double] = js.native
  var progress: js.UndefOr[ProgressCallback] = js.native
  var unmountBatchSize: js.UndefOr[Double] = js.native
  var viewport: js.UndefOr[ViewportCallback] = js.native
}

object Before {
  @scala.inline
  def apply(): Before = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Before]
  }
  @scala.inline
  implicit class BeforeOps[Self <: Before] (val x: Self) extends AnyVal {
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
    def setBatchSize(value: Double): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchSize: Self = this.set("batchSize", js.undefined)
    @scala.inline
    def setBefore(value: (/* opt */ StringDictionary[js.Any], /* paper */ Paper) => scala.Unit): Self = this.set("before", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    @scala.inline
    def setMountBatchSize(value: Double): Self = this.set("mountBatchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMountBatchSize: Self = this.set("mountBatchSize", js.undefined)
    @scala.inline
    def setProgress(
      value: (/* done */ Boolean, /* processed */ Double, /* total */ Double, /* stats */ UpdateStats, /* paper */ Paper) => scala.Unit
    ): Self = this.set("progress", js.Any.fromFunction5(value))
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    @scala.inline
    def setUnmountBatchSize(value: Double): Self = this.set("unmountBatchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnmountBatchSize: Self = this.set("unmountBatchSize", js.undefined)
    @scala.inline
    def setViewport(value: (/* view */ View[js.Any], /* isMounted */ Boolean, /* paper */ Paper) => Boolean): Self = this.set("viewport", js.Any.fromFunction3(value))
    @scala.inline
    def deleteViewport: Self = this.set("viewport", js.undefined)
  }
  
}

