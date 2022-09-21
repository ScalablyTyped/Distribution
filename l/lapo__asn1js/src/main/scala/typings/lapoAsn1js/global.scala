package typings.lapoAsn1js

import typings.lapoAsn1js.mod.ASN1
import typings.lapoAsn1js.mod.ASN1Tag
import typings.lapoAsn1js.mod.Stream
import typings.lapoAsn1js.mod.StreamOrBinary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object asn1 {
    
    @JSGlobal("asn1")
    @js.native
    open class ^ protected ()
      extends typings.lapoAsn1js.mod.^ {
      def this(stream: Stream, header: Double, length: Double, tag: ASN1Tag, tagLen: Double) = this()
      def this(stream: Stream, header: Double, length: Double, tag: ASN1Tag, tagLen: Double, sub: js.Array[ASN1]) = this()
    }
    
    @JSGlobal("asn1")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def decode(stream: StreamOrBinary): ASN1 = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(stream.asInstanceOf[js.Any]).asInstanceOf[ASN1]
    inline def decode(stream: StreamOrBinary, offset: Double): ASN1 = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(stream.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[ASN1]
  }
}
