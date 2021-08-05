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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("istanbul-lib-source-maps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("istanbul-lib-source-maps", "SourceStore")
  @js.native
  class SourceStore () extends StObject {
    
    def getSource(filepath: String): String | Null = js.native
    
    def registerSource(filepath: String, sourceText: String): Unit = js.native
  }
  
  inline def createSourceMapStore(): MapStore = ^.asInstanceOf[js.Dynamic].applyDynamic("createSourceMapStore")().asInstanceOf[MapStore]
  inline def createSourceMapStore(options: PartialMapStoreOptions): MapStore = ^.asInstanceOf[js.Dynamic].applyDynamic("createSourceMapStore")(options.asInstanceOf[js.Any]).asInstanceOf[MapStore]
  
  trait MapStore extends StObject {
    
    def addInputSourceMapsSync(coverageData: js.Any): Unit
    
    var baseDir: String | Null
    
    var data: StringDictionary[Data]
    
    def dispose(): Unit
    
    def getSourceMapSync(filePath: String): js.Any
    
    def registerMap(filename: String, sourceMap: RawSourceMap): Unit
    
    def registerURL(transformedFilePath: String, sourceMapUrl: String): Unit
    
    def sourceFinder(filePath: String): String
    
    var sourceStore: SourceStore
    
    def transformCoverage(coverageMap: CoverageMap): js.Promise[CoverageMap]
    
    var verbose: Boolean
  }
  object MapStore {
    
    inline def apply(
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
      val __obj = js.Dynamic.literal(addInputSourceMapsSync = js.Any.fromFunction1(addInputSourceMapsSync), data = data.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), getSourceMapSync = js.Any.fromFunction1(getSourceMapSync), registerMap = js.Any.fromFunction2(registerMap), registerURL = js.Any.fromFunction2(registerURL), sourceFinder = js.Any.fromFunction1(sourceFinder), sourceStore = sourceStore.asInstanceOf[js.Any], transformCoverage = js.Any.fromFunction1(transformCoverage), verbose = verbose.asInstanceOf[js.Any], baseDir = null)
      __obj.asInstanceOf[MapStore]
    }
    
    extension [Self <: MapStore](x: Self) {
      
      inline def setAddInputSourceMapsSync(value: js.Any => Unit): Self = StObject.set(x, "addInputSourceMapsSync", js.Any.fromFunction1(value))
      
      inline def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
      
      inline def setBaseDirNull: Self = StObject.set(x, "baseDir", null)
      
      inline def setData(value: StringDictionary[Data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      inline def setGetSourceMapSync(value: String => js.Any): Self = StObject.set(x, "getSourceMapSync", js.Any.fromFunction1(value))
      
      inline def setRegisterMap(value: (String, RawSourceMap) => Unit): Self = StObject.set(x, "registerMap", js.Any.fromFunction2(value))
      
      inline def setRegisterURL(value: (String, String) => Unit): Self = StObject.set(x, "registerURL", js.Any.fromFunction2(value))
      
      inline def setSourceFinder(value: String => String): Self = StObject.set(x, "sourceFinder", js.Any.fromFunction1(value))
      
      inline def setSourceStore(value: SourceStore): Self = StObject.set(x, "sourceStore", value.asInstanceOf[js.Any])
      
      inline def setTransformCoverage(value: CoverageMap => js.Promise[CoverageMap]): Self = StObject.set(x, "transformCoverage", js.Any.fromFunction1(value))
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  trait MapStoreOptions extends StObject {
    
    var baseDir: String
    
    var sourceStore: memory | file
    
    var tmpdir: String
    
    var verbose: Boolean
  }
  object MapStoreOptions {
    
    inline def apply(baseDir: String, sourceStore: memory | file, tmpdir: String, verbose: Boolean): MapStoreOptions = {
      val __obj = js.Dynamic.literal(baseDir = baseDir.asInstanceOf[js.Any], sourceStore = sourceStore.asInstanceOf[js.Any], tmpdir = tmpdir.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapStoreOptions]
    }
    
    extension [Self <: MapStoreOptions](x: Self) {
      
      inline def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
      
      inline def setSourceStore(value: memory | file): Self = StObject.set(x, "sourceStore", value.asInstanceOf[js.Any])
      
      inline def setTmpdir(value: String): Self = StObject.set(x, "tmpdir", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
}
