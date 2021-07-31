package typings.hapiPino

import org.scalablytyped.runtime.StringDictionary
import typings.hapiPino.mod.Serializers
import typings.pino.mod.Level
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var level: js.UndefOr[Level | String] = js.undefined
    
    var serializers: js.UndefOr[Serializers] = js.undefined
  }
  object Dictkey {
    
    @scala.inline
    def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: Level | String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setSerializers(value: Serializers): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializersUndefined: Self = StObject.set(x, "serializers", js.undefined)
    }
  }
  
  /* Inlined {[ key in pino.pino.Level ]:? string} */
  trait keyinLevelstring extends StObject {
    
    var debug: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var fatal: js.UndefOr[String] = js.undefined
    
    var info: js.UndefOr[String] = js.undefined
    
    var trace: js.UndefOr[String] = js.undefined
    
    var warn: js.UndefOr[String] = js.undefined
  }
  object keyinLevelstring {
    
    @scala.inline
    def apply(): keyinLevelstring = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[keyinLevelstring]
    }
    
    @scala.inline
    implicit class keyinLevelstringMutableBuilder[Self <: keyinLevelstring] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: String): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFatal(value: String): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFatalUndefined: Self = StObject.set(x, "fatal", js.undefined)
      
      @scala.inline
      def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setTrace(value: String): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
      
      @scala.inline
      def setWarn(value: String): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
}
