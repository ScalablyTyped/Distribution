package typings.hapiHawk

import typings.hapiHawk.clientMod.Credentials
import typings.node.cryptoMod.Hash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cryptoMod {
  
  @JSImport("@hapi/hawk/lib/crypto", "algorithms")
  @js.native
  val algorithms: js.Array[String] = js.native
  
  @JSImport("@hapi/hawk/lib/crypto", "calculateMac")
  @js.native
  def calculateMac(`type`: String, credentials: Credentials, options: Artifacts): String = js.native
  
  @JSImport("@hapi/hawk/lib/crypto", "calculatePayloadHash")
  @js.native
  def calculatePayloadHash(payload: String, algorithm: String, contentType: String): String = js.native
  
  @JSImport("@hapi/hawk/lib/crypto", "calculateTsMac")
  @js.native
  def calculateTsMac(ts: String, credentials: Credentials): String = js.native
  
  @JSImport("@hapi/hawk/lib/crypto", "finalizePayloadHash")
  @js.native
  def finalizePayloadHash(hash: Hash): String = js.native
  
  @JSImport("@hapi/hawk/lib/crypto", "generateNormalizedString")
  @js.native
  def generateNormalizedString(`type`: String, options: Artifacts): String = js.native
  
  @JSImport("@hapi/hawk/lib/crypto", "headerVersion")
  @js.native
  val headerVersion: String = js.native
  
  @JSImport("@hapi/hawk/lib/crypto", "initializePayloadHash")
  @js.native
  def initializePayloadHash(algorithm: String, contentType: String): String = js.native
  
  @JSImport("@hapi/hawk/lib/crypto", "timestampMessage")
  @js.native
  def timestampMessage(credentials: Credentials, localtimeOffsetMsec: Double): TimestampMessage_ = js.native
  
  @js.native
  trait Artifacts extends StObject {
    
    var app: js.UndefOr[String] = js.native
    
    var dlg: js.UndefOr[String] = js.native
    
    var ext: js.UndefOr[String] = js.native
    
    var hash: js.UndefOr[String] = js.native
    
    var host: String = js.native
    
    var method: String = js.native
    
    var nonce: String = js.native
    
    var port: Double = js.native
    
    var resource: String = js.native
    
    var ts: String = js.native
  }
  object Artifacts {
    
    @scala.inline
    def apply(host: String, method: String, nonce: String, port: Double, resource: String, ts: String): Artifacts = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[Artifacts]
    }
    
    @scala.inline
    implicit class ArtifactsMutableBuilder[Self <: Artifacts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
      
      @scala.inline
      def setDlg(value: String): Self = StObject.set(x, "dlg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDlgUndefined: Self = StObject.set(x, "dlg", js.undefined)
      
      @scala.inline
      def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTs(value: String): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TimestampMessage_ extends StObject {
    
    var ts: Double = js.native
    
    var tsm: String = js.native
  }
  object TimestampMessage_ {
    
    @scala.inline
    def apply(ts: Double, tsm: String): TimestampMessage_ = {
      val __obj = js.Dynamic.literal(ts = ts.asInstanceOf[js.Any], tsm = tsm.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimestampMessage_]
    }
    
    @scala.inline
    implicit class TimestampMessage_MutableBuilder[Self <: TimestampMessage_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTsm(value: String): Self = StObject.set(x, "tsm", value.asInstanceOf[js.Any])
    }
  }
}
