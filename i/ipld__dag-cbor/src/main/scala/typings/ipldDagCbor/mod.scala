package typings.ipldDagCbor

import typings.ipldDagCbor.ipldDagCborNumbers.`113`
import typings.ipldDagCbor.ipldDagCborStrings.`dag-cbor`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ipld/dag-cbor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ipld/dag-cbor", "code")
  @js.native
  val code: `113` = js.native
  
  inline def decode[T](
    data: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.ByteView<T> */ Any
  ): T = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def encode[T](node: T): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(node.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@ipld/dag-cbor", "name")
  @js.native
  val name: `dag-cbor` = js.native
  
  type ByteView[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.ByteView<T> */ Any
}
