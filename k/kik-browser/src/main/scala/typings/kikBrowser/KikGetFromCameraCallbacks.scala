package typings.kikBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KikGetFromCameraCallbacks extends StObject {
  
  def onCancel(): Unit
  
  def onComplete(photos: js.Array[String]): Unit
  
  def onPhoto(photo: String, index: Double): Unit
  
  def onSelect(numPhotos: Double): Unit
}
object KikGetFromCameraCallbacks {
  
  inline def apply(
    onCancel: () => Unit,
    onComplete: js.Array[String] => Unit,
    onPhoto: (String, Double) => Unit,
    onSelect: Double => Unit
  ): KikGetFromCameraCallbacks = {
    val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onComplete = js.Any.fromFunction1(onComplete), onPhoto = js.Any.fromFunction2(onPhoto), onSelect = js.Any.fromFunction1(onSelect))
    __obj.asInstanceOf[KikGetFromCameraCallbacks]
  }
  
  extension [Self <: KikGetFromCameraCallbacks](x: Self) {
    
    inline def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
    
    inline def setOnComplete(value: js.Array[String] => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
    
    inline def setOnPhoto(value: (String, Double) => Unit): Self = StObject.set(x, "onPhoto", js.Any.fromFunction2(value))
    
    inline def setOnSelect(value: Double => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
  }
}
