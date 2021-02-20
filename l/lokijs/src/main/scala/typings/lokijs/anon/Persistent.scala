package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Persistent extends StObject {
  
  var persistent: js.UndefOr[Boolean] = js.native
  
  var suppressRebuildEvent: js.UndefOr[Boolean] = js.native
}
object Persistent {
  
  @scala.inline
  def apply(): Persistent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Persistent]
  }
  
  @scala.inline
  implicit class PersistentMutableBuilder[Self <: Persistent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    
    @scala.inline
    def setSuppressRebuildEvent(value: Boolean): Self = StObject.set(x, "suppressRebuildEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressRebuildEventUndefined: Self = StObject.set(x, "suppressRebuildEvent", js.undefined)
  }
}
