package typings.libp2pInterfacePubsub.mod

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePubsub.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def StrictNoSign: /* "StrictNoSign" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("StrictNoSign").asInstanceOf[/* "StrictNoSign" */ String]

inline def StrictSign: /* "StrictSign" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("StrictSign").asInstanceOf[/* "StrictSign" */ String]

type SignaturePolicy = /* "StrictSign" */ String

type TopicValidatorFn = js.Function2[
/* peer */ PeerId, 
/* message */ Message, 
TopicValidatorResult | js.Promise[TopicValidatorResult]]
