package typings.k6.experimentalBrowserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardPressOptions
  extends StObject
     with EventSequenceOptions
     with TimeoutOptions {
  
  /**
    * If set to `true` and a navigation occurs from performing this action, it
    * will not wait for it to complete. Defaults to `false`.
    */
  var noWaitAfter: js.UndefOr[Boolean] = js.undefined
}
object KeyboardPressOptions {
  
  inline def apply(): KeyboardPressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardPressOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyboardPressOptions] (val x: Self) extends AnyVal {
    
    inline def setNoWaitAfter(value: Boolean): Self = StObject.set(x, "noWaitAfter", value.asInstanceOf[js.Any])
    
    inline def setNoWaitAfterUndefined: Self = StObject.set(x, "noWaitAfter", js.undefined)
  }
}
