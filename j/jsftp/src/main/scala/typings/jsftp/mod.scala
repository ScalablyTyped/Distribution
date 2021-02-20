package typings.jsftp

import typings.jsftp.anon.Code
import typings.jsftp.anon.Host
import typings.jsftp.anon.Name
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.node.eventsMod.EventEmitter
import typings.node.netMod.Socket
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsftp", JSImport.Default)
  @js.native
  class default protected () extends Ftp {
    def this(opts: JsftpOpts) = this()
  }
  
  type ErrorCallback = js.Function1[/* err */ Error, Unit]
  
  @js.native
  trait Ftp extends EventEmitter {
    
    def destroy(): Unit = js.native
    
    def get(remotePath: String, callback: GetCallback): Unit = js.native
    def get(remotePath: String, localPath: String, callback: ErrorCallback): Unit = js.native
    
    def keepAlive(): Unit = js.native
    def keepAlive(timeInMs: Double): Unit = js.native
    
    def list(filePath: String, callback: ListCallback): Unit = js.native
    
    def ls(filePath: String, callback: LsCallback): Unit = js.native
    
    def put(source: String, remotePath: String, callback: ErrorCallback): Unit = js.native
    def put(source: Buffer, remotePath: String, callback: ErrorCallback): Unit = js.native
    def put(source: ReadableStream, remotePath: String, callback: ErrorCallback): Unit = js.native
    
    def raw(command: String, arg1: js.Any, arg2: js.Any, arg3: js.Any, arg4: js.Any, callback: RawCallback): Unit = js.native
    def raw(command: String, arg1: js.Any, arg2: js.Any, arg3: js.Any, callback: RawCallback): Unit = js.native
    def raw(command: String, arg1: js.Any, arg2: js.Any, callback: RawCallback): Unit = js.native
    def raw(command: String, arg1: js.Any, callback: RawCallback): Unit = js.native
    // Ftp.raw(command, params, callback)
    def raw(command: String, callback: RawCallback): Unit = js.native
    
    def rename(from: String, to: String, callback: ErrorCallback): Unit = js.native
  }
  
  type GetCallback = js.Function2[/* err */ Error, /* socket */ Socket, Unit]
  
  @js.native
  trait JsftpOpts extends StObject {
    
    var createSocket: js.UndefOr[
        js.Function2[/* hasPortHost */ Host, /* firstAction */ js.Function0[js.Object], Socket]
      ] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var pass: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var useList: js.UndefOr[Boolean] = js.native
    
    var user: js.UndefOr[String] = js.native
  }
  object JsftpOpts {
    
    @scala.inline
    def apply(): JsftpOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsftpOpts]
    }
    
    @scala.inline
    implicit class JsftpOptsMutableBuilder[Self <: JsftpOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateSocket(value: (/* hasPortHost */ Host, /* firstAction */ js.Function0[js.Object]) => Socket): Self = StObject.set(x, "createSocket", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateSocketUndefined: Self = StObject.set(x, "createSocket", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setUseList(value: Boolean): Self = StObject.set(x, "useList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseListUndefined: Self = StObject.set(x, "useList", js.undefined)
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  type ListCallback = js.Function2[/* err */ Error, /* dirContents */ String, Unit]
  
  type LsCallback = js.Function2[/* err */ Error, /* res */ js.Array[Name], Unit]
  
  type RawCallback = js.Function2[/* err */ Error, /* data */ Code, Unit]
}
