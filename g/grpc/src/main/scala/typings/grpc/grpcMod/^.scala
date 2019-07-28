package typings.grpc.grpcMod

import org.scalablytyped.runtime.Instantiable3
import typings.grpc.grpcStrings.json
import typings.grpc.grpcStrings.proto
import typings.std.Console
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grpc", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def closeClient(clientObj: Client): Unit = js.native
  def getClientChannel(client: Client): Channel = js.native
  def load[T](filename: Filename): T = js.native
  def loadObject[T](value: js.Object): T = js.native
  def loadObject[T](value: js.Object, options: LoadObjectOptions): T = js.native
  def loadPackageDefinition(packageDefinition: PackageDefinition): GrpcObject = js.native
  @JSName("load")
  def load_json[T](filename: Filename, format: json): T = js.native
  @JSName("load")
  def load_json[T](filename: Filename, format: json, options: LoadOptions): T = js.native
  @JSName("load")
  def load_proto[T](filename: Filename, format: proto): T = js.native
  @JSName("load")
  def load_proto[T](filename: Filename, format: proto, options: LoadOptions): T = js.native
  def makeGenericClientConstructor(methods: ServiceDefinition[_], serviceName: String, classOptions: GenericClientOptions): Instantiable3[
    /* address */ String, 
    /* credentials */ ChannelCredentials, 
    js.UndefOr[/* options */ js.Object], 
    Client
  ] = js.native
  def setLogVerbosity(verbosity: logVerbosity): Unit = js.native
  def setLogger(logger: Console): Unit = js.native
  def waitForClientReady(client: Client, deadline: Deadline, callback: js.Function1[/* error */ Error | Null, Unit]): Unit = js.native
}

