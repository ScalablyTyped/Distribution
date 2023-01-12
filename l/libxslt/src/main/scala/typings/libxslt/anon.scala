package typings.libxslt

import typings.libxslt.libxsltStrings.document
import typings.libxslt.libxsltStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait NoWrapParams extends StObject {
    
    var noWrapParams: js.UndefOr[Boolean] = js.undefined
    
    var outputFormat: string
  }
  object NoWrapParams {
    
    inline def apply(): NoWrapParams = {
      val __obj = js.Dynamic.literal(outputFormat = "string")
      __obj.asInstanceOf[NoWrapParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NoWrapParams] (val x: Self) extends AnyVal {
      
      inline def setNoWrapParams(value: Boolean): Self = StObject.set(x, "noWrapParams", value.asInstanceOf[js.Any])
      
      inline def setNoWrapParamsUndefined: Self = StObject.set(x, "noWrapParams", js.undefined)
      
      inline def setOutputFormat(value: string): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
    }
  }
  
  trait OutputFormat extends StObject {
    
    var noWrapParams: js.UndefOr[Boolean] = js.undefined
    
    var outputFormat: document
  }
  object OutputFormat {
    
    inline def apply(): OutputFormat = {
      val __obj = js.Dynamic.literal(outputFormat = "document")
      __obj.asInstanceOf[OutputFormat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OutputFormat] (val x: Self) extends AnyVal {
      
      inline def setNoWrapParams(value: Boolean): Self = StObject.set(x, "noWrapParams", value.asInstanceOf[js.Any])
      
      inline def setNoWrapParamsUndefined: Self = StObject.set(x, "noWrapParams", js.undefined)
      
      inline def setOutputFormat(value: document): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
    }
  }
}
