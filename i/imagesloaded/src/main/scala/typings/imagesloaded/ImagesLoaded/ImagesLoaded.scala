package typings.imagesloaded.ImagesLoaded

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagesLoaded
  extends Instantiable2[
      /* elem */ ElementSelector, 
      /* callback */ ImagesLoadedCallback, 
      typings.imagesloaded.ImagesLoaded.ImagesLoaded
    ] {
  
  var images: js.Array[LoadingImage] = js.native
  
  def off(event: String, listener: ImagesLoadedListener): Unit = js.native
  
  // event listeners
  def on(event: String, listener: ImagesLoadedListener): Unit = js.native
  
  def once(event: String, listener: ImagesLoadedListener): Unit = js.native
}
