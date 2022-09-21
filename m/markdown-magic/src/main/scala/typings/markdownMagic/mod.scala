package typings.markdownMagic

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(path: String): Unit = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(path: String, config: Unit, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], config.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(path: String, config: Configuration): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(path: String, config: Configuration, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], config.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(path: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(path: js.Array[String], config: Unit, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], config.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(path: js.Array[String], config: Configuration): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(path: js.Array[String], config: Configuration, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], config.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("markdown-magic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Callback = js.Function2[/* error */ js.UndefOr[js.Error], /* output */ js.Array[ProcessedConfig], Unit]
  
  trait Configuration extends StObject {
    
    /**
      * set debug flag to true to inspect the process
      */
    var DEBUG: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Comment pattern to look for & replace inner contents. Default AUTO-GENERATED-CONTENT
      */
    var matchWord: js.UndefOr[String] = js.undefined
    
    /**
      * Change output path of new content. Default behavior is replacing the original file
      */
    var outputDir: js.UndefOr[String] = js.undefined
    
    /**
      * Custom commands to transform block contents, see transforms & custom transforms sections below.
      */
    var transforms: js.UndefOr[StringDictionary[TransformFunction]] = js.undefined
  }
  object Configuration {
    
    inline def apply(): Configuration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Configuration]
    }
    
    extension [Self <: Configuration](x: Self) {
      
      inline def setDEBUG(value: Boolean): Self = StObject.set(x, "DEBUG", value.asInstanceOf[js.Any])
      
      inline def setDEBUGUndefined: Self = StObject.set(x, "DEBUG", js.undefined)
      
      inline def setMatchWord(value: String): Self = StObject.set(x, "matchWord", value.asInstanceOf[js.Any])
      
      inline def setMatchWordUndefined: Self = StObject.set(x, "matchWord", js.undefined)
      
      inline def setOutputDir(value: String): Self = StObject.set(x, "outputDir", value.asInstanceOf[js.Any])
      
      inline def setOutputDirUndefined: Self = StObject.set(x, "outputDir", js.undefined)
      
      inline def setTransforms(value: StringDictionary[TransformFunction]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
      
      inline def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
    }
  }
  
  trait ProcessedConfig
    extends StObject
       with Configuration {
    
    val originalPath: String
    
    val outputContent: String
    
    @JSName("outputDir")
    val outputDir_ProcessedConfig: String
    
    val outputFilePath: String
  }
  object ProcessedConfig {
    
    inline def apply(originalPath: String, outputContent: String, outputDir: String, outputFilePath: String): ProcessedConfig = {
      val __obj = js.Dynamic.literal(originalPath = originalPath.asInstanceOf[js.Any], outputContent = outputContent.asInstanceOf[js.Any], outputDir = outputDir.asInstanceOf[js.Any], outputFilePath = outputFilePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessedConfig]
    }
    
    extension [Self <: ProcessedConfig](x: Self) {
      
      inline def setOriginalPath(value: String): Self = StObject.set(x, "originalPath", value.asInstanceOf[js.Any])
      
      inline def setOutputContent(value: String): Self = StObject.set(x, "outputContent", value.asInstanceOf[js.Any])
      
      inline def setOutputDir(value: String): Self = StObject.set(x, "outputDir", value.asInstanceOf[js.Any])
      
      inline def setOutputFilePath(value: String): Self = StObject.set(x, "outputFilePath", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    *  transform function
    */
  type TransformFunction = js.Function2[/* content */ String, /* options */ Any, String]
}
