package typings.htmlWebpackPlugin.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("html-webpack-plugin", JSImport.Namespace)
@js.native
class ^ () extends HtmlWebpackPlugin {
  def this(options: Options) = this()
}
@JSImport("html-webpack-plugin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Static helper to create a tag object to be get injected into the dom
    */
  def createHtmlTagObject(tagName: String): HtmlTagObject = js.native
  def createHtmlTagObject(tagName: String, attributes: js.UndefOr[scala.Nothing], innerHTML: String): HtmlTagObject = js.native
  def createHtmlTagObject(tagName: String, attributes: StringDictionary[String | Boolean]): HtmlTagObject = js.native
  def createHtmlTagObject(tagName: String, attributes: StringDictionary[String | Boolean], innerHTML: String): HtmlTagObject = js.native
  
  def getHooks(
    compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Compilation */ js.Any
  ): Hooks = js.native
  
  val version: Double = js.native
}
