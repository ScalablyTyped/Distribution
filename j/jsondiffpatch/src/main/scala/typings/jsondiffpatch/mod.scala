package typings.jsondiffpatch

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.jsondiffpatch.anon.DetectMove
import typings.jsondiffpatch.anon.Diff
import typings.jsondiffpatch.anon.MinLength
import typings.jsondiffpatch.jsondiffpatchStrings.diff
import typings.jsondiffpatch.jsondiffpatchStrings.patch
import typings.jsondiffpatch.jsondiffpatchStrings.reverse
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsondiffpatch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jsondiffpatch", "Context")
  @js.native
  class Context () extends StObject {
    
    var childName: js.UndefOr[String] = js.native
    
    var children: js.UndefOr[js.Array[PatchContext]] = js.native
    
    def exit(): Context = js.native
    
    var exiting: js.UndefOr[Boolean] = js.native
    
    var hasResult: Boolean = js.native
    
    var nested: Boolean = js.native
    
    var next: js.UndefOr[PatchContext] = js.native
    
    var nextAfterChildren: js.UndefOr[PatchContext] = js.native
    
    var options: Config = js.native
    
    var parent: js.UndefOr[PatchContext] = js.native
    
    var root: js.UndefOr[PatchContext] = js.native
    
    def setResult(result: js.Any): Context = js.native
  }
  
  @JSImport("jsondiffpatch", "DiffContext")
  @js.native
  class DiffContext ()
    extends Context
       with FilterContext {
    
    var left: js.Any = js.native
    
    var pipe: diff = js.native
    
    var right: js.Any = js.native
  }
  
  @JSImport("jsondiffpatch", "DiffPatcher")
  @js.native
  class DiffPatcher () extends StObject {
    def this(options: Config) = this()
    
    def clone(value: js.Any): js.Any = js.native
    
    def diff(left: js.Any, right: js.Any): js.UndefOr[Delta] = js.native
    
    def patch(left: js.Any, delta: Delta): js.Any = js.native
    
    var processor: Processor = js.native
    
    def reverse(delta: Delta): js.UndefOr[Delta] = js.native
    
    def unpatch(right: js.Any, delta: Delta): js.Any = js.native
  }
  
  @JSImport("jsondiffpatch", "PatchContext")
  @js.native
  class PatchContext ()
    extends Context
       with FilterContext {
    
    var delta: Delta = js.native
    
    var left: js.Any = js.native
    
    var pipe: patch = js.native
  }
  
  @JSImport("jsondiffpatch", "Pipe")
  @js.native
  class Pipe[TContext /* <: FilterContext */] () extends StObject {
    
    /**
      * Add one ore more filters after the specified filter
      * @param filterName The name of the filter to insert before
      * @param filters Filters to be inserted
      */
    def after(filterName: String, filters: Filter[TContext]*): Unit = js.native
    
    /**
      * Append one or more filters to the existing list
      */
    def append(filters: Filter[TContext]*): Unit = js.native
    
    /**
      * Add one ore more filters before the specified filter
      * @param filterName The name of the filter to insert before
      * @param filters Filters to be inserted
      */
    def before(filterName: String, filters: Filter[TContext]*): Unit = js.native
    
    /**
      * Remove all filters from this pipe
      */
    def clear(): Unit = js.native
    
    /**
      * Return array of ordered filter names for this pipe
      */
    def list(): Unit = js.native
    
    /**
      * Prepend one or more filters to the existing list
      */
    def prepend(filters: Filter[TContext]*): Unit = js.native
    
    /**
      * Remove the filter with the specified name
      * @param filterName The name of the filter to remove
      */
    def remove(filterName: String): Unit = js.native
    
    /**
      * Replace the specified filter with one ore more filters
      * @param filterName The name of the filter to replace
      * @param filters Filters to be inserted
      */
    def replace(filterName: String, filters: Filter[TContext]*): Unit = js.native
  }
  
  @JSImport("jsondiffpatch", "Processor")
  @js.native
  class Processor () extends StObject {
    def this(options: Config) = this()
    
    var pipes: Diff = js.native
  }
  
  @JSImport("jsondiffpatch", "ReverseContext")
  @js.native
  class ReverseContext ()
    extends Context
       with FilterContext {
    
    var delta: Delta = js.native
    
    var pipe: reverse = js.native
  }
  
  @JSImport("jsondiffpatch", "console")
  @js.native
  val console: Formatter = js.native
  
  inline def create(): DiffPatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[DiffPatcher]
  inline def create(options: js.Any): DiffPatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[DiffPatcher]
  
  inline def dateReviver(key: String, value: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dateReviver")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def diff(left: js.Any, right: js.Any): js.UndefOr[Delta] = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Delta]]
  
  object formatters {
    
    @JSImport("jsondiffpatch", "formatters")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("jsondiffpatch", "formatters.annotated")
    @js.native
    def annotated: Formatter = js.native
    inline def annotated_=(x: Formatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotated")(x.asInstanceOf[js.Any])
    
    @JSImport("jsondiffpatch", "formatters.console")
    @js.native
    def console: Formatter = js.native
    inline def console_=(x: Formatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("console")(x.asInstanceOf[js.Any])
    
    @JSImport("jsondiffpatch", "formatters.html")
    @js.native
    def html: HtmlFormatter = js.native
    inline def html_=(x: HtmlFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("html")(x.asInstanceOf[js.Any])
  }
  
  inline def patch(left: js.Any, delta: Delta): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(left.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def reverse(delta: Delta): js.UndefOr[Delta] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(delta.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Delta]]
  
  inline def unpatch(right: js.Any, delta: Delta): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unpatch")(right.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  trait Config extends StObject {
    
    var arrays: js.UndefOr[DetectMove] = js.undefined
    
    /**
      *  default false. if true, values in the obtained delta will be cloned (using jsondiffpatch.clone by default),
      *  to ensure delta keeps no references to left or right objects. this becomes useful if you're diffing and patching
      *  the same objects multiple times without serializing deltas.
      *
      *  instead of true, a function can be specified here to provide a custom clone(value)
      */
    var cloneDiffValues: js.UndefOr[Boolean | (js.Function1[/* value */ js.Any, js.Any])] = js.undefined
    
    // used to match objects when diffing arrays, by default only === operator is used
    var objectHash: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, String]] = js.undefined
    
    /**
      * this optional function can be specified to ignore object properties (eg. volatile data)
      * @param name property name, present in either context.left or context.right objects
      * @param context the diff context (has context.left and context.right objects)
      */
    /**
      *
      */
    var propertyFilter: js.UndefOr[js.Function2[/* name */ String, /* context */ DiffContext, Boolean]] = js.undefined
    
    var textDiff: js.UndefOr[MinLength] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setArrays(value: DetectMove): Self = StObject.set(x, "arrays", value.asInstanceOf[js.Any])
      
      inline def setArraysUndefined: Self = StObject.set(x, "arrays", js.undefined)
      
      inline def setCloneDiffValues(value: Boolean | (js.Function1[/* value */ js.Any, js.Any])): Self = StObject.set(x, "cloneDiffValues", value.asInstanceOf[js.Any])
      
      inline def setCloneDiffValuesFunction1(value: /* value */ js.Any => js.Any): Self = StObject.set(x, "cloneDiffValues", js.Any.fromFunction1(value))
      
      inline def setCloneDiffValuesUndefined: Self = StObject.set(x, "cloneDiffValues", js.undefined)
      
      inline def setObjectHash(value: (/* item */ js.Any, /* index */ Double) => String): Self = StObject.set(x, "objectHash", js.Any.fromFunction2(value))
      
      inline def setObjectHashUndefined: Self = StObject.set(x, "objectHash", js.undefined)
      
      inline def setPropertyFilter(value: (/* name */ String, /* context */ DiffContext) => Boolean): Self = StObject.set(x, "propertyFilter", js.Any.fromFunction2(value))
      
      inline def setPropertyFilterUndefined: Self = StObject.set(x, "propertyFilter", js.undefined)
      
      inline def setTextDiff(value: MinLength): Self = StObject.set(x, "textDiff", value.asInstanceOf[js.Any])
      
      inline def setTextDiffUndefined: Self = StObject.set(x, "textDiff", js.undefined)
    }
  }
  
  type Delta = StringDictionary[js.Any] & NumberDictionary[js.Any]
  
  @js.native
  trait Filter[TContext /* <: FilterContext */] extends StObject {
    
    /**
      * A function which is called at each stage of the operation and can update the context to modify the result
      * @param context The current state of the operation
      */
    def apply(context: TContext): Unit = js.native
    
    /**
      * A unique name which can be used to insert other filters before/after, or remove/replace this filter
      */
    var filterName: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsondiffpatch.mod.PatchContext
    - typings.jsondiffpatch.mod.DiffContext
    - typings.jsondiffpatch.mod.ReverseContext
  */
  trait FilterContext extends StObject
  
  trait Formatter extends StObject {
    
    def format(delta: Delta, original: js.Any): String
  }
  object Formatter {
    
    inline def apply(format: (Delta, js.Any) => String): Formatter = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format))
      __obj.asInstanceOf[Formatter]
    }
    
    extension [Self <: Formatter](x: Self) {
      
      inline def setFormat(value: (Delta, js.Any) => String): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait HtmlFormatter
    extends StObject
       with Formatter {
    
    /**
      * An alias for showUnchanged(false, ...)
      * @param node The root element the diff is contained within (Default: body)
      * @param delay Transition time in ms. (Default: no transition)
      */
    def hideUnchanged(): Unit = js.native
    def hideUnchanged(node: Null, delay: Double): Unit = js.native
    def hideUnchanged(node: Unit, delay: Double): Unit = js.native
    def hideUnchanged(node: Element): Unit = js.native
    def hideUnchanged(node: Element, delay: Double): Unit = js.native
    
    /**
      * Set whether to show or hide unchanged parts of a diff.
      * @param show Whether to show unchanged parts
      * @param node The root element the diff is contained within. (Default: body)
      * @param delay Transition time in ms. (Default: no transition)
      */
    def showUnchanged(show: Boolean): Unit = js.native
    def showUnchanged(show: Boolean, node: Null, delay: Double): Unit = js.native
    def showUnchanged(show: Boolean, node: Unit, delay: Double): Unit = js.native
    def showUnchanged(show: Boolean, node: Element): Unit = js.native
    def showUnchanged(show: Boolean, node: Element, delay: Double): Unit = js.native
  }
}
