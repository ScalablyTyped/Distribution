package typings.hoxy

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typings.cheerio.libEsmCheerioMod.Cheerio
import typings.cheerio.libEsmLoadMod.CheerioAPI
import typings.cheerio.libEsmOptionsMod.CheerioOptions
import typings.cheerio.libEsmTypesMod.BasicAcceptedElems
import typings.cheerio.libOptionsMod.InternalOptions
import typings.cheerio.libStaticMod.WritableArrayLike
import typings.domhandler.libNodeMod.AnyNode
import typings.domhandler.libNodeMod.ChildNode
import typings.domhandler.mod.Document
import typings.hoxy.hoxyStrings._empty
import typings.node.bufferMod.global.Buffer
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<hoxy.hoxy.Slow> */
  trait PartialSlow extends StObject {
    
    var down: js.UndefOr[Double] = js.undefined
    
    var latency: js.UndefOr[Double] = js.undefined
    
    var rate: js.UndefOr[Double] = js.undefined
    
    var up: js.UndefOr[Double] = js.undefined
  }
  object PartialSlow {
    
    inline def apply(): PartialSlow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSlow]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialSlow] (val x: Self) extends AnyVal {
      
      inline def setDown(value: Double): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
      
      inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
      
      inline def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
      
      inline def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
      
      inline def setUp(value: Double): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
      
      inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
    }
  }
  
  @js.native
  trait Typeofcheerio extends StObject {
    
    /**
      * This selector method is the starting point for traversing and manipulating
      * the document. Like jQuery, it's the primary method for selecting elements
      * in the document.
      *
      * `selector` searches within the `context` scope which searches within the
      * `root` scope.
      *
      * @example
      *
      * ```js
      * $('.apple', '#fruits').text();
      * //=> Apple
      *
      * $('ul .pear').attr('class');
      * //=> pear
      *
      * $('li[class=orange]').html();
      * //=> Orange
      * ```
      *
      * @param selector - Either a selector to look for within the document, or the
      *   contents of a new Cheerio instance.
      * @param context - Either a selector to look for within the root, or the
      *   contents of the document to query.
      * @param root - Optional HTML document string.
      */
    /**
      * The default cheerio instance.
      *
      * @deprecated Use the function returned by `load` instead.
      */
    def default[T /* <: AnyNode */, S /* <: String */](): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    /**
      * The default cheerio instance.
      *
      * @deprecated Use the function returned by `load` instead.
      */
    def default[T /* <: AnyNode */, S /* <: String */](selector: BasicAcceptedElems[T] | S): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    /**
      * The default cheerio instance.
      *
      * @deprecated Use the function returned by `load` instead.
      */
    def default[T /* <: AnyNode */, S /* <: String */](selector: BasicAcceptedElems[T] | S, context: Null, root: Unit, options: CheerioOptions): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    /**
      * The default cheerio instance.
      *
      * @deprecated Use the function returned by `load` instead.
      */
    def default[T /* <: AnyNode */, S /* <: String */](selector: BasicAcceptedElems[T] | S, context: Null, root: BasicAcceptedElems[Document]): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    /**
      * The default cheerio instance.
      *
      * @deprecated Use the function returned by `load` instead.
      */
    def default[T /* <: AnyNode */, S /* <: String */](
      selector: BasicAcceptedElems[T] | S,
      context: Null,
      root: BasicAcceptedElems[Document],
      options: CheerioOptions
    ): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    /**
      * The default cheerio instance.
      *
      * @deprecated Use the function returned by `load` instead.
      */
    def default[T /* <: AnyNode */, S /* <: String */](selector: BasicAcceptedElems[T] | S, context: Unit, root: Unit, options: CheerioOptions): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    /**
      * The default cheerio instance.
      *
      * @deprecated Use the function returned by `load` instead.
      */
    def default[T /* <: AnyNode */, S /* <: String */](selector: BasicAcceptedElems[T] | S, context: Unit, root: BasicAcceptedElems[Document]): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    /**
      * The default cheerio instance.
      *
      * @deprecated Use the function returned by `load` instead.
      */
    def default[T /* <: AnyNode */, S /* <: String */](
      selector: BasicAcceptedElems[T] | S,
      context: Unit,
      root: BasicAcceptedElems[Document],
      options: CheerioOptions
    ): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    /**
      * The default cheerio instance.
      *
      * @deprecated Use the function returned by `load` instead.
      */
    def default[T /* <: AnyNode */, S /* <: String */](selector: BasicAcceptedElems[T] | S, context: BasicAcceptedElems[AnyNode]): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    /**
      * The default cheerio instance.
      *
      * @deprecated Use the function returned by `load` instead.
      */
    def default[T /* <: AnyNode */, S /* <: String */](
      selector: BasicAcceptedElems[T] | S,
      context: BasicAcceptedElems[AnyNode],
      root: Unit,
      options: CheerioOptions
    ): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    /**
      * The default cheerio instance.
      *
      * @deprecated Use the function returned by `load` instead.
      */
    def default[T /* <: AnyNode */, S /* <: String */](
      selector: BasicAcceptedElems[T] | S,
      context: BasicAcceptedElems[AnyNode],
      root: BasicAcceptedElems[Document]
    ): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    /**
      * The default cheerio instance.
      *
      * @deprecated Use the function returned by `load` instead.
      */
    def default[T /* <: AnyNode */, S /* <: String */](
      selector: BasicAcceptedElems[T] | S,
      context: BasicAcceptedElems[AnyNode],
      root: BasicAcceptedElems[Document],
      options: CheerioOptions
    ): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    /**
      * The default cheerio instance.
      *
      * @deprecated Use the function returned by `load` instead.
      */
    def default[T /* <: AnyNode */, S /* <: String */](selector: Unit, context: Null, root: Unit, options: CheerioOptions): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    /**
      * The default cheerio instance.
      *
      * @deprecated Use the function returned by `load` instead.
      */
    def default[T /* <: AnyNode */, S /* <: String */](selector: Unit, context: Null, root: BasicAcceptedElems[Document]): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    /**
      * The default cheerio instance.
      *
      * @deprecated Use the function returned by `load` instead.
      */
    def default[T /* <: AnyNode */, S /* <: String */](selector: Unit, context: Null, root: BasicAcceptedElems[Document], options: CheerioOptions): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    /**
      * The default cheerio instance.
      *
      * @deprecated Use the function returned by `load` instead.
      */
    def default[T /* <: AnyNode */, S /* <: String */](selector: Unit, context: Unit, root: Unit, options: CheerioOptions): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    /**
      * The default cheerio instance.
      *
      * @deprecated Use the function returned by `load` instead.
      */
    def default[T /* <: AnyNode */, S /* <: String */](selector: Unit, context: Unit, root: BasicAcceptedElems[Document]): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    /**
      * The default cheerio instance.
      *
      * @deprecated Use the function returned by `load` instead.
      */
    def default[T /* <: AnyNode */, S /* <: String */](selector: Unit, context: Unit, root: BasicAcceptedElems[Document], options: CheerioOptions): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    /**
      * The default cheerio instance.
      *
      * @deprecated Use the function returned by `load` instead.
      */
    def default[T /* <: AnyNode */, S /* <: String */](selector: Unit, context: BasicAcceptedElems[AnyNode]): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    /**
      * The default cheerio instance.
      *
      * @deprecated Use the function returned by `load` instead.
      */
    def default[T /* <: AnyNode */, S /* <: String */](selector: Unit, context: BasicAcceptedElems[AnyNode], root: Unit, options: CheerioOptions): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    /**
      * The default cheerio instance.
      *
      * @deprecated Use the function returned by `load` instead.
      */
    def default[T /* <: AnyNode */, S /* <: String */](selector: Unit, context: BasicAcceptedElems[AnyNode], root: BasicAcceptedElems[Document]): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    /**
      * The default cheerio instance.
      *
      * @deprecated Use the function returned by `load` instead.
      */
    def default[T /* <: AnyNode */, S /* <: String */](
      selector: Unit,
      context: BasicAcceptedElems[AnyNode],
      root: BasicAcceptedElems[Document],
      options: CheerioOptions
    ): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    
    var Cheerio: Instantiable3[
        /* elements */ ArrayLike[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
        /* root */ typings.cheerio.libCheerioMod.Cheerio[Document], 
        /* options */ InternalOptions, 
        typings.cheerio.libCheerioMod.Cheerio[js.Object]
      ] = js.native
    
    var Document: Instantiable1[/* children */ js.Array[ChildNode], typings.cheerio.mod.Document] = js.native
    
    var Element: Instantiable2[
        /* name */ String, 
        /* attribs */ StringDictionary[String], 
        typings.cheerio.mod.Element
      ] = js.native
    
    var Node: Instantiable0[typings.cheerio.mod.Node] = js.native
    
    def contains(container: AnyNode, contained: AnyNode): Boolean = js.native
    
    /**
      * The default cheerio instance.
      *
      * @deprecated Use the function returned by `load` instead.
      */
    @JSName("default")
    val default_Original: CheerioAPI = js.native
    
    def html(): String = js.native
    def html(dom: Unit, options: typings.cheerio.libOptionsMod.CheerioOptions): String = js.native
    def html(dom: typings.cheerio.libTypesMod.BasicAcceptedElems[AnyNode]): String = js.native
    def html(
      dom: typings.cheerio.libTypesMod.BasicAcceptedElems[AnyNode],
      options: typings.cheerio.libOptionsMod.CheerioOptions
    ): String = js.native
    def html(options: typings.cheerio.libOptionsMod.CheerioOptions): String = js.native
    
    def load(content: String): CheerioAPI = js.native
    def load(content: String, options: Null, isDocument: Boolean): CheerioAPI = js.native
    def load(content: String, options: Unit, isDocument: Boolean): CheerioAPI = js.native
    def load(content: String, options: CheerioOptions): CheerioAPI = js.native
    def load(content: String, options: CheerioOptions, isDocument: Boolean): CheerioAPI = js.native
    def load(content: js.Array[AnyNode]): CheerioAPI = js.native
    def load(content: js.Array[AnyNode], options: Null, isDocument: Boolean): CheerioAPI = js.native
    def load(content: js.Array[AnyNode], options: Unit, isDocument: Boolean): CheerioAPI = js.native
    def load(content: js.Array[AnyNode], options: CheerioOptions): CheerioAPI = js.native
    def load(content: js.Array[AnyNode], options: CheerioOptions, isDocument: Boolean): CheerioAPI = js.native
    def load(content: AnyNode): CheerioAPI = js.native
    def load(content: AnyNode, options: Null, isDocument: Boolean): CheerioAPI = js.native
    def load(content: AnyNode, options: Unit, isDocument: Boolean): CheerioAPI = js.native
    def load(content: AnyNode, options: CheerioOptions): CheerioAPI = js.native
    def load(content: AnyNode, options: CheerioOptions, isDocument: Boolean): CheerioAPI = js.native
    def load(content: Buffer): CheerioAPI = js.native
    def load(content: Buffer, options: Null, isDocument: Boolean): CheerioAPI = js.native
    def load(content: Buffer, options: Unit, isDocument: Boolean): CheerioAPI = js.native
    def load(content: Buffer, options: CheerioOptions): CheerioAPI = js.native
    def load(content: Buffer, options: CheerioOptions, isDocument: Boolean): CheerioAPI = js.native
    
    val merge: Typeofmerge = js.native
    
    val parseHTML: TypeofparseHTML = js.native
    
    def root(): typings.cheerio.libCheerioMod.Cheerio[Document] = js.native
    
    def text(): String = js.native
    def text(elements: ArrayLike[AnyNode]): String = js.native
    
    def xml(): String = js.native
    def xml(dom: typings.cheerio.libTypesMod.BasicAcceptedElems[AnyNode]): String = js.native
  }
  
  @js.native
  trait Typeofmerge extends StObject {
    
    def apply[T](arr1: WritableArrayLike[T], arr2: ArrayLike[T]): js.UndefOr[ArrayLike[T]] = js.native
  }
  
  @js.native
  trait TypeofparseHTML extends StObject {
    
    def apply(): Null = js.native
    def apply(data: String): js.Array[AnyNode] = js.native
    def apply(data: String, context: Any): js.Array[AnyNode] = js.native
    def apply(data: String, context: Any, keepScripts: Boolean): js.Array[AnyNode] = js.native
    def apply(data: String, context: Boolean): js.Array[AnyNode] = js.native
    def apply(data: String, context: Boolean, keepScripts: Boolean): js.Array[AnyNode] = js.native
    def apply(data: String, context: Unit, keepScripts: Boolean): js.Array[AnyNode] = js.native
    def apply(data: _empty): Null = js.native
  }
}
