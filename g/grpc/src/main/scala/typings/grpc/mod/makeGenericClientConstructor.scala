package typings.grpc.mod

import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grpc", "makeGenericClientConstructor")
@js.native
object makeGenericClientConstructor extends js.Object {
  
  def apply(methods: ServiceDefinition[_], serviceName: String, classOptions: GenericClientOptions): Instantiable3[
    /* address */ String, 
    /* credentials */ ChannelCredentials, 
    /* options */ js.UndefOr[js.Object], 
    Client
  ] = js.native
}
