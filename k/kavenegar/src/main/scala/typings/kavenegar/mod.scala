package typings.kavenegar

import typings.kavenegar.anon.Apilogs
import typings.kavenegar.anon.Cost
import typings.kavenegar.anon.Dailyreport
import typings.kavenegar.anon.Date
import typings.kavenegar.anon.Enddate
import typings.kavenegar.anon.EnddateStartdate
import typings.kavenegar.anon.Expiredate
import typings.kavenegar.anon.Hide
import typings.kavenegar.anon.Isread
import typings.kavenegar.anon.Linenumber
import typings.kavenegar.anon.Localid
import typings.kavenegar.anon.Message
import typings.kavenegar.anon.Messageid
import typings.kavenegar.anon.Pagesize
import typings.kavenegar.anon.Receptor
import typings.kavenegar.anon.Repeat
import typings.kavenegar.anon.Startdate
import typings.kavenegar.anon.Status
import typings.kavenegar.anon.Statustext
import typings.kavenegar.anon.Sumcount
import typings.kavenegar.mod.kavenegar.KavenegarInstance
import typings.kavenegar.mod.kavenegar.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("kavenegar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def KavenegarApi(options: Options): KavenegarInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("KavenegarApi")(options.asInstanceOf[js.Any]).asInstanceOf[KavenegarInstance]
  
  object kavenegar {
    
    /* Rewritten from type alias, can be one of: 
      - typings.kavenegar.kavenegarStrings.sms
      - typings.kavenegar.kavenegarStrings.verify
      - typings.kavenegar.kavenegarStrings.account
      - typings.kavenegar.kavenegarStrings.call
    */
    trait Actions extends StObject
    object Actions {
      
      inline def account: typings.kavenegar.kavenegarStrings.account = "account".asInstanceOf[typings.kavenegar.kavenegarStrings.account]
      
      inline def call: typings.kavenegar.kavenegarStrings.call = "call".asInstanceOf[typings.kavenegar.kavenegarStrings.call]
      
      inline def sms: typings.kavenegar.kavenegarStrings.sms = "sms".asInstanceOf[typings.kavenegar.kavenegarStrings.sms]
      
      inline def verify: typings.kavenegar.kavenegarStrings.verify = "verify".asInstanceOf[typings.kavenegar.kavenegarStrings.verify]
    }
    
    trait KavenegarInstance extends StObject {
      
      def AccountConfig(
        data: Apilogs,
        callback: js.Function3[/* entries */ Dailyreport, /* status */ Double, /* message */ String, Unit]
      ): Unit
      @JSName("AccountConfig")
      var AccountConfig_Original: ResponseK[Apilogs, Dailyreport]
      
      def AccountInfo(
        data: js.Object,
        callback: js.Function3[/* entries */ Expiredate, /* status */ Double, /* message */ String, Unit]
      ): Unit
      @JSName("AccountInfo")
      var AccountInfo_Original: ResponseK[js.Object, Expiredate]
      
      def CallMakeTTS(
        data: Repeat,
        callback: js.Function3[/* entries */ js.Array[Cost], /* status */ Double, /* message */ String, Unit]
      ): Unit
      @JSName("CallMakeTTS")
      var CallMakeTTS_Original: ResponseK[Repeat, js.Array[Cost]]
      
      def Cancel(
        data: Messageid,
        callback: js.Function3[/* entries */ js.Array[Status], /* status */ Double, /* message */ String, Unit]
      ): Unit
      @JSName("Cancel")
      var Cancel_Original: ResponseK[Messageid, js.Array[Status]]
      
      def CountInbox(
        data: Linenumber,
        callback: js.Function3[
              /* entries */ js.Array[EnddateStartdate], 
              /* status */ Double, 
              /* message */ String, 
              Unit
            ]
      ): Unit
      @JSName("CountInbox")
      var CountInbox_Original: ResponseK[Linenumber, js.Array[EnddateStartdate]]
      
      def CountOutbox(
        data: Startdate,
        callback: js.Function3[/* entries */ js.Array[Sumcount], /* status */ Double, /* message */ String, Unit]
      ): Unit
      @JSName("CountOutbox")
      var CountOutbox_Original: ResponseK[Startdate, js.Array[Sumcount]]
      
      def CountPostalCode(
        data: Any,
        callback: js.Function3[/* entries */ Any, /* status */ Double, /* message */ String, Unit]
      ): Unit
      @JSName("CountPostalCode")
      var CountPostalCode_Original: ResponseK[Any, Any]
      
      def LatestOutbox(
        data: Pagesize,
        callback: js.Function3[/* entries */ js.Array[Cost], /* status */ Double, /* message */ String, Unit]
      ): Unit
      @JSName("LatestOutbox")
      var LatestOutbox_Original: ResponseK[Pagesize, js.Array[Cost]]
      
      def Receive(
        data: Isread,
        callback: js.Function3[/* entries */ js.Array[Message], /* status */ Double, /* message */ String, Unit]
      ): Unit
      @JSName("Receive")
      var Receive_Original: ResponseK[Isread, js.Array[Message]]
      
      def Select(
        data: Messageid,
        callback: js.Function3[/* entries */ js.Array[Cost], /* status */ Double, /* message */ String, Unit]
      ): Unit
      
      def SelectOutbox(
        data: Enddate,
        callback: js.Function3[/* entries */ js.Array[Cost], /* status */ Double, /* message */ String, Unit]
      ): Unit
      @JSName("SelectOutbox")
      var SelectOutbox_Original: ResponseK[Enddate, js.Array[Cost]]
      
      @JSName("Select")
      var Select_Original: ResponseK[Messageid, js.Array[Cost]]
      
      def Send(
        data: Date,
        callback: js.Function3[/* entries */ js.Array[Cost], /* status */ Double, /* message */ String, Unit]
      ): Unit
      
      def SendArray(
        data: Hide,
        callback: js.Function3[/* entries */ js.Array[Cost], /* status */ Double, /* message */ String, Unit]
      ): Unit
      @JSName("SendArray")
      var SendArray_Original: ResponseK[Hide, js.Array[Cost]]
      
      def SendByPostalCode(
        data: Any,
        callback: js.Function3[/* entries */ Any, /* status */ Double, /* message */ String, Unit]
      ): Unit
      @JSName("SendByPostalCode")
      var SendByPostalCode_Original: ResponseK[Any, Any]
      
      @JSName("Send")
      var Send_Original: ResponseK[Date, js.Array[Cost]]
      
      def Status(
        data: Messageid,
        callback: js.Function3[
              /* entries */ js.Array[typings.kavenegar.anon.Status], 
              /* status */ Double, 
              /* message */ String, 
              Unit
            ]
      ): Unit
      
      def StatusLocalMessageid(
        data: Localid,
        callback: js.Function3[/* entries */ js.Array[Statustext], /* status */ Double, /* message */ String, Unit]
      ): Unit
      @JSName("StatusLocalMessageid")
      var StatusLocalMessageid_Original: ResponseK[Localid, js.Array[Statustext]]
      
      @JSName("Status")
      var Status_Original: ResponseK[Messageid, js.Array[Status]]
      
      def VerifyLookup(
        data: Receptor,
        callback: js.Function3[/* entries */ js.Array[Cost], /* status */ Double, /* message */ String, Unit]
      ): Unit
      @JSName("VerifyLookup")
      var VerifyLookup_Original: ResponseK[Receptor, js.Array[Cost]]
      
      def request(action: Actions, method: Methods, params: js.Object, callback: Any): Unit
    }
    object KavenegarInstance {
      
      inline def apply(
        AccountConfig: (Apilogs, /* callback */ js.Function3[Dailyreport, /* status */ Double, /* message */ String, Unit]) => Unit,
        AccountInfo: (js.Object, /* callback */ js.Function3[Expiredate, /* status */ Double, /* message */ String, Unit]) => Unit,
        CallMakeTTS: (Repeat, /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => Unit,
        Cancel: (Messageid, /* callback */ js.Function3[js.Array[Status], /* status */ Double, /* message */ String, Unit]) => Unit,
        CountInbox: (Linenumber, /* callback */ js.Function3[js.Array[EnddateStartdate], /* status */ Double, /* message */ String, Unit]) => Unit,
        CountOutbox: (Startdate, /* callback */ js.Function3[js.Array[Sumcount], /* status */ Double, /* message */ String, Unit]) => Unit,
        CountPostalCode: (Any, /* callback */ js.Function3[Any, /* status */ Double, /* message */ String, Unit]) => Unit,
        LatestOutbox: (Pagesize, /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => Unit,
        Receive: (Isread, /* callback */ js.Function3[js.Array[Message], /* status */ Double, /* message */ String, Unit]) => Unit,
        Select: (Messageid, /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => Unit,
        SelectOutbox: (Enddate, /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => Unit,
        Send: (Date, /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => Unit,
        SendArray: (Hide, /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => Unit,
        SendByPostalCode: (Any, /* callback */ js.Function3[Any, /* status */ Double, /* message */ String, Unit]) => Unit,
        Status: (Messageid, /* callback */ js.Function3[js.Array[Status], /* status */ Double, /* message */ String, Unit]) => Unit,
        StatusLocalMessageid: (Localid, /* callback */ js.Function3[js.Array[Statustext], /* status */ Double, /* message */ String, Unit]) => Unit,
        VerifyLookup: (Receptor, /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => Unit,
        request: (Actions, Methods, js.Object, Any) => Unit
      ): KavenegarInstance = {
        val __obj = js.Dynamic.literal(AccountConfig = js.Any.fromFunction2(AccountConfig), AccountInfo = js.Any.fromFunction2(AccountInfo), CallMakeTTS = js.Any.fromFunction2(CallMakeTTS), Cancel = js.Any.fromFunction2(Cancel), CountInbox = js.Any.fromFunction2(CountInbox), CountOutbox = js.Any.fromFunction2(CountOutbox), CountPostalCode = js.Any.fromFunction2(CountPostalCode), LatestOutbox = js.Any.fromFunction2(LatestOutbox), Receive = js.Any.fromFunction2(Receive), Select = js.Any.fromFunction2(Select), SelectOutbox = js.Any.fromFunction2(SelectOutbox), Send = js.Any.fromFunction2(Send), SendArray = js.Any.fromFunction2(SendArray), SendByPostalCode = js.Any.fromFunction2(SendByPostalCode), Status = js.Any.fromFunction2(Status), StatusLocalMessageid = js.Any.fromFunction2(StatusLocalMessageid), VerifyLookup = js.Any.fromFunction2(VerifyLookup), request = js.Any.fromFunction4(request))
        __obj.asInstanceOf[KavenegarInstance]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: KavenegarInstance] (val x: Self) extends AnyVal {
        
        inline def setAccountConfig(
          value: (Apilogs, /* callback */ js.Function3[Dailyreport, /* status */ Double, /* message */ String, Unit]) => Unit
        ): Self = StObject.set(x, "AccountConfig", js.Any.fromFunction2(value))
        
        inline def setAccountInfo(
          value: (js.Object, /* callback */ js.Function3[Expiredate, /* status */ Double, /* message */ String, Unit]) => Unit
        ): Self = StObject.set(x, "AccountInfo", js.Any.fromFunction2(value))
        
        inline def setCallMakeTTS(
          value: (Repeat, /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => Unit
        ): Self = StObject.set(x, "CallMakeTTS", js.Any.fromFunction2(value))
        
        inline def setCancel(
          value: (Messageid, /* callback */ js.Function3[js.Array[Status], /* status */ Double, /* message */ String, Unit]) => Unit
        ): Self = StObject.set(x, "Cancel", js.Any.fromFunction2(value))
        
        inline def setCountInbox(
          value: (Linenumber, /* callback */ js.Function3[js.Array[EnddateStartdate], /* status */ Double, /* message */ String, Unit]) => Unit
        ): Self = StObject.set(x, "CountInbox", js.Any.fromFunction2(value))
        
        inline def setCountOutbox(
          value: (Startdate, /* callback */ js.Function3[js.Array[Sumcount], /* status */ Double, /* message */ String, Unit]) => Unit
        ): Self = StObject.set(x, "CountOutbox", js.Any.fromFunction2(value))
        
        inline def setCountPostalCode(
          value: (Any, /* callback */ js.Function3[Any, /* status */ Double, /* message */ String, Unit]) => Unit
        ): Self = StObject.set(x, "CountPostalCode", js.Any.fromFunction2(value))
        
        inline def setLatestOutbox(
          value: (Pagesize, /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => Unit
        ): Self = StObject.set(x, "LatestOutbox", js.Any.fromFunction2(value))
        
        inline def setReceive(
          value: (Isread, /* callback */ js.Function3[js.Array[Message], /* status */ Double, /* message */ String, Unit]) => Unit
        ): Self = StObject.set(x, "Receive", js.Any.fromFunction2(value))
        
        inline def setRequest(value: (Actions, Methods, js.Object, Any) => Unit): Self = StObject.set(x, "request", js.Any.fromFunction4(value))
        
        inline def setSelect(
          value: (Messageid, /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => Unit
        ): Self = StObject.set(x, "Select", js.Any.fromFunction2(value))
        
        inline def setSelectOutbox(
          value: (Enddate, /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => Unit
        ): Self = StObject.set(x, "SelectOutbox", js.Any.fromFunction2(value))
        
        inline def setSend(
          value: (Date, /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => Unit
        ): Self = StObject.set(x, "Send", js.Any.fromFunction2(value))
        
        inline def setSendArray(
          value: (Hide, /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => Unit
        ): Self = StObject.set(x, "SendArray", js.Any.fromFunction2(value))
        
        inline def setSendByPostalCode(
          value: (Any, /* callback */ js.Function3[Any, /* status */ Double, /* message */ String, Unit]) => Unit
        ): Self = StObject.set(x, "SendByPostalCode", js.Any.fromFunction2(value))
        
        inline def setStatus(
          value: (Messageid, /* callback */ js.Function3[js.Array[Status], /* status */ Double, /* message */ String, Unit]) => Unit
        ): Self = StObject.set(x, "Status", js.Any.fromFunction2(value))
        
        inline def setStatusLocalMessageid(
          value: (Localid, /* callback */ js.Function3[js.Array[Statustext], /* status */ Double, /* message */ String, Unit]) => Unit
        ): Self = StObject.set(x, "StatusLocalMessageid", js.Any.fromFunction2(value))
        
        inline def setVerifyLookup(
          value: (Receptor, /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => Unit
        ): Self = StObject.set(x, "VerifyLookup", js.Any.fromFunction2(value))
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.kavenegar.kavenegarStrings.send
      - typings.kavenegar.kavenegarStrings.sendarray
      - typings.kavenegar.kavenegarStrings.status
      - typings.kavenegar.kavenegarStrings.statuslocalmessageid
      - typings.kavenegar.kavenegarStrings.select
      - typings.kavenegar.kavenegarStrings.selectoutbox
      - typings.kavenegar.kavenegarStrings.latestoutbox
      - typings.kavenegar.kavenegarStrings.countoutbox
      - typings.kavenegar.kavenegarStrings.cancel
      - typings.kavenegar.kavenegarStrings.receive
      - typings.kavenegar.kavenegarStrings.countinbox
      - typings.kavenegar.kavenegarStrings.countpostalcode
      - typings.kavenegar.kavenegarStrings.sendbypostalcode
      - typings.kavenegar.kavenegarStrings.lookup
      - typings.kavenegar.kavenegarStrings.info
      - typings.kavenegar.kavenegarStrings.config
      - typings.kavenegar.kavenegarStrings.maketts
    */
    trait Methods extends StObject
    object Methods {
      
      inline def cancel: typings.kavenegar.kavenegarStrings.cancel = "cancel".asInstanceOf[typings.kavenegar.kavenegarStrings.cancel]
      
      inline def config: typings.kavenegar.kavenegarStrings.config = "config".asInstanceOf[typings.kavenegar.kavenegarStrings.config]
      
      inline def countinbox: typings.kavenegar.kavenegarStrings.countinbox = "countinbox".asInstanceOf[typings.kavenegar.kavenegarStrings.countinbox]
      
      inline def countoutbox: typings.kavenegar.kavenegarStrings.countoutbox = "countoutbox".asInstanceOf[typings.kavenegar.kavenegarStrings.countoutbox]
      
      inline def countpostalcode: typings.kavenegar.kavenegarStrings.countpostalcode = "countpostalcode".asInstanceOf[typings.kavenegar.kavenegarStrings.countpostalcode]
      
      inline def info: typings.kavenegar.kavenegarStrings.info = "info".asInstanceOf[typings.kavenegar.kavenegarStrings.info]
      
      inline def latestoutbox: typings.kavenegar.kavenegarStrings.latestoutbox = "latestoutbox".asInstanceOf[typings.kavenegar.kavenegarStrings.latestoutbox]
      
      inline def lookup: typings.kavenegar.kavenegarStrings.lookup = "lookup".asInstanceOf[typings.kavenegar.kavenegarStrings.lookup]
      
      inline def maketts: typings.kavenegar.kavenegarStrings.maketts = "maketts".asInstanceOf[typings.kavenegar.kavenegarStrings.maketts]
      
      inline def receive: typings.kavenegar.kavenegarStrings.receive = "receive".asInstanceOf[typings.kavenegar.kavenegarStrings.receive]
      
      inline def select: typings.kavenegar.kavenegarStrings.select = "select".asInstanceOf[typings.kavenegar.kavenegarStrings.select]
      
      inline def selectoutbox: typings.kavenegar.kavenegarStrings.selectoutbox = "selectoutbox".asInstanceOf[typings.kavenegar.kavenegarStrings.selectoutbox]
      
      inline def send: typings.kavenegar.kavenegarStrings.send = "send".asInstanceOf[typings.kavenegar.kavenegarStrings.send]
      
      inline def sendarray: typings.kavenegar.kavenegarStrings.sendarray = "sendarray".asInstanceOf[typings.kavenegar.kavenegarStrings.sendarray]
      
      inline def sendbypostalcode: typings.kavenegar.kavenegarStrings.sendbypostalcode = "sendbypostalcode".asInstanceOf[typings.kavenegar.kavenegarStrings.sendbypostalcode]
      
      inline def status: typings.kavenegar.kavenegarStrings.status = "status".asInstanceOf[typings.kavenegar.kavenegarStrings.status]
      
      inline def statuslocalmessageid: typings.kavenegar.kavenegarStrings.statuslocalmessageid = "statuslocalmessageid".asInstanceOf[typings.kavenegar.kavenegarStrings.statuslocalmessageid]
    }
    
    trait Options extends StObject {
      
      var apikey: String
      
      var host: js.UndefOr[String] = js.undefined
      
      var version: js.UndefOr[String] = js.undefined
    }
    object Options {
      
      inline def apply(apikey: String): Options = {
        val __obj = js.Dynamic.literal(apikey = apikey.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setApikey(value: String): Self = StObject.set(x, "apikey", value.asInstanceOf[js.Any])
        
        inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
        
        inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      }
    }
    
    type ResponseK[T, Y] = js.Function2[
        /* data */ T, 
        /* callback */ js.Function3[/* entries */ Y, /* status */ Double, /* message */ String, Unit], 
        Unit
      ]
  }
}
