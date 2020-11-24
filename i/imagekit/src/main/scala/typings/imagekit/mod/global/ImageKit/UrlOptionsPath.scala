package typings.imagekit.mod.global.ImageKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlOptionsPath
  extends UrlOptionsBase
     with UrlOptions {
  
  /**
    * Conditional. This is the path at which the image exists.
    * For example, /path/to/image.jpg. Either the path or src parameter need to be specified for URL generation.
    */
  var path: String = js.native
  
  var src: js.UndefOr[scala.Nothing] = js.native
}
object UrlOptionsPath {
  
  @scala.inline
  def apply(path: String): UrlOptionsPath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlOptionsPath]
  }
  
  @scala.inline
  implicit class UrlOptionsPathOps[Self <: UrlOptionsPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
}
