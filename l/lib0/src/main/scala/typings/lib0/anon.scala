package typings.lib0

import typings.lib0.lib0Strings.arraybuffer
import typings.lib0.lib0Strings.blob
import typings.lib0.lib0Strings.decrypt
import typings.lib0.lib0Strings.encrypt
import typings.lib0.lib0Strings.sign
import typings.lib0.lib0Strings.verify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var extractable: js.UndefOr[Boolean] = js.undefined
    
    var usages: js.UndefOr[typings.lib0.distCryptoAesGcmMod.Usages] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setExtractable(value: Boolean): Self = StObject.set(x, "extractable", value.asInstanceOf[js.Any])
      
      inline def setExtractableUndefined: Self = StObject.set(x, "extractable", js.undefined)
      
      inline def setUsages(value: typings.lib0.distCryptoAesGcmMod.Usages): Self = StObject.set(x, "usages", value.asInstanceOf[js.Any])
      
      inline def setUsagesUndefined: Self = StObject.set(x, "usages", js.undefined)
      
      inline def setUsagesVarargs(value: (encrypt | decrypt)*): Self = StObject.set(x, "usages", js.Array(value*))
    }
  }
  
  trait `1` extends StObject {
    
    var extractable: js.UndefOr[Boolean] = js.undefined
    
    var usages: js.UndefOr[typings.lib0.distCryptoEcdsaMod.Usages] = js.undefined
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
      
      inline def setExtractable(value: Boolean): Self = StObject.set(x, "extractable", value.asInstanceOf[js.Any])
      
      inline def setExtractableUndefined: Self = StObject.set(x, "extractable", js.undefined)
      
      inline def setUsages(value: typings.lib0.distCryptoEcdsaMod.Usages): Self = StObject.set(x, "usages", value.asInstanceOf[js.Any])
      
      inline def setUsagesUndefined: Self = StObject.set(x, "usages", js.undefined)
      
      inline def setUsagesVarargs(value: (sign | verify)*): Self = StObject.set(x, "usages", js.Array(value*))
    }
  }
  
  trait `2` extends StObject {
    
    var extractable: js.UndefOr[Boolean] = js.undefined
    
    var usages: js.UndefOr[typings.lib0.distCryptoRsaOaepMod.Usages] = js.undefined
  }
  object `2` {
    
    inline def apply(): `2` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`2`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `2`] (val x: Self) extends AnyVal {
      
      inline def setExtractable(value: Boolean): Self = StObject.set(x, "extractable", value.asInstanceOf[js.Any])
      
      inline def setExtractableUndefined: Self = StObject.set(x, "extractable", js.undefined)
      
      inline def setUsages(value: typings.lib0.distCryptoRsaOaepMod.Usages): Self = StObject.set(x, "usages", value.asInstanceOf[js.Any])
      
      inline def setUsagesUndefined: Self = StObject.set(x, "usages", js.undefined)
      
      inline def setUsagesVarargs(value: (encrypt | decrypt)*): Self = StObject.set(x, "usages", js.Array(value*))
    }
  }
  
  trait BinaryType extends StObject {
    
    var binaryType: js.UndefOr[arraybuffer | blob | Null] = js.undefined
  }
  object BinaryType {
    
    inline def apply(): BinaryType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BinaryType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BinaryType] (val x: Self) extends AnyVal {
      
      inline def setBinaryType(value: arraybuffer | blob): Self = StObject.set(x, "binaryType", value.asInstanceOf[js.Any])
      
      inline def setBinaryTypeNull: Self = StObject.set(x, "binaryType", null)
      
      inline def setBinaryTypeUndefined: Self = StObject.set(x, "binaryType", js.undefined)
    }
  }
  
  trait ChunkFileNames extends StObject {
    
    var chunkFileNames: String
    
    var dir: String
    
    var entryFileNames: String
    
    var format: String
    
    var sourcemap: Boolean
  }
  object ChunkFileNames {
    
    inline def apply(chunkFileNames: String, dir: String, entryFileNames: String, format: String, sourcemap: Boolean): ChunkFileNames = {
      val __obj = js.Dynamic.literal(chunkFileNames = chunkFileNames.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], entryFileNames = entryFileNames.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], sourcemap = sourcemap.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChunkFileNames]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChunkFileNames] (val x: Self) extends AnyVal {
      
      inline def setChunkFileNames(value: String): Self = StObject.set(x, "chunkFileNames", value.asInstanceOf[js.Any])
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setEntryFileNames(value: String): Self = StObject.set(x, "entryFileNames", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setSourcemap(value: Boolean): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
    }
  }
  
  trait External extends StObject {
    
    var external: js.Array[String]
    
    var input: js.Array[String]
    
    var output: ChunkFileNames
  }
  object External {
    
    inline def apply(external: js.Array[String], input: js.Array[String], output: ChunkFileNames): External = {
      val __obj = js.Dynamic.literal(external = external.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[External]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: External] (val x: Self) extends AnyVal {
      
      inline def setExternal(value: js.Array[String]): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setExternalVarargs(value: String*): Self = StObject.set(x, "external", js.Array(value*))
      
      inline def setInput(value: js.Array[String]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputVarargs(value: String*): Self = StObject.set(x, "input", js.Array(value*))
      
      inline def setOutput(value: ChunkFileNames): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  trait Extractable extends StObject {
    
    var extractable: js.UndefOr[Boolean] = js.undefined
    
    var usages: js.UndefOr[typings.lib0.cryptoAesGcmMod.Usages] = js.undefined
  }
  object Extractable {
    
    inline def apply(): Extractable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Extractable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Extractable] (val x: Self) extends AnyVal {
      
      inline def setExtractable(value: Boolean): Self = StObject.set(x, "extractable", value.asInstanceOf[js.Any])
      
      inline def setExtractableUndefined: Self = StObject.set(x, "extractable", js.undefined)
      
      inline def setUsages(value: typings.lib0.cryptoAesGcmMod.Usages): Self = StObject.set(x, "usages", value.asInstanceOf[js.Any])
      
      inline def setUsagesUndefined: Self = StObject.set(x, "usages", js.undefined)
      
      inline def setUsagesVarargs(value: (encrypt | decrypt)*): Self = StObject.set(x, "usages", js.Array(value*))
    }
  }
  
  trait ExtractableUsages extends StObject {
    
    var extractable: js.UndefOr[Boolean] = js.undefined
    
    var usages: js.UndefOr[typings.lib0.cryptoRsaOaepMod.Usages] = js.undefined
  }
  object ExtractableUsages {
    
    inline def apply(): ExtractableUsages = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtractableUsages]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtractableUsages] (val x: Self) extends AnyVal {
      
      inline def setExtractable(value: Boolean): Self = StObject.set(x, "extractable", value.asInstanceOf[js.Any])
      
      inline def setExtractableUndefined: Self = StObject.set(x, "extractable", js.undefined)
      
      inline def setUsages(value: typings.lib0.cryptoRsaOaepMod.Usages): Self = StObject.set(x, "usages", value.asInstanceOf[js.Any])
      
      inline def setUsagesUndefined: Self = StObject.set(x, "usages", js.undefined)
      
      inline def setUsagesVarargs(value: (encrypt | decrypt)*): Self = StObject.set(x, "usages", js.Array(value*))
    }
  }
  
  trait Index extends StObject {
    
    var index: Double
    
    var insert: String
    
    var remove: Double
  }
  object Index {
    
    inline def apply(index: Double, insert: String, remove: Double): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], insert = insert.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setInsert(value: String): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: Double): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var key: String
    
    var newValue: String
    
    var oldValue: String
  }
  object Key {
    
    inline def apply(key: String, newValue: String, oldValue: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNewValue(value: String): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setOldValue(value: String): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait N extends StObject {
    
    var n: Double
    
    var prefix: String
  }
  object N {
    
    inline def apply(n: Double, prefix: String): N = {
      val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[N]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: N] (val x: Self) extends AnyVal {
      
      inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
  
  trait Usages extends StObject {
    
    var extractable: js.UndefOr[Boolean] = js.undefined
    
    var usages: js.UndefOr[typings.lib0.cryptoEcdsaMod.Usages] = js.undefined
  }
  object Usages {
    
    inline def apply(): Usages = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Usages]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Usages] (val x: Self) extends AnyVal {
      
      inline def setExtractable(value: Boolean): Self = StObject.set(x, "extractable", value.asInstanceOf[js.Any])
      
      inline def setExtractableUndefined: Self = StObject.set(x, "extractable", js.undefined)
      
      inline def setUsages(value: typings.lib0.cryptoEcdsaMod.Usages): Self = StObject.set(x, "usages", value.asInstanceOf[js.Any])
      
      inline def setUsagesUndefined: Self = StObject.set(x, "usages", js.undefined)
      
      inline def setUsagesVarargs(value: (sign | verify)*): Self = StObject.set(x, "usages", js.Array(value*))
    }
  }
  
  trait _empty extends StObject {
    
    @JSName("_")
    var _underscore: Double
    
    def destroy(): Unit
  }
  object _empty {
    
    inline def apply(_underscore: Double, destroy: () => Unit): _empty = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
      __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
      __obj.asInstanceOf[_empty]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: _empty] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def set_underscore(value: Double): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
    }
  }
}
