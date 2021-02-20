package typings.jestCucumber

import typings.jestCucumber.modelsMod.ParsedFeature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateCodeByLineNumberMod {
  
  @js.native
  sealed trait ObjectTypeEnum extends StObject
  @JSImport("jest-cucumber/dist/src/code-generation/generate-code-by-line-number", "ObjectTypeEnum")
  @js.native
  object ObjectTypeEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ObjectTypeEnum with Double] = js.native
    
    @js.native
    sealed trait scenario extends ObjectTypeEnum
    /* 0 */ val scenario: typings.jestCucumber.generateCodeByLineNumberMod.ObjectTypeEnum.scenario with Double = js.native
    
    @js.native
    sealed trait scenarioOutline extends ObjectTypeEnum
    /* 1 */ val scenarioOutline: typings.jestCucumber.generateCodeByLineNumberMod.ObjectTypeEnum.scenarioOutline with Double = js.native
    
    @js.native
    sealed trait step extends ObjectTypeEnum
    /* 2 */ val step: typings.jestCucumber.generateCodeByLineNumberMod.ObjectTypeEnum.step with Double = js.native
  }
  
  @JSImport("jest-cucumber/dist/src/code-generation/generate-code-by-line-number", "generateCodeFromFeature")
  @js.native
  def generateCodeFromFeature(feature: ParsedFeature, lineNumber: Double): String | Null = js.native
  
  @JSImport("jest-cucumber/dist/src/code-generation/generate-code-by-line-number", "generateCodeWithSeparateFunctionsFromFeature")
  @js.native
  def generateCodeWithSeparateFunctionsFromFeature(feature: ParsedFeature, lineNumber: Double): String | Null = js.native
}
