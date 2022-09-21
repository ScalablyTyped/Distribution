package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.ExtParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Notafter extends StObject {
  
  var ext: js.UndefOr[js.Array[ExtParam]] = js.undefined
  
  var issuer: ArrayStrString
  
  var notafter: String
  
  var notbefore: String
  
  var sbjpubkey: String
  
  var serial: Hex
  
  var sigalg: String
  
  var sighex: String
  
  var subject: ArrayStrString
  
  var tbshex: js.UndefOr[String] = js.undefined
  
  var version: Double
}
object Notafter {
  
  inline def apply(
    issuer: ArrayStrString,
    notafter: String,
    notbefore: String,
    sbjpubkey: String,
    serial: Hex,
    sigalg: String,
    sighex: String,
    subject: ArrayStrString,
    version: Double
  ): Notafter = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], notafter = notafter.asInstanceOf[js.Any], notbefore = notbefore.asInstanceOf[js.Any], sbjpubkey = sbjpubkey.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], sigalg = sigalg.asInstanceOf[js.Any], sighex = sighex.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notafter]
  }
  
  extension [Self <: Notafter](x: Self) {
    
    inline def setExt(value: js.Array[ExtParam]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
    
    inline def setExtVarargs(value: ExtParam*): Self = StObject.set(x, "ext", js.Array(value*))
    
    inline def setIssuer(value: ArrayStrString): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setNotafter(value: String): Self = StObject.set(x, "notafter", value.asInstanceOf[js.Any])
    
    inline def setNotbefore(value: String): Self = StObject.set(x, "notbefore", value.asInstanceOf[js.Any])
    
    inline def setSbjpubkey(value: String): Self = StObject.set(x, "sbjpubkey", value.asInstanceOf[js.Any])
    
    inline def setSerial(value: Hex): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
    
    inline def setSigalg(value: String): Self = StObject.set(x, "sigalg", value.asInstanceOf[js.Any])
    
    inline def setSighex(value: String): Self = StObject.set(x, "sighex", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: ArrayStrString): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setTbshex(value: String): Self = StObject.set(x, "tbshex", value.asInstanceOf[js.Any])
    
    inline def setTbshexUndefined: Self = StObject.set(x, "tbshex", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
