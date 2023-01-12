package typings.karmaMocha

import org.scalablytyped.runtime.StringDictionary
import typings.karmaMocha.karmaMochaBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object karmaMod {
  
  trait ClientOptions extends StObject {
    
    var mocha: js.UndefOr[MochaClientOptions] = js.undefined
  }
  object ClientOptions {
    
    inline def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      inline def setMocha(value: MochaClientOptions): Self = StObject.set(x, "mocha", value.asInstanceOf[js.Any])
      
      inline def setMochaUndefined: Self = StObject.set(x, "mocha", js.undefined)
    }
  }
  
  trait MochaClientOptions
    extends StObject
       with /** any supported Mocha configuration options */
  /* key */ StringDictionary[Any] {
    
    /** This will be exposed in a reporter as `result.mocha.{exportedValue}` */
    var `export`: js.UndefOr[js.Array[String]] = js.undefined
    
    /** You can set opts to equal true then plugin will load opts from default location 'test/mocha.opts' */
    var opts: js.UndefOr[`true` | String] = js.undefined
  }
  object MochaClientOptions {
    
    inline def apply(): MochaClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MochaClientOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MochaClientOptions] (val x: Self) extends AnyVal {
      
      inline def setExport(value: js.Array[String]): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
      
      inline def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
      
      inline def setExportVarargs(value: String*): Self = StObject.set(x, "export", js.Array(value*))
      
      inline def setOpts(value: `true` | String): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      inline def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
    }
  }
}
