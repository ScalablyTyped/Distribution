package typings.googleapis

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
  class Generator () extends StObject {
    def this(options: GeneratorOptions) = this()
    
    /**
      * Clean a string of comment tags.
      * @param str String to process
      * @return Single line string processed
      */
    /* private */ var cleanComments: js.Any = js.native
    
    /* private */ var env: js.Any = js.native
    
    /* private */ var generate: js.Any = js.native
    
    /**
      * Generate API file given discovery URL
      * @param apiDiscoveryUri URL or filename of discovery doc for API
      */
    def generateAPI(apiDiscoveryUrl: String): js.Promise[Unit] = js.native
    
    /**
      * Generate all APIs and write to files.
      */
    def generateAllAPIs(discoveryUrl: String): js.Promise[Unit] = js.native
    
    def generateIndex(metadata: js.Array[Schema]): js.Promise[Unit] = js.native
    
    /**
      * Given a discovery doc, parse it and recursively iterate over the various
      * embedded links.
      */
    /* private */ var getFragmentsForSchema: js.Any = js.native
    
    /* private */ var getPathParams: js.Any = js.native
    
    /* private */ var getSafeParamName: js.Any = js.native
    
    /* private */ var hasResourceParam: js.Any = js.native
    
    /**
      * Log output of generator. Works just like console.log.
      */
    /* private */ var log: js.Any = js.native
    
    /**
      * Write to the state log, which is used for debugging.
      * @param id DiscoveryRestUrl of the endpoint to log
      * @param message
      */
    /* private */ var logResult: js.Any = js.native
    
    /**
      * A multi-line string is turned into one line.
      * @param str String to process
      * @return Single line string processed
      */
    /* private */ var oneLine: js.Any = js.native
    
    /* private */ var options: js.Any = js.native
    
    /**
      * Add a requests to the rate limited queue.
      * @param opts Options to pass to the default transporter
      */
    /* private */ var request: js.Any = js.native
    
    /* private */ var requestQueue: js.Any = js.native
    
    /* private */ var state: js.Any = js.native
    
    /* private */ var transporter: js.Any = js.native
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
}
