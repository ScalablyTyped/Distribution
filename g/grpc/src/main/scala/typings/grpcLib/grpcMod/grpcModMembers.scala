package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grpc", JSImport.Namespace)
@js.native
object grpcModMembers extends js.Object {
  val credentials: grpcLib.Anon_CreateFromGoogleCredential = js.native
  def closeClient(clientObj: Client): scala.Unit = js.native
  def getClientChannel(client: Client): Channel = js.native
  def load[T](filename: Filename): T = js.native
  def loadObject[T](value: js.Object): T = js.native
  def loadObject[T](value: js.Object, options: LoadObjectOptions): T = js.native
  def loadPackageDefinition(packageDefinition: PackageDefinition): GrpcObject = js.native
  @JSName("load")
  def load_json[T](filename: Filename, format: grpcLib.grpcLibStrings.json): T = js.native
  @JSName("load")
  def load_json[T](filename: Filename, format: grpcLib.grpcLibStrings.json, options: LoadOptions): T = js.native
  @JSName("load")
  def load_proto[T](filename: Filename, format: grpcLib.grpcLibStrings.proto): T = js.native
  @JSName("load")
  def load_proto[T](filename: Filename, format: grpcLib.grpcLibStrings.proto, options: LoadOptions): T = js.native
  def makeGenericClientConstructor(methods: ServiceDefinition[_], serviceName: java.lang.String, classOptions: GenericClientOptions): ScalablyTyped.runtime.Instantiable3[
    /* address */ java.lang.String, 
    /* credentials */ ChannelCredentials, 
    /* options */ js.UndefOr[/* options */ js.Object], 
    Client
  ] = js.native
  def setLogVerbosity(verbosity: logVerbosity): scala.Unit = js.native
  def setLogger(logger: nodeLib.Console): scala.Unit = js.native
  def waitForClientReady(
    client: Client,
    deadline: Deadline,
    callback: js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
}

