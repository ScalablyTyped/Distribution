package typings.joi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenameOptions extends StObject {
  
  /**
    * if true, does not delete the old key name, keeping both the new and old keys in place.
    *
    * @default false
    */
  var alias: js.UndefOr[Boolean] = js.undefined
  
  /**
    * if true, skip renaming of a key if it's undefined.
    *
    * @default false
    */
  var ignoreUndefined: js.UndefOr[Boolean] = js.undefined
  
  /**
    * if true, allows renaming multiple keys to the same destination where the last rename wins.
    *
    * @default false
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * if true, allows renaming a key over an existing key.
    *
    * @default false
    */
  var `override`: js.UndefOr[Boolean] = js.undefined
}
object RenameOptions {
  
  inline def apply(): RenameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenameOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenameOptions] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: Boolean): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setIgnoreUndefined(value: Boolean): Self = StObject.set(x, "ignoreUndefined", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUndefinedUndefined: Self = StObject.set(x, "ignoreUndefined", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
  }
}
