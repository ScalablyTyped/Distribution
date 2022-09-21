package typings.jsonPtr

import typings.jsonPtr.pointerMod.Visitor
import typings.jsonPtr.typesMod.Decoder
import typings.jsonPtr.typesMod.JsonStringPointer
import typings.jsonPtr.typesMod.JsonStringPointerListItem
import typings.jsonPtr.typesMod.PathSegment
import typings.jsonPtr.typesMod.PathSegments
import typings.jsonPtr.typesMod.Pointer
import typings.jsonPtr.typesMod.RelativeJsonPointer
import typings.jsonPtr.typesMod.UriFragmentIdentifierPointer
import typings.jsonPtr.typesMod.UriFragmentIdentifierPointerListItem
import typings.jsonPtr.utilMod.Dereference
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-ptr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("json-ptr", "JsonPointer")
  @js.native
  open class JsonPointer protected ()
    extends typings.jsonPtr.pointerMod.JsonPointer {
    def this(ptr: PathSegments) = this()
    /**
      * Creates a new instance.
      * @param ptr a string representation of a JSON Pointer, or a decoded array of path segments.
      */
    def this(ptr: Pointer) = this()
  }
  /* static members */
  object JsonPointer {
    
    @JSImport("json-ptr", "JsonPointer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(pointer: PathSegments): typings.jsonPtr.pointerMod.JsonPointer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(pointer.asInstanceOf[js.Any]).asInstanceOf[typings.jsonPtr.pointerMod.JsonPointer]
    /**
      * Factory function that creates a JsonPointer instance.
      *
      * ```ts
      * const ptr = JsonPointer.create('/deeply/nested/data/0/here');
      * ```
      * _or_
      * ```ts
      * const ptr = JsonPointer.create(['deeply', 'nested', 'data', 0, 'here']);
      * ```
      * @param pointer the pointer or path.
      */
    inline def create(pointer: Pointer): typings.jsonPtr.pointerMod.JsonPointer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(pointer.asInstanceOf[js.Any]).asInstanceOf[typings.jsonPtr.pointerMod.JsonPointer]
    
    /**
      * Decodes the specified pointer into path segments.
      * @param pointer a string representation of a JSON Pointer
      */
    inline def decode(pointer: Pointer): PathSegments = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(pointer.asInstanceOf[js.Any]).asInstanceOf[PathSegments]
    
    /**
      * Evaluates the target's object graph, returning a Record&lt;Pointer, unknown> populated with pointers and the corresponding values from the graph.
      * @param target the target of the operation
      * @param fragmentId indicates whether the results are populated with fragment identifiers rather than regular pointers
      */
    inline def flatten(target: Any): Record[Pointer, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(target.asInstanceOf[js.Any]).asInstanceOf[Record[Pointer, Any]]
    inline def flatten(target: Any, fragmentId: Boolean): Record[Pointer, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(target.asInstanceOf[js.Any], fragmentId.asInstanceOf[js.Any])).asInstanceOf[Record[Pointer, Any]]
    
    inline def get(target: Any, pointer: typings.jsonPtr.pointerMod.JsonPointer): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(target.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def get(target: Any, pointer: PathSegments): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(target.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[Any]
    /**
      * Gets the `target` object's value at the `pointer`'s location.
      *
      * ```ts
      * const target = {
      *   first: 'second',
      *   third: ['fourth', 'fifth', { sixth: 'seventh' }],
      *   eighth: 'ninth'
      * };
      *
      * console.log(JsonPointer.get(target, '/third/2/sixth'));
      * // seventh
      * console.log(JsonPointer.get(target, '/tenth'));
      * // undefined
      * ```
      *
      * @param target the target of the operation
      * @param pointer the pointer or path.
      */
    inline def get(target: Any, pointer: Pointer): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(target.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def has(target: Any, pointer: typings.jsonPtr.pointerMod.JsonPointer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(target.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def has(target: Any, pointer: PathSegments): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(target.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    /**
      * Determines if the specified `target`'s object graph has a value at the `pointer`'s location.
      *
      * ```ts
      * const target = {
      *   first: 'second',
      *   third: ['fourth', 'fifth', { sixth: 'seventh' }],
      *   eighth: 'ninth'
      * };
      *
      * console.log(JsonPointer.has(target, '/third/0'));
      * // true
      * console.log(JsonPointer.has(target, '/tenth'));
      * // false
      * ```
      *
      * @param target the target of the operation
      * @param pointer the pointer or path
      */
    inline def has(target: Any, pointer: Pointer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(target.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Evaluates the target's object graph, returning a [[UriFragmentIdentifierPointerListItem]] for each location in the graph.
      * @param target the target of the operation
      */
    inline def listFragmentIds(target: Any): js.Array[UriFragmentIdentifierPointerListItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("listFragmentIds")(target.asInstanceOf[js.Any]).asInstanceOf[js.Array[UriFragmentIdentifierPointerListItem]]
    
    /**
      * Evaluates the target's object graph, returning a [[JsonStringPointerListItem]] for each location in the graph.
      * @param target the target of the operation
      */
    inline def listPointers(target: Any): js.Array[JsonStringPointerListItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("listPointers")(target.asInstanceOf[js.Any]).asInstanceOf[js.Array[JsonStringPointerListItem]]
    
    /**
      * Evaluates the target's object graph, returning a Map&lt;Pointer,unknown>  populated with pointers and the corresponding values form the graph.
      * @param target the target of the operation
      * @param fragmentId indicates whether the results are populated with fragment identifiers rather than regular pointers
      */
    inline def map(target: Any): Map[Pointer, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(target.asInstanceOf[js.Any]).asInstanceOf[Map[Pointer, Any]]
    inline def map(target: Any, fragmentId: Boolean): Map[Pointer, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(target.asInstanceOf[js.Any], fragmentId.asInstanceOf[js.Any])).asInstanceOf[Map[Pointer, Any]]
    
    inline def set(target: Any, pointer: typings.jsonPtr.pointerMod.JsonPointer, `val`: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(target.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def set(target: Any, pointer: typings.jsonPtr.pointerMod.JsonPointer, `val`: Any, force: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(target.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def set(target: Any, pointer: PathSegments, `val`: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(target.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def set(target: Any, pointer: PathSegments, `val`: Any, force: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(target.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[Any]
    /**
      * Sets the `target` object's value, as specified, at the `pointer`'s location.
      *
      * ```ts
      * const target = {
      *   first: 'second',
      *   third: ['fourth', 'fifth', { sixth: 'seventh' }],
      *   eighth: 'ninth'
      * };
      *
      * console.log(JsonPointer.set(target, '/third/2/sixth', 'tenth'));
      * // seventh
      * console.log(JsonPointer.set(target, '/tenth', 'eleventh', true));
      * // undefined
      * console.log(JSON.stringify(target, null, ' '));
      * // {
      * // "first": "second",
      * // "third": [
      * //  "fourth",
      * //  "fifth",
      * //  {
      * //   "sixth": "tenth"
      * //  }
      * // ],
      * // "eighth": "ninth",
      * // "tenth": "eleventh"
      * // }
      * ```
      *
      * @param target the target of the operation
      * @param pointer the pointer or path
      * @param val a value to write into the object graph at the specified pointer location
      * @param force indications whether the operation should force the pointer's location into existence in the object graph.
      *
      * @returns the prior value at the pointer's location in the object graph.
      */
    inline def set(target: Any, pointer: Pointer, `val`: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(target.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def set(target: Any, pointer: Pointer, `val`: Any, force: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(target.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def unset(target: Any, pointer: typings.jsonPtr.pointerMod.JsonPointer): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unset")(target.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def unset(target: Any, pointer: PathSegments): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unset")(target.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[Any]
    /**
      * Removes the `target` object's value at the `pointer`'s location.
      *
      * ```ts
      * const target = {
      *   first: 'second',
      *   third: ['fourth', 'fifth', { sixth: 'seventh' }],
      *   eighth: 'ninth'
      * };
      *
      * console.log(JsonPointer.unset(target, '/third/2/sixth'));
      * // seventh
      * console.log(JsonPointer.unset(target, '/tenth'));
      * // undefined
      * console.log(JSON.stringify(target, null, ' '));
      * // {
      * // "first": "second",
      * // "third": [
      * //  "fourth",
      * //  "fifth",
      * //  {}
      * // ],
      * // "eighth": "ninth",
      * // }
      * ```
      * @param target the target of the operation
      * @param pointer the pointer or path
      *
      * @returns the value that was removed from the object graph.
      */
    inline def unset(target: Any, pointer: Pointer): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unset")(target.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * Evaluates the target's object graph, calling the specified visitor for every unique pointer location discovered while walking the graph.
      * @param target the target of the operation
      * @param visitor a callback function invoked for each unique pointer location in the object graph
      * @param fragmentId indicates whether the visitor should receive fragment identifiers or regular pointers
      */
    inline def visit(target: Any, visitor: Visitor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visit")(target.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def visit(target: Any, visitor: Visitor, fragmentId: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visit")(target.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], fragmentId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("json-ptr", "JsonReference")
  @js.native
  open class JsonReference protected ()
    extends typings.jsonPtr.pointerMod.JsonReference {
    /**
      * Creates a new instance.
      * @param pointer a JSON Pointer for the reference.
      */
    def this(pointer: typings.jsonPtr.pointerMod.JsonPointer) = this()
    def this(pointer: PathSegments) = this()
    def this(pointer: Pointer) = this()
  }
  /* static members */
  object JsonReference {
    
    @JSImport("json-ptr", "JsonReference")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Determines if the specified `candidate` is a JsonReference.
      * @param candidate the candidate
      */
    inline def isReference(candidate: Any): /* is json-ptr.json-ptr/dist/types/pointer.JsonReference */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReference")(candidate.asInstanceOf[js.Any]).asInstanceOf[/* is json-ptr.json-ptr/dist/types/pointer.JsonReference */ Boolean]
  }
  
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
}
