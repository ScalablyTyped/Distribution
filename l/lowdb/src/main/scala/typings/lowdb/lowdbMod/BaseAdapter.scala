package typings.lowdb.lowdbMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseAdapter[SchemaT]
  extends AdapterOptions[SchemaT]
     with Instantiable1[/* source */ String, BaseAdapter[js.Object]]
     with Instantiable2[/* source */ String, /* options */ AdapterOptions[js.Object], BaseAdapter[js.Object]] {
  val `@@reference`: SchemaT = js.native
  var source: String = js.native
}

