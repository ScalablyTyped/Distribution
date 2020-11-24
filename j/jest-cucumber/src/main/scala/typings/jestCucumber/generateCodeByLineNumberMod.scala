package typings.jestCucumber

import org.scalablytyped.runtime.TopLevel
import typings.jestCucumber.modelsMod.ParsedFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-cucumber/dist/src/code-generation/generate-code-by-line-number", JSImport.Namespace)
@js.native
object generateCodeByLineNumberMod extends js.Object {
  
  def generateCodeFromFeature(feature: ParsedFeature, lineNumber: Double): String | Null = js.native
  
  def generateCodeWithSeparateFunctionsFromFeature(feature: ParsedFeature, lineNumber: Double): String | Null = js.native
  
  @js.native
  sealed trait ObjectTypeEnum extends js.Object
  @js.native
  object ObjectTypeEnum extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ObjectTypeEnum with Double] = js.native
    
    @js.native
    sealed trait scenario extends ObjectTypeEnum
    /* 0 */ @js.native
    object scenario extends TopLevel[scenario with Double]
    
    @js.native
    sealed trait scenarioOutline extends ObjectTypeEnum
    /* 1 */ @js.native
    object scenarioOutline extends TopLevel[scenarioOutline with Double]
    
    @js.native
    sealed trait step extends ObjectTypeEnum
    /* 2 */ @js.native
    object step extends TopLevel[step with Double]
  }
}
