package typings.kavenegar

import typings.kavenegar.mod.kavenegar.Actions
import typings.kavenegar.mod.kavenegar.Methods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kavenegarStrings {
  
  @js.native
  sealed trait account
    extends StObject
       with Actions
  inline def account: account = "account".asInstanceOf[account]
  
  @js.native
  sealed trait call
    extends StObject
       with Actions
  inline def call: call = "call".asInstanceOf[call]
  
  @js.native
  sealed trait cancel
    extends StObject
       with Methods
  inline def cancel: cancel = "cancel".asInstanceOf[cancel]
  
  @js.native
  sealed trait config
    extends StObject
       with Methods
  inline def config: config = "config".asInstanceOf[config]
  
  @js.native
  sealed trait countinbox
    extends StObject
       with Methods
  inline def countinbox: countinbox = "countinbox".asInstanceOf[countinbox]
  
  @js.native
  sealed trait countoutbox
    extends StObject
       with Methods
  inline def countoutbox: countoutbox = "countoutbox".asInstanceOf[countoutbox]
  
  @js.native
  sealed trait countpostalcode
    extends StObject
       with Methods
  inline def countpostalcode: countpostalcode = "countpostalcode".asInstanceOf[countpostalcode]
  
  @js.native
  sealed trait info
    extends StObject
       with Methods
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait latestoutbox
    extends StObject
       with Methods
  inline def latestoutbox: latestoutbox = "latestoutbox".asInstanceOf[latestoutbox]
  
  @js.native
  sealed trait lookup
    extends StObject
       with Methods
  inline def lookup: lookup = "lookup".asInstanceOf[lookup]
  
  @js.native
  sealed trait maketts
    extends StObject
       with Methods
  inline def maketts: maketts = "maketts".asInstanceOf[maketts]
  
  @js.native
  sealed trait receive
    extends StObject
       with Methods
  inline def receive: receive = "receive".asInstanceOf[receive]
  
  @js.native
  sealed trait select
    extends StObject
       with Methods
  inline def select: select = "select".asInstanceOf[select]
  
  @js.native
  sealed trait selectoutbox
    extends StObject
       with Methods
  inline def selectoutbox: selectoutbox = "selectoutbox".asInstanceOf[selectoutbox]
  
  @js.native
  sealed trait send
    extends StObject
       with Methods
  inline def send: send = "send".asInstanceOf[send]
  
  @js.native
  sealed trait sendarray
    extends StObject
       with Methods
  inline def sendarray: sendarray = "sendarray".asInstanceOf[sendarray]
  
  @js.native
  sealed trait sendbypostalcode
    extends StObject
       with Methods
  inline def sendbypostalcode: sendbypostalcode = "sendbypostalcode".asInstanceOf[sendbypostalcode]
  
  @js.native
  sealed trait sms
    extends StObject
       with Actions
  inline def sms: sms = "sms".asInstanceOf[sms]
  
  @js.native
  sealed trait status
    extends StObject
       with Methods
  inline def status: status = "status".asInstanceOf[status]
  
  @js.native
  sealed trait statuslocalmessageid
    extends StObject
       with Methods
  inline def statuslocalmessageid: statuslocalmessageid = "statuslocalmessageid".asInstanceOf[statuslocalmessageid]
  
  @js.native
  sealed trait verify
    extends StObject
       with Actions
  inline def verify: verify = "verify".asInstanceOf[verify]
}
