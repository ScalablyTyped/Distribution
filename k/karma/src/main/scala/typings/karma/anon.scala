package typings.karma

import typings.karma.karmaBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined karma.karma.ParseOptions & {  promiseConfig :true} */
  trait ParseOptionspromiseConfig extends StObject {
    
    /**
      * When true, the return value of the function is a Promise of Config instead of Config.
      * Should be set to true to support async Karma configuration file.
      *
      * @deprecated Will become a default in the next major release.
      */
    var promiseConfig: js.UndefOr[Boolean] & `true`
    
    /**
      * When true, function will throw error or return rejected Promise instead of calling process.exit(1).
      *
      * @deprecated Will become a default in the next major release.
      */
    var throwErrors: js.UndefOr[Boolean] = js.undefined
  }
  object ParseOptionspromiseConfig {
    
    inline def apply(promiseConfig: js.UndefOr[Boolean] & `true`): ParseOptionspromiseConfig = {
      val __obj = js.Dynamic.literal(promiseConfig = promiseConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseOptionspromiseConfig]
    }
    
    extension [Self <: ParseOptionspromiseConfig](x: Self) {
      
      inline def setPromiseConfig(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "promiseConfig", value.asInstanceOf[js.Any])
      
      inline def setThrowErrors(value: Boolean): Self = StObject.set(x, "throwErrors", value.asInstanceOf[js.Any])
      
      inline def setThrowErrorsUndefined: Self = StObject.set(x, "throwErrors", js.undefined)
    }
  }
  
  trait Pattern extends StObject {
    
    var pattern: String
    
    var `type`: String
  }
  object Pattern {
    
    inline def apply(pattern: String, `type`: String): Pattern = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pattern]
    }
    
    extension [Self <: Pattern](x: Self) {
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
