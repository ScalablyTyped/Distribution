package typings.libp2pInterfacePubsub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TopicValidatorResult extends StObject
@JSImport("@libp2p/interface-pubsub", "TopicValidatorResult")
@js.native
object TopicValidatorResult extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TopicValidatorResult & String] = js.native
  
  /**
    * The message is considered valid, and it should be delivered and forwarded to the network
    */
  @js.native
  sealed trait Accept
    extends StObject
       with TopicValidatorResult
  /* "accept" */ val Accept: typings.libp2pInterfacePubsub.mod.TopicValidatorResult.Accept & String = js.native
  
  /**
    * The message is neither delivered nor forwarded to the network
    */
  @js.native
  sealed trait Ignore
    extends StObject
       with TopicValidatorResult
  /* "ignore" */ val Ignore: typings.libp2pInterfacePubsub.mod.TopicValidatorResult.Ignore & String = js.native
  
  /**
    * The message is considered invalid, and it should be rejected
    */
  @js.native
  sealed trait Reject
    extends StObject
       with TopicValidatorResult
  /* "reject" */ val Reject: typings.libp2pInterfacePubsub.mod.TopicValidatorResult.Reject & String = js.native
}
