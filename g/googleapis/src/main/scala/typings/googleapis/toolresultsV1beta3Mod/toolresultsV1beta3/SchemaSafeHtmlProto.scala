package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSafeHtmlProto extends StObject {
  
  /**
    * IMPORTANT: Never set or read this field, even from tests, it is private. See documentation at the top of .proto file for programming language packages with which to create or read this message.
    */
  var privateDoNotAccessOrElseSafeHtmlWrappedValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaSafeHtmlProto {
  
  inline def apply(): SchemaSafeHtmlProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSafeHtmlProto]
  }
  
  extension [Self <: SchemaSafeHtmlProto](x: Self) {
    
    inline def setPrivateDoNotAccessOrElseSafeHtmlWrappedValue(value: String): Self = StObject.set(x, "privateDoNotAccessOrElseSafeHtmlWrappedValue", value.asInstanceOf[js.Any])
    
    inline def setPrivateDoNotAccessOrElseSafeHtmlWrappedValueNull: Self = StObject.set(x, "privateDoNotAccessOrElseSafeHtmlWrappedValue", null)
    
    inline def setPrivateDoNotAccessOrElseSafeHtmlWrappedValueUndefined: Self = StObject.set(x, "privateDoNotAccessOrElseSafeHtmlWrappedValue", js.undefined)
  }
}
