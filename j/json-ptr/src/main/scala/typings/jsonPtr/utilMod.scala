package typings.jsonPtr

import typings.jsonPtr.typesMod.Decoder
import typings.jsonPtr.typesMod.JsonStringPointer
import typings.jsonPtr.typesMod.PathSegment
import typings.jsonPtr.typesMod.PathSegments
import typings.jsonPtr.typesMod.Pointer
import typings.jsonPtr.typesMod.RelativeJsonPointer
import typings.jsonPtr.typesMod.UriFragmentIdentifierPointer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("json-ptr/dist/types/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compilePointerDereference(path: PathSegments): Dereference = ^.asInstanceOf[js.Dynamic].applyDynamic("compilePointerDereference")(path.asInstanceOf[js.Any]).asInstanceOf[Dereference]
  
  inline def decodeFragmentSegments(segments: PathSegments): PathSegments = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeFragmentSegments")(segments.asInstanceOf[js.Any]).asInstanceOf[PathSegments]
  
  inline def decodePointer(ptr: Pointer): PathSegments = ^.asInstanceOf[js.Dynamic].applyDynamic("decodePointer")(ptr.asInstanceOf[js.Any]).asInstanceOf[PathSegments]
  
  inline def decodePointerSegments(segments: PathSegments): PathSegments = ^.asInstanceOf[js.Dynamic].applyDynamic("decodePointerSegments")(segments.asInstanceOf[js.Any]).asInstanceOf[PathSegments]
  
  inline def decodePtrInit(ptr: PathSegments): PathSegments = ^.asInstanceOf[js.Dynamic].applyDynamic("decodePtrInit")(ptr.asInstanceOf[js.Any]).asInstanceOf[PathSegments]
  inline def decodePtrInit(ptr: Pointer): PathSegments = ^.asInstanceOf[js.Dynamic].applyDynamic("decodePtrInit")(ptr.asInstanceOf[js.Any]).asInstanceOf[PathSegments]
  
  inline def decodeRelativePointer(ptr: RelativeJsonPointer): PathSegments = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeRelativePointer")(ptr.asInstanceOf[js.Any]).asInstanceOf[PathSegments]
  
  inline def decodeUriFragmentIdentifier(ptr: UriFragmentIdentifierPointer): PathSegments = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeUriFragmentIdentifier")(ptr.asInstanceOf[js.Any]).asInstanceOf[PathSegments]
  
  inline def encodeFragmentSegments(segments: PathSegments): PathSegments = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeFragmentSegments")(segments.asInstanceOf[js.Any]).asInstanceOf[PathSegments]
  
  inline def encodePointer(path: PathSegments): JsonStringPointer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodePointer")(path.asInstanceOf[js.Any]).asInstanceOf[JsonStringPointer]
  
  inline def encodePointerSegments(segments: PathSegments): PathSegments = ^.asInstanceOf[js.Dynamic].applyDynamic("encodePointerSegments")(segments.asInstanceOf[js.Any]).asInstanceOf[PathSegments]
  
  inline def encodeUriFragmentIdentifier(path: PathSegments): UriFragmentIdentifierPointer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeUriFragmentIdentifier")(path.asInstanceOf[js.Any]).asInstanceOf[UriFragmentIdentifierPointer]
  
  inline def looksLikeFragment(ptr: Pointer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("looksLikeFragment")(ptr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def pickDecoder(ptr: Pointer): Decoder = ^.asInstanceOf[js.Dynamic].applyDynamic("pickDecoder")(ptr.asInstanceOf[js.Any]).asInstanceOf[Decoder]
  
  inline def replace(source: String, find: String, repl: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(source.asInstanceOf[js.Any], find.asInstanceOf[js.Any], repl.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def setValueAtPath(target: Any, `val`: Any, path: PathSegments): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setValueAtPath")(target.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def setValueAtPath(target: Any, `val`: Any, path: PathSegments, force: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setValueAtPath")(target.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def toArrayIndexReference(arr: js.Array[Any], idx: PathSegment): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toArrayIndexReference")(arr.asInstanceOf[js.Any], idx.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def unsetValueAtPath(target: Any, path: PathSegments): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unsetValueAtPath")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  type Dereference = js.Function1[/* it */ Any, Any]
}
