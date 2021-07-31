package typings.jscodeshift

import typings.jscodeshift.coreMod.Options
import typings.jscodeshift.coreMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testUtilsMod {
  
  @JSImport("jscodeshift/src/testUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def defineInlineTest(module: Transform, options: Options, inputSource: String, expectedOutputSource: String): js.Function0[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("defineInlineTest")(module.asInstanceOf[js.Any], options.asInstanceOf[js.Any], inputSource.asInstanceOf[js.Any], expectedOutputSource.asInstanceOf[js.Any])).asInstanceOf[js.Function0[js.Any]]
  @scala.inline
  def defineInlineTest(
    module: Transform,
    options: Options,
    inputSource: String,
    expectedOutputSource: String,
    testName: String
  ): js.Function0[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("defineInlineTest")(module.asInstanceOf[js.Any], options.asInstanceOf[js.Any], inputSource.asInstanceOf[js.Any], expectedOutputSource.asInstanceOf[js.Any], testName.asInstanceOf[js.Any])).asInstanceOf[js.Function0[js.Any]]
  
  @scala.inline
  def defineTest(dirName: String, transformName: String, options: Options): js.Function0[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("defineTest")(dirName.asInstanceOf[js.Any], transformName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[js.Any]]
  @scala.inline
  def defineTest(dirName: String, transformName: String, options: Options, testFilePrefix: String): js.Function0[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("defineTest")(dirName.asInstanceOf[js.Any], transformName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], testFilePrefix.asInstanceOf[js.Any])).asInstanceOf[js.Function0[js.Any]]
  @scala.inline
  def defineTest(
    dirName: String,
    transformName: String,
    options: Options,
    testFilePrefix: String,
    testOptions: TestOptions
  ): js.Function0[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("defineTest")(dirName.asInstanceOf[js.Any], transformName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], testFilePrefix.asInstanceOf[js.Any], testOptions.asInstanceOf[js.Any])).asInstanceOf[js.Function0[js.Any]]
  @scala.inline
  def defineTest(
    dirName: String,
    transformName: String,
    options: Options,
    testFilePrefix: Unit,
    testOptions: TestOptions
  ): js.Function0[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("defineTest")(dirName.asInstanceOf[js.Any], transformName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], testFilePrefix.asInstanceOf[js.Any], testOptions.asInstanceOf[js.Any])).asInstanceOf[js.Function0[js.Any]]
  
  trait TestOptions extends StObject {
    
    var parser: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify recast.Parser */ js.Any) | String
      ] = js.undefined
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
