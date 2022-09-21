package typings.happyguestmxWebUtilities.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetsHandler_ extends StObject {
  
  def amazonS3Uri(url: String): js.Promise[AmazonS3UriOutput]
  
  def getImage(url: String, format: String): js.Promise[String]
  
  def storeGallery(request: StoreGalleryRequest): js.Promise[js.Array[String]]
  
  def storeImage(request: StoreImageRequest): js.Promise[PutObjectOutput]
}
object AssetsHandler_ {
  
  inline def apply(
    amazonS3Uri: String => js.Promise[AmazonS3UriOutput],
    getImage: (String, String) => js.Promise[String],
    storeGallery: StoreGalleryRequest => js.Promise[js.Array[String]],
    storeImage: StoreImageRequest => js.Promise[PutObjectOutput]
  ): AssetsHandler_ = {
    val __obj = js.Dynamic.literal(amazonS3Uri = js.Any.fromFunction1(amazonS3Uri), getImage = js.Any.fromFunction2(getImage), storeGallery = js.Any.fromFunction1(storeGallery), storeImage = js.Any.fromFunction1(storeImage))
    __obj.asInstanceOf[AssetsHandler_]
  }
  
  extension [Self <: AssetsHandler_](x: Self) {
    
    inline def setAmazonS3Uri(value: String => js.Promise[AmazonS3UriOutput]): Self = StObject.set(x, "amazonS3Uri", js.Any.fromFunction1(value))
    
    inline def setGetImage(value: (String, String) => js.Promise[String]): Self = StObject.set(x, "getImage", js.Any.fromFunction2(value))
    
    inline def setStoreGallery(value: StoreGalleryRequest => js.Promise[js.Array[String]]): Self = StObject.set(x, "storeGallery", js.Any.fromFunction1(value))
    
    inline def setStoreImage(value: StoreImageRequest => js.Promise[PutObjectOutput]): Self = StObject.set(x, "storeImage", js.Any.fromFunction1(value))
  }
}
