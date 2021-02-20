package typings.istanbulLibSourceMaps

import org.scalablytyped.runtime.StringDictionary
import typings.istanbulLibCoverage.mod.CoverageMap
import typings.istanbulLibSourceMaps.anon.Data
import typings.istanbulLibSourceMaps.anon.PartialMapStoreOptions
import typings.istanbulLibSourceMaps.istanbulLibSourceMapsStrings.file
import typings.istanbulLibSourceMaps.istanbulLibSourceMapsStrings.memory
import typings.sourceMap.mod.RawSourceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("istanbul-lib-source-maps", "SourceStore")
  @js.native
  class SourceStore () extends StObject {
    
    def getSource(filepath: String): String | Null = js.native
    
    def registerSource(filepath: String, sourceText: String): Unit = js.native
  }
  
  @JSImport("istanbul-lib-source-maps", "createSourceMapStore")
  @js.native
  def createSourceMapStore(): MapStore = js.native
  @JSImport("istanbul-lib-source-maps", "createSourceMapStore")
  @js.native
  def createSourceMapStore(options: PartialMapStoreOptions): MapStore = js.native
  
  @js.native
  trait MapStore extends StObject {
    
    def addInputSourceMapsSync(coverageData: js.Any): Unit = js.native
    
    var baseDir: String | Null = js.native
    
    var data: StringDictionary[Data] = js.native
    
    def dispose(): Unit = js.native
    
    def getSourceMapSync(filePath: String): js.Any = js.native
    
    def registerMap(filename: String, sourceMap: RawSourceMap): Unit = js.native
    
    def registerURL(transformedFilePath: String, sourceMapUrl: String): Unit = js.native
    
    def sourceFinder(filePath: String): String = js.native
    
    var sourceStore: SourceStore = js.native
    
    def transformCoverage(coverageMap: CoverageMap): js.Promise[CoverageMap] = js.native
    
    var verbose: Boolean = js.native
  }
  object MapStore {
    
    @scala.inline
    def apply(
      addInputSourceMapsSync: js.Any => Unit,
      data: StringDictionary[Data],
      dispose: () => Unit,
      getSourceMapSync: String => js.Any,
      registerMap: (String, RawSourceMap) => Unit,
      registerURL: (String, String) => Unit,
      sourceFinder: String => String,
      sourceStore: SourceStore,
      transformCoverage: CoverageMap => js.Promise[CoverageMap],
      verbose: Boolean
    ): MapStore = {
      val __obj = js.Dynamic.literal(addInputSourceMapsSync = js.Any.fromFunction1(addInputSourceMapsSync), data = data.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), getSourceMapSync = js.Any.fromFunction1(getSourceMapSync), registerMap = js.Any.fromFunction2(registerMap), registerURL = js.Any.fromFunction2(registerURL), sourceFinder = js.Any.fromFunction1(sourceFinder), sourceStore = sourceStore.asInstanceOf[js.Any], transformCoverage = js.Any.fromFunction1(transformCoverage), verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapStore]
    }
    
    @scala.inline
    implicit class MapStoreMutableBuilder[Self <: MapStore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddInputSourceMapsSync(value: js.Any => Unit): Self = StObject.set(x, "addInputSourceMapsSync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseDirNull: Self = StObject.set(x, "baseDir", null)
      
      @scala.inline
      def setData(value: StringDictionary[Data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSourceMapSync(value: String => js.Any): Self = StObject.set(x, "getSourceMapSync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegisterMap(value: (String, RawSourceMap) => Unit): Self = StObject.set(x, "registerMap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRegisterURL(value: (String, String) => Unit): Self = StObject.set(x, "registerURL", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSourceFinder(value: String => String): Self = StObject.set(x, "sourceFinder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSourceStore(value: SourceStore): Self = StObject.set(x, "sourceStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformCoverage(value: CoverageMap => js.Promise[CoverageMap]): Self = StObject.set(x, "transformCoverage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MapStoreOptions extends StObject {
    
    var baseDir: String = js.native
    
    var sourceStore: memory | file = js.native
    
    var tmpdir: String = js.native
    
    var verbose: Boolean = js.native
  }
  object MapStoreOptions {
    
    @scala.inline
    def apply(baseDir: String, sourceStore: memory | file, tmpdir: String, verbose: Boolean): MapStoreOptions = {
      val __obj = js.Dynamic.literal(baseDir = baseDir.asInstanceOf[js.Any], sourceStore = sourceStore.asInstanceOf[js.Any], tmpdir = tmpdir.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapStoreOptions]
    }
    
    @scala.inline
    implicit class MapStoreOptionsMutableBuilder[Self <: MapStoreOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceStore(value: memory | file): Self = StObject.set(x, "sourceStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTmpdir(value: String): Self = StObject.set(x, "tmpdir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
}
