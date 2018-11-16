package typings
package incrementalDashDomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("incremental-dom", JSImport.Namespace)
@js.native
object incrementalDashDomMod extends js.Object {
  var applyAttr: js.Function3[
    /* el */ stdLib.Element, 
    /* name */ java.lang.String, 
    /* value */ js.UndefOr[scala.Boolean | scala.Double | java.lang.String], 
    scala.Unit
  ] = js.native
  var applyProp: js.Function3[
    /* el */ stdLib.Element, 
    /* name */ java.lang.String, 
    /* value */ js.UndefOr[js.Any], 
    scala.Unit
  ] = js.native
  var attr: js.Function2[/* name */ java.lang.String, /* value */ js.Any, scala.Unit] = js.native
  var attributes: js.Any = js.native
  var close: js.Function0[stdLib.Element] = js.native
  var currentElement: js.Function0[stdLib.Element] = js.native
  var currentPointer: js.Function0[stdLib.Node] = js.native
  var elementClose: js.Function1[/* nameOrCtor */ incrementalDashDomLib.NameOrCtorDef, stdLib.Element] = js.native
  var elementOpen: js.Function4[
    /* nameOrCtor */ incrementalDashDomLib.NameOrCtorDef, 
    /* key */ js.UndefOr[java.lang.String], 
    /* statics */ js.UndefOr[js.Array[js.Any]], 
    /* repeated */js.Any, 
    stdLib.Element
  ] = js.native
  var elementOpenEnd: js.Function0[stdLib.Element] = js.native
  var elementOpenStart: js.Function3[
    /* nameOrCtor */ incrementalDashDomLib.NameOrCtorDef, 
    /* key */ js.UndefOr[java.lang.String], 
    /* statics */ js.UndefOr[js.Array[js.Any]], 
    scala.Unit
  ] = js.native
  var elementVoid: js.Function4[
    /* nameOrCtor */ incrementalDashDomLib.NameOrCtorDef, 
    /* key */ js.UndefOr[java.lang.String], 
    /* statics */ js.UndefOr[js.Array[js.Any]], 
    /* repeated */js.Any, 
    stdLib.Element
  ] = js.native
  var importNode: js.Function1[/* node */ js.UndefOr[stdLib.Node], scala.Unit] = js.native
  var open: js.Function3[
    /* nameOrCtor */ incrementalDashDomLib.NameOrCtorDef, 
    /* key */ js.UndefOr[java.lang.String], 
    /* typeId */ js.UndefOr[js.Any], 
    stdLib.Element
  ] = js.native
  var patch: js.Function3[
    /* node */ stdLib.Element | stdLib.DocumentFragment, 
    /* fn */ js.Function1[/* data */ js.Any, scala.Unit], 
    /* data */ js.UndefOr[js.Any], 
    stdLib.Node
  ] = js.native
  var patchInner: js.Function3[
    /* node */ stdLib.Element | stdLib.DocumentFragment, 
    /* fn */ js.Function1[/* data */ js.Any, scala.Unit], 
    /* data */ js.UndefOr[js.Any], 
    stdLib.Node
  ] = js.native
  var patchOuter: js.Function3[
    /* node */ stdLib.Element, 
    /* fn */ js.Function1[/* data */ js.Any, scala.Unit], 
    /* data */ js.UndefOr[js.Any], 
    stdLib.Node | scala.Null
  ] = js.native
  var skip: js.Function0[scala.Unit] = js.native
  var skipNode: js.Function0[scala.Unit] = js.native
  var symbols: js.Any = js.native
  var text: js.Function1[/* value */ java.lang.String | scala.Double | scala.Boolean, stdLib.Text] = js.native
}

