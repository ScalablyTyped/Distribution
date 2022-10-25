package typings.libp2pPubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object errorsMod {
  
  object codes {
    
    @JSImport("@libp2p/pubsub/errors", "codes")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Message `signature` is invalid
      */
    @JSImport("@libp2p/pubsub/errors", "codes.ERR_INVALID_SIGNATURE")
    @js.native
    def ERR_INVALID_SIGNATURE: String = js.native
    inline def ERR_INVALID_SIGNATURE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_INVALID_SIGNATURE")(x.asInstanceOf[js.Any])
    
    /**
      * Signature policy is invalid
      */
    @JSImport("@libp2p/pubsub/errors", "codes.ERR_INVALID_SIGNATURE_POLICY")
    @js.native
    def ERR_INVALID_SIGNATURE_POLICY: String = js.native
    inline def ERR_INVALID_SIGNATURE_POLICY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_INVALID_SIGNATURE_POLICY")(x.asInstanceOf[js.Any])
    
    /**
      * Message expected to have a `from`, but doesn't
      */
    @JSImport("@libp2p/pubsub/errors", "codes.ERR_MISSING_FROM")
    @js.native
    def ERR_MISSING_FROM: String = js.native
    inline def ERR_MISSING_FROM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_MISSING_FROM")(x.asInstanceOf[js.Any])
    
    /**
      * Message expected to have a `key`, but doesn't
      */
    @JSImport("@libp2p/pubsub/errors", "codes.ERR_MISSING_KEY")
    @js.native
    def ERR_MISSING_KEY: String = js.native
    inline def ERR_MISSING_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_MISSING_KEY")(x.asInstanceOf[js.Any])
    
    /**
      * Message expected to have a `seqno`, but doesn't
      */
    @JSImport("@libp2p/pubsub/errors", "codes.ERR_MISSING_SEQNO")
    @js.native
    def ERR_MISSING_SEQNO: String = js.native
    inline def ERR_MISSING_SEQNO_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_MISSING_SEQNO")(x.asInstanceOf[js.Any])
    
    /**
      * Message expected to have a `signature`, but doesn't
      */
    @JSImport("@libp2p/pubsub/errors", "codes.ERR_MISSING_SIGNATURE")
    @js.native
    def ERR_MISSING_SIGNATURE: String = js.native
    inline def ERR_MISSING_SIGNATURE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_MISSING_SIGNATURE")(x.asInstanceOf[js.Any])
    
    /**
      * Message failed topic validator
      */
    @JSImport("@libp2p/pubsub/errors", "codes.ERR_TOPIC_VALIDATOR_REJECT")
    @js.native
    def ERR_TOPIC_VALIDATOR_REJECT: String = js.native
    inline def ERR_TOPIC_VALIDATOR_REJECT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_TOPIC_VALIDATOR_REJECT")(x.asInstanceOf[js.Any])
    
    /**
      * Message expected to not have a `from`, but does
      */
    @JSImport("@libp2p/pubsub/errors", "codes.ERR_UNEXPECTED_FROM")
    @js.native
    def ERR_UNEXPECTED_FROM: String = js.native
    inline def ERR_UNEXPECTED_FROM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_UNEXPECTED_FROM")(x.asInstanceOf[js.Any])
    
    /**
      * Message expected to not have a `key`, but does
      */
    @JSImport("@libp2p/pubsub/errors", "codes.ERR_UNEXPECTED_KEY")
    @js.native
    def ERR_UNEXPECTED_KEY: String = js.native
    inline def ERR_UNEXPECTED_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_UNEXPECTED_KEY")(x.asInstanceOf[js.Any])
    
    /**
      * Message expected to not have a `seqno`, but does
      */
    @JSImport("@libp2p/pubsub/errors", "codes.ERR_UNEXPECTED_SEQNO")
    @js.native
    def ERR_UNEXPECTED_SEQNO: String = js.native
    inline def ERR_UNEXPECTED_SEQNO_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_UNEXPECTED_SEQNO")(x.asInstanceOf[js.Any])
    
    /**
      * Message expected to not have a `signature`, but does
      */
    @JSImport("@libp2p/pubsub/errors", "codes.ERR_UNEXPECTED_SIGNATURE")
    @js.native
    def ERR_UNEXPECTED_SIGNATURE: String = js.native
    inline def ERR_UNEXPECTED_SIGNATURE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_UNEXPECTED_SIGNATURE")(x.asInstanceOf[js.Any])
    
    /**
      * Signature policy is unhandled
      */
    @JSImport("@libp2p/pubsub/errors", "codes.ERR_UNHANDLED_SIGNATURE_POLICY")
    @js.native
    def ERR_UNHANDLED_SIGNATURE_POLICY: String = js.native
    inline def ERR_UNHANDLED_SIGNATURE_POLICY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_UNHANDLED_SIGNATURE_POLICY")(x.asInstanceOf[js.Any])
  }
}
