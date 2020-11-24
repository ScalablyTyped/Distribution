package typings.jestSnapshot.stateMod

import typings.jestSnapshot.typesMod.BabelTraverse
import typings.jestSnapshot.typesMod.Prettier
import typings.jestTypes.configMod.SnapshotUpdateState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotStateOptions extends js.Object {
  
  var expand: js.UndefOr[Boolean] = js.native
  
  def getBabelTraverse(): BabelTraverse = js.native
  
  def getPrettier(): Null | Prettier = js.native
  
  var updateSnapshot: SnapshotUpdateState = js.native
}
object SnapshotStateOptions {
  
  @scala.inline
  def apply(
    getBabelTraverse: () => BabelTraverse,
    getPrettier: () => Null | Prettier,
    updateSnapshot: SnapshotUpdateState
  ): SnapshotStateOptions = {
    val __obj = js.Dynamic.literal(getBabelTraverse = js.Any.fromFunction0(getBabelTraverse), getPrettier = js.Any.fromFunction0(getPrettier), updateSnapshot = updateSnapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotStateOptions]
  }
  
  @scala.inline
  implicit class SnapshotStateOptionsOps[Self <: SnapshotStateOptions] (val x: Self) extends AnyVal {
    
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
    def setGetBabelTraverse(value: () => BabelTraverse): Self = this.set("getBabelTraverse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPrettier(value: () => Null | Prettier): Self = this.set("getPrettier", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateSnapshot(value: SnapshotUpdateState): Self = this.set("updateSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpand(value: Boolean): Self = this.set("expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
  }
}
