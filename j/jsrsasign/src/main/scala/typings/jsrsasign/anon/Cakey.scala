package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Extension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cakey extends StObject {
  
  var cakey: js.Tuple2[String, String] = js.native
  
  var ext: js.UndefOr[js.Array[Extension]] = js.native
  
  var issue: StringParam = js.native
  
  var notafter: StringParam = js.native
  
  var sbjpubkey: String = js.native
  
  var serial: IntegerParam = js.native
  
  var sigalg: NameParam = js.native
  
  var sighex: String = js.native
  
  var subject: StringParam = js.native
}
object Cakey {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class CakeyMutableBuilder[Self <: Cakey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCakey(value: js.Tuple2[String, String]): Self = StObject.set(x, "cakey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExt(value: js.Array[Extension]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
    
    @scala.inline
    def setExtVarargs(value: Extension*): Self = StObject.set(x, "ext", js.Array(value :_*))
    
    @scala.inline
    def setIssue(value: StringParam): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotafter(value: StringParam): Self = StObject.set(x, "notafter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSbjpubkey(value: String): Self = StObject.set(x, "sbjpubkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerial(value: IntegerParam): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigalg(value: NameParam): Self = StObject.set(x, "sigalg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSighex(value: String): Self = StObject.set(x, "sighex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: StringParam): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
  }
}
