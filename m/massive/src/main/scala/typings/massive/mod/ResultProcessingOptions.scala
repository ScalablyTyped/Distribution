package typings.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultProcessingOptions extends StObject {
  
  var build: js.UndefOr[Boolean] = js.undefined
  
  var decompose: js.UndefOr[DecomposeOptions] = js.undefined
  
  var document: js.UndefOr[Boolean] = js.undefined
  
  var single: js.UndefOr[Boolean] = js.undefined
  
  var stream: js.UndefOr[Boolean] = js.undefined
}
object ResultProcessingOptions {
  
  @scala.inline
  def apply(): ResultProcessingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultProcessingOptions]
  }
  
  @scala.inline
  implicit class ResultProcessingOptionsMutableBuilder[Self <: ResultProcessingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: Boolean): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    @scala.inline
    def setDecompose(value: DecomposeOptions): Self = StObject.set(x, "decompose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecomposeUndefined: Self = StObject.set(x, "decompose", js.undefined)
    
    @scala.inline
    def setDocument(value: Boolean): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    @scala.inline
    def setSingle(value: Boolean): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleUndefined: Self = StObject.set(x, "single", js.undefined)
    
    @scala.inline
    def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
