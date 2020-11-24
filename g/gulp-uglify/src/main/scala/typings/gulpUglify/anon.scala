package typings.gulpUglify

import org.scalablytyped.runtime.StringDictionary
import typings.uglifyJs.mod.MinifyOptions
import typings.uglifyJs.mod.MinifyOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait FnCall extends js.Object {
    
    def apply(files: String): MinifyOutput = js.native
    def apply(files: String, options: MinifyOptions): MinifyOutput = js.native
    def apply(files: js.Array[String]): MinifyOutput = js.native
    def apply(files: js.Array[String], options: MinifyOptions): MinifyOutput = js.native
    def apply(files: StringDictionary[String]): MinifyOutput = js.native
    def apply(files: StringDictionary[String], options: MinifyOptions): MinifyOutput = js.native
  }
  
  @js.native
  trait FnCallMessageOptionalParams extends js.Object {
    
    def apply(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
    def apply(message: js.Any, optionalParams: js.Any*): Unit = js.native
  }
}
