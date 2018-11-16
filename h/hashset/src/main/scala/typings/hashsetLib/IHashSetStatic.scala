package typings
package hashsetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHashSetStatic
  extends ScalablyTyped.runtime.Instantiable2[
      /* hashCode */ js.Function1[/* value */ js.Object, js.Any], 
      /* equals */ js.Function2[/* value1 */ js.Object, /* value2 */ js.Object, scala.Boolean], 
      IHashSet[js.Object]
    ]
     with ScalablyTyped.runtime.Instantiable1[
      (/* options */ hashtableLib.IHashtableOptions[js.Object]) | (/* hashCode */ js.Function1[/* value */ js.Object, js.Any]), 
      IHashSet[js.Object]
    ]
     with ScalablyTyped.runtime.Instantiable0[IHashSet[js.Object]]

