package typings.imageToBase64

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("image-to-base64", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Generate a base64 code from an image through a URL or a path.
    * @param path - a URL or a path
    * @returns a base64 code from an image
    */
  def apply(urlOrImage: String): js.Promise[String] = js.native
}
