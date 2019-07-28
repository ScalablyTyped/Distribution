package typings.atGrpcProtoDashLoader.atGrpcProtoDashLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/proto-loader", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def load(filename: String): js.Promise[PackageDefinition] = js.native
  def load(filename: String, options: Options): js.Promise[PackageDefinition] = js.native
  def load(filename: js.Array[String]): js.Promise[PackageDefinition] = js.native
  def load(filename: js.Array[String], options: Options): js.Promise[PackageDefinition] = js.native
  def loadSync(filename: String): PackageDefinition = js.native
  def loadSync(filename: String, options: Options): PackageDefinition = js.native
  def loadSync(filename: js.Array[String]): PackageDefinition = js.native
  def loadSync(filename: js.Array[String], options: Options): PackageDefinition = js.native
}

