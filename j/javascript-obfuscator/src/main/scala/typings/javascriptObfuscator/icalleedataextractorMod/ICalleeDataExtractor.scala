package typings.javascriptObfuscator.icalleedataextractorMod

import typings.javascriptObfuscator.icalleedataMod.ICalleeData
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalleeDataExtractor extends js.Object {
  /**
    * @param blockScopeBody
    * @param callee
    * @returns ICalleeData|null
    */
  def extract(blockScopeBody: js.Array[Node], callee: Node): ICalleeData | Null
}

object ICalleeDataExtractor {
  @scala.inline
  def apply(extract: (js.Array[Node], Node) => ICalleeData | Null): ICalleeDataExtractor = {
    val __obj = js.Dynamic.literal(extract = js.Any.fromFunction2(extract))
  
    __obj.asInstanceOf[ICalleeDataExtractor]
  }
}

