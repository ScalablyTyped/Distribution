package typings
package jestLib.jestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transformer extends js.Object {
  var canInstrument: js.UndefOr[scala.Boolean] = js.native
  var createTransformer: js.UndefOr[js.Function1[/* options */ js.Any, this.type]] = js.native
  var getCacheKey: js.UndefOr[
    js.Function4[
      /* fileData */ java.lang.String, 
      /* filePath */ Path, 
      /* configStr */ java.lang.String, 
      /* options */ TransformOptions, 
      java.lang.String
    ]
  ] = js.native
  def process(sourceText: java.lang.String, sourcePath: Path, config: ProjectConfig): java.lang.String | TransformedSource = js.native
  def process(sourceText: java.lang.String, sourcePath: Path, config: ProjectConfig, options: TransformOptions): java.lang.String | TransformedSource = js.native
}

