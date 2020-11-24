package typings.klaw.mod

import typings.node.streamMod.ReadableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends ReadableOptions {
  
  var depthLimit: js.UndefOr[Double] = js.native
  
  // fs or mock-fs
  var filter: js.UndefOr[js.Function1[/* path */ String, Boolean]] = js.native
  
  var fs: js.UndefOr[js.Any] = js.native
  
  var pathSorter: js.UndefOr[js.Function2[/* pathA */ String, /* pathB */ String, Double]] = js.native
  
  var preserveSymlinks: js.UndefOr[Boolean] = js.native
  
  var queueMethod: js.UndefOr[QueueMethod] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setDepthLimit(value: Double): Self = this.set("depthLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepthLimit: Self = this.set("depthLimit", js.undefined)
    
    @scala.inline
    def setFilter(value: /* path */ String => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFs(value: js.Any): Self = this.set("fs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFs: Self = this.set("fs", js.undefined)
    
    @scala.inline
    def setPathSorter(value: (/* pathA */ String, /* pathB */ String) => Double): Self = this.set("pathSorter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePathSorter: Self = this.set("pathSorter", js.undefined)
    
    @scala.inline
    def setPreserveSymlinks(value: Boolean): Self = this.set("preserveSymlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveSymlinks: Self = this.set("preserveSymlinks", js.undefined)
    
    @scala.inline
    def setQueueMethod(value: QueueMethod): Self = this.set("queueMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueueMethod: Self = this.set("queueMethod", js.undefined)
  }
}
