package typings.imagekit.mod.global.ImageKit

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlOptionsBase extends js.Object {
  
  /**
    * Meant to be used along with the signed parameter to specify the time in seconds from now when the URL should expire.
    * If specified, the URL contains the expiry timestamp in the URL and the image signature is modified accordingly.
    */
  var expireSeconds: js.UndefOr[Double] = js.native
  
  /**
    * These are the other query parameters that you want to add to the final URL.
    * These can be any query parameters and not necessarily related to ImageKit.
    * Especially useful, if you want to add some versioning parameter to your URLs.
    */
  var queryParameters: js.UndefOr[StringDictionary[String | Double]] = js.native
  
  /**
    * Default is false. If set to true, the SDK generates a signed image URL adding the image signature to the image URL.
    * If you are creating URL using src parameter instead of path then do correct urlEndpoint for this to work.
    * Otherwise returned URL will have wrong signature.
    */
  var signed: js.UndefOr[Boolean] = js.native
  
  /**
    * An array of objects specifying the transformations to be applied in the URL.
    * The transformation name and the value should be specified as a key-value pair in each object.
    * @see {@link https://docs.imagekit.io/features/image-transformations/chained-transformations}
    */
  var transformation: js.UndefOr[js.Array[Transformation]] = js.native
  
  /**
    * Default value is path that places the transformation string as a path parameter in the URL.
    * Can also be specified as query which adds the transformation string as the query parameter tr in the URL.
    * If you use src parameter to create the URL, then the transformation string is always added as a query parameter.
    */
  var transformationPosition: js.UndefOr[TransformationPosition] = js.native
  
  /**
    * The base URL to be appended before the path of the image.
    * If not specified, the URL Endpoint specified at the time of SDK initialization is used.
    */
  var urlEndpoint: js.UndefOr[String] = js.native
}
object UrlOptionsBase {
  
  @scala.inline
  def apply(): UrlOptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlOptionsBase]
  }
  
  @scala.inline
  implicit class UrlOptionsBaseOps[Self <: UrlOptionsBase] (val x: Self) extends AnyVal {
    
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
    def setExpireSeconds(value: Double): Self = this.set("expireSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpireSeconds: Self = this.set("expireSeconds", js.undefined)
    
    @scala.inline
    def setQueryParameters(value: StringDictionary[String | Double]): Self = this.set("queryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryParameters: Self = this.set("queryParameters", js.undefined)
    
    @scala.inline
    def setSigned(value: Boolean): Self = this.set("signed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigned: Self = this.set("signed", js.undefined)
    
    @scala.inline
    def setTransformationVarargs(value: Transformation*): Self = this.set("transformation", js.Array(value :_*))
    
    @scala.inline
    def setTransformation(value: js.Array[Transformation]): Self = this.set("transformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformation: Self = this.set("transformation", js.undefined)
    
    @scala.inline
    def setTransformationPosition(value: TransformationPosition): Self = this.set("transformationPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformationPosition: Self = this.set("transformationPosition", js.undefined)
    
    @scala.inline
    def setUrlEndpoint(value: String): Self = this.set("urlEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlEndpoint: Self = this.set("urlEndpoint", js.undefined)
  }
}
