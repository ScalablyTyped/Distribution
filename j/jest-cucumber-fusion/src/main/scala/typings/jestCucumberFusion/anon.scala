package typings.jestCucumberFusion

import typings.jestCucumber.modelsMod.Options
import typings.jestCucumber.modelsMod.ParsedFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait FnCall extends js.Object {
    
    def apply(featureFilePath: String): ParsedFeature = js.native
    def apply(featureFilePath: String, options: Options): ParsedFeature = js.native
  }
}
