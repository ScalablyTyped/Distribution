package typings.jsreportXlsx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<jsreport-xlsx.jsreport-xlsx.Options> */
  @js.native
  trait PartialOptions extends StObject {
    
    var addBufferSize: js.UndefOr[Double] = js.native
    
    var escapeAmp: js.UndefOr[Boolean] = js.native
    
    var numberOfParsedAddIterations: js.UndefOr[Double] = js.native
  }
  object PartialOptions {
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddBufferSize(value: Double): Self = StObject.set(x, "addBufferSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddBufferSizeUndefined: Self = StObject.set(x, "addBufferSize", js.undefined)
      
      @scala.inline
      def setEscapeAmp(value: Boolean): Self = StObject.set(x, "escapeAmp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeAmpUndefined: Self = StObject.set(x, "escapeAmp", js.undefined)
      
      @scala.inline
      def setNumberOfParsedAddIterations(value: Double): Self = StObject.set(x, "numberOfParsedAddIterations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfParsedAddIterationsUndefined: Self = StObject.set(x, "numberOfParsedAddIterations", js.undefined)
    }
  }
}
