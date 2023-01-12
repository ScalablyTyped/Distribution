package typings.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistenceInsertOptions extends StObject {
  
  var deepInsert: js.UndefOr[Boolean] = js.undefined
  
  var onConflictIgnore: js.UndefOr[Boolean] = js.undefined
}
object PersistenceInsertOptions {
  
  inline def apply(): PersistenceInsertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistenceInsertOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PersistenceInsertOptions] (val x: Self) extends AnyVal {
    
    inline def setDeepInsert(value: Boolean): Self = StObject.set(x, "deepInsert", value.asInstanceOf[js.Any])
    
    inline def setDeepInsertUndefined: Self = StObject.set(x, "deepInsert", js.undefined)
    
    inline def setOnConflictIgnore(value: Boolean): Self = StObject.set(x, "onConflictIgnore", value.asInstanceOf[js.Any])
    
    inline def setOnConflictIgnoreUndefined: Self = StObject.set(x, "onConflictIgnore", js.undefined)
  }
}
