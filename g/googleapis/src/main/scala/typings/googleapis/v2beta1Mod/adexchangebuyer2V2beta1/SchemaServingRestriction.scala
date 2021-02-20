package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @OutputOnly A representation of the status of an ad in a specific context.
  * A context here relates to where something ultimately serves (for example, a
  * user or publisher geo, a platform, an HTTPS vs HTTP request, or the type of
  * auction).
  */
@js.native
trait SchemaServingRestriction extends StObject {
  
  /**
    * The contexts for the restriction.
    */
  var contexts: js.UndefOr[js.Array[SchemaServingContext]] = js.native
  
  /**
    * Disapproval bound to this restriction. Only present if
    * status=DISAPPROVED. Can be used to filter the response of the
    * creatives.list method.
    */
  var disapproval: js.UndefOr[SchemaDisapproval] = js.native
  
  /**
    * Any disapprovals bound to this restriction. Only present if
    * status=DISAPPROVED. Can be used to filter the response of the
    * creatives.list method. Deprecated; please use disapproval field instead.
    */
  var disapprovalReasons: js.UndefOr[js.Array[SchemaDisapproval]] = js.native
  
  /**
    * The status of the creative in this context (for example, it has been
    * explicitly disapproved or is pending review).
    */
  var status: js.UndefOr[String] = js.native
}
object SchemaServingRestriction {
  
  @scala.inline
  def apply(): SchemaServingRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServingRestriction]
  }
  
  @scala.inline
  implicit class SchemaServingRestrictionMutableBuilder[Self <: SchemaServingRestriction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContexts(value: js.Array[SchemaServingContext]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    @scala.inline
    def setContextsVarargs(value: SchemaServingContext*): Self = StObject.set(x, "contexts", js.Array(value :_*))
    
    @scala.inline
    def setDisapproval(value: SchemaDisapproval): Self = StObject.set(x, "disapproval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisapprovalReasons(value: js.Array[SchemaDisapproval]): Self = StObject.set(x, "disapprovalReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisapprovalReasonsUndefined: Self = StObject.set(x, "disapprovalReasons", js.undefined)
    
    @scala.inline
    def setDisapprovalReasonsVarargs(value: SchemaDisapproval*): Self = StObject.set(x, "disapprovalReasons", js.Array(value :_*))
    
    @scala.inline
    def setDisapprovalUndefined: Self = StObject.set(x, "disapproval", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
