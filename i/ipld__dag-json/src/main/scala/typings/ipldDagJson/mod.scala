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
  
  inline def decode[T](data: typings.multiformats.distTypesSrcBlockInterfaceMod.ByteView[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def encode[T](node: T): typings.multiformats.distTypesSrcBlockInterfaceMod.ByteView[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(node.asInstanceOf[js.Any]).asInstanceOf[typings.multiformats.distTypesSrcBlockInterfaceMod.ByteView[T]]
  
  inline def format[T](node: T): typings.multiformats.distTypesSrcLinkInterfaceMod.ToString[T, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(node.asInstanceOf[js.Any]).asInstanceOf[typings.multiformats.distTypesSrcLinkInterfaceMod.ToString[T, String]]
  
  @JSImport("@ipld/dag-json", "name")
  @js.native
  val name: `dag-json` = js.native
  
  inline def parse[T](data: typings.multiformats.distTypesSrcLinkInterfaceMod.ToString[T, String]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def stringify[T](node: T): typings.multiformats.distTypesSrcLinkInterfaceMod.ToString[T, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any]).asInstanceOf[typings.multiformats.distTypesSrcLinkInterfaceMod.ToString[T, String]]
  
  type ByteView[T] = typings.multiformats.distTypesSrcBlockInterfaceMod.ByteView[T]
  
  type DecodeTokenizer = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.DecodeTokenizer */ Any
  
  type ToString[T] = typings.multiformats.distTypesSrcLinkInterfaceMod.ToString[T, String]
}
