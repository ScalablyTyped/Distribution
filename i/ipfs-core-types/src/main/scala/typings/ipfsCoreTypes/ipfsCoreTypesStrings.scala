package typings.ipfsCoreTypes

import typings.ipfsCoreTypes.distSrcPinMod.PinQueryType
import typings.ipfsCoreTypes.distSrcPinMod.PinType
import typings.ipfsCoreTypes.distSrcPinRemoteMod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ipfsCoreTypesStrings {
  
  @js.native
  sealed trait ADDING_PEER extends StObject
  inline def ADDING_PEER: ADDING_PEER = "ADDING_PEER".asInstanceOf[ADDING_PEER]
  
  @js.native
  sealed trait DIALING_PEER extends StObject
  inline def DIALING_PEER: DIALING_PEER = "DIALING_PEER".asInstanceOf[DIALING_PEER]
  
  @js.native
  sealed trait FINAL_PEER extends StObject
  inline def FINAL_PEER: FINAL_PEER = "FINAL_PEER".asInstanceOf[FINAL_PEER]
  
  @js.native
  sealed trait PEER_RESPONSE extends StObject
  inline def PEER_RESPONSE: PEER_RESPONSE = "PEER_RESPONSE".asInstanceOf[PEER_RESPONSE]
  
  @js.native
  sealed trait PROVIDER extends StObject
  inline def PROVIDER: PROVIDER = "PROVIDER".asInstanceOf[PROVIDER]
  
  @js.native
  sealed trait QUERY_ERROR extends StObject
  inline def QUERY_ERROR: QUERY_ERROR = "QUERY_ERROR".asInstanceOf[QUERY_ERROR]
  
  @js.native
  sealed trait SENDING_QUERY extends StObject
  inline def SENDING_QUERY: SENDING_QUERY = "SENDING_QUERY".asInstanceOf[SENDING_QUERY]
  
  @js.native
  sealed trait VALUE extends StObject
  inline def VALUE: VALUE = "VALUE".asInstanceOf[VALUE]
  
  @js.native
  sealed trait all
    extends StObject
       with PinQueryType
       with PinType
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait balanced extends StObject
  inline def balanced: balanced = "balanced".asInstanceOf[balanced]
  
  @js.native
  sealed trait dir extends StObject
  inline def dir: dir = "dir".asInstanceOf[dir]
  
  @js.native
  sealed trait direct
    extends StObject
       with PinQueryType
       with PinType
  inline def direct: direct = "direct".asInstanceOf[direct]
  
  @js.native
  sealed trait directory extends StObject
  inline def directory: directory = "directory".asInstanceOf[directory]
  
  @js.native
  sealed trait failed
    extends StObject
       with Status
  inline def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait file extends StObject
  inline def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait floodsub extends StObject
  inline def floodsub: floodsub = "floodsub".asInstanceOf[floodsub]
  
  @js.native
  sealed trait gossipsub extends StObject
  inline def gossipsub: gossipsub = "gossipsub".asInstanceOf[gossipsub]
  
  @js.native
  sealed trait inbound extends StObject
  inline def inbound: inbound = "inbound".asInstanceOf[inbound]
  
  @js.native
  sealed trait indirect
    extends StObject
       with PinQueryType
       with PinType
  inline def indirect: indirect = "indirect".asInstanceOf[indirect]
  
  @js.native
  sealed trait invalid extends StObject
  inline def invalid: invalid = "invalid".asInstanceOf[invalid]
  
  @js.native
  sealed trait outbound extends StObject
  inline def outbound: outbound = "outbound".asInstanceOf[outbound]
  
  @js.native
  sealed trait pinned
    extends StObject
       with Status
  inline def pinned: pinned = "pinned".asInstanceOf[pinned]
  
  @js.native
  sealed trait pinning
    extends StObject
       with Status
  inline def pinning: pinning = "pinning".asInstanceOf[pinning]
  
  @js.native
  sealed trait queued
    extends StObject
       with Status
  inline def queued: queued = "queued".asInstanceOf[queued]
  
  @js.native
  sealed trait recursive
    extends StObject
       with PinQueryType
       with PinType
  inline def recursive: recursive = "recursive".asInstanceOf[recursive]
  
  @js.native
  sealed trait trickle extends StObject
  inline def trickle: trickle = "trickle".asInstanceOf[trickle]
  
  @js.native
  sealed trait `unixfs-dir` extends StObject
  inline def `unixfs-dir`: `unixfs-dir` = "unixfs-dir".asInstanceOf[`unixfs-dir`]
  
  @js.native
  sealed trait valid extends StObject
  inline def valid: valid = "valid".asInstanceOf[valid]
}
