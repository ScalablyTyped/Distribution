package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServingRestriction extends StObject {
  
  /** The contexts for the restriction. */
  var contexts: js.UndefOr[js.Array[ServingContext]] = js.undefined
  
  /** Disapproval bound to this restriction. Only present if status=DISAPPROVED. Can be used to filter the response of the creatives.list method. */
  var disapproval: js.UndefOr[Disapproval] = js.undefined
  
  /**
    * Any disapprovals bound to this restriction. Only present if status=DISAPPROVED. Can be used to filter the response of the creatives.list method. Deprecated; please use disapproval
    * field instead.
    */
  var disapprovalReasons: js.UndefOr[js.Array[Disapproval]] = js.undefined
  
  /** The status of the creative in this context (for example, it has been explicitly disapproved or is pending review). */
  var status: js.UndefOr[String] = js.undefined
}
object ServingRestriction {
  
  @scala.inline
  def apply(): ServingRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServingRestriction]
  }
  
  @scala.inline
  implicit class ServingRestrictionMutableBuilder[Self <: ServingRestriction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContexts(value: js.Array[ServingContext]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    @scala.inline
    def setContextsVarargs(value: ServingContext*): Self = StObject.set(x, "contexts", js.Array(value :_*))
    
    @scala.inline
    def setDisapproval(value: Disapproval): Self = StObject.set(x, "disapproval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisapprovalReasons(value: js.Array[Disapproval]): Self = StObject.set(x, "disapprovalReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisapprovalReasonsUndefined: Self = StObject.set(x, "disapprovalReasons", js.undefined)
    
    @scala.inline
    def setDisapprovalReasonsVarargs(value: Disapproval*): Self = StObject.set(x, "disapprovalReasons", js.Array(value :_*))
    
    @scala.inline
    def setDisapprovalUndefined: Self = StObject.set(x, "disapproval", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
