package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkEditNegativeKeywordsRequest extends StObject {
  
  /** The negative keywords to create in batch, specified as a list of NegativeKeywords. */
  var createdNegativeKeywords: js.UndefOr[js.Array[NegativeKeyword]] = js.undefined
  
  /** The negative keywords to delete in batch, specified as a list of keyword_values. */
  var deletedNegativeKeywords: js.UndefOr[js.Array[String]] = js.undefined
}
object BulkEditNegativeKeywordsRequest {
  
  @scala.inline
  def apply(): BulkEditNegativeKeywordsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEditNegativeKeywordsRequest]
  }
  
  @scala.inline
  implicit class BulkEditNegativeKeywordsRequestMutableBuilder[Self <: BulkEditNegativeKeywordsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedNegativeKeywords(value: js.Array[NegativeKeyword]): Self = StObject.set(x, "createdNegativeKeywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedNegativeKeywordsUndefined: Self = StObject.set(x, "createdNegativeKeywords", js.undefined)
    
    @scala.inline
    def setCreatedNegativeKeywordsVarargs(value: NegativeKeyword*): Self = StObject.set(x, "createdNegativeKeywords", js.Array(value :_*))
    
    @scala.inline
    def setDeletedNegativeKeywords(value: js.Array[String]): Self = StObject.set(x, "deletedNegativeKeywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedNegativeKeywordsUndefined: Self = StObject.set(x, "deletedNegativeKeywords", js.undefined)
    
    @scala.inline
    def setDeletedNegativeKeywordsVarargs(value: String*): Self = StObject.set(x, "deletedNegativeKeywords", js.Array(value :_*))
  }
}
