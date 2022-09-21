package typings.jssha.anon

import typings.jssha.jsshaStrings.TEXT
import typings.jssha.sha1Mod.EncodingType
import typings.jssha.sha1Mod.GenericInputType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodingFormat
  extends StObject
     with GenericInputType {
  
  var encoding: js.UndefOr[EncodingType] = js.undefined
  
  var format: TEXT
  
  var value: String
}
object EncodingFormat {
  
  inline def apply(value: String): EncodingFormat = {
    val __obj = js.Dynamic.literal(format = "TEXT", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodingFormat]
  }
  
  extension [Self <: EncodingFormat](x: Self) {
    
    inline def setEncoding(value: EncodingType): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFormat(value: TEXT): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
