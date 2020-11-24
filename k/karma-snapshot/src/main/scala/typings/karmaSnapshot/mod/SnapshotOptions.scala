package typings.karmaSnapshot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotOptions extends js.Object {
  
  /**
    * Checks existince of the source file associated with tests
    * @default false
    */
  var checkSourceFile: js.UndefOr[Boolean] = js.native
  
  /**
    * Snapshot format
    * @default 'md'
    */
  var format: js.UndefOr[String | SnapshotSerializer] = js.native
  
  /**
    * Limit number of unused snapshots reported in the warning.
    * `-1` means unlimited.
    * @default -1
    */
  var limitUnusedSnapshotsInWarning: js.UndefOr[Double] = js.native
  
  /**
    * Custom path resolver
    */
  var pathResolver: js.UndefOr[SnapshotPathResolver] = js.native
  
  /**
    * Prune unused snapshots
    * @default false
    */
  var prune: js.UndefOr[Boolean] = js.native
  
  /**
    * Run snapshot tests in UPDATE mode
    * @default false
    */
  var update: js.UndefOr[Boolean] = js.native
}
object SnapshotOptions {
  
  @scala.inline
  def apply(): SnapshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotOptions]
  }
  
  @scala.inline
  implicit class SnapshotOptionsOps[Self <: SnapshotOptions] (val x: Self) extends AnyVal {
    
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
    def setCheckSourceFile(value: Boolean): Self = this.set("checkSourceFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckSourceFile: Self = this.set("checkSourceFile", js.undefined)
    
    @scala.inline
    def setFormat(value: String | SnapshotSerializer): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setLimitUnusedSnapshotsInWarning(value: Double): Self = this.set("limitUnusedSnapshotsInWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitUnusedSnapshotsInWarning: Self = this.set("limitUnusedSnapshotsInWarning", js.undefined)
    
    @scala.inline
    def setPathResolver(value: (/* basePath */ String, /* suiteName */ String) => String): Self = this.set("pathResolver", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePathResolver: Self = this.set("pathResolver", js.undefined)
    
    @scala.inline
    def setPrune(value: Boolean): Self = this.set("prune", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrune: Self = this.set("prune", js.undefined)
    
    @scala.inline
    def setUpdate(value: Boolean): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
}
