package typings.kikBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KikGetFromCameraCallbacks extends StObject {
  
  def onCancel(): Unit = js.native
  
  def onComplete(photos: js.Array[String]): Unit = js.native
  
  def onPhoto(photo: String, index: Double): Unit = js.native
  
  def onSelect(numPhotos: Double): Unit = js.native
}
object KikGetFromCameraCallbacks {
  
  @scala.inline
  def apply(
    onCancel: () => Unit,
    onComplete: js.Array[String] => Unit,
    onPhoto: (String, Double) => Unit,
    onSelect: Double => Unit
  ): KikGetFromCameraCallbacks = {
    val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onComplete = js.Any.fromFunction1(onComplete), onPhoto = js.Any.fromFunction2(onPhoto), onSelect = js.Any.fromFunction1(onSelect))
    __obj.asInstanceOf[KikGetFromCameraCallbacks]
  }
  
  @scala.inline
  implicit class KikGetFromCameraCallbacksMutableBuilder[Self <: KikGetFromCameraCallbacks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnComplete(value: js.Array[String] => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPhoto(value: (String, Double) => Unit): Self = StObject.set(x, "onPhoto", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnSelect(value: Double => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
  }
}
