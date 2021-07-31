package typings.hlsParser.anon

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format extends StObject {
  
  var format: js.UndefOr[String] = js.undefined
  
  var formatVersion: js.UndefOr[String] = js.undefined
  
  var iv: js.UndefOr[Buffer] = js.undefined
  
  var method: String
  
  var uri: js.UndefOr[String] = js.undefined
}
object Format {
  
  @scala.inline
  def apply(method: String): Format = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
  
  @scala.inline
  implicit class FormatMutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFormatVersion(value: String): Self = StObject.set(x, "formatVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatVersionUndefined: Self = StObject.set(x, "formatVersion", js.undefined)
    
    @scala.inline
    def setIv(value: Buffer): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
