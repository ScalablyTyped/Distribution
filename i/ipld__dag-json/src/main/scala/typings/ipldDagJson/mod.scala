package typings.ipldDagJson

import typings.ipldDagJson.ipldDagJsonInts.`297`
import typings.ipldDagJson.ipldDagJsonStrings.`dag-json`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ipld/dag-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ipld/dag-json", "code")
  @js.native
  val code: `297` = js.native
  
  inline def decode[T](
    data: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.ByteView<T> */ Any
  ): T = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def encode[T](node: T): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(node.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@ipld/dag-json", "name")
  @js.native
  val name: `dag-json` = js.native
  
  type ByteView[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.ByteView<T> */ Any
  
  type DecodeTokenizer = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.DecodeTokenizer */ Any
}
