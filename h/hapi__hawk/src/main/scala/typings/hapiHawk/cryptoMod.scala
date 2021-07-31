package typings.hapiHawk

import typings.hapiHawk.clientMod.Credentials
import typings.node.cryptoMod.Hash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cryptoMod {
  
  @JSImport("@hapi/hawk/lib/crypto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@hapi/hawk/lib/crypto", "algorithms")
  @js.native
  val algorithms: js.Array[String] = js.native
  
  @scala.inline
  def calculateMac(`type`: String, credentials: Credentials, options: Artifacts): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateMac")(`type`.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def calculatePayloadHash(payload: String, algorithm: String, contentType: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calculatePayloadHash")(payload.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def calculateTsMac(ts: String, credentials: Credentials): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateTsMac")(ts.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def finalizePayloadHash(hash: Hash): String = ^.asInstanceOf[js.Dynamic].applyDynamic("finalizePayloadHash")(hash.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def generateNormalizedString(`type`: String, options: Artifacts): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateNormalizedString")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@hapi/hawk/lib/crypto", "headerVersion")
  @js.native
  val headerVersion: String = js.native
  
  @scala.inline
  def initializePayloadHash(algorithm: String, contentType: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("initializePayloadHash")(algorithm.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def timestampMessage(credentials: Credentials, localtimeOffsetMsec: Double): TimestampMessage_ = (^.asInstanceOf[js.Dynamic].applyDynamic("timestampMessage")(credentials.asInstanceOf[js.Any], localtimeOffsetMsec.asInstanceOf[js.Any])).asInstanceOf[TimestampMessage_]
  
  trait Artifacts extends StObject {
    
    var app: js.UndefOr[String] = js.undefined
    
    var dlg: js.UndefOr[String] = js.undefined
    
    var ext: js.UndefOr[String] = js.undefined
    
    var hash: js.UndefOr[String] = js.undefined
    
    var host: String
    
    var method: String
    
    var nonce: String
    
    var port: Double
    
    var resource: String
    
    var ts: String
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
  
  trait TimestampMessage_ extends StObject {
    
    var ts: Double
    
    var tsm: String
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
