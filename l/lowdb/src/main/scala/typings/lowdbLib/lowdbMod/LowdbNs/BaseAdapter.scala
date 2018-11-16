package typings
package lowdbLib.lowdbMod.LowdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseAdapter[SchemaT]
  extends AdapterOptions[SchemaT]
     with ScalablyTyped.runtime.Instantiable1[/* source */ java.lang.String, BaseAdapter[js.Object]]
     with ScalablyTyped.runtime.Instantiable2[
      /* source */ java.lang.String, 
      /* options */ AdapterOptions[js.Object], 
      BaseAdapter[js.Object]
    ] {
  val `@@reference`: SchemaT = js.native
  var source: java.lang.String = js.native
}

