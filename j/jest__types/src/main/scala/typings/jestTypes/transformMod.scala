package typings.jestTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformMod {
  
  trait TransformResult extends StObject {
    
    var code: String
    
    var mapCoverage: js.UndefOr[Boolean] = js.undefined
    
    var originalCode: String
    
    var sourceMapPath: String | Null
  }
  object TransformResult {
    
    @scala.inline
    def apply(code: String, originalCode: String): TransformResult = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], originalCode = originalCode.asInstanceOf[js.Any], sourceMapPath = null)
      __obj.asInstanceOf[TransformResult]
    }
    
    @scala.inline
    implicit class TransformResultMutableBuilder[Self <: TransformResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapCoverage(value: Boolean): Self = StObject.set(x, "mapCoverage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapCoverageUndefined: Self = StObject.set(x, "mapCoverage", js.undefined)
      
      @scala.inline
      def setOriginalCode(value: String): Self = StObject.set(x, "originalCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapPath(value: String): Self = StObject.set(x, "sourceMapPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapPathNull: Self = StObject.set(x, "sourceMapPath", null)
    }
  }
}
