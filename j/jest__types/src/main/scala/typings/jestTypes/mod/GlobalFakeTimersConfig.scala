package typings.jestTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalFakeTimersConfig extends StObject {
  
  /**
    * Whether fake timers should be enabled globally for all test files.
    *
    * @defaultValue
    * The default is `false`.
    */
  var enableGlobally: js.UndefOr[Boolean] = js.undefined
}
object GlobalFakeTimersConfig {
  
  inline def apply(): GlobalFakeTimersConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalFakeTimersConfig]
  }
  
  extension [Self <: GlobalFakeTimersConfig](x: Self) {
    
    inline def setEnableGlobally(value: Boolean): Self = StObject.set(x, "enableGlobally", value.asInstanceOf[js.Any])
    
    inline def setEnableGloballyUndefined: Self = StObject.set(x, "enableGlobally", js.undefined)
  }
}
