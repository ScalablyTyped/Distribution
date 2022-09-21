package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFormsResponsesList
  extends StObject
     with StandardParameters {
  
  /**
    * Which form responses to return. Currently, the only supported filters are: * timestamp \> *N* which means to get all form responses submitted after (but not at) timestamp *N*. * timestamp \>= *N* which means to get all form responses submitted at and after timestamp *N*. For both supported filters, timestamp must be formatted in RFC3339 UTC "Zulu" format. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Required. ID of the Form whose responses to list.
    */
  var formId: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of responses to return. The service may return fewer than this value. If unspecified or zero, at most 5000 responses are returned.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A page token returned by a previous list response. If this field is set, the form and the values of the filter must be the same as for the original request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceFormsResponsesList {
  
  inline def apply(): ParamsResourceFormsResponsesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFormsResponsesList]
  }
  
  extension [Self <: ParamsResourceFormsResponsesList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFormId(value: String): Self = StObject.set(x, "formId", value.asInstanceOf[js.Any])
    
    inline def setFormIdUndefined: Self = StObject.set(x, "formId", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
