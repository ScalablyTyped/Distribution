package typings.imagekit.mod.global.ImageKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlOptionsSrc
  extends UrlOptionsBase
     with UrlOptions {
  
  var path: js.UndefOr[scala.Nothing] = js.native
  
  /**
    * Conditional. This is the complete URL of an image already mapped to ImageKit.
    * For example, https://ik.imagekit.io/your_imagekit_id/endpoint/path/to/image.jpg.
    * Either the path or src parameter need to be specified for URL generation.
    */
  var src: String = js.native
}
object UrlOptionsSrc {
  
  @scala.inline
  def apply(src: String): UrlOptionsSrc = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlOptionsSrc]
  }
  
  @scala.inline
  implicit class UrlOptionsSrcOps[Self <: UrlOptionsSrc] (val x: Self) extends AnyVal {
    
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
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
  }
}
