package typings.karmaMocha

import org.scalablytyped.runtime.StringDictionary
import typings.karmaMocha.karmaMochaBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @js.native
  trait ClientOptions extends StObject {
    
    var mocha: js.UndefOr[MochaClientOptions] = js.native
  }
  object ClientOptions {
    
    @scala.inline
    def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMocha(value: MochaClientOptions): Self = StObject.set(x, "mocha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMochaUndefined: Self = StObject.set(x, "mocha", js.undefined)
    }
  }
  
  @js.native
  trait MochaClientOptions
    extends /** any supported Mocha configuration options */
  /* key */ StringDictionary[js.Any] {
    
    /** This will be exposed in a reporter as `result.mocha.{exportedValue}` */
    var export: js.UndefOr[js.Array[String]] = js.native
    
    /** You can set opts to equal true then plugin will load opts from default location 'test/mocha.opts' */
    var opts: js.UndefOr[`true` | String] = js.native
  }
  object MochaClientOptions {
    
    @scala.inline
    def apply(): MochaClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MochaClientOptions]
    }
    
    @scala.inline
    implicit class MochaClientOptionsMutableBuilder[Self <: MochaClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExport(value: js.Array[String]): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
      
      @scala.inline
      def setExportVarargs(value: String*): Self = StObject.set(x, "export", js.Array(value :_*))
      
      @scala.inline
      def setOpts(value: `true` | String): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
    }
  }
}
