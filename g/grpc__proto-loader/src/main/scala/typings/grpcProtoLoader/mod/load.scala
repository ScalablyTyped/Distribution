package typings.grpcProtoLoader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/proto-loader", "load")
@js.native
object load extends js.Object {
  
  def apply(filename: String): js.Promise[PackageDefinition] = js.native
  def apply(filename: String, options: Options): js.Promise[PackageDefinition] = js.native
  def apply(filename: js.Array[String]): js.Promise[PackageDefinition] = js.native
  def apply(filename: js.Array[String], options: Options): js.Promise[PackageDefinition] = js.native
}
