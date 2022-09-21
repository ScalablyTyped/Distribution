package typings.htmlEntities

import typings.htmlEntities.htmlEntitiesStrings.decimal
import typings.htmlEntities.htmlEntitiesStrings.hexadecimal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("html-entities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")().asInstanceOf[String]
  inline def decode(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def decode(text: String, hasLevelScope: DecodeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(text.asInstanceOf[js.Any], hasLevelScope.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def decode(text: Null, hasLevelScope: DecodeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(text.asInstanceOf[js.Any], hasLevelScope.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def decode(text: Unit, hasLevelScope: DecodeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(text.asInstanceOf[js.Any], hasLevelScope.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def decodeEntity(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeEntity")().asInstanceOf[String]
  inline def decodeEntity(entity: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeEntity")(entity.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def decodeEntity(entity: String, hasLevel: CommonOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeEntity")(entity.asInstanceOf[js.Any], hasLevel.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def decodeEntity(entity: Null, hasLevel: CommonOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeEntity")(entity.asInstanceOf[js.Any], hasLevel.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def decodeEntity(entity: Unit, hasLevel: CommonOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeEntity")(entity.asInstanceOf[js.Any], hasLevel.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encode(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")().asInstanceOf[String]
  inline def encode(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(text: String, hasModeNumericLevel: EncodeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(text.asInstanceOf[js.Any], hasModeNumericLevel.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(text: Null, hasModeNumericLevel: EncodeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(text.asInstanceOf[js.Any], hasModeNumericLevel.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(text: Unit, hasModeNumericLevel: EncodeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(text.asInstanceOf[js.Any], hasModeNumericLevel.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait CommonOptions extends StObject {
    
    var level: js.UndefOr[Level] = js.undefined
  }
  object CommonOptions {
    
    inline def apply(): CommonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonOptions]
    }
    
    extension [Self <: CommonOptions](x: Self) {
      
      inline def setLevel(value: Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    }
  }
  
  trait DecodeOptions
    extends StObject
       with CommonOptions {
    
    var scope: js.UndefOr[DecodeScope] = js.undefined
  }
  object DecodeOptions {
    
    inline def apply(): DecodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecodeOptions]
    }
    
    extension [Self <: DecodeOptions](x: Self) {
      
      inline def setScope(value: DecodeScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.htmlEntities.htmlEntitiesStrings.strict
    - typings.htmlEntities.htmlEntitiesStrings.body
    - typings.htmlEntities.htmlEntitiesStrings.attribute
  */
  trait DecodeScope extends StObject
  object DecodeScope {
    
    inline def attribute: typings.htmlEntities.htmlEntitiesStrings.attribute = "attribute".asInstanceOf[typings.htmlEntities.htmlEntitiesStrings.attribute]
    
    inline def body: typings.htmlEntities.htmlEntitiesStrings.body = "body".asInstanceOf[typings.htmlEntities.htmlEntitiesStrings.body]
    
    inline def strict: typings.htmlEntities.htmlEntitiesStrings.strict = "strict".asInstanceOf[typings.htmlEntities.htmlEntitiesStrings.strict]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.htmlEntities.htmlEntitiesStrings.specialChars
    - typings.htmlEntities.htmlEntitiesStrings.nonAscii
    - typings.htmlEntities.htmlEntitiesStrings.nonAsciiPrintable
    - typings.htmlEntities.htmlEntitiesStrings.extensive
  */
  trait EncodeMode extends StObject
  object EncodeMode {
    
    inline def extensive: typings.htmlEntities.htmlEntitiesStrings.extensive = "extensive".asInstanceOf[typings.htmlEntities.htmlEntitiesStrings.extensive]
    
    inline def nonAscii: typings.htmlEntities.htmlEntitiesStrings.nonAscii = "nonAscii".asInstanceOf[typings.htmlEntities.htmlEntitiesStrings.nonAscii]
    
    inline def nonAsciiPrintable: typings.htmlEntities.htmlEntitiesStrings.nonAsciiPrintable = "nonAsciiPrintable".asInstanceOf[typings.htmlEntities.htmlEntitiesStrings.nonAsciiPrintable]
    
    inline def specialChars: typings.htmlEntities.htmlEntitiesStrings.specialChars = "specialChars".asInstanceOf[typings.htmlEntities.htmlEntitiesStrings.specialChars]
  }
  
  trait EncodeOptions
    extends StObject
       with CommonOptions {
    
    var mode: js.UndefOr[EncodeMode] = js.undefined
    
    var numeric: js.UndefOr[decimal | hexadecimal] = js.undefined
  }
  object EncodeOptions {
    
    inline def apply(): EncodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodeOptions]
    }
    
    extension [Self <: EncodeOptions](x: Self) {
      
      inline def setMode(value: EncodeMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setNumeric(value: decimal | hexadecimal): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      inline def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.htmlEntities.htmlEntitiesStrings.xml
    - typings.htmlEntities.htmlEntitiesStrings.html4
    - typings.htmlEntities.htmlEntitiesStrings.html5
    - typings.htmlEntities.htmlEntitiesStrings.all
  */
  trait Level extends StObject
  object Level {
    
    inline def all: typings.htmlEntities.htmlEntitiesStrings.all = "all".asInstanceOf[typings.htmlEntities.htmlEntitiesStrings.all]
    
    inline def html4: typings.htmlEntities.htmlEntitiesStrings.html4 = "html4".asInstanceOf[typings.htmlEntities.htmlEntitiesStrings.html4]
    
    inline def html5: typings.htmlEntities.htmlEntitiesStrings.html5 = "html5".asInstanceOf[typings.htmlEntities.htmlEntitiesStrings.html5]
    
    inline def xml: typings.htmlEntities.htmlEntitiesStrings.xml = "xml".asInstanceOf[typings.htmlEntities.htmlEntitiesStrings.xml]
  }
}
