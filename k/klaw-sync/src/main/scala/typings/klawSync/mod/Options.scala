package typings.klawSync.mod

import typings.klawSync.anon.ReaddirSync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * @description The number of times to recurse before stopping.
    *              -1 for unlimited.
    * @default -1
    * @since v5.0.0
    */
  var depthLimit: js.UndefOr[Double] = js.native
  
  /**
    * @description function that gets one argument fn({path: '', stats: {}}) and returns true to include
    *              or false to exclude the item
    * @since v2.0.0
    */
  var filter: js.UndefOr[Filter] = js.native
  
  /**
    * @description Custom fs, useful when mocking fs object.
    * @default graceful-fs
    * @since v4.0.0
    */
  var fs: js.UndefOr[ReaddirSync] = js.native
  
  /**
    * @description True to only return files (ignore directories).
    *              Defaults to false if not specified.
    * @default false
    */
  var nodir: js.UndefOr[Boolean] = js.native
  
  /**
    * @description True to only return directories (ignore files).
    *              Defaults to false if not specified.
    * @default false
    */
  var nofile: js.UndefOr[Boolean] = js.native
  
  /**
    * @description traverse all subdirectories, regardless of `filter` option.
    *
    * When set to true, traverseAll produces similar behavior to the default
    * behavior prior to `v4.0.0`. The current default of `traverseAll: false`
    * is equivalent to the old `noRecurseOnFailedFilter: true`).
    *
    * @since v6.0.0
    */
  var traverseAll: js.UndefOr[Boolean] = js.native
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
    def setFilter(value: /* item */ Item => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFs(value: ReaddirSync): Self = this.set("fs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFs: Self = this.set("fs", js.undefined)
    
    @scala.inline
    def setNodir(value: Boolean): Self = this.set("nodir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodir: Self = this.set("nodir", js.undefined)
    
    @scala.inline
    def setNofile(value: Boolean): Self = this.set("nofile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNofile: Self = this.set("nofile", js.undefined)
    
    @scala.inline
    def setTraverseAll(value: Boolean): Self = this.set("traverseAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraverseAll: Self = this.set("traverseAll", js.undefined)
  }
}
