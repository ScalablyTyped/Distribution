package typings
package inkLib.inkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentClass[P /* <: stdLib.Record[java.lang.String, _] */, S /* <: stdLib.Record[java.lang.String, _] */, C /* <: stdLib.Record[java.lang.String, _] */]
  extends org.scalablytyped.runtime.Instantiable2[
      /* props */ js.Object with inkLib.Anon_Children, 
      /* context */ js.Object, 
      Component[P, S, C]
    ] {
  var defaultProps: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.native
  var propTypes: js.UndefOr[
    propDashTypesLib.propDashTypesMod.ValidationMap[stdLib.Record[java.lang.String, _]]
  ] = js.native
}

