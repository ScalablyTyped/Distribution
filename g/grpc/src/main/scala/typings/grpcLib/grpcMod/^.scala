package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grpc", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val credentials: grpcLib.Anon_CertChain = js.native
  def closeClient(clientObj: grpcLib.grpcMod.Client): scala.Unit = js.native
  def getClientChannel(client: grpcLib.grpcMod.Client): grpcLib.grpcMod.Channel = js.native
  def load[T](filename: grpcLib.grpcMod.Filename): T = js.native
  def loadObject[T](value: js.Object): T = js.native
  def loadObject[T](value: js.Object, options: grpcLib.grpcMod.LoadObjectOptions): T = js.native
  def loadPackageDefinition(packageDefinition: grpcLib.grpcMod.PackageDefinition): grpcLib.grpcMod.GrpcObject = js.native
  @JSName("load")
  def load_json[T](filename: grpcLib.grpcMod.Filename, format: grpcLib.grpcLibStrings.json): T = js.native
  @JSName("load")
  def load_json[T](
    filename: grpcLib.grpcMod.Filename,
    format: grpcLib.grpcLibStrings.json,
    options: grpcLib.grpcMod.LoadOptions
  ): T = js.native
  @JSName("load")
  def load_proto[T](filename: grpcLib.grpcMod.Filename, format: grpcLib.grpcLibStrings.proto): T = js.native
  @JSName("load")
  def load_proto[T](
    filename: grpcLib.grpcMod.Filename,
    format: grpcLib.grpcLibStrings.proto,
    options: grpcLib.grpcMod.LoadOptions
  ): T = js.native
  def makeGenericClientConstructor(
    methods: grpcLib.grpcMod.ServiceDefinition[_],
    serviceName: java.lang.String,
    classOptions: grpcLib.grpcMod.GenericClientOptions
  ): org.scalablytyped.runtime.Instantiable3[
    /* address */ java.lang.String, 
    /* credentials */ grpcLib.grpcMod.ChannelCredentials, 
    /* options */ js.UndefOr[/* options */ js.Object], 
    grpcLib.grpcMod.Client
  ] = js.native
  def setLogVerbosity(verbosity: grpcLib.grpcMod.logVerbosity): scala.Unit = js.native
  def setLogger(logger: nodeLib.Console): scala.Unit = js.native
  def waitForClientReady(
    client: grpcLib.grpcMod.Client,
    deadline: grpcLib.grpcMod.Deadline,
    callback: js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
}

