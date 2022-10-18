package typings.loglevelnext

import org.scalablytyped.runtime.StringDictionary
import typings.loglevelnext.distMethodFactoryMod.Factory
import typings.loglevelnext.distMethodFactoryMod.UnknownFactoryLevels
import typings.loglevelnext.distPrefixFactoryMod.PrefixFactoryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLogLevelMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - org.scalablytyped.runtime.StObject because Already inherited
  - org.scalablytyped.runtime.StringDictionary because Already inherited */ @JSImport("loglevelnext/dist/LogLevel", "LogLevel")
  @js.native
  open class LogLevel protected ()
    extends StObject
       with LogLevelIndex {
    def this(options: LogLevelOptions) = this()
    
    /* private */ var currentLevel: Any = js.native
    
    def disable(): Unit = js.native
    
    def enable(): Unit = js.native
    
    def factory: Factory = js.native
    def factory_=(factory: Factory): Unit = js.native
    
    def level: Double = js.native
    def level_=(logLevel: SomeLevel): Unit = js.native
    
    def levels: UnknownFactoryLevels = js.native
    
    /* private */ var methodFactory: Any = js.native
    
    var name: String = js.native
    
    /* private */ var options: Any = js.native
    
    var `type`: String = js.native
  }
  
  type LogLevelIndex = StringDictionary[Any]
  
  trait LogLevelOptions extends StObject {
    
    var factory: js.UndefOr[Factory] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var level: js.UndefOr[Double | String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[PrefixFactoryOptions] = js.undefined
  }
  object LogLevelOptions {
    
    inline def apply(): LogLevelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogLevelOptions]
    }
    
    extension [Self <: LogLevelOptions](x: Self) {
      
      inline def setFactory(value: Factory): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
      
      inline def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLevel(value: Double | String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPrefix(value: PrefixFactoryOptions): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  type SomeLevel = Double | String
}
