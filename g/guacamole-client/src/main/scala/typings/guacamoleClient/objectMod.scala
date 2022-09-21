package typings.guacamoleClient

import typings.guacamoleClient.clientMod.Client
import typings.guacamoleClient.guacCommonMod.Mimetype
import typings.guacamoleClient.inputStreamMod.InputStream
import typings.guacamoleClient.outputStreamMod.OutputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectMod {
  
  @JSImport("guacamole-client/lib/Object", "Object")
  @js.native
  open class Object protected () extends StObject {
    /**
      * @param client The client owning this object.
      * @param index The index of this object.
      */
    def this(client: Client, index: Double) = this()
    
    /**
      * Creates a new output stream associated with this object and having the
      * given mimetype and name. The legality of a mimetype and name is dictated
      * by the object itself.
      * @param mimetype The mimetype of the data which will be sent to the output stream.
      * @param name The defined name of an output stream within this object.
      * @returns An output stream which will write blobs to the named output stream of this object.
      */
    def createOutputStream(mimetype: Mimetype, name: String): OutputStream = js.native
    
    /**
      * The index of this object.
      */
    val index: Double = js.native
    
    /**
      * Called when this object receives the body of a requested input stream.
      * By default, all objects will invoke the callbacks provided to their
      * requestInputStream() functions based on the name of the stream
      * requested. This behavior can be overridden by specifying a different
      * handler here.
      *
      * @event
      * @param bodyStream The input stream of the received body.
      * @param mimetype The mimetype of the data being received.
      * @param name The name of the stream whose body has been received.
      */
    var onbody: Null | (js.Function2[/* bodyStream */ InputStream, /* mimetype */ Mimetype, Unit]) = js.native
    
    /**
      * Called when this object is being undefined. Once undefined, no further
      * communication involving this object may occur.
      *
      * @event
      */
    var onundefine: Null | js.Function0[Unit] = js.native
    
    /**
      * Requests read access to the input stream having the given name. If
      * successful, a new input stream will be created.
      *
      * @param name The name of the input stream to request.
      * @param bodyCallback
      * The callback to invoke when the body of the requested input stream
      * is received. This callback will be provided a Guacamole.InputStream
      * and its mimetype as its two only arguments. If the onbody handler of
      * this object is overridden, this callback will not be invoked.
      */
    def requestInputStream(name: String): Unit = js.native
    def requestInputStream(name: String, bodyCallback: js.Function2[/* stream */ InputStream, /* mimetype */ Mimetype, Unit]): Unit = js.native
  }
  /* static members */
  object Object {
    
    /**
      * The reserved name denoting the root stream of any object. The contents of
      * the root stream MUST be a JSON map of stream name to mimetype.
      */
    @JSImport("guacamole-client/lib/Object", "Object.ROOT_STREAM")
    @js.native
    val ROOT_STREAM: String = js.native
    
    /**
      * The mimetype of a stream containing JSON which maps available stream names
      * to their corresponding mimetype. The root stream of a Guacamole.Object MUST
      * have this mimetype.
      */
    @JSImport("guacamole-client/lib/Object", "Object.STREAM_INDEX_MIMETYPE")
    @js.native
    val STREAM_INDEX_MIMETYPE: String = js.native
  }
}
