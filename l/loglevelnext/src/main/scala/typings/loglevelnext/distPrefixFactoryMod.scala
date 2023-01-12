package typings.loglevelnext

import org.scalablytyped.runtime.StringDictionary
import typings.loglevelnext.distLogLevelMod.LogLevel
import typings.loglevelnext.distMethodFactoryMod.MethodFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPrefixFactoryMod {
  
  @JSImport("loglevelnext/dist/PrefixFactory", "PrefixFactory")
  @js.native
  open class PrefixFactory () extends MethodFactory {
    def this(logger: LogLevel) = this()
    def this(logger: Unit, options: PrefixFactoryOptions) = this()
    def this(logger: LogLevel, options: PrefixFactoryOptions) = this()
    
    def interpolate(level: String): String = js.native
    
    /* private */ var options: Any = js.native
  }
  
  trait PrefixFactoryOptions
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[PrefixTemplateFn | String]] {
    
    var level: js.UndefOr[PrefixTemplateFn] = js.undefined
    
    var name: js.UndefOr[PrefixTemplateFn] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
    
    var time: js.UndefOr[PrefixTemplateFn] = js.undefined
  }
  object PrefixFactoryOptions {
    
    inline def apply(): PrefixFactoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrefixFactoryOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrefixFactoryOptions] (val x: Self) extends AnyVal {
      
      inline def setLevel(value: /* options */ PrefixTemplateOptions => String): Self = StObject.set(x, "level", js.Any.fromFunction1(value))
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setName(value: /* options */ PrefixTemplateOptions => String): Self = StObject.set(x, "name", js.Any.fromFunction1(value))
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTime(value: /* options */ PrefixTemplateOptions => String): Self = StObject.set(x, "time", js.Any.fromFunction1(value))
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
  
  type PrefixTemplateFn = js.Function1[/* options */ PrefixTemplateOptions, String]
  
  trait PrefixTemplateOptions extends StObject {
    
    var level: String
    
    var logger: LogLevel
  }
  object PrefixTemplateOptions {
    
    inline def apply(level: String, logger: LogLevel): PrefixTemplateOptions = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrefixTemplateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrefixTemplateOptions] (val x: Self) extends AnyVal {
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLogger(value: LogLevel): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    }
  }
}
