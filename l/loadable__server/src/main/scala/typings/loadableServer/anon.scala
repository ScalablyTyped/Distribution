package typings.loadableServer

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Default extends StObject {
    
    var default: ComponentType[js.Object] = js.native
  }
  object Default {
    
    @scala.inline
    def apply(default: ComponentType[js.Object]): Default = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default]
    }
    
    @scala.inline
    implicit class DefaultMutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: ComponentType[js.Object]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Entrypoints extends StObject {
    
    /**
      * Webpack entrypoints to load (default to `["main"]`)
      */
    var entrypoints: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * File system used to read files (default to fs)
      */
    var inputFileSystem: js.UndefOr[js.Object] = js.native
    
    /**
      * Optional namespace in case of multiple apps on same page
      */
    var namespace: js.UndefOr[String] = js.native
    
    /**
      * Optional output path (only for `requireEntrypoint`)
      */
    var outputPath: js.UndefOr[String] = js.native
    
    /**
      * Optional public path to override stats.publicPath at runtime
      */
    var publicPath: js.UndefOr[String] = js.native
  }
  object Entrypoints {
    
    @scala.inline
    def apply(): Entrypoints = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Entrypoints]
    }
    
    @scala.inline
    implicit class EntrypointsMutableBuilder[Self <: Entrypoints] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntrypoints(value: String | js.Array[String]): Self = StObject.set(x, "entrypoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntrypointsUndefined: Self = StObject.set(x, "entrypoints", js.undefined)
      
      @scala.inline
      def setEntrypointsVarargs(value: String*): Self = StObject.set(x, "entrypoints", js.Array(value :_*))
      
      @scala.inline
      def setInputFileSystem(value: js.Object): Self = StObject.set(x, "inputFileSystem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputFileSystemUndefined: Self = StObject.set(x, "inputFileSystem", js.undefined)
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      @scala.inline
      def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
      
      @scala.inline
      def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
    }
  }
  
  @js.native
  trait Stats extends StObject {
    
    /**
      * Stats generated using `@loadable/webpack-plugin`.
      */
    var stats: js.Object = js.native
  }
  object Stats {
    
    @scala.inline
    def apply(stats: js.Object): Stats = {
      val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    @scala.inline
    implicit class StatsMutableBuilder[Self <: Stats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStats(value: js.Object): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StatsFile extends StObject {
    
    /**
      * Stats file path generated using `@loadable/webpack-plugin`
      */
    var statsFile: String = js.native
  }
  object StatsFile {
    
    @scala.inline
    def apply(statsFile: String): StatsFile = {
      val __obj = js.Dynamic.literal(statsFile = statsFile.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatsFile]
    }
    
    @scala.inline
    implicit class StatsFileMutableBuilder[Self <: StatsFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatsFile(value: String): Self = StObject.set(x, "statsFile", value.asInstanceOf[js.Any])
    }
  }
}
