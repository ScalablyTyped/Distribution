package typings.imagekit.mod.global.ImageKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for generating an URL
  *
  * @see {@link https://github.com/imagekit-developer/imagekit-nodejs#url-generation}
  */
/* Rewritten from type alias, can be one of: 
  - typings.imagekit.mod.global.ImageKit.UrlOptionsSrc
  - typings.imagekit.mod.global.ImageKit.UrlOptionsPath
*/
trait UrlOptions extends js.Object
object UrlOptions {
  
  @scala.inline
  def UrlOptionsSrc(src: String): UrlOptions = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlOptions]
  }
  
  @scala.inline
  def UrlOptionsPath(path: String): UrlOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlOptions]
  }
}
