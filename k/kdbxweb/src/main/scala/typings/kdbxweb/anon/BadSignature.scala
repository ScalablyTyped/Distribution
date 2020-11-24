package typings.kdbxweb.anon

import typings.kdbxweb.kdbxwebStrings.FileCorrupt
import typings.kdbxweb.kdbxwebStrings.InvalidArg
import typings.kdbxweb.kdbxwebStrings.InvalidKey
import typings.kdbxweb.kdbxwebStrings.InvalidVersion
import typings.kdbxweb.kdbxwebStrings.MergeError
import typings.kdbxweb.kdbxwebStrings.NotImplemented
import typings.kdbxweb.kdbxwebStrings.Unsupported
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BadSignature extends js.Object {
  
  var BadSignature: typings.kdbxweb.kdbxwebStrings.BadSignature = js.native
  
  var FileCorrupt: typings.kdbxweb.kdbxwebStrings.FileCorrupt = js.native
  
  var InvalidArg: typings.kdbxweb.kdbxwebStrings.InvalidArg = js.native
  
  var InvalidKey: typings.kdbxweb.kdbxwebStrings.InvalidKey = js.native
  
  var InvalidVersion: typings.kdbxweb.kdbxwebStrings.InvalidVersion = js.native
  
  var MergeError: typings.kdbxweb.kdbxwebStrings.MergeError = js.native
  
  var NotImplemented: typings.kdbxweb.kdbxwebStrings.NotImplemented = js.native
  
  var Unsupported: typings.kdbxweb.kdbxwebStrings.Unsupported = js.native
}
object BadSignature {
  
  @scala.inline
  def apply(
    BadSignature: typings.kdbxweb.kdbxwebStrings.BadSignature,
    FileCorrupt: FileCorrupt,
    InvalidArg: InvalidArg,
    InvalidKey: InvalidKey,
    InvalidVersion: InvalidVersion,
    MergeError: MergeError,
    NotImplemented: NotImplemented,
    Unsupported: Unsupported
  ): BadSignature = {
    val __obj = js.Dynamic.literal(BadSignature = BadSignature.asInstanceOf[js.Any], FileCorrupt = FileCorrupt.asInstanceOf[js.Any], InvalidArg = InvalidArg.asInstanceOf[js.Any], InvalidKey = InvalidKey.asInstanceOf[js.Any], InvalidVersion = InvalidVersion.asInstanceOf[js.Any], MergeError = MergeError.asInstanceOf[js.Any], NotImplemented = NotImplemented.asInstanceOf[js.Any], Unsupported = Unsupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadSignature]
  }
  
  @scala.inline
  implicit class BadSignatureOps[Self <: BadSignature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBadSignature(value: typings.kdbxweb.kdbxwebStrings.BadSignature): Self = this.set("BadSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileCorrupt(value: FileCorrupt): Self = this.set("FileCorrupt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidArg(value: InvalidArg): Self = this.set("InvalidArg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidKey(value: InvalidKey): Self = this.set("InvalidKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidVersion(value: InvalidVersion): Self = this.set("InvalidVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeError(value: MergeError): Self = this.set("MergeError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotImplemented(value: NotImplemented): Self = this.set("NotImplemented", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsupported(value: Unsupported): Self = this.set("Unsupported", value.asInstanceOf[js.Any])
  }
}
