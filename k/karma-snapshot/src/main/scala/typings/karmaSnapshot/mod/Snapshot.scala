package typings.karmaSnapshot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * details about snapshot.
  */
@js.native
trait Snapshot extends js.Object {
  
  /**
    * snapshot value that will be checked by an assertion plugin
    */
  var code: String = js.native
  
  /**
    * Flag that should be marked by an assertion plugin when it updates or adds a new snapshot
    */
  var dirty: js.UndefOr[Boolean] = js.native
  
  /**
    * which language should be used in a markdown format to improve readability
    */
  var lang: js.UndefOr[String] = js.native
  
  /**
    * Flag that should be marked by an assertion plugin when it visits suites and snapshots.
    * Visited flags are used to automatically prune removed snapshots
    */
  var visited: js.UndefOr[Boolean] = js.native
}
object Snapshot {
  
  @scala.inline
  def apply(code: String): Snapshot = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Snapshot]
  }
  
  @scala.inline
  implicit class SnapshotOps[Self <: Snapshot] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirty(value: Boolean): Self = this.set("dirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirty: Self = this.set("dirty", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setVisited(value: Boolean): Self = this.set("visited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisited: Self = this.set("visited", js.undefined)
  }
}
