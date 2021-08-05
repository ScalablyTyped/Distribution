package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Extension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cakey extends StObject {
  
  var cakey: js.Tuple2[String, String]
  
  var ext: js.UndefOr[js.Array[Extension]] = js.undefined
  
  var issue: StringParam
  
  var notafter: StringParam
  
  var sbjpubkey: String
  
  var serial: IntegerParam
  
  var sigalg: NameParam
  
  var sighex: String
  
  var subject: StringParam
}
object Cakey {
  
  inline def apply(
    cakey: js.Tuple2[String, String],
    issue: StringParam,
    notafter: StringParam,
    sbjpubkey: String,
    serial: IntegerParam,
    sigalg: NameParam,
    sighex: String,
    subject: StringParam
  ): Cakey = {
    val __obj = js.Dynamic.literal(cakey = cakey.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], notafter = notafter.asInstanceOf[js.Any], sbjpubkey = sbjpubkey.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], sigalg = sigalg.asInstanceOf[js.Any], sighex = sighex.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cakey]
  }
  
  extension [Self <: Cakey](x: Self) {
    
    inline def setCakey(value: js.Tuple2[String, String]): Self = StObject.set(x, "cakey", value.asInstanceOf[js.Any])
    
    inline def setExt(value: js.Array[Extension]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
    
    inline def setExtVarargs(value: Extension*): Self = StObject.set(x, "ext", js.Array(value :_*))
    
    inline def setIssue(value: StringParam): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    
    inline def setNotafter(value: StringParam): Self = StObject.set(x, "notafter", value.asInstanceOf[js.Any])
    
    inline def setSbjpubkey(value: String): Self = StObject.set(x, "sbjpubkey", value.asInstanceOf[js.Any])
    
    inline def setSerial(value: IntegerParam): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
    
    inline def setSigalg(value: NameParam): Self = StObject.set(x, "sigalg", value.asInstanceOf[js.Any])
    
    inline def setSighex(value: String): Self = StObject.set(x, "sighex", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: StringParam): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
  }
}
