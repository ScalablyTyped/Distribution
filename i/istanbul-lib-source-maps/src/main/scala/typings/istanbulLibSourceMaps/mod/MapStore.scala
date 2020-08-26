package typings.istanbulLibSourceMaps.mod

import org.scalablytyped.runtime.StringDictionary
import typings.istanbulLibCoverage.mod.CoverageMap
import typings.istanbulLibSourceMaps.anon.Data
import typings.sourceMap.mod.RawSourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapStore extends js.Object {
  var baseDir: String | Null = js.native
  var data: StringDictionary[Data] = js.native
  var sourceStore: SourceStore = js.native
  var verbose: Boolean = js.native
  def addInputSourceMapsSync(coverageData: js.Any): Unit = js.native
  def dispose(): Unit = js.native
  def getSourceMapSync(filePath: String): js.Any = js.native
  def registerMap(filename: String, sourceMap: RawSourceMap): Unit = js.native
  def registerURL(transformedFilePath: String, sourceMapUrl: String): Unit = js.native
  def sourceFinder(filePath: String): String = js.native
  def transformCoverage(coverageMap: CoverageMap): js.Promise[CoverageMap] = js.native
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
  implicit class MapStoreOps[Self <: MapStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddInputSourceMapsSync(value: js.Any => Unit): Self = this.set("addInputSourceMapsSync", js.Any.fromFunction1(value))
    @scala.inline
    def setData(value: StringDictionary[Data]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSourceMapSync(value: String => js.Any): Self = this.set("getSourceMapSync", js.Any.fromFunction1(value))
    @scala.inline
    def setRegisterMap(value: (String, RawSourceMap) => Unit): Self = this.set("registerMap", js.Any.fromFunction2(value))
    @scala.inline
    def setRegisterURL(value: (String, String) => Unit): Self = this.set("registerURL", js.Any.fromFunction2(value))
    @scala.inline
    def setSourceFinder(value: String => String): Self = this.set("sourceFinder", js.Any.fromFunction1(value))
    @scala.inline
    def setSourceStore(value: SourceStore): Self = this.set("sourceStore", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformCoverage(value: CoverageMap => js.Promise[CoverageMap]): Self = this.set("transformCoverage", js.Any.fromFunction1(value))
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseDir(value: String): Self = this.set("baseDir", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseDirNull: Self = this.set("baseDir", null)
  }
  
}

