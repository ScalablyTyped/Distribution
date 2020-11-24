package typings.ipfsCore

import typings.ipfsCore.configMod.PubSubRouter
import typings.ipfsCore.initMod.KeyType
import typings.ipfsCore.lsMod.FileType
import typings.ipfsCore.pinManagerMod.PinQueryType
import typings.ipfsCore.pinManagerMod.PinType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ipfsCoreStrings {
  
  @scala.inline
  def Ed25519: Ed25519 = "Ed25519".asInstanceOf[Ed25519]
  
  @scala.inline
  def RSA: RSA = "RSA".asInstanceOf[RSA]
  
  @scala.inline
  def SHA1: SHA1 = "SHA1".asInstanceOf[SHA1]
  
  @scala.inline
  def SHA256: SHA256 = "SHA256".asInstanceOf[SHA256]
  
  @scala.inline
  def SHA512: SHA512 = "SHA512".asInstanceOf[SHA512]
  
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @scala.inline
  def dir: dir = "dir".asInstanceOf[dir]
  
  @scala.inline
  def direct: direct = "direct".asInstanceOf[direct]
  
  @scala.inline
  def directory: directory = "directory".asInstanceOf[directory]
  
  @scala.inline
  def ed25519_ : ed25519_ = "ed25519".asInstanceOf[ed25519_]
  
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  
  @scala.inline
  def fixed: fixed = "fixed".asInstanceOf[fixed]
  
  @scala.inline
  def floodsub: floodsub = "floodsub".asInstanceOf[floodsub]
  
  @scala.inline
  def gossipsub: gossipsub = "gossipsub".asInstanceOf[gossipsub]
  
  @scala.inline
  def indirect: indirect = "indirect".asInstanceOf[indirect]
  
  @scala.inline
  def rabin: rabin = "rabin".asInstanceOf[rabin]
  
  @scala.inline
  def recursive: recursive = "recursive".asInstanceOf[recursive]
  
  @scala.inline
  def secp256k1: secp256k1 = "secp256k1".asInstanceOf[secp256k1]
  
  @js.native
  sealed trait Ed25519 extends js.Object
  
  @js.native
  sealed trait RSA extends KeyType
  
  @js.native
  sealed trait SHA1 extends js.Object
  
  @js.native
  sealed trait SHA256 extends js.Object
  
  @js.native
  sealed trait SHA512 extends js.Object
  
  @js.native
  sealed trait _empty extends js.Object
  
  @js.native
  sealed trait all
    extends PinQueryType
       with typings.ipfsCore.pinLsMod.PinQueryType
  
  @js.native
  sealed trait dir extends js.Object
  
  @js.native
  sealed trait direct
    extends PinQueryType
       with typings.ipfsCore.pinLsMod.PinQueryType
       with PinType
       with typings.ipfsCore.pinLsMod.PinType
  
  @js.native
  sealed trait directory extends FileType
  
  @js.native
  sealed trait ed25519_ extends KeyType
  
  @js.native
  sealed trait file extends FileType
  
  @js.native
  sealed trait fixed extends js.Object
  
  @js.native
  sealed trait floodsub extends PubSubRouter
  
  @js.native
  sealed trait gossipsub extends PubSubRouter
  
  @js.native
  sealed trait indirect
    extends PinQueryType
       with typings.ipfsCore.pinLsMod.PinQueryType
       with PinType
       with typings.ipfsCore.pinLsMod.PinType
  
  @js.native
  sealed trait rabin extends js.Object
  
  @js.native
  sealed trait recursive
    extends PinQueryType
       with typings.ipfsCore.pinLsMod.PinQueryType
       with PinType
       with typings.ipfsCore.pinLsMod.PinType
  
  @js.native
  sealed trait secp256k1 extends KeyType
}
