package typings.libxslt

import typings.libxslt.libxsltStrings.document
import typings.libxslt.libxsltStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait NoWrapParams extends StObject {
    
    var noWrapParams: js.UndefOr[Boolean] = js.native
    
    var outputFormat: string = js.native
  }
  object NoWrapParams {
    
    @scala.inline
    def apply(outputFormat: string): NoWrapParams = {
      val __obj = js.Dynamic.literal(outputFormat = outputFormat.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoWrapParams]
    }
    
    @scala.inline
    implicit class NoWrapParamsMutableBuilder[Self <: NoWrapParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoWrapParams(value: Boolean): Self = StObject.set(x, "noWrapParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoWrapParamsUndefined: Self = StObject.set(x, "noWrapParams", js.undefined)
      
      @scala.inline
      def setOutputFormat(value: string): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OutputFormat extends StObject {
    
    var noWrapParams: js.UndefOr[Boolean] = js.native
    
    var outputFormat: document = js.native
  }
  object OutputFormat {
    
    @scala.inline
    def apply(outputFormat: document): OutputFormat = {
      val __obj = js.Dynamic.literal(outputFormat = outputFormat.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputFormat]
    }
    
    @scala.inline
    implicit class OutputFormatMutableBuilder[Self <: OutputFormat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoWrapParams(value: Boolean): Self = StObject.set(x, "noWrapParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoWrapParamsUndefined: Self = StObject.set(x, "noWrapParams", js.undefined)
      
      @scala.inline
      def setOutputFormat(value: document): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
    }
  }
}
