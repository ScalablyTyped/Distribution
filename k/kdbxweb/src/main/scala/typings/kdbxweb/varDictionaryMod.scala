package typings.kdbxweb

import typings.kdbxweb.binaryStreamMod.BinaryStream
import typings.kdbxweb.int64Mod.Int64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object varDictionaryMod {
  
  @js.native
  sealed trait ValueType extends StObject
  @JSImport("kdbxweb/dist/types/utils/var-dictionary", "ValueType")
  @js.native
  object ValueType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ValueType & Double] = js.native
    
    @js.native
    sealed trait Bool
      extends StObject
         with ValueType
    /* 8 */ val Bool: typings.kdbxweb.varDictionaryMod.ValueType.Bool & Double = js.native
    
    @js.native
    sealed trait Bytes
      extends StObject
         with ValueType
    /* 66 */ val Bytes: typings.kdbxweb.varDictionaryMod.ValueType.Bytes & Double = js.native
    
    @js.native
    sealed trait Int32
      extends StObject
         with ValueType
    /* 12 */ val Int32: typings.kdbxweb.varDictionaryMod.ValueType.Int32 & Double = js.native
    
    @js.native
    sealed trait Int64
      extends StObject
         with ValueType
    /* 13 */ val Int64: typings.kdbxweb.varDictionaryMod.ValueType.Int64 & Double = js.native
    
    @js.native
    sealed trait String
      extends StObject
         with ValueType
    /* 24 */ val String: typings.kdbxweb.varDictionaryMod.ValueType.String & Double = js.native
    
    @js.native
    sealed trait UInt32
      extends StObject
         with ValueType
    /* 4 */ val UInt32: typings.kdbxweb.varDictionaryMod.ValueType.UInt32 & Double = js.native
    
    @js.native
    sealed trait UInt64
      extends StObject
         with ValueType
    /* 5 */ val UInt64: typings.kdbxweb.varDictionaryMod.ValueType.UInt64 & Double = js.native
  }
  
  @JSImport("kdbxweb/dist/types/utils/var-dictionary", "VarDictionary")
  @js.native
  open class VarDictionary () extends StObject {
    
    /* private */ var _items: Any = js.native
    
    /* private */ val _map: Any = js.native
    
    def get(key: String): VarDictionaryAnyValue = js.native
    
    def keys(): js.Array[String] = js.native
    
    def length: Double = js.native
    
    /* private */ var readItem: Any = js.native
    
    /* private */ var readVersion: Any = js.native
    
    def remove(key: String): Unit = js.native
    
    def set(key: String, `type`: ValueType, value: VarDictionaryAnyValue): Unit = js.native
    
    def write(stm: BinaryStream): Unit = js.native
    
    /* private */ var writeItem: Any = js.native
    
    /* private */ var writeVersion: Any = js.native
  }
  /* static members */
  object VarDictionary {
    
    @JSImport("kdbxweb/dist/types/utils/var-dictionary", "VarDictionary")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("kdbxweb/dist/types/utils/var-dictionary", "VarDictionary.ValueType")
    @js.native
    val ValueType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueType */ Any = js.native
    
    inline def read(stm: BinaryStream): VarDictionary = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(stm.asInstanceOf[js.Any]).asInstanceOf[VarDictionary]
  }
  
  type VarDictionaryAnyValue = js.UndefOr[Double | Int64 | Boolean | String | js.typedarray.ArrayBuffer]
}
