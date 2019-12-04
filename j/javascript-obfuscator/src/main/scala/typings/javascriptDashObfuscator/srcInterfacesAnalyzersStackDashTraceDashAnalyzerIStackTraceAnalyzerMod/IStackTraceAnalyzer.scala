package typings.javascriptDashObfuscator.srcInterfacesAnalyzersStackDashTraceDashAnalyzerIStackTraceAnalyzerMod

import typings.javascriptDashObfuscator.srcInterfacesAnalyzersIAnalyzerMod.IAnalyzer
import typings.javascriptDashObfuscator.srcTypesTObjectMod.TObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStackTraceAnalyzer extends IAnalyzer

object IStackTraceAnalyzer {
  @scala.inline
  def apply(
    analyze: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ESTree.Program */ js.Any => js.Array[TObject[_]]
  ): IStackTraceAnalyzer = {
    val __obj = js.Dynamic.literal(analyze = js.Any.fromFunction1(analyze))
  
    __obj.asInstanceOf[IStackTraceAnalyzer]
  }
}

