package typings.karma.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseOptions extends StObject {
  
  /**
    * When true, the return value of the function is a Promise of Config instead of Config.
    * Should be set to true to support async Karma configuration file.
    *
    * @deprecated Will become a default in the next major release.
    */
  var promiseConfig: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When true, function will throw error or return rejected Promise instead of calling process.exit(1).
    *
    * @deprecated Will become a default in the next major release.
    */
  var throwErrors: js.UndefOr[Boolean] = js.undefined
}
object ParseOptions {
  
  inline def apply(): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions]
  }
  
  extension [Self <: ParseOptions](x: Self) {
    
    inline def setPromiseConfig(value: Boolean): Self = StObject.set(x, "promiseConfig", value.asInstanceOf[js.Any])
    
    inline def setPromiseConfigUndefined: Self = StObject.set(x, "promiseConfig", js.undefined)
    
    inline def setThrowErrors(value: Boolean): Self = StObject.set(x, "throwErrors", value.asInstanceOf[js.Any])
    
    inline def setThrowErrorsUndefined: Self = StObject.set(x, "throwErrors", js.undefined)
  }
}
