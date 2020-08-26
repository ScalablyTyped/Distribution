package typings.hashset

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.hashtable.IHashtableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHashSetStatic
  extends Instantiable0[IHashSet[js.Object]]
     with Instantiable1[
      (/* hashCode */ js.Function1[/* value */ js.Object, js.Any]) | (/* options */ IHashtableOptions[js.Object]), 
      IHashSet[js.Object]
    ]
     with Instantiable2[
      js.UndefOr[/* hashCode */ js.Function1[/* value */ js.Object, js.Any]], 
      /* equals */ js.Function2[/* value1 */ js.Object, /* value2 */ js.Object, Boolean], 
      IHashSet[js.Object]
    ]

