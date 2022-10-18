package typings.lib0

import typings.lib0.lib0Strings.arraybuffer
import typings.lib0.lib0Strings.blob
import typings.rollup.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BinaryType extends StObject {
    
    var binaryType: js.UndefOr[arraybuffer | blob | Null] = js.undefined
  }
  object BinaryType {
    
    inline def apply(): BinaryType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BinaryType]
    }
    
    extension [Self <: BinaryType](x: Self) {
      
      inline def setBinaryType(value: arraybuffer | blob): Self = StObject.set(x, "binaryType", value.asInstanceOf[js.Any])
      
      inline def setBinaryTypeNull: Self = StObject.set(x, "binaryType", null)
      
      inline def setBinaryTypeUndefined: Self = StObject.set(x, "binaryType", js.undefined)
    }
  }
  
  trait ChunkFileNames extends StObject {
    
    var chunkFileNames: Unit
    
    var dir: Unit
    
    var entryFileNames: Unit
    
    var file: String
    
    var format: String
    
    var sourcemap: Boolean
  }
  object ChunkFileNames {
    
    inline def apply(
      chunkFileNames: Unit,
      dir: Unit,
      entryFileNames: Unit,
      file: String,
      format: String,
      sourcemap: Boolean
    ): ChunkFileNames = {
      val __obj = js.Dynamic.literal(chunkFileNames = chunkFileNames.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], entryFileNames = entryFileNames.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], sourcemap = sourcemap.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChunkFileNames]
    }
    
    extension [Self <: ChunkFileNames](x: Self) {
      
      inline def setChunkFileNames(value: Unit): Self = StObject.set(x, "chunkFileNames", value.asInstanceOf[js.Any])
      
      inline def setDir(value: Unit): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setEntryFileNames(value: Unit): Self = StObject.set(x, "entryFileNames", value.asInstanceOf[js.Any])
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setSourcemap(value: Boolean): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dir extends StObject {
    
    var chunkFileNames: String
    
    var dir: String
    
    var entryFileNames: String
    
    var file: Unit
    
    var format: String
    
    var sourcemap: Boolean
  }
  object Dir {
    
    inline def apply(
      chunkFileNames: String,
      dir: String,
      entryFileNames: String,
      file: Unit,
      format: String,
      sourcemap: Boolean
    ): Dir = {
      val __obj = js.Dynamic.literal(chunkFileNames = chunkFileNames.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], entryFileNames = entryFileNames.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], sourcemap = sourcemap.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dir]
    }
    
    extension [Self <: Dir](x: Self) {
      
      inline def setChunkFileNames(value: String): Self = StObject.set(x, "chunkFileNames", value.asInstanceOf[js.Any])
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setEntryFileNames(value: String): Self = StObject.set(x, "entryFileNames", value.asInstanceOf[js.Any])
      
      inline def setFile(value: Unit): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setSourcemap(value: Boolean): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
    }
  }
  
  trait External extends StObject {
    
    var external: Unit
    
    var input: String
    
    var output: ChunkFileNames
    
    var plugins: js.Array[Plugin]
  }
  object External {
    
    inline def apply(external: Unit, input: String, output: ChunkFileNames, plugins: js.Array[Plugin]): External = {
      val __obj = js.Dynamic.literal(external = external.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
      __obj.asInstanceOf[External]
    }
    
    extension [Self <: External](x: Self) {
      
      inline def setExternal(value: Unit): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: ChunkFileNames): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setPlugins(value: js.Array[Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsVarargs(value: Plugin*): Self = StObject.set(x, "plugins", js.Array(value*))
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
    
    extension [Self <: Index](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setInsert(value: String): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: Double): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    }
  }
  
  trait Input extends StObject {
    
    var external: js.Array[String]
    
    var input: js.Array[String]
    
    var output: Dir
    
    var plugins: Unit
  }
  object Input {
    
    inline def apply(external: js.Array[String], input: js.Array[String], output: Dir, plugins: Unit): Input = {
      val __obj = js.Dynamic.literal(external = external.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
      __obj.asInstanceOf[Input]
    }
    
    extension [Self <: Input](x: Self) {
      
      inline def setExternal(value: js.Array[String]): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setExternalVarargs(value: String*): Self = StObject.set(x, "external", js.Array(value*))
      
      inline def setInput(value: js.Array[String]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputVarargs(value: String*): Self = StObject.set(x, "input", js.Array(value*))
      
      inline def setOutput(value: Dir): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setPlugins(value: Unit): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
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
    
    extension [Self <: Key](x: Self) {
      
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
    
    extension [Self <: N](x: Self) {
      
      inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
  
  trait Output extends StObject {
    
    var external: js.Array[String]
    
    var input: String
    
    var output: Dir
    
    var plugins: Unit
  }
  object Output {
    
    inline def apply(external: js.Array[String], input: String, output: Dir, plugins: Unit): Output = {
      val __obj = js.Dynamic.literal(external = external.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
      __obj.asInstanceOf[Output]
    }
    
    extension [Self <: Output](x: Self) {
      
      inline def setExternal(value: js.Array[String]): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setExternalVarargs(value: String*): Self = StObject.set(x, "external", js.Array(value*))
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: Dir): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setPlugins(value: Unit): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
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
    
    extension [Self <: _empty](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def set_underscore(value: Double): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
    }
  }
}
