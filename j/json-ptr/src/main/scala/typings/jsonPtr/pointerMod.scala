package typings.jsonPtr

import typings.jsonPtr.typesMod.JsonStringPointer
import typings.jsonPtr.typesMod.JsonStringPointerListItem
import typings.jsonPtr.typesMod.PathSegments
import typings.jsonPtr.typesMod.Pointer
import typings.jsonPtr.typesMod.RelativeJsonPointer
import typings.jsonPtr.typesMod.UriFragmentIdentifierPointer
import typings.jsonPtr.typesMod.UriFragmentIdentifierPointerListItem
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointerMod {
  
  @JSImport("json-ptr/dist/types/pointer", "JsonPointer")
  @js.native
  open class JsonPointer protected () extends StObject {
    def this(ptr: PathSegments) = this()
    /**
      * Creates a new instance.
      * @param ptr a string representation of a JSON Pointer, or a decoded array of path segments.
      */
    def this(ptr: Pointer) = this()
    
    /**
      * Creates a new instance by concatenating the specified pointer's path onto this pointer's path.
      * @param ptr the string representation of a pointer, it's decoded path, or an instance of JsonPointer indicating the additional path to concatenate onto the pointer.
      */
    def concat(ptr: JsonPointer): JsonPointer = js.native
    def concat(ptr: PathSegments): JsonPointer = js.native
    def concat(ptr: Pointer): JsonPointer = js.native
    
    /**
      * Gets the target object's value at the pointer's location.
      * @param target the target of the operation
      */
    def get(target: Any): Any = js.native
    
    /**
      * Determines if the specified target's object graph has a value at the pointer's location.
      * @param target the target of the operation
      */
    def has(target: Any): Boolean = js.native
    
    /**
      * Gets the value in the object graph that is the parent of the pointer location.
      * @param target the target of the operation
      */
    def parent(target: Any): Any = js.native
    
    /**
      * The pointer's decoded path segments.
      */
    val path: PathSegments = js.native
    
    /**
      * This pointer's JSON Pointer encoded string representation.
      */
    def pointer: JsonStringPointer = js.native
    
    /**
      * Resolves the specified relative pointer path against the specified target object, and gets the target object's value at the relative pointer's location.
      * @param target the target of the operation
      * @param ptr the relative pointer (relative to this)
      * @returns the value at the relative pointer's resolved path; otherwise undefined.
      */
    def rel(target: Any, ptr: RelativeJsonPointer): Any = js.native
    
    /**
      * Creates a new JsonPointer instance, pointing to the specified relative location in the object graph.
      * @param ptr the relative pointer (relative to this)
      * @returns A new instance that points to the relative location.
      */
    def relative(ptr: RelativeJsonPointer): JsonPointer = js.native
    
    /**
      * Sets the target object's value, as specified, at the pointer's location.
      *
      * If any part of the pointer's path does not exist, the operation aborts
      * without modification, unless the caller indicates that pointer's location
      * should be created.
      *
      * @param target the target of the operation
      * @param value the value to set
      * @param force indicates whether the pointer's location should be created if it doesn't already exist.
      */
    def set(target: Any, value: Any): Any = js.native
    def set(target: Any, value: Any, force: Boolean): Any = js.native
    
    /**
      * Removes the target object's value at the pointer's location.
      * @param target the target of the operation
      *
      * @returns the value that was removed from the object graph.
      */
    def unset(target: Any): Any = js.native
    
    /**
      * This pointer's URI fragment identifier encoded string representation.
      */
    def uriFragmentIdentifier: UriFragmentIdentifierPointer = js.native
  }
  /* static members */
  object JsonPointer {
    
    @JSImport("json-ptr/dist/types/pointer", "JsonPointer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(pointer: PathSegments): JsonPointer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(pointer.asInstanceOf[js.Any]).asInstanceOf[JsonPointer]
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
    inline def create(pointer: Pointer): JsonPointer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(pointer.asInstanceOf[js.Any]).asInstanceOf[JsonPointer]
    
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
    
    inline def get(target: Any, pointer: JsonPointer): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(target.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[Any]
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
    
    inline def has(target: Any, pointer: JsonPointer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(target.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
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
    
    inline def set(target: Any, pointer: JsonPointer, `val`: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(target.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def set(target: Any, pointer: JsonPointer, `val`: Any, force: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(target.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[Any]
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
    
    inline def unset(target: Any, pointer: JsonPointer): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unset")(target.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[Any]
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
  
  @JSImport("json-ptr/dist/types/pointer", "JsonReference")
  @js.native
  open class JsonReference protected () extends StObject {
    /**
      * Creates a new instance.
      * @param pointer a JSON Pointer for the reference.
      */
    def this(pointer: JsonPointer) = this()
    def this(pointer: PathSegments) = this()
    def this(pointer: Pointer) = this()
    
    /**
      * A reference to a position if an object graph.
      */
    @JSName("$ref")
    val $ref: UriFragmentIdentifierPointer = js.native
    
    /**
      * Gets the reference's pointer.
      */
    def pointer(): JsonPointer = js.native
    
    /**
      * Resolves the reference against the `target` object, returning the value at
      * the referenced pointer's location.
      * @param target the target object
      */
    def resolve(target: Any): Any = js.native
  }
  /* static members */
  object JsonReference {
    
    @JSImport("json-ptr/dist/types/pointer", "JsonReference")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Determines if the specified `candidate` is a JsonReference.
      * @param candidate the candidate
      */
    inline def isReference(candidate: Any): /* is json-ptr.json-ptr/dist/types/pointer.JsonReference */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReference")(candidate.asInstanceOf[js.Any]).asInstanceOf[/* is json-ptr.json-ptr/dist/types/pointer.JsonReference */ Boolean]
  }
  
  type Visitor = js.Function2[/* ptr */ JsonStringPointer, /* val */ Any, Unit]
}
