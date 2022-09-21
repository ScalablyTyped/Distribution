package typings.googleapis

import typings.googleapis.downloadMod.ChangeSet
import typings.googleapisCommon.schemaMod.Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generatorMod {
  
  @JSImport("googleapis/build/src/generator/generator", "Generator")
  @js.native
  /**
    * Generator for generating API endpoints
    * @param options Options for generation
    */
  open class Generator () extends StObject {
    def this(options: GeneratorOptions) = this()
    
    /* private */ var env: Any = js.native
    
    /* private */ var generate: Any = js.native
    
    /**
      * Generate API file given discovery URL
      * @param apiDiscoveryUri URL or filename of discovery doc for API
      */
    def generateAPI(apiDiscoveryUrl: String): js.Promise[String] = js.native
    
    /**
      * Generate all APIs and write to files.
      */
    def generateAllAPIs(discoveryUrl: String, useCache: Boolean): js.Promise[js.Array[ChangeSet]] = js.native
    
    def generateIndex(metadata: js.Array[Schema]): js.Promise[Unit] = js.native
    def generateIndex(metadata: js.Array[Schema], directory: String): js.Promise[Unit] = js.native
    
    def generateReleasePleaseConfig(): js.Promise[Unit] = js.native
    
    def getPkgPathAndData(apisPath: String, file: String, desc: String): js.Promise[js.Tuple2[String, PkgData]] = js.native
    def getPkgPathAndData(apisPath: String, file: String, desc: String, defaultVersion: String): js.Promise[js.Tuple2[String, PkgData]] = js.native
    
    /**
      * Log output of generator. Works just like console.log.
      */
    /* private */ var log: Any = js.native
    
    /**
      * Write to the state log, which is used for debugging.
      * @param id DiscoveryRestUrl of the endpoint to log
      * @param message
      */
    /* private */ var logResult: Any = js.native
    
    /* private */ var options: Any = js.native
    
    /**
      * Render a nunjucks template, format it, and write to disk
      */
    /* private */ var render: Any = js.native
    
    /* private */ var state: Any = js.native
  }
  
  trait GeneratorOptions extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var includePrivate: js.UndefOr[Boolean] = js.undefined
  }
  object GeneratorOptions {
    
    inline def apply(): GeneratorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeneratorOptions]
    }
    
    extension [Self <: GeneratorOptions](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setIncludePrivate(value: Boolean): Self = StObject.set(x, "includePrivate", value.asInstanceOf[js.Any])
      
      inline def setIncludePrivateUndefined: Self = StObject.set(x, "includePrivate", js.undefined)
    }
  }
  
  trait PkgData extends StObject {
    
    var desc: String
    
    var name: String
    
    var version: String
  }
  object PkgData {
    
    inline def apply(desc: String, name: String, version: String): PkgData = {
      val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PkgData]
    }
    
    extension [Self <: PkgData](x: Self) {
      
      inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
