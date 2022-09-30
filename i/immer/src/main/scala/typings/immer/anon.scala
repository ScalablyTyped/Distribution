package typings.immer

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.immer.immerStrings.`Illegal state`
import typings.immer.immerStrings.`Immer drafts cannot have computed properties`
import typings.immer.immerStrings.`Immer forbids circular references`
import typings.immer.immerStrings.`Immer only supports deleting array indices`
import typings.immer.immerStrings.`Sets cannot have QuotationmarkreplaceQuotationmark patchesDot`
import typings.immer.immerStrings.`The first or second argument to GraveaccentproduceGraveaccent must be a function`
import typings.immer.immerStrings.`The given draft is already finalized`
import typings.immer.immerStrings.`This object has been frozen and should not be mutated`
import typings.immer.pluginsMod.ES5ArrayState
import typings.immer.pluginsMod.ES5ObjectState
import typings.immer.pluginsMod.PatchPath
import typings.immer.scopeMod.ImmerScope
import typings.immer.typesExternalMod.Patch
import typings.immer.typesInternalMod.AnyMap
import typings.immer.typesInternalMod.AnySet
import typings.immer.typesInternalMod.Drafted
import typings.immer.typesInternalMod.ImmerState
import typings.std.FlatArray
import typings.std.IterableIterator
import typings.std.Map
import typings.std.Set
import typings.std.anon.CopyWithin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    val `0`: `Illegal state`
    
    val `1`: `Immer drafts cannot have computed properties`
    
    val `10`: `The given draft is already finalized`
    
    val `11`: String
    
    val `12`: String
    
    val `13`: `Immer only supports deleting array indices`
    
    val `14`: String
    
    def `15`(path: String): String
    
    val `16`: `Sets cannot have QuotationmarkreplaceQuotationmark patchesDot`
    
    def `17`(op: String): String
    
    def `18`(plugin: String): String
    
    val `2`: `This object has been frozen and should not be mutated`
    
    val `20`: String
    
    def `21`(thing: String): String
    
    def `22`(thing: String): String
    
    def `23`(thing: String): String
    
    val `24`: String
    
    def `3`(data: Any): String
    
    val `4`: String
    
    val `5`: `Immer forbids circular references`
    
    val `6`: `The first or second argument to GraveaccentproduceGraveaccent must be a function`
    
    val `7`: String
    
    val `8`: String
    
    val `9`: String
  }
  object `0` {
    
    inline def apply(
      `15`: String => String,
      `17`: String => String,
      `18`: String => String,
      `21`: String => String,
      `22`: String => String,
      `23`: String => String,
      `3`: Any => String
    ): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("0")("Illegal state")
      __obj.updateDynamic("1")("Immer drafts cannot have computed properties")
      __obj.updateDynamic("10")("The given draft is already finalized")
      __obj.updateDynamic("11")("Object.defineProperty() cannot be used on an Immer draft")
      __obj.updateDynamic("12")("Object.setPrototypeOf() cannot be used on an Immer draft")
      __obj.updateDynamic("13")("Immer only supports deleting array indices")
      __obj.updateDynamic("14")("Immer only supports setting array indices and the 'length' property")
      __obj.updateDynamic("15")(js.Any.fromFunction1(`15`))
      __obj.updateDynamic("16")("Sets cannot have \"replace\" patches.")
      __obj.updateDynamic("17")(js.Any.fromFunction1(`17`))
      __obj.updateDynamic("18")(js.Any.fromFunction1(`18`))
      __obj.updateDynamic("2")("This object has been frozen and should not be mutated")
      __obj.updateDynamic("20")("Cannot use proxies if Proxy, Proxy.revocable or Reflect are not available")
      __obj.updateDynamic("21")(js.Any.fromFunction1(`21`))
      __obj.updateDynamic("22")(js.Any.fromFunction1(`22`))
      __obj.updateDynamic("23")(js.Any.fromFunction1(`23`))
      __obj.updateDynamic("24")("Patching reserved attributes like __proto__, prototype and constructor is not allowed")
      __obj.updateDynamic("3")(js.Any.fromFunction1(`3`))
      __obj.updateDynamic("4")("An immer producer returned a new value *and* modified its draft. Either return a new value *or* modify the draft.")
      __obj.updateDynamic("5")("Immer forbids circular references")
      __obj.updateDynamic("6")("The first or second argument to `produce` must be a function")
      __obj.updateDynamic("7")("The third argument to `produce` must be a function or undefined")
      __obj.updateDynamic("8")("First argument to `createDraft` must be a plain object, an array, or an immerable object")
      __obj.updateDynamic("9")("First argument to `finishDraft` must be a draft returned by `createDraft`")
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def set0(value: `Illegal state`): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      inline def set1(value: `Immer drafts cannot have computed properties`): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      inline def set10(value: `The given draft is already finalized`): Self = StObject.set(x, "10", value.asInstanceOf[js.Any])
      
      inline def set11(value: String): Self = StObject.set(x, "11", value.asInstanceOf[js.Any])
      
      inline def set12(value: String): Self = StObject.set(x, "12", value.asInstanceOf[js.Any])
      
      inline def set13(value: `Immer only supports deleting array indices`): Self = StObject.set(x, "13", value.asInstanceOf[js.Any])
      
      inline def set14(value: String): Self = StObject.set(x, "14", value.asInstanceOf[js.Any])
      
      inline def set15(value: String => String): Self = StObject.set(x, "15", js.Any.fromFunction1(value))
      
      inline def set16(value: `Sets cannot have QuotationmarkreplaceQuotationmark patchesDot`): Self = StObject.set(x, "16", value.asInstanceOf[js.Any])
      
      inline def set17(value: String => String): Self = StObject.set(x, "17", js.Any.fromFunction1(value))
      
      inline def set18(value: String => String): Self = StObject.set(x, "18", js.Any.fromFunction1(value))
      
      inline def set2(value: `This object has been frozen and should not be mutated`): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      inline def set20(value: String): Self = StObject.set(x, "20", value.asInstanceOf[js.Any])
      
      inline def set21(value: String => String): Self = StObject.set(x, "21", js.Any.fromFunction1(value))
      
      inline def set22(value: String => String): Self = StObject.set(x, "22", js.Any.fromFunction1(value))
      
      inline def set23(value: String => String): Self = StObject.set(x, "23", js.Any.fromFunction1(value))
      
      inline def set24(value: String): Self = StObject.set(x, "24", value.asInstanceOf[js.Any])
      
      inline def set3(value: Any => String): Self = StObject.set(x, "3", js.Any.fromFunction1(value))
      
      inline def set4(value: String): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
      
      inline def set5(value: `Immer forbids circular references`): Self = StObject.set(x, "5", value.asInstanceOf[js.Any])
      
      inline def set6(value: `The first or second argument to GraveaccentproduceGraveaccent must be a function`): Self = StObject.set(x, "6", value.asInstanceOf[js.Any])
      
      inline def set7(value: String): Self = StObject.set(x, "7", value.asInstanceOf[js.Any])
      
      inline def set8(value: String): Self = StObject.set(x, "8", value.asInstanceOf[js.Any])
      
      inline def set9(value: String): Self = StObject.set(x, "9", value.asInstanceOf[js.Any])
    }
  }
  
  trait ApplyPatches extends StObject {
    
    def applyPatches_[T](draft: T, patches: js.Array[Patch]): T
    
    def generatePatches_(state: ImmerState, basePath: PatchPath, patches: js.Array[Patch], inversePatches: js.Array[Patch]): Unit
    
    def generateReplacementPatches_(base: Any, replacement: Any, patches: js.Array[Patch], inversePatches: js.Array[Patch]): Unit
  }
  object ApplyPatches {
    
    inline def apply(
      applyPatches_ : (Any, js.Array[Patch]) => Any,
      generatePatches_ : (ImmerState, PatchPath, js.Array[Patch], js.Array[Patch]) => Unit,
      generateReplacementPatches_ : (Any, Any, js.Array[Patch], js.Array[Patch]) => Unit
    ): ApplyPatches = {
      val __obj = js.Dynamic.literal(applyPatches_ = js.Any.fromFunction2(applyPatches_), generatePatches_ = js.Any.fromFunction4(generatePatches_), generateReplacementPatches_ = js.Any.fromFunction4(generateReplacementPatches_))
      __obj.asInstanceOf[ApplyPatches]
    }
    
    extension [Self <: ApplyPatches](x: Self) {
      
      inline def setApplyPatches_(value: (Any, js.Array[Patch]) => Any): Self = StObject.set(x, "applyPatches_", js.Any.fromFunction2(value))
      
      inline def setGeneratePatches_(value: (ImmerState, PatchPath, js.Array[Patch], js.Array[Patch]) => Unit): Self = StObject.set(x, "generatePatches_", js.Any.fromFunction4(value))
      
      inline def setGenerateReplacementPatches_(value: (Any, Any, js.Array[Patch], js.Array[Patch]) => Unit): Self = StObject.set(x, "generateReplacementPatches_", js.Any.fromFunction4(value))
    }
  }
  
  trait AutoFreeze extends StObject {
    
    var autoFreeze: js.UndefOr[Boolean] = js.undefined
    
    var useProxies: js.UndefOr[Boolean] = js.undefined
  }
  object AutoFreeze {
    
    inline def apply(): AutoFreeze = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoFreeze]
    }
    
    extension [Self <: AutoFreeze](x: Self) {
      
      inline def setAutoFreeze(value: Boolean): Self = StObject.set(x, "autoFreeze", value.asInstanceOf[js.Any])
      
      inline def setAutoFreezeUndefined: Self = StObject.set(x, "autoFreeze", js.undefined)
      
      inline def setUseProxies(value: Boolean): Self = StObject.set(x, "useProxies", value.asInstanceOf[js.Any])
      
      inline def setUseProxiesUndefined: Self = StObject.set(x, "useProxies", js.undefined)
    }
  }
  
  trait Base extends StObject {
    
    var base_ : Any
    
    var copy_ : Any
  }
  object Base {
    
    inline def apply(base_ : Any, copy_ : Any): Base = {
      val __obj = js.Dynamic.literal(base_ = base_.asInstanceOf[js.Any], copy_ = copy_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Base]
    }
    
    extension [Self <: Base](x: Self) {
      
      inline def setBase_(value: Any): Self = StObject.set(x, "base_", value.asInstanceOf[js.Any])
      
      inline def setCopy_(value: Any): Self = StObject.set(x, "copy_", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CreateES5Proxy extends StObject {
    
    def createES5Proxy_[T](base: T): Drafted[T, ES5ObjectState | ES5ArrayState] = js.native
    def createES5Proxy_[T](base: T, parent: ImmerState): Drafted[T, ES5ObjectState | ES5ArrayState] = js.native
    
    def hasChanges_(state: ES5ArrayState): Boolean = js.native
    def hasChanges_(state: ES5ObjectState): Boolean = js.native
    
    def willFinalizeES5_(scope: ImmerScope, result: Any, isReplaced: Boolean): Unit = js.native
  }
  
  @js.native
  trait DRAFTSTATE[T /* <: ImmerState */] extends StObject
  
  /* Inlined immer.immer/dist/internal.Drafted<immer.immer/dist/internal.AnyArray, immer.immer/dist/core/proxy.ProxyArrayState> */
  @js.native
  trait DraftedAnyArrayProxyArray
    extends StObject
       with /* standard es5 */
  /* n */ NumberDictionary[Any] {
    
    /**
      * Returns the item located at the specified index.
      * @param index The zero-based index of the desired code unit. A negative index will count back from the last item.
      */
    /* standard es2022.array */
    def at(index: Double): js.UndefOr[Any] = js.native
    
    /**
      * Combines two or more arrays.
      * This method returns a new array without modifying any existing arrays.
      * @param items Additional arrays and/or items to add to the end of the array.
      */
    /* standard es5 */
    def concat(items: (Any | js.Array[Any])*): js.Array[Any] = js.native
    
    /**
      * Returns the this object after copying a section of the array identified by start and end
      * to the same array starting at position target
      * @param target If target is negative, it is treated as length+target where length is the
      * length of the array.
      * @param start If start is negative, it is treated as length+start. If end is negative, it
      * is treated as length+end.
      * @param end If not specified, length of the this object is used as its default value.
      */
    /* standard es2015.core */
    def copyWithin(target: Double, start: Double): this.type = js.native
    def copyWithin(target: Double, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    /* standard es2015.iterable */
    def entries(): IterableIterator[js.Tuple2[Double, Any]] = js.native
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def every(predicate: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any]): Boolean = js.native
    def every(
      predicate: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any],
      thisArg: Any
    ): Boolean = js.native
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    @JSName("every")
    def every_S[S /* <: Any */](
      predicate: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is S */ Boolean]
    ): /* is std.Array<S> */ Boolean = js.native
    @JSName("every")
    def every_S[S /* <: Any */](
      predicate: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is S */ Boolean],
      thisArg: Any
    ): /* is std.Array<S> */ Boolean = js.native
    
    /**
      * Changes all array elements from `start` to `end` index to a static `value` and returns the modified array
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    /* standard es2015.core */
    def fill(value: Any): this.type = js.native
    def fill(value: Any, start: Double): this.type = js.native
    def fill(value: Any, start: Double, end: Double): this.type = js.native
    def fill(value: Any, start: Unit, end: Double): this.type = js.native
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def filter(predicate: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any]): js.Array[Any] = js.native
    def filter(
      predicate: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any],
      thisArg: Any
    ): js.Array[Any] = js.native
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    @JSName("filter")
    def filter_S[S /* <: Any */](
      predicate: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is S */ Boolean]
    ): js.Array[S] = js.native
    @JSName("filter")
    def filter_S[S /* <: Any */](
      predicate: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is S */ Boolean],
      thisArg: Any
    ): js.Array[S] = js.native
    
    /* standard es2015.core */
    def find(predicate: js.Function3[/* value */ Any, /* index */ Double, /* obj */ js.Array[Any], Any]): js.UndefOr[Any] = js.native
    def find(
      predicate: js.Function3[/* value */ Any, /* index */ Double, /* obj */ js.Array[Any], Any],
      thisArg: Any
    ): js.UndefOr[Any] = js.native
    /**
      * Returns the value of the first element in the array where predicate is true, and undefined
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found, find
      * immediately returns that element value. Otherwise, find returns undefined.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    /* standard es2015.core */
    def find[S /* <: Any */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ Any, 
          /* index */ Double, 
          /* obj */ js.Array[Any], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = js.native
    def find[S /* <: Any */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ Any, 
          /* index */ Double, 
          /* obj */ js.Array[Any], 
          /* is S */ Boolean
        ],
      thisArg: Any
    ): js.UndefOr[S] = js.native
    
    /**
      * Returns the index of the first element in the array where predicate is true, and -1
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found,
      * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    /* standard es2015.core */
    def findIndex(predicate: js.Function3[/* value */ Any, /* index */ Double, /* obj */ js.Array[Any], Any]): Double = js.native
    def findIndex(
      predicate: js.Function3[/* value */ Any, /* index */ Double, /* obj */ js.Array[Any], Any],
      thisArg: Any
    ): Double = js.native
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    /* standard es2019.array */
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = js.native
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = js.native
    
    /**
      * Calls a defined callback function on each element of an array. Then, flattens the result into
      * a new array.
      * This is identical to a map followed by flat with depth 1.
      *
      * @param callback A function that accepts up to three arguments. The flatMap method calls the
      * callback function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callback function. If
      * thisArg is omitted, undefined is used as the this value.
      */
    /* standard es2019.array */
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ Any, 
          /* index */ Double, 
          /* array */ js.Array[Any], 
          U | js.Array[U]
        ]
    ): js.Array[U] = js.native
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ Any, 
          /* index */ Double, 
          /* array */ js.Array[Any], 
          U | js.Array[U]
        ],
      thisArg: This
    ): js.Array[U] = js.native
    
    /**
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def forEach(callbackfn: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Unit]): Unit = js.native
    def forEach(
      callbackfn: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Unit],
      thisArg: Any
    ): Unit = js.native
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    /* standard es2016.array.include */
    def includes(searchElement: Any): Boolean = js.native
    def includes(searchElement: Any, fromIndex: Double): Boolean = js.native
    
    /**
      * Returns the index of the first occurrence of a value in an array, or -1 if it is not present.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    /* standard es5 */
    def indexOf(searchElement: Any): Double = js.native
    def indexOf(searchElement: Any, fromIndex: Double): Double = js.native
    
    /** Iterator */
    /* standard es2015.iterable */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[Any]] = js.native
    
    /**
      * Adds all the elements of an array into a string, separated by the specified separator string.
      * @param separator A string used to separate one element of the array from the next in the resulting string. If omitted, the array elements are separated with a comma.
      */
    /* standard es5 */
    def join(): String = js.native
    def join(separator: String): String = js.native
    
    /**
      * Returns an iterable of keys in the array
      */
    /* standard es2015.iterable */
    def keys(): IterableIterator[Double] = js.native
    
    /**
      * Returns the index of the last occurrence of a specified value in an array, or -1 if it is not present.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin searching backward. If fromIndex is omitted, the search starts at the last index in the array.
      */
    /* standard es5 */
    def lastIndexOf(searchElement: Any): Double = js.native
    def lastIndexOf(searchElement: Any, fromIndex: Double): Double = js.native
    
    /**
      * Gets or sets the length of the array. This is a number one higher than the highest index in the array.
      */
    /* standard es5 */
    var length: Double = js.native
    
    /**
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
      * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def map[U](callbackfn: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], U]): js.Array[U] = js.native
    def map[U](
      callbackfn: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], U],
      thisArg: Any
    ): js.Array[U] = js.native
    
    /**
      * Removes the last element from an array and returns it.
      * If the array is empty, undefined is returned and the array is not modified.
      */
    /* standard es5 */
    def pop(): js.UndefOr[Any] = js.native
    
    /**
      * Appends new elements to the end of an array, and returns the new length of the array.
      * @param items New elements to add to the array.
      */
    /* standard es5 */
    def push(items: Any*): Double = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ Any, 
          /* currentValue */ Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Any], 
          Any
        ]
    ): Any = js.native
    /* standard es5 */
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ Any, 
          /* currentValue */ Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Any], 
          Any
        ],
      initialValue: Any
    ): Any = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ Any, 
          /* currentValue */ Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Any], 
          Any
        ]
    ): Any = js.native
    /* standard es5 */
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ Any, 
          /* currentValue */ Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Any], 
          Any
        ],
      initialValue: Any
    ): Any = js.native
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    @JSName("reduceRight")
    def reduceRight_U_U[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Any], 
          U
        ],
      initialValue: U
    ): U = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    @JSName("reduce")
    def reduce_U_U[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Any], 
          U
        ],
      initialValue: U
    ): U = js.native
    
    /**
      * Reverses the elements in an array in place.
      * This method mutates the array and returns a reference to the same array.
      */
    /* standard es5 */
    def reverse(): js.Array[Any] = js.native
    
    /**
      * Removes the first element from an array and returns it.
      * If the array is empty, undefined is returned and the array is not modified.
      */
    /* standard es5 */
    def shift(): js.UndefOr[Any] = js.native
    
    /**
      * Returns a copy of a section of an array.
      * For both start and end, a negative index can be used to indicate an offset from the end of the array.
      * For example, -2 refers to the second to last element of the array.
      * @param start The beginning index of the specified portion of the array.
      * If start is undefined, then the slice begins at index 0.
      * @param end The end index of the specified portion of the array. This is exclusive of the element at the index 'end'.
      * If end is undefined, then the slice extends to the end of the array.
      */
    /* standard es5 */
    def slice(): js.Array[Any] = js.native
    def slice(start: Double): js.Array[Any] = js.native
    def slice(start: Double, end: Double): js.Array[Any] = js.native
    def slice(start: Unit, end: Double): js.Array[Any] = js.native
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def some(predicate: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any]): Boolean = js.native
    def some(
      predicate: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any],
      thisArg: Any
    ): Boolean = js.native
    
    /**
      * Sorts an array in place.
      * This method mutates the array and returns a reference to the same array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if the first argument is less than the second argument, zero if they're equal, and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    /* standard es5 */
    def sort(): this.type = js.native
    def sort(compareFn: js.Function2[/* a */ Any, /* b */ Any, Double]): this.type = js.native
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @returns An array containing the elements that were deleted.
      */
    /* standard es5 */
    def splice(start: Double): js.Array[Any] = js.native
    def splice(start: Double, deleteCount: Double): js.Array[Any] = js.native
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      * @returns An array containing the elements that were deleted.
      */
    /* standard es5 */
    def splice(start: Double, deleteCount: Double, items: Any*): js.Array[Any] = js.native
    
    /**
      * Returns an object whose properties have the value 'true'
      * when they will be absent when used in a 'with' statement.
      */
    /* standard es2015.symbol.wellknown */
    @JSName(js.Symbol.unscopables)
    var unscopables: js.Function0[CopyWithin] = js.native
    
    /**
      * Inserts new elements at the start of an array, and returns the new length of the array.
      * @param items Elements to insert at the start of the array.
      */
    /* standard es5 */
    def unshift(items: Any*): Double = js.native
    
    /**
      * Returns an iterable of values in the array
      */
    /* standard es2015.iterable */
    def values(): IterableIterator[Any] = js.native
  }
  
  /* Inlined immer.immer/dist/internal.Drafted<immer.immer/dist/internal.AnyMap, immer.immer/dist/utils/plugins.MapState> */
  @js.native
  trait DraftedAnyMapMapState extends StObject {
    
    /* standard es2015.collection */
    def clear(): Unit = js.native
    
    /**
      * @returns true if an element in the Map existed and has been removed, or false if the element does not exist.
      */
    /* standard es2015.collection */
    def delete(key: Any): Boolean = js.native
    
    /**
      * Returns an iterable of key, value pairs for every entry in the map.
      */
    /* standard es2015.iterable */
    def entries(): IterableIterator[js.Tuple2[Any, Any]] = js.native
    
    /**
      * Executes a provided function once per each key/value pair in the Map, in insertion order.
      */
    /* standard es2015.collection */
    def forEach(callbackfn: js.Function3[/* value */ Any, /* key */ Any, /* map */ Map[Any, Any], Unit]): Unit = js.native
    def forEach(
      callbackfn: js.Function3[/* value */ Any, /* key */ Any, /* map */ Map[Any, Any], Unit],
      thisArg: Any
    ): Unit = js.native
    
    /**
      * Returns a specified element from the Map object. If the value that is associated to the provided key is an object, then you will get a reference to that object and any change made to that object will effectively modify it inside the Map.
      * @returns Returns the element associated with the specified key. If no element is associated with the specified key, undefined is returned.
      */
    /* standard es2015.collection */
    def get(key: Any): js.UndefOr[Any] = js.native
    
    /**
      * @returns boolean indicating whether an element with the specified key exists or not.
      */
    /* standard es2015.collection */
    def has(key: Any): Boolean = js.native
    
    /** Returns an iterable of entries in the map. */
    /* standard es2015.iterable */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[js.Tuple2[Any, Any]]] = js.native
    
    /**
      * Returns an iterable of keys in the map
      */
    /* standard es2015.iterable */
    def keys(): IterableIterator[Any] = js.native
    
    /**
      * Adds a new element with a specified key and value to the Map. If an element with the same key already exists, the element will be updated.
      */
    /* standard es2015.collection */
    def set(key: Any, value: Any): this.type = js.native
    
    /**
      * @returns the number of elements in the Map.
      */
    /* standard es2015.collection */
    val size: Double = js.native
    
    /* standard es2015.symbol.wellknown */
    @JSName(js.Symbol.toStringTag)
    val toStringTag: String = js.native
    
    /**
      * Returns an iterable of values in the map
      */
    /* standard es2015.iterable */
    def values(): IterableIterator[Any] = js.native
  }
  
  /* Inlined immer.immer/dist/internal.Drafted<immer.immer/dist/internal.AnyObject, immer.immer/dist/utils/plugins.ES5ArrayState> */
  @js.native
  trait DraftedAnyObjectES5ArrayS
    extends StObject
       with /* key */ StringDictionary[Any]
  
  /* Inlined immer.immer/dist/internal.Drafted<immer.immer/dist/internal.AnyObject, immer.immer/dist/utils/plugins.ES5ObjectState> */
  @js.native
  trait DraftedAnyObjectES5Object
    extends StObject
       with /* key */ StringDictionary[Any]
  
  /* Inlined immer.immer/dist/internal.Drafted<immer.immer/dist/internal.AnyObject, immer.immer/dist/core/proxy.ProxyObjectState> */
  @js.native
  trait DraftedAnyObjectProxyObje
    extends StObject
       with /* key */ StringDictionary[Any]
  
  /* Inlined immer.immer/dist/internal.Drafted<immer.immer/dist/internal.AnySet, immer.immer/dist/utils/plugins.SetState> */
  @js.native
  trait DraftedAnySetSetState extends StObject {
    
    /**
      * Appends a new element with a specified value to the end of the Set.
      */
    /* standard es2015.collection */
    def add(value: Any): this.type = js.native
    
    /* standard es2015.collection */
    def clear(): Unit = js.native
    
    /**
      * Removes a specified value from the Set.
      * @returns Returns true if an element in the Set existed and has been removed, or false if the element does not exist.
      */
    /* standard es2015.collection */
    def delete(value: Any): Boolean = js.native
    
    /**
      * Returns an iterable of [v,v] pairs for every value `v` in the set.
      */
    /* standard es2015.iterable */
    def entries(): IterableIterator[js.Tuple2[Any, Any]] = js.native
    
    /**
      * Executes a provided function once per each value in the Set object, in insertion order.
      */
    /* standard es2015.collection */
    def forEach(callbackfn: js.Function3[/* value */ Any, /* value2 */ Any, /* set */ Set[Any], Unit]): Unit = js.native
    def forEach(
      callbackfn: js.Function3[/* value */ Any, /* value2 */ Any, /* set */ Set[Any], Unit],
      thisArg: Any
    ): Unit = js.native
    
    /**
      * @returns a boolean indicating whether an element with the specified value exists in the Set or not.
      */
    /* standard es2015.collection */
    def has(value: Any): Boolean = js.native
    
    /** Iterates over values in the set. */
    /* standard es2015.iterable */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[Any]] = js.native
    
    /**
      * Despite its name, returns an iterable of the values in the set.
      */
    /* standard es2015.iterable */
    def keys(): IterableIterator[Any] = js.native
    
    /**
      * @returns the number of (unique) elements in Set.
      */
    /* standard es2015.collection */
    val size: Double = js.native
    
    /* standard es2015.symbol.wellknown */
    @JSName(js.Symbol.toStringTag)
    val toStringTag: String = js.native
    
    /**
      * Returns an iterable of values in the set.
      */
    /* standard es2015.iterable */
    def values(): IterableIterator[Any] = js.native
  }
  
  @js.native
  trait ProxyMap extends StObject {
    
    def proxyMap_[T /* <: AnyMap */](target: T): T = js.native
    def proxyMap_[T /* <: AnyMap */](target: T, parent: ImmerState): T = js.native
    
    def proxySet_[T /* <: AnySet */](target: T): T = js.native
    def proxySet_[T /* <: AnySet */](target: T, parent: ImmerState): T = js.native
  }
}
