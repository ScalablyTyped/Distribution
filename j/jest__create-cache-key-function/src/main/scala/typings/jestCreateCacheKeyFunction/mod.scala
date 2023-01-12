package typings.jestCreateCacheKeyFunction

import typings.jestTypes.mod.ProjectConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jest/create-cache-key-function", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): GetCacheKeyFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[GetCacheKeyFunction]
  inline def default(files: js.Array[String]): GetCacheKeyFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(files.asInstanceOf[js.Any]).asInstanceOf[GetCacheKeyFunction]
  inline def default(files: js.Array[String], values: js.Array[String]): GetCacheKeyFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(files.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[GetCacheKeyFunction]
  inline def default(files: Unit, values: js.Array[String]): GetCacheKeyFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(files.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[GetCacheKeyFunction]
  
  type GetCacheKeyFunction = OldGetCacheKeyFunction | NewGetCacheKeyFunction
  
  trait NewCacheKeyOptions extends StObject {
    
    var config: ProjectConfig
    
    var configString: String
    
    var instrument: Boolean
  }
  object NewCacheKeyOptions {
    
    inline def apply(config: ProjectConfig, configString: String, instrument: Boolean): NewCacheKeyOptions = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], configString = configString.asInstanceOf[js.Any], instrument = instrument.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewCacheKeyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NewCacheKeyOptions] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: ProjectConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigString(value: String): Self = StObject.set(x, "configString", value.asInstanceOf[js.Any])
      
      inline def setInstrument(value: Boolean): Self = StObject.set(x, "instrument", value.asInstanceOf[js.Any])
    }
  }
  
  type NewGetCacheKeyFunction = js.Function3[
    /* sourceText */ String, 
    /* sourcePath */ String, 
    /* options */ NewCacheKeyOptions, 
    String
  ]
  
  trait OldCacheKeyOptions extends StObject {
    
    var config: ProjectConfig
    
    var instrument: Boolean
  }
  object OldCacheKeyOptions {
    
    inline def apply(config: ProjectConfig, instrument: Boolean): OldCacheKeyOptions = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], instrument = instrument.asInstanceOf[js.Any])
      __obj.asInstanceOf[OldCacheKeyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OldCacheKeyOptions] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: ProjectConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setInstrument(value: Boolean): Self = StObject.set(x, "instrument", value.asInstanceOf[js.Any])
    }
  }
  
  type OldGetCacheKeyFunction = js.Function4[
    /* fileData */ String, 
    /* filePath */ String, 
    /* configStr */ String, 
    /* options */ OldCacheKeyOptions, 
    String
  ]
}
