package typings.htmlEntities

import typings.htmlEntities.mod.DecodeScope
import typings.htmlEntities.mod.EncodeMode
import typings.htmlEntities.mod.Level
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlEntitiesStrings {
  
  @js.native
  sealed trait all
    extends StObject
       with Level
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait attribute
    extends StObject
       with DecodeScope
  inline def attribute: attribute = "attribute".asInstanceOf[attribute]
  
  @js.native
  sealed trait body
    extends StObject
       with DecodeScope
  inline def body: body = "body".asInstanceOf[body]
  
  @js.native
  sealed trait decimal extends StObject
  inline def decimal: decimal = "decimal".asInstanceOf[decimal]
  
  @js.native
  sealed trait extensive
    extends StObject
       with EncodeMode
  inline def extensive: extensive = "extensive".asInstanceOf[extensive]
  
  @js.native
  sealed trait hexadecimal extends StObject
  inline def hexadecimal: hexadecimal = "hexadecimal".asInstanceOf[hexadecimal]
  
  @js.native
  sealed trait html4
    extends StObject
       with Level
  inline def html4: html4 = "html4".asInstanceOf[html4]
  
  @js.native
  sealed trait html5
    extends StObject
       with Level
  inline def html5: html5 = "html5".asInstanceOf[html5]
  
  @js.native
  sealed trait nonAscii
    extends StObject
       with EncodeMode
  inline def nonAscii: nonAscii = "nonAscii".asInstanceOf[nonAscii]
  
  @js.native
  sealed trait nonAsciiPrintable
    extends StObject
       with EncodeMode
  inline def nonAsciiPrintable: nonAsciiPrintable = "nonAsciiPrintable".asInstanceOf[nonAsciiPrintable]
  
  @js.native
  sealed trait nonAsciiPrintableOnly
    extends StObject
       with EncodeMode
  inline def nonAsciiPrintableOnly: nonAsciiPrintableOnly = "nonAsciiPrintableOnly".asInstanceOf[nonAsciiPrintableOnly]
  
  @js.native
  sealed trait specialChars
    extends StObject
       with EncodeMode
  inline def specialChars: specialChars = "specialChars".asInstanceOf[specialChars]
  
  @js.native
  sealed trait strict
    extends StObject
       with DecodeScope
  inline def strict: strict = "strict".asInstanceOf[strict]
  
  @js.native
  sealed trait xml
    extends StObject
       with Level
  inline def xml: xml = "xml".asInstanceOf[xml]
}
