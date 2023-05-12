package typings.ippPrinter

import org.scalablytyped.runtime.Instantiable1
import typings.ippPrinter.anon.Major
import typings.ippPrinter.ippPrinterStrings.job
import typings.ippPrinter.ippPrinterStrings.operation
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.bufferMod.global.BufferEncoding
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import typings.node.nodeColonstreamMod.Readable
import typings.node.streamMod.ReadableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ipp-printer", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Printer {
    def this(opts: String) = this()
    def this(opts: Options) = this()
  }
  
  @JSImport("ipp-printer", "Job")
  @js.native
  open class Job () extends Readable {
    def this(opts: ReadableOptions) = this()
    
    def attributes(): js.Array[Attribute] = js.native
    def attributes(filter: js.Array[String]): js.Array[Attribute] = js.native
    
    var compression: String = js.native
    
    var createdAt: js.Date = js.native
    
    var id: Double = js.native
    
    var name: String = js.native
    
    def pause(): this.type = js.native
    
    def resume(): this.type = js.native
    
    def setEncoding(encoding: BufferEncoding): this.type = js.native
    
    var state: Double = js.native
    
    def unpipe(): this.type = js.native
    def unpipe(destination: WritableStream): this.type = js.native
    
    var uri: String = js.native
    
    var userName: String = js.native
    
    def wrap(oldStream: ReadableStream): this.type = js.native
  }
  
  trait Attribute extends StObject {
    
    var name: String
    
    var tag: Double
    
    var value: String | Double | js.Date
  }
  object Attribute {
    
    inline def apply(name: String, tag: Double, value: String | Double | js.Date): Attribute = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attribute]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTag(value: Double): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Double | js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait AttributeGroup extends StObject {
    
    var attributes: js.Array[Attribute]
    
    var tag: Double
  }
  object AttributeGroup {
    
    inline def apply(attributes: js.Array[Attribute], tag: Double): AttributeGroup = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeGroup]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AttributeGroup] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setTag(value: Double): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait Operation extends StObject {
    
    var groups: js.Array[AttributeGroup]
    
    var operationId: Double
    
    var requestId: Double
    
    var version: Major
  }
  object Operation {
    
    inline def apply(groups: js.Array[AttributeGroup], operationId: Double, requestId: Double, version: Major): Operation = {
      val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], operationId = operationId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Operation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Operation] (val x: Self) extends AnyVal {
      
      inline def setGroups(value: js.Array[AttributeGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsVarargs(value: AttributeGroup*): Self = StObject.set(x, "groups", js.Array(value*))
      
      inline def setOperationId(value: Double): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
      
      inline def setRequestId(value: Double): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Major): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var fallback: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var server: js.UndefOr[
        Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
      ] = js.undefined
    
    var uri: js.UndefOr[String] = js.undefined
    
    var zeroconf: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setFallback(value: Boolean): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setServer(
        value: Server[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[IncomingMessage]
              ]
            ]
      ): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      
      inline def setZeroconf(value: Boolean): Self = StObject.set(x, "zeroconf", value.asInstanceOf[js.Any])
      
      inline def setZeroconfUndefined: Self = StObject.set(x, "zeroconf", js.undefined)
    }
  }
  
  @js.native
  trait Printer extends StObject {
    
    var fallback: Boolean = js.native
    
    var jobs: js.Array[Job] = js.native
    
    var name: String = js.native
    
    @JSName("on")
    def on_job(event: job, handler: js.Function1[/* job */ Job, Unit]): Printer = js.native
    @JSName("on")
    def on_operation(event: operation, handler: js.Function1[/* operation */ Operation, Unit]): Printer = js.native
    
    var port: Double = js.native
    
    var server: Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ] = js.native
    
    var started: js.Date = js.native
    
    var state: Double = js.native
    
    var uri: String = js.native
  }
}
