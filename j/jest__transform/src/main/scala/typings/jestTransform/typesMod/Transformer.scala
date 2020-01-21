package typings.jestTransform.typesMod

import typings.jestTypes.configMod.Path
import typings.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transformer extends js.Object {
  var canInstrument: js.UndefOr[Boolean] = js.native
  var createTransformer: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Transformer]] = js.native
  def getCacheKey(fileData: String, filePath: Path, configStr: String, options: CacheKeyOptions): String = js.native
  def process(sourceText: String, sourcePath: Path, config: ProjectConfig): String | TransformedSource = js.native
  def process(sourceText: String, sourcePath: Path, config: ProjectConfig, options: TransformOptions): String | TransformedSource = js.native
}

