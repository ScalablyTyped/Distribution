package typings.ipfsCoreTypes

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcNameMod {
  
  @js.native
  trait API[OptionExtension] extends StObject {
    
    def publish(value: String): js.Promise[PublishResult] = js.native
    def publish(value: String, options: PublishOptions & OptionExtension): js.Promise[PublishResult] = js.native
    /**
      * IPNS is a PKI namespace, where names are the hashes of public keys, and
      * the private key enables publishing new (signed) values. In both publish
      * and resolve, the default name used is the node's own PeerID,
      * which is the hash of its public key.
      *
      * @example
      * ```js
      * // The address of your files.
      * const addr = '/ipfs/QmbezGequPwcsWo8UL4wDF6a8hYwM1hmbzYv2mnKkEWaUp'
      * const res = await ipfs.name.publish(addr)
      * // You now have a res which contains two fields:
      * //   - name: the name under which the content was published.
      * //   - value: the "real" address to which Name points.
      * console.log(`https://gateway.ipfs.io/ipns/${res.name}`)
      * ```
      */
    def publish(value: CID[Any, Double, Double, Version]): js.Promise[PublishResult] = js.native
    def publish(value: CID[Any, Double, Double, Version], options: PublishOptions & OptionExtension): js.Promise[PublishResult] = js.native
    
    var pubsub: typings.ipfsCoreTypes.distSrcNamePubsubMod.API[js.Object] = js.native
    
    def resolve(value: String): AsyncIterable[String] = js.native
    def resolve(value: String, options: ResolveOptions & OptionExtension): AsyncIterable[String] = js.native
    /**
      * Given a key, query the DHT for its best value.
      *
      * @example
      * ```js
      * // The IPNS address you want to resolve
      * const addr = '/ipns/ipfs.io'
      *
      * for await (const name of ipfs.name.resolve(addr)) {
      *   console.log(name)
      * }
      * // Logs: /ipfs/QmQrX8hka2BtNHa8N8arAq16TCVx5qHcb46c5yPewRycLm
      * ```
      */
    def resolve(value: PeerId): AsyncIterable[String] = js.native
    def resolve(value: PeerId, options: ResolveOptions & OptionExtension): AsyncIterable[String] = js.native
  }
  
  trait PublishOptions
    extends StObject
       with AbortOptions {
    
    /**
      * When offline, save the IPNS record
      * to the the local datastore without broadcasting to the network instead of
      * simply failing.
      *
      * This option is not yet implemented in js-ipfs. See tracking issue [ipfs/js-ipfs#1997]
      * (https://github.com/ipfs/js-ipfs/issues/1997).
      */
    var allowOffline: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Name of the key to be used
      */
    var key: js.UndefOr[String] = js.undefined
    
    /**
      * Time duration of the record
      */
    var lifetime: js.UndefOr[String] = js.undefined
    
    /**
      * Resolve given path before publishing
      */
    var resolve: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Time duration this record should be cached
      */
    var ttl: js.UndefOr[String] = js.undefined
  }
  object PublishOptions {
    
    inline def apply(): PublishOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublishOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PublishOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowOffline(value: Boolean): Self = StObject.set(x, "allowOffline", value.asInstanceOf[js.Any])
      
      inline def setAllowOfflineUndefined: Self = StObject.set(x, "allowOffline", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLifetime(value: String): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
      
      inline def setLifetimeUndefined: Self = StObject.set(x, "lifetime", js.undefined)
      
      inline def setResolve(value: Boolean): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
      
      inline def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  trait PublishResult extends StObject {
    
    /**
      * The published IPNS name
      */
    var name: String
    
    /**
      * The IPNS record
      */
    var value: String
  }
  object PublishResult {
    
    inline def apply(name: String, value: String): PublishResult = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublishResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PublishResult] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResolveOptions
    extends StObject
       with AbortOptions {
    
    /**
      * do not use cached entries
      */
    var nocache: js.UndefOr[Boolean] = js.undefined
    
    /**
      * resolve until the result is not an IPNS name
      */
    var recursive: js.UndefOr[Boolean] = js.undefined
  }
  object ResolveOptions {
    
    inline def apply(): ResolveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolveOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolveOptions] (val x: Self) extends AnyVal {
      
      inline def setNocache(value: Boolean): Self = StObject.set(x, "nocache", value.asInstanceOf[js.Any])
      
      inline def setNocacheUndefined: Self = StObject.set(x, "nocache", js.undefined)
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
}
