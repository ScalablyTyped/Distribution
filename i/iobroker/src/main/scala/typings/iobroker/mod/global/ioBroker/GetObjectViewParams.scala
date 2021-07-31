package typings.iobroker.mod.global.ioBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for adapter.getObjectView */
trait GetObjectViewParams extends StObject {
  
  /** Last id to include in the return list */
  var endkey: js.UndefOr[String] = js.undefined
  
  /** Whether docs should be included in the return list */ // TODO: What are docs?
  var include_docs: js.UndefOr[Boolean] = js.undefined
  
  /** First id to include in the return list */
  var startkey: js.UndefOr[String] = js.undefined
}
object GetObjectViewParams {
  
  @scala.inline
  def apply(): GetObjectViewParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectViewParams]
  }
  
  @scala.inline
  implicit class GetObjectViewParamsMutableBuilder[Self <: GetObjectViewParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndkey(value: String): Self = StObject.set(x, "endkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndkeyUndefined: Self = StObject.set(x, "endkey", js.undefined)
    
    @scala.inline
    def setInclude_docs(value: Boolean): Self = StObject.set(x, "include_docs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_docsUndefined: Self = StObject.set(x, "include_docs", js.undefined)
    
    @scala.inline
    def setStartkey(value: String): Self = StObject.set(x, "startkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartkeyUndefined: Self = StObject.set(x, "startkey", js.undefined)
  }
}
