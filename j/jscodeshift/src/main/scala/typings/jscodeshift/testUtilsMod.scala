package typings.jscodeshift

import typings.jscodeshift.coreMod.Options
import typings.jscodeshift.coreMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testUtilsMod {
  
  @JSImport("jscodeshift/src/testUtils", "defineInlineTest")
  @js.native
  def defineInlineTest(module: Transform, options: Options, inputSource: String, expectedOutputSource: String): js.Function0[_] = js.native
  @JSImport("jscodeshift/src/testUtils", "defineInlineTest")
  @js.native
  def defineInlineTest(
    module: Transform,
    options: Options,
    inputSource: String,
    expectedOutputSource: String,
    testName: String
  ): js.Function0[_] = js.native
  
  @JSImport("jscodeshift/src/testUtils", "defineTest")
  @js.native
  def defineTest(dirName: String, transformName: String, options: Options): js.Function0[_] = js.native
  @JSImport("jscodeshift/src/testUtils", "defineTest")
  @js.native
  def defineTest(
    dirName: String,
    transformName: String,
    options: Options,
    testFilePrefix: js.UndefOr[scala.Nothing],
    testOptions: TestOptions
  ): js.Function0[_] = js.native
  @JSImport("jscodeshift/src/testUtils", "defineTest")
  @js.native
  def defineTest(dirName: String, transformName: String, options: Options, testFilePrefix: String): js.Function0[_] = js.native
  @JSImport("jscodeshift/src/testUtils", "defineTest")
  @js.native
  def defineTest(
    dirName: String,
    transformName: String,
    options: Options,
    testFilePrefix: String,
    testOptions: TestOptions
  ): js.Function0[_] = js.native
  
  @js.native
  trait TestOptions extends StObject {
    
    var parser: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify recast.Parser */ js.Any) | String
      ] = js.native
  }
  object TestOptions {
    
    @scala.inline
    def apply(): TestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestOptions]
    }
    
    @scala.inline
    implicit class TestOptionsMutableBuilder[Self <: TestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParser(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify recast.Parser */ js.Any) | String
      ): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    }
  }
}
