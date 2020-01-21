package typings.jest.mod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transformer extends js.Object {
  var canInstrument: js.UndefOr[Boolean] = js.native
  var createTransformer: js.UndefOr[js.Function1[/* options */ js.Any, this.type]] = js.native
  var getCacheKey: js.UndefOr[
    js.Function4[
      /* fileData */ String, 
      /* filePath */ Path, 
      /* configStr */ String, 
      /* options */ TransformOptions, 
      String
    ]
  ] = js.native
  def process(sourceText: String, sourcePath: Path, config: ProjectConfig): String | TransformedSource = js.native
  def process(sourceText: String, sourcePath: Path, config: ProjectConfig, options: TransformOptions): String | TransformedSource = js.native
}

