package typings.ink.inkMod

import org.scalablytyped.runtime.Instantiable2
import typings.ink.Anon_Children
import typings.propDashTypes.propDashTypesMod.ValidationMap
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentClass[P /* <: Record[String, _] */, S /* <: Record[String, _] */, C /* <: Record[String, _] */]
  extends Instantiable2[
      /* props */ js.Object with Anon_Children, 
      /* context */ js.Object, 
      Component[P, S, C]
    ] {
  var defaultProps: js.UndefOr[Record[String, _]] = js.native
  var propTypes: js.UndefOr[ValidationMap[Record[String, _]]] = js.native
}

