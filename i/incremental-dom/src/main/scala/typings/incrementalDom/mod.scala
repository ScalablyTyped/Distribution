package typings.incrementalDom

import typings.std.DocumentFragment
import typings.std.Element
import typings.std.Node
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("incremental-dom", JSImport.Namespace)
@js.native
object mod extends js.Object {
  var applyAttr: js.Function3[
    /* el */ Element, 
    /* name */ String, 
    /* value */ js.UndefOr[Boolean | Double | String], 
    Unit
  ] = js.native
  var applyProp: js.Function3[/* el */ Element, /* name */ String, /* value */ js.UndefOr[js.Any], Unit] = js.native
  var attr: js.Function2[/* name */ String, /* value */ js.Any, Unit] = js.native
  var attributes: js.Any = js.native
  var close: js.Function0[Element] = js.native
  var currentElement: js.Function0[Element] = js.native
  var currentPointer: js.Function0[Node] = js.native
  var elementClose: js.Function1[/* nameOrCtor */ NameOrCtorDef, Element] = js.native
  var elementOpen: js.Function4[
    /* nameOrCtor */ NameOrCtorDef, 
    /* key */ js.UndefOr[String], 
    /* statics */ js.UndefOr[js.Array[js.Any]], 
    /* repeated */ js.Any, 
    Element
  ] = js.native
  var elementOpenEnd: js.Function0[Element] = js.native
  var elementOpenStart: js.Function3[
    /* nameOrCtor */ NameOrCtorDef, 
    /* key */ js.UndefOr[String], 
    /* statics */ js.UndefOr[js.Array[js.Any]], 
    Unit
  ] = js.native
  var elementVoid: js.Function4[
    /* nameOrCtor */ NameOrCtorDef, 
    /* key */ js.UndefOr[String], 
    /* statics */ js.UndefOr[js.Array[js.Any]], 
    /* repeated */ js.Any, 
    Element
  ] = js.native
  var importNode: js.Function1[/* node */ js.UndefOr[Node], Unit] = js.native
  var open: js.Function3[
    /* nameOrCtor */ NameOrCtorDef, 
    /* key */ js.UndefOr[String], 
    /* typeId */ js.UndefOr[js.Any], 
    Element
  ] = js.native
  var patchInner: js.Function3[
    /* node */ Element | DocumentFragment, 
    /* fn */ js.Function1[/* data */ js.Any, Unit], 
    /* data */ js.UndefOr[js.Any], 
    Node
  ] = js.native
  var patchOuter: js.Function3[
    /* node */ Element, 
    /* fn */ js.Function1[/* data */ js.Any, Unit], 
    /* data */ js.UndefOr[js.Any], 
    Node | Null
  ] = js.native
  var skip: js.Function0[Unit] = js.native
  var skipNode: js.Function0[Unit] = js.native
  var symbols: js.Any = js.native
  var text: js.Function1[/* value */ String | Double | Boolean, Text] = js.native
  @js.native
  object patch extends js.Object {
    def apply[T](node: DocumentFragment, fn: js.Function1[/* data */ T, Unit]): Node = js.native
    def apply[T](node: DocumentFragment, fn: js.Function1[/* data */ T, Unit], data: T): Node = js.native
    def apply[T](node: Element, fn: js.Function1[/* data */ T, Unit]): Node = js.native
    def apply[T](node: Element, fn: js.Function1[/* data */ T, Unit], data: T): Node = js.native
  }
  
  type NameOrCtorDef = String | AnonArgs
}

