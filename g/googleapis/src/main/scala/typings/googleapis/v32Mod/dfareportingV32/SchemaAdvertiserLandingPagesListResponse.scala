package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Landing Page List Response
  */
trait SchemaAdvertiserLandingPagesListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#advertiserLandingPagesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Landing page collection
    */
  var landingPages: js.UndefOr[js.Array[SchemaLandingPage]] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaAdvertiserLandingPagesListResponse {
  
  @scala.inline
  def apply(): SchemaAdvertiserLandingPagesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvertiserLandingPagesListResponse]
  }
  
  @scala.inline
  implicit class SchemaAdvertiserLandingPagesListResponseMutableBuilder[Self <: SchemaAdvertiserLandingPagesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLandingPages(value: js.Array[SchemaLandingPage]): Self = StObject.set(x, "landingPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLandingPagesUndefined: Self = StObject.set(x, "landingPages", js.undefined)
    
    @scala.inline
    def setLandingPagesVarargs(value: SchemaLandingPage*): Self = StObject.set(x, "landingPages", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
