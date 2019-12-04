package typings.javascriptDashObfuscator.srcInterfacesAnalyzersIAnalyzerMod

import typings.javascriptDashObfuscator.srcTypesTObjectMod.TObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnalyzer extends js.Object {
  /**
    * @param {Program} astTree
    * @returns {TObject[]}
    */
  def analyze(
    astTree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ESTree.Program */ js.Any
  ): js.Array[TObject[_]]
}

object IAnalyzer {
  @scala.inline
  def apply(
    analyze: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ESTree.Program */ js.Any => js.Array[TObject[_]]
  ): IAnalyzer = {
    val __obj = js.Dynamic.literal(analyze = js.Any.fromFunction1(analyze))
  
    __obj.asInstanceOf[IAnalyzer]
  }
}

