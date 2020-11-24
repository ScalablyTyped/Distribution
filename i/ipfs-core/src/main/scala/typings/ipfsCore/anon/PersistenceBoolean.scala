package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersistenceBoolean extends js.Object {
  
  var persistence: Boolean = js.native
}
object PersistenceBoolean {
  
  @scala.inline
  def apply(persistence: Boolean): PersistenceBoolean = {
    val __obj = js.Dynamic.literal(persistence = persistence.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistenceBoolean]
  }
  
  @scala.inline
  implicit class PersistenceBooleanOps[Self <: PersistenceBoolean] (val x: Self) extends AnyVal {
    
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
    def setPersistence(value: Boolean): Self = this.set("persistence", value.asInstanceOf[js.Any])
  }
}
