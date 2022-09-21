package typings.kdbxweb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "VarDictionary")
@js.native
open class VarDictionary ()
  extends typings.kdbxweb.varDictionaryMod.VarDictionary
/* static members */
object VarDictionary {
  
  @JSImport("kdbxweb", "VarDictionary")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("kdbxweb", "VarDictionary.ValueType")
  @js.native
  val ValueType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueType */ Any = js.native
  
  inline def read(stm: typings.kdbxweb.binaryStreamMod.BinaryStream): typings.kdbxweb.varDictionaryMod.VarDictionary = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(stm.asInstanceOf[js.Any]).asInstanceOf[typings.kdbxweb.varDictionaryMod.VarDictionary]
}
