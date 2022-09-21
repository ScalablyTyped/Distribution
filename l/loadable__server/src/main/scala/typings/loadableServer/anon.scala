package typings.loadableServer

import typings.loadableServer.mod.ChunkExtractorOptions
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Default extends StObject {
    
    var default: ComponentType[js.Object]
  }
  object Default {
    
    inline def apply(default: ComponentType[js.Object]): Default = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default]
    }
    
    extension [Self <: Default](x: Self) {
      
      inline def setDefault(value: ComponentType[js.Object]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  statsFile :string} & {  entrypoints :string | std.Array<string> | undefined,   outputPath :string | undefined,   publicPath :string | undefined,   namespace :string | undefined,   inputFileSystem :object | undefined} */
  trait statsFilestringentrypoint
    extends StObject
       with ChunkExtractorOptions {
    
    /**
      * Webpack entrypoints to load (default to `["main"]`)
      */
    var entrypoints: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * File system used to read files (default to fs)
      */
    var inputFileSystem: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Optional namespace in case of multiple apps on same page
      */
    var namespace: js.UndefOr[String] = js.undefined
    
    /**
      * Optional output path (only for `requireEntrypoint`)
      */
    var outputPath: js.UndefOr[String] = js.undefined
    
    /**
      * Optional public path to override stats.publicPath at runtime
      */
    var publicPath: js.UndefOr[String] = js.undefined
    
    /**
      * Stats file path generated using `@loadable/webpack-plugin`
      */
    var statsFile: String
  }
  object statsFilestringentrypoint {
    
    inline def apply(statsFile: String): statsFilestringentrypoint = {
      val __obj = js.Dynamic.literal(statsFile = statsFile.asInstanceOf[js.Any])
      __obj.asInstanceOf[statsFilestringentrypoint]
    }
    
    extension [Self <: statsFilestringentrypoint](x: Self) {
      
      inline def setEntrypoints(value: String | js.Array[String]): Self = StObject.set(x, "entrypoints", value.asInstanceOf[js.Any])
      
      inline def setEntrypointsUndefined: Self = StObject.set(x, "entrypoints", js.undefined)
      
      inline def setEntrypointsVarargs(value: String*): Self = StObject.set(x, "entrypoints", js.Array(value*))
      
      inline def setInputFileSystem(value: js.Object): Self = StObject.set(x, "inputFileSystem", value.asInstanceOf[js.Any])
      
      inline def setInputFileSystemUndefined: Self = StObject.set(x, "inputFileSystem", js.undefined)
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
      
      inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      inline def setStatsFile(value: String): Self = StObject.set(x, "statsFile", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  stats :object} & {  entrypoints :string | std.Array<string> | undefined,   outputPath :string | undefined,   publicPath :string | undefined,   namespace :string | undefined,   inputFileSystem :object | undefined} */
  trait statsobjectentrypointsstr
    extends StObject
       with ChunkExtractorOptions {
    
    /**
      * Webpack entrypoints to load (default to `["main"]`)
      */
    var entrypoints: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * File system used to read files (default to fs)
      */
    var inputFileSystem: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Optional namespace in case of multiple apps on same page
      */
    var namespace: js.UndefOr[String] = js.undefined
    
    /**
      * Optional output path (only for `requireEntrypoint`)
      */
    var outputPath: js.UndefOr[String] = js.undefined
    
    /**
      * Optional public path to override stats.publicPath at runtime
      */
    var publicPath: js.UndefOr[String] = js.undefined
    
    /**
      * Stats generated using `@loadable/webpack-plugin`.
      */
    var stats: js.Object
  }
  object statsobjectentrypointsstr {
    
    inline def apply(stats: js.Object): statsobjectentrypointsstr = {
      val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[statsobjectentrypointsstr]
    }
    
    extension [Self <: statsobjectentrypointsstr](x: Self) {
      
      inline def setEntrypoints(value: String | js.Array[String]): Self = StObject.set(x, "entrypoints", value.asInstanceOf[js.Any])
      
      inline def setEntrypointsUndefined: Self = StObject.set(x, "entrypoints", js.undefined)
      
      inline def setEntrypointsVarargs(value: String*): Self = StObject.set(x, "entrypoints", js.Array(value*))
      
      inline def setInputFileSystem(value: js.Object): Self = StObject.set(x, "inputFileSystem", value.asInstanceOf[js.Any])
      
      inline def setInputFileSystemUndefined: Self = StObject.set(x, "inputFileSystem", js.undefined)
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
      
      inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      inline def setStats(value: js.Object): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
}
