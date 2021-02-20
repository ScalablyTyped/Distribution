package typings.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersistenceInsertOptions extends StObject {
  
  var deepInsert: js.UndefOr[Boolean] = js.native
  
  var onConflictIgnore: js.UndefOr[Boolean] = js.native
}
object PersistenceInsertOptions {
  
  @scala.inline
  def apply(): PersistenceInsertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistenceInsertOptions]
  }
  
  @scala.inline
  implicit class PersistenceInsertOptionsMutableBuilder[Self <: PersistenceInsertOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeepInsert(value: Boolean): Self = StObject.set(x, "deepInsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeepInsertUndefined: Self = StObject.set(x, "deepInsert", js.undefined)
    
    @scala.inline
    def setOnConflictIgnore(value: Boolean): Self = StObject.set(x, "onConflictIgnore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnConflictIgnoreUndefined: Self = StObject.set(x, "onConflictIgnore", js.undefined)
  }
}
