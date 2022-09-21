package typings.k6.httpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _RefinedBatchRequest[RT /* <: js.UndefOr[ResponseType] */] extends StObject
object _RefinedBatchRequest {
  
  inline def HttpURL(): typings.k6.httpMod.HttpURL = {
    val __obj = js.Dynamic.literal(__brand = "http-url")
    __obj.asInstanceOf[typings.k6.httpMod.HttpURL]
  }
  
  inline def ObjectRefinedBatchRequest[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String | HttpURL): typings.k6.httpMod.ObjectRefinedBatchRequest[RT] = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.k6.httpMod.ObjectRefinedBatchRequest[RT]]
  }
}
