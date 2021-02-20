package typings.gulpUglify

import org.scalablytyped.runtime.StringDictionary
import typings.uglifyJs.mod.MinifyOptions
import typings.uglifyJs.mod.MinifyOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(files: String): MinifyOutput = js.native
    def apply(files: String, options: MinifyOptions): MinifyOutput = js.native
    def apply(files: js.Array[String]): MinifyOutput = js.native
    def apply(files: js.Array[String], options: MinifyOptions): MinifyOutput = js.native
    def apply(files: StringDictionary[String]): MinifyOutput = js.native
    def apply(files: StringDictionary[String], options: MinifyOptions): MinifyOutput = js.native
  }
}
