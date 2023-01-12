package typings.ipfsCoreTypes

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.libp2pInterfaceKeychain.mod.KeyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcKeyMod {
  
  @js.native
  trait API[OptionExtension] extends StObject {
    
    /**
      * Remove a key
      *
      * @example
      * ```js
      * const pem = await ipfs.key.export('self', 'password')
      *
      * console.log(pem)
      * // -----BEGIN ENCRYPTED PRIVATE KEY-----
      * // MIIFDTA/BgkqhkiG9w0BBQ0wMjAaBgkqhkiG9w0BBQwwDQQIpdO40RVyBwACAWQw
      * // ...
      * // YA==
      * // -----END ENCRYPTED PRIVATE KEY-----
      * ```
      */
    def `export`(name: String, password: String): js.Promise[String] = js.native
    def `export`(name: String, password: String, options: AbortOptions & OptionExtension): js.Promise[String] = js.native
    
    /**
      * Generate a new key
      *
      * @example
      * ```js
      * const key = await ipfs.key.gen('my-key', {
      *   type: 'rsa',
      *   size: 2048
      * })
      *
      * console.log(key)
      * // { id: 'QmYWqAFvLWb2G5A69JGXui2JJXzaHXiUEmQkQgor6kNNcJ',
      * //  name: 'my-key' }
      * ```
      */
    def gen(name: String): js.Promise[Key] = js.native
    def gen(name: String, options: GenOptions & OptionExtension): js.Promise[Key] = js.native
    
    /**
      * Remove a key
      *
      * @example
      * ```js
      * const key = await ipfs.key.import('clone', pem, 'password')
      *
      * console.log(key)
      * // { id: 'QmQRiays958UM7norGRQUG3tmrLq8pJdmJarwYSk2eLthQ',
      * //   name: 'clone' }
      * ```
      */
    def `import`(name: String, pem: String, password: String): js.Promise[Key] = js.native
    def `import`(name: String, pem: String, password: String, options: AbortOptions & OptionExtension): js.Promise[Key] = js.native
    
    /**
      * Return the id and name of a key
      *
      * * @example
      * ```js
      * const { id, name } = await ipfs.key.info('key-name')
      * ```
      */
    def info(name: String): js.Promise[Key] = js.native
    def info(name: String, options: AbortOptions & OptionExtension): js.Promise[Key] = js.native
    
    /**
      * List all the keys
      *
      * @example
      * ```js
      * const keys = await ipfs.key.list()
      *
      * console.log(keys)
      * // [
      * //   { id: 'QmTe4tuceM2sAmuZiFsJ9tmAopA8au71NabBDdpPYDjxAb',
      * //     name: 'self' },
      * //   { id: 'QmWETF5QvzGnP7jKq5sPDiRjSM2fzwzNsna4wSBEzRzK6W',
      * //     name: 'my-key' }
      * // ]
      * ```
      */
    def list(): js.Promise[js.Array[Key]] = js.native
    def list(options: AbortOptions & OptionExtension): js.Promise[js.Array[Key]] = js.native
    
    /**
      * Rename a key
      *
      * @example
      * ```js
      * const key = await ipfs.key.rename('my-key', 'my-new-key')
      *
      * console.log(key)
      * // { id: 'Qmd4xC46Um6s24MradViGLFtMitvrR4SVexKUgPgFjMNzg',
      * //   was: 'my-key',
      * //   now: 'my-new-key',
      * //   overwrite: false }
      * ```
      */
    def rename(oldName: String, newName: String): js.Promise[RenameKeyResult] = js.native
    def rename(oldName: String, newName: String, options: AbortOptions & OptionExtension): js.Promise[RenameKeyResult] = js.native
    
    /**
      * Remove a key
      *
      * @example
      * ```js
      * const key = await ipfs.key.rm('my-key')
      *
      * console.log(key)
      * // { id: 'QmWETF5QvzGnP7jKq5sPDiRjSM2fzwzNsna4wSBEzRzK6W',
      * //   name: 'my-key' }
      * ```
      */
    def rm(name: String): js.Promise[Key] = js.native
    def rm(name: String, options: AbortOptions & OptionExtension): js.Promise[Key] = js.native
  }
  
  trait GenOptions
    extends StObject
       with AbortOptions {
    
    var size: js.UndefOr[Double] = js.undefined
    
    var `type`: KeyType
  }
  object GenOptions {
    
    inline def apply(`type`: KeyType): GenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GenOptions] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: KeyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var id: String
    
    var name: String
  }
  object Key {
    
    inline def apply(id: String, name: String): Key = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait RenameKeyResult extends StObject {
    
    var id: String
    
    var now: String
    
    var overwrite: Boolean
    
    var was: String
  }
  object RenameKeyResult {
    
    inline def apply(id: String, now: String, overwrite: Boolean, was: String): RenameKeyResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], overwrite = overwrite.asInstanceOf[js.Any], was = was.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenameKeyResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenameKeyResult] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setNow(value: String): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setWas(value: String): Self = StObject.set(x, "was", value.asInstanceOf[js.Any])
    }
  }
}
