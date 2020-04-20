package typings.istanbulLibSourceMaps.mod

import org.scalablytyped.runtime.StringDictionary
import typings.istanbulLibCoverage.mod.CoverageMap
import typings.istanbulLibSourceMaps.AnonData
import typings.sourceMap.mod.RawSourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapStore extends js.Object {
  var baseDir: String | Null
  var data: StringDictionary[AnonData]
  var sourceStore: SourceStore
  var verbose: Boolean
  def addInputSourceMapsSync(coverageData: js.Any): Unit
  def dispose(): Unit
  def getSourceMapSync(filePath: String): js.Any
  def registerMap(filename: String, sourceMap: RawSourceMap): Unit
  def registerURL(transformedFilePath: String, sourceMapUrl: String): Unit
  def sourceFinder(filePath: String): String
  def transformCoverage(coverageMap: CoverageMap): js.Promise[CoverageMap]
}

object MapStore {
  @scala.inline
  def apply(
    addInputSourceMapsSync: js.Any => Unit,
    data: StringDictionary[AnonData],
    dispose: () => Unit,
    getSourceMapSync: String => js.Any,
    registerMap: (String, RawSourceMap) => Unit,
    registerURL: (String, String) => Unit,
    sourceFinder: String => String,
    sourceStore: SourceStore,
    transformCoverage: CoverageMap => js.Promise[CoverageMap],
    verbose: Boolean,
    baseDir: String = null
  ): MapStore = {
    val __obj = js.Dynamic.literal(addInputSourceMapsSync = js.Any.fromFunction1(addInputSourceMapsSync), data = data.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), getSourceMapSync = js.Any.fromFunction1(getSourceMapSync), registerMap = js.Any.fromFunction2(registerMap), registerURL = js.Any.fromFunction2(registerURL), sourceFinder = js.Any.fromFunction1(sourceFinder), sourceStore = sourceStore.asInstanceOf[js.Any], transformCoverage = js.Any.fromFunction1(transformCoverage), verbose = verbose.asInstanceOf[js.Any])
    if (baseDir != null) __obj.updateDynamic("baseDir")(baseDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapStore]
  }
}

