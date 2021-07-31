package typings.imageToBase64

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Generate a base64 code from an image through a URL or a path.
    * @param path - a URL or a path
    * @returns a base64 code from an image
    */
  @scala.inline
  def apply(urlOrImage: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(urlOrImage.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @JSImport("image-to-base64", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
