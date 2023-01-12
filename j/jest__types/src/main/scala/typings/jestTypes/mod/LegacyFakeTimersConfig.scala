package typings.jestTypes.mod

import typings.jestTypes.jestTypesBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegacyFakeTimersConfig extends StObject {
  
  /**
    * Use the old fake timers implementation instead of one backed by
    * [`@sinonjs/fake-timers`](https://github.com/sinonjs/fake-timers).
    *
    * @defaultValue
    * The default is `false`.
    */
  var legacyFakeTimers: js.UndefOr[`true`] = js.undefined
}
object LegacyFakeTimersConfig {
  
  inline def apply(): LegacyFakeTimersConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegacyFakeTimersConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LegacyFakeTimersConfig] (val x: Self) extends AnyVal {
    
    inline def setLegacyFakeTimers(value: `true`): Self = StObject.set(x, "legacyFakeTimers", value.asInstanceOf[js.Any])
    
    inline def setLegacyFakeTimersUndefined: Self = StObject.set(x, "legacyFakeTimers", js.undefined)
  }
}
