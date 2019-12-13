package typings.javascriptDashObfuscator.srcInterfacesAnalyzersIAnalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnalyzer[T] extends js.Object {
  /**
    * @param {Program} astTree
    * @returns {T[]}
    */
  def analyze(
    astTree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ESTree.Program */ js.Any
  ): js.Array[T]
}

object IAnalyzer {
  @scala.inline
  def apply[T](
    analyze: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ESTree.Program */ js.Any => js.Array[T]
  ): IAnalyzer[T] = {
    val __obj = js.Dynamic.literal(analyze = js.Any.fromFunction1(analyze))
  
    __obj.asInstanceOf[IAnalyzer[T]]
  }
}

