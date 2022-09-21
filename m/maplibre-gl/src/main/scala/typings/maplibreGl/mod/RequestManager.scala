package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "RequestManager")
@js.native
open class RequestManager () extends StObject {
  def this(transformRequestFn: RequestTransformFunction) = this()
  
  def _transformRequestFn(url: String): RequestParameters = js.native
  def _transformRequestFn(url: String, resourceType: ResourceTypeEnum): RequestParameters = js.native
  @JSName("_transformRequestFn")
  var _transformRequestFn_Original: RequestTransformFunction = js.native
  
  def normalizeSpriteURL(url: String, format: String, `extension`: String): String = js.native
  
  def setTransformRequest(transformRequest: RequestTransformFunction): scala.Unit = js.native
  
  def transformRequest(url: String, `type`: ResourceTypeEnum): RequestParameters = js.native
}
