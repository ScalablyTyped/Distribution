package typings.imapflow.mod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailboxObject extends StObject {
  
  var delimeter: String
  
  var exists: Double
  
  var flags: Set[String]
  
  var highestModseq: js.BigInt
  
  var listed: Boolean
  
  var mailboxId: String
  
  var path: String
  
  var permanentFlags: Set[String]
  
  var specialUse: String
  
  var subscribed: Boolean
  
  var uidNext: Double
  
  var uidValidity: js.BigInt
}
object MailboxObject {
  
  inline def apply(
    delimeter: String,
    exists: Double,
    flags: Set[String],
    highestModseq: js.BigInt,
    listed: Boolean,
    mailboxId: String,
    path: String,
    permanentFlags: Set[String],
    specialUse: String,
    subscribed: Boolean,
    uidNext: Double,
    uidValidity: js.BigInt
  ): MailboxObject = {
    val __obj = js.Dynamic.literal(delimeter = delimeter.asInstanceOf[js.Any], exists = exists.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], highestModseq = highestModseq.asInstanceOf[js.Any], listed = listed.asInstanceOf[js.Any], mailboxId = mailboxId.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], permanentFlags = permanentFlags.asInstanceOf[js.Any], specialUse = specialUse.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any], uidNext = uidNext.asInstanceOf[js.Any], uidValidity = uidValidity.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailboxObject]
  }
  
  extension [Self <: MailboxObject](x: Self) {
    
    inline def setDelimeter(value: String): Self = StObject.set(x, "delimeter", value.asInstanceOf[js.Any])
    
    inline def setExists(value: Double): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: Set[String]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setHighestModseq(value: js.BigInt): Self = StObject.set(x, "highestModseq", value.asInstanceOf[js.Any])
    
    inline def setListed(value: Boolean): Self = StObject.set(x, "listed", value.asInstanceOf[js.Any])
    
    inline def setMailboxId(value: String): Self = StObject.set(x, "mailboxId", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPermanentFlags(value: Set[String]): Self = StObject.set(x, "permanentFlags", value.asInstanceOf[js.Any])
    
    inline def setSpecialUse(value: String): Self = StObject.set(x, "specialUse", value.asInstanceOf[js.Any])
    
    inline def setSubscribed(value: Boolean): Self = StObject.set(x, "subscribed", value.asInstanceOf[js.Any])
    
    inline def setUidNext(value: Double): Self = StObject.set(x, "uidNext", value.asInstanceOf[js.Any])
    
    inline def setUidValidity(value: js.BigInt): Self = StObject.set(x, "uidValidity", value.asInstanceOf[js.Any])
  }
}
